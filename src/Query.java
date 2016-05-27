import java.util.ArrayList;


public class Query {

	String query;
	int score;
	String tablesUsed;
	public Query(){
		tablesUsed = "";
		score = 0;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
