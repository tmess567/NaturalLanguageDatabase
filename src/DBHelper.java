import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DBHelper {
	ArrayList<Tables> tablesAL = new ArrayList<Tables>();
	ArrayList<Columns> columnsAL = new ArrayList<Columns>();
	ArrayList<Values> valuesAL = new ArrayList<Values>();
	ArrayList<ForeignKey> fkeys = new ArrayList<ForeignKey>();
	
	Connection conn;
	Statement stat;
	DatabaseMetaData md;
	
	
	public DBHelper(){
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager
					.getConnection("jdbc:sqlite:veekun-pokedex.sqlite");
			stat = conn.createStatement();
			md = conn.getMetaData();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<Tables> getTablesAL() {
		return tablesAL;
	}

	public void setTablesAL(ArrayList<Tables> tablesAL) {
		this.tablesAL = tablesAL;
	}

	public ArrayList<Columns> getColumnsAL() {
		return columnsAL;
	}

	public void setColumnsAL(ArrayList<Columns> columnsAL) {
		this.columnsAL = columnsAL;
	}

	public ArrayList<Values> getValuesAL() {
		return valuesAL;
	}

	public void setValuesAL(ArrayList<Values> valuesAL) {
		this.valuesAL = valuesAL;
	}

	public ArrayList<ForeignKey> getFkeys() {
		return fkeys;
	}

	public void setFkeys(ArrayList<ForeignKey> fkeys) {
		this.fkeys = fkeys;
	}

	public void compareKeyword(String s){
		String table = "";
		try {
			ResultSet rs = md.getTables(null, null, "%", null);
			while (rs.next()) {
				table = rs.getString(3);
				if(table.contains(s)){
					Tables currTable = new Tables();
					currTable.setKeyword(s);
					currTable.setScore(0);
					currTable.setTablename(table);
				}
				
				Statement stmt = conn.createStatement();
				ResultSet rs1 = stmt.executeQuery("select * from " + table
						+ ";");
				ResultSetMetaData metaData = rs1.getMetaData();
				int count = metaData.getColumnCount(); // number of column
				for (int i = 1; i <= count; i++) {
					if(metaData.getColumnLabel(i).contains(s)){
						Columns currColumn = new Columns();
						currColumn.setTablename(table);
						currColumn.setColname(metaData.getColumnLabel(i));
						currColumn.setKeyword(s);
						currColumn.setScore(0);
						columnsAL.add(currColumn);
					}
				}
				while(rs1.next()){
					for (int i = 1; i <= count; i++) {
						try{
							if (rs1.getString(metaData.getColumnLabel(i)).equals(s)) {
								Values currValue = new Values();
								currValue.setTablename(table);
								currValue.setColname(metaData.getColumnLabel(i));
								currValue.setScore(0);
								currValue.setKeyword(s);
								valuesAL.add(currValue);
							}
						}catch(Exception e){
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getForeignKeys(String s){
		try {
			ResultSet foreignKeys = md.getImportedKeys(conn.getCatalog(), null,
					s);
			while (foreignKeys.next()) {

				ForeignKey f = new ForeignKey();
				f.setFkTableName(foreignKeys.getString("FKTABLE_NAME"));
				f.setFkColumnName(foreignKeys.getString("FKCOLUMN_NAME"));
				f.setPkTableName(foreignKeys.getString("PKTABLE_NAME"));
				f.setPkColumnName(foreignKeys.getString("PKCOLUMN_NAME"));
			    
				fkeys.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getDistinctTableNames(String type){
		if(type.equals("Tables")){
			ArrayList<String> distinctNames = new ArrayList<String>();
			Set<Tables> hs = new HashSet<Tables>();
			hs.addAll(tablesAL);
			for(Tables s: hs){
				distinctNames.add(s.getTablename());
			}
			return distinctNames;
		}
		else if(type.equals("Columns")){
			ArrayList<String> distinctNames = new ArrayList<String>();
			Set<Columns> hs = new HashSet<Columns>();
			hs.addAll(columnsAL);
			for(Columns s: hs){
				distinctNames.add(s.getTablename());
			}
			return distinctNames;
		}
		
		else if(type.equals("Values")){
			ArrayList<String> distinctNames = new ArrayList<String>();
			Set<Values> hs = new HashSet<Values>();
			hs.addAll(valuesAL);
			for(Values s: hs){
				distinctNames.add(s.getTablename());
			}
			return distinctNames;
		}
		else return null;
		
	}
	
	
	public void print(){
		for(Tables currT: tablesAL)
			System.out.println("TABLE: Table->"+currT.getTablename()+
					" Keyword->"+currT.getKeyword()+
					" Score->"+currT.getScore());
		for(Columns currT: columnsAL)
			System.out.println("COLUMN: Table->"+currT.getTablename()+
					" Column->"+currT.getColname()+
					" Keyword->"+currT.getKeyword()+
					" Score->"+currT.getScore());
		for(Values currT: valuesAL)
			System.out.println("VALUE: Table->"+currT.getTablename()+
					" Column->"+currT.getColname()+
					" Keyword->"+currT.getKeyword()+
					" Score->"+currT.getScore());
		for(ForeignKey currT: fkeys)
			System.out.println("FOREIGN KEY: PKTable->"+currT.getPkTableName()+
					" PKColumn->"+currT.getPkColumnName()+
					" FKTable->"+currT.getFkTableName()+
					" FKColumn->"+currT.getFkColumnName());
		
	}

	public void compareColumns(String s) {
		String table = "";
		try {
			ResultSet rs = md.getTables(null, null, "%", null);
			while (rs.next()) {
				table = rs.getString(3);
				if(table.contains(s)){
					Tables currTable = new Tables();
					currTable.setKeyword(s);
					currTable.setScore(0);
					currTable.setTablename(table);
				}
				
				Statement stmt = conn.createStatement();
				ResultSet rs1 = stmt.executeQuery("select * from " + table
						+ ";");
				ResultSetMetaData metaData = rs1.getMetaData();
				int count = metaData.getColumnCount(); // number of column
				for (int i = 1; i <= count; i++) {
					if(metaData.getColumnLabel(i).contains(s)){
						Columns currColumn = new Columns();
						currColumn.setTablename(table);
						currColumn.setColname(metaData.getColumnLabel(i));
						currColumn.setKeyword(s);
						currColumn.setScore(0);
						columnsAL.add(currColumn);
					}
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
