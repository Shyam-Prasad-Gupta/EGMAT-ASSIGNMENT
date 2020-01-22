package com.shyam.egmat;

public enum QuestionTag {

	TAG1(1), TAG2(2), TAG3(3), TAG4(4), TAG5(5), TAG6(6);

	private final int tagCode;

	private QuestionTag(int tagCode) {
		this.tagCode = tagCode;
	}

	public static Integer getQuestionTagCodeFromTagCodeString(String tagCodeString) {
		
		switch (tagCodeString) {
		case "Tag1":
			return QuestionTag.TAG1.tagCode;
		case "Tag2":
				return QuestionTag.TAG2.tagCode;
		case "Tag3":
				return QuestionTag.TAG3.tagCode;
		case "Tag4":
			return QuestionTag.TAG4.tagCode;
		case "Tag5":
			return QuestionTag.TAG5.tagCode;
		case "Tag6":
			return QuestionTag.TAG6.tagCode;
		default:
			return null;
		}
	}

}
