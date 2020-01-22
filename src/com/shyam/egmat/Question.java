package com.shyam.egmat;

public class Question {

	// Here I am assuming that the question number in the file will be questionId as
	// we have question
	// numbers with unique numbers
	private Long questionId;
	// private String questionText;
	private Integer questionLevel;
	private Integer questionTag;

	public Question() {
	}

	public Question(Long questionId, Integer questionLevel, Integer questionTag) {
		this.questionId = questionId;
		this.questionLevel = questionLevel;
		this.questionTag = questionTag;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	/*
	 * public String getQuestionText() { return questionText; }
	 * 
	 * public void setQuestionText(String questionText) { this.questionText =
	 * questionText; }
	 */

	public Integer getQuestionLevel() {
		return questionLevel;
	}

	public void setQuestionLevel(Integer questionLevel) {
		this.questionLevel = questionLevel;
	}

	public Integer getQuestionTag() {
		return questionTag;
	}

	public void setQuestionTag(Integer questionTag) {
		this.questionTag = questionTag;
	}
	
	

}
