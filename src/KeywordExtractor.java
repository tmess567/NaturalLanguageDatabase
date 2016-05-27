import java.util.ArrayList;


public class KeywordExtractor {
	String inpSentence = "";
	ArrayList<String> keywords = new ArrayList<String>();
	
	public KeywordExtractor(String s){
		this.inpSentence = s;
	}
	
	public void extractKeywords(){
		keywords = getKeywords(inpSentence);
	}
	private static ArrayList<String> getKeywords(String inpstr) {
		String word = "";
		ArrayList<String> keywords = new ArrayList<String>();
		for (int i = 0; i < inpstr.length(); i++) {
			if (inpstr.charAt(i) == ' ') {
				if (word.contains("/NN"))
					keywords.add(word);
				word = "";
			} else
				word += inpstr.charAt(i);
		}
		return keywords;
	}
}
