public class Runner {

	public static void main(String[] args) {

		DBHelper db = new DBHelper();
		/*db.compareKeyword("bulbasaur");
		db.compareKeyword("height");*/
		KeywordExtractor keywEx = new KeywordExtractor("What/WP is/VBZ the/DT height/NN of/IN bulbasaur/NN ?/.");
		keywEx.extractKeywords();
		for(String keyword: keywEx.keywords){
			db.compareKeyword(keyword.substring(0,keyword.length()-3));
		}
			
		QueryGenerator q = new QueryGenerator();
		q.lookForRelations(db);
		//q.rankLongRelatedQueries(db, 5, 5);
		q.formSelectQueries(db);
		q.formConstraintQueries(db);
		q.combineQueries();
		q.displayQueriesByRank();
	}

}
