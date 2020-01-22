package com.shyam.egmat;

public enum QuestionLevel {

	EASY(1), MEDIUM(2), HARD(3);

	private final int levelCode;

	private QuestionLevel(int i) {
		this.levelCode = i;
	}

	public static Integer getQuestionLevelCodeFromQuestionLevelString(String questionLevelString) {
		switch (questionLevelString) {
		case "EASY":
			return QuestionLevel.EASY.levelCode;
		case "MEDIUM":
			return QuestionLevel.MEDIUM.levelCode;
		case "HARD":
			return QuestionLevel.HARD.levelCode;
		default:
			return null;
		}
	}
}
