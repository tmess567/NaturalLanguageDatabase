import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QueryGenerator {

	ArrayList<Query> selectQueries = new ArrayList<Query>();
	ArrayList<Query> constraintQueries = new ArrayList<Query>();
	ArrayList<Query> queries = new ArrayList<Query>();

	public static void rankLongRelatedQueries(DBHelper db, int depth, 
			int maxScoreAdd){
		/*for all tables in tablesAL search for fkey
		if fkey = tablename in vals rank+=maxscoreadd
		
		repeat depth times -> 
		for each fkey find fkeys and populate currTables
		 if fkey = tablename in vals rank+=(maxscoreadd/currdepth)
		*/
		ArrayList<DepthSearchTable> tlist = new ArrayList<DepthSearchTable>();
		for(Tables t:db.tablesAL){
			DBHelper DBfkeys = new DBHelper();
			for(int i=1;i<=depth;i++){
				DBfkeys.fkeys.clear();
				DBfkeys.getForeignKeys(t.getTablename());
				for(ForeignKey fk : DBfkeys.fkeys){
					for(Values v:db.valuesAL){
						if(fk.pkTableName.equals(v.tablename)){
							System.out.println("For "+t.tablename+" "
									+ fk.pkTableName +"="+v.tablename);
							v.score+=maxScoreAdd/depth;
							t.score+=maxScoreAdd/depth;
						}
					}
				}
			}
		}
		for(Columns t:db.columnsAL){
			DBHelper DBfkeys = new DBHelper();
			for(int i=1;i<=depth;i++){
				DBfkeys.fkeys.clear();
				DBfkeys.getForeignKeys(t.getTablename());
				for(ForeignKey fk : DBfkeys.fkeys){
					for(Values v:db.valuesAL){
						if(fk.pkTableName.equals(v.tablename)){
							System.out.println("For "+t.tablename+" "
								+ fk.pkTableName +"="+v.tablename);
							v.score+=maxScoreAdd/depth;
							t.score+=maxScoreAdd/depth;
						}
					}
				}
			}
		}
	}
	
	public static void lookForRelations(DBHelper db) {
		if (db.tablesAL != null || db.columnsAL != null || db.valuesAL != null) {
			for (Tables t : db.tablesAL) {
				DBHelper fkeydb = new DBHelper();
				fkeydb.getForeignKeys(t.getTablename());
				ArrayList<ForeignKey> fkeys = fkeydb.fkeys;
				for (ForeignKey fkey : fkeys) {
					int countTables = countOccurenceTableName("Tables",
							db.tablesAL, fkey.getPkTableName());
					int countColumns = countOccurenceTableName("Columns",
							db.columnsAL, fkey.getPkTableName());
					int countValues = countOccurenceTableName("Values",
							db.valuesAL, fkey.getPkTableName());
					t.score += (2 * (countTables + countColumns + countValues));
				}
			}

			for (Columns t : db.columnsAL) {
				DBHelper fkeydb = new DBHelper();
				fkeydb.getForeignKeys(t.getTablename());
				ArrayList<ForeignKey> fkeys = fkeydb.fkeys;
				for (ForeignKey fkey : fkeys) {
					int countTables = countOccurenceTableName("Tables",
							db.tablesAL, fkey.getPkTableName());
					int countColumns = countOccurenceTableName("Columns",
							db.columnsAL, fkey.getPkTableName());
					int countValues = countOccurenceTableName("Values",
							db.valuesAL, fkey.getPkTableName());
					t.score += (2 * (countTables + countColumns + countValues));
				}
			}

			for (Values t : db.valuesAL) {
				DBHelper fkeydb = new DBHelper();
				fkeydb.getForeignKeys(t.getTablename());
				ArrayList<ForeignKey> fkeys = fkeydb.fkeys;
				for (ForeignKey fkey : fkeys) {
					int countTables = countOccurenceTableName("Tables",
							db.tablesAL, fkey.getPkTableName());
					int countColumns = countOccurenceTableName("Columns",
							db.columnsAL, fkey.getPkTableName());
					int countValues = countOccurenceTableName("Values",
							db.valuesAL, fkey.getPkTableName());

					t.score += (2 * (countTables + countColumns + countValues));
				}
			}

			for (Tables a : db.tablesAL) {
				for (Columns b : db.columnsAL) {
					if (b.getTablename().equals(a.getTablename())) {
						b.score++;
						a.score++;
					}
				}
				for (Values b : db.valuesAL) {
					if (b.getTablename().equals(a.getTablename())) {
						b.score++;
						a.score++;
					}
				}
			}

			for (Columns a : db.columnsAL) {
				for (Tables b : db.tablesAL) {
					if (b.getTablename().equals(a.getTablename())) {
						b.score++;
						a.score++;
					}
				}
				for (Values b : db.valuesAL) {
					if (b.getTablename().equals(a.getTablename())) {
						b.score++;
						a.score++;
					}
				}
			}

			for (Values a : db.valuesAL) {
				for (Tables b : db.tablesAL) {
					if (b.getTablename().equals(a.getTablename())) {
						b.score++;
						a.score++;
					}
				}
				for (Columns b : db.columnsAL) {
					if (b.getTablename().equals(a.getTablename())) {
						b.score++;
						a.score++;
					}
				}
			}

		}

	}

	public static int countOccurenceTableName(String type, ArrayList t, String n) {
		int count = 0;
		if (type.equals("Tables")) {
			ArrayList<Tables> t_table = (ArrayList<Tables>) t;
			for (Tables tab : t_table) {
				if (tab.getTablename().equals(n)) {
					count++;
				}
			}
		} else if (type.equals("Columns")) {
			ArrayList<Columns> t_col = (ArrayList<Columns>) t;
			for (Columns tab : t_col) {
				if (tab.getTablename().equals(n)) {
					count++;
				}
			}
		} else if (type.equals("Values")) {
			ArrayList<Values> t_val = (ArrayList<Values>) t;
			for (Values tab : t_val) {
				if (tab.getTablename().equals(n)) {
					count++;
				}
			}
		}
		return count;
	}

	public void formSelectQueries(DBHelper db) {

		for (Tables t : db.tablesAL) {
			try {
				ResultSet pkRS = (db.md.getPrimaryKeys(null, null,
						t.getTablename()));
				pkRS.next();
			} catch (Exception e) {
				e.printStackTrace();
			}
			String pk = "";
			// continue here
			// TODO: you have to store primary key in pk
			// also design query class such that it contains foreign key links
			Query query = new Query();
			query.setQuery("select " + pk + " from " + t.getTablename());
			query.score += t.getScore();
			if(!(pk.contains("id")))
				selectQueries.add(query);
			else{
				DBHelper identifierChecker = new DBHelper();
				identifierChecker.compareColumns("identifier");
				if(identifierChecker.columnsAL.size()>0)
					query.setQuery("select identifier" + " from " + t.getTablename());
			}
		}
		for (Columns t : db.columnsAL) {
			Query query = new Query();
			query.setQuery("select " + t.getColname() + " from "
					+ t.getTablename());
			query.score += t.getScore();
			query.tablesUsed = t.getTablename();
			if(!(t.getColname().contains("id")))
				selectQueries.add(query);
			else{
				DBHelper identifierChecker = new DBHelper();
				identifierChecker.compareColumns("identifier");
				if(identifierChecker.columnsAL.size()>0)
					query.setQuery("select identifier" + " from " + t.getTablename());
			}
		}
	}

	public void formConstraintQueries(DBHelper db) {
		for (Values t : db.valuesAL) {
			Query query = new Query();
			query.setQuery(" where " + t.getTablename() + "." + t.getColname()
					+ " = \"" + t.getKeyword() + "\"");
			query.score += t.getScore();
			query.tablesUsed = t.getTablename();
			constraintQueries.add(query);
		}

	}

	public void combineQueries() {
		for (Query sel : selectQueries) {
			for (Query cons : constraintQueries) {
				Query query = new Query();
				boolean flag = true;
				DBHelper db = new DBHelper();
				db.getForeignKeys(sel.tablesUsed);
				for (ForeignKey selfkey : db.fkeys) {
				
					if (selfkey.pkTableName .equals( cons.tablesUsed)) {
						query.setQuery(sel.getQuery()+ ","+cons.tablesUsed + cons.getQuery()
								+ " and " + selfkey.fkTableName + "."
								+ selfkey.fkColumnName + " = "
								+ selfkey.pkTableName + "."
								+ selfkey.pkColumnName);
						query.setScore(sel.getScore() + cons.getScore() + 2);
						flag = false;
					}
				}
				db.fkeys.clear();
				db.getForeignKeys(cons.tablesUsed);
				for (ForeignKey consfkey : db.fkeys) {
					if (consfkey.pkTableName .equals(sel.tablesUsed)) {
						query.setQuery(sel.getQuery()+ ","+cons.tablesUsed  + cons.getQuery()
								+ " and " + consfkey.fkTableName + "."
								+ consfkey.fkColumnName + " = "
								+ consfkey.pkTableName + "."
								+ consfkey.pkColumnName);
						query.setScore(sel.getScore() + cons.getScore() + 2);
						flag = false;
					}
				}
				if (flag) {
					query.setQuery(sel.getQuery() + cons.getQuery());
					query.setScore(sel.getScore() + cons.getScore());
				}

				queries.add(query);
			}
		}
	}

	public void displayQueriesByRank() {
		orderQueries();
		for (Query q : queries)
			System.out.println(q.getQuery() + "  SCORE->" + q.getScore());
	}

	private void orderQueries() {
		Collections.sort(queries, new Comparator<Query>() {
			public int compare(Query q2, Query q1) {
				Integer s1 = Integer.valueOf(q1.getScore());
				Integer s2 = Integer.valueOf(q2.getScore());
				return s1.compareTo(s2);
			}
		});
	}

}
