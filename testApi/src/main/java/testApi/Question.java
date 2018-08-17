package testApi;

import java.util.List;

public class Question {
	
	private int questionId;
	private String question;
	private List<String> questionTag;
	
	public Question() {		
	}		
	public Question(int questionId, String question, List<String> questionTag) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.questionTag = questionTag;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getQuestionTag() {
		return questionTag;
	}
	public void setQuestionTag(List<String> questionTag) {
		this.questionTag = questionTag;
	}
}
