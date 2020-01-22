package com.shyam.egmat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DriverProgram {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir") + "\\src" + "\\questions.txt");
		List<Question> questions = parseFileToGetQuestions(file);//System.out.println(System.getProperty("user.dir"));
		
		Map<Integer, List<Question>> questionFilteredOnQLevel = questions.stream().collect(Collectors.groupingBy(Question::getQuestionLevel));
		
		Map<Integer, Map<Integer, List<Question>>> finalQuestionsFilteredWithLevelAndTag = new HashMap<Integer, Map<Integer,List<Question>>>();
		for(Integer qLevel : questionFilteredOnQLevel.keySet()) {
			System.out.println(qLevel);
			finalQuestionsFilteredWithLevelAndTag.put(qLevel, questionFilteredOnQLevel.get(qLevel).stream().collect(Collectors.groupingBy(Question::getQuestionTag)));
		}
		//Map<String, List<Person>> peopleByCity
        //= personStream.collect(Collectors.groupingBy(Person::getCity));
		
		System.out.println(questions.toString());
		
		
		
	}
	
	public static List<Question> parseFileToGetQuestions(File file) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(file));
			
		String tempLine = null;
		String[] splittedLine;
		List<Question> questions = new ArrayList<Question>();
		Question tempQuestion;
		while((tempLine = br.readLine()) != null) {
			splittedLine = tempLine.split("\\|");//assuming the format each line will be like Q#|DifficultyLevel|AssociatedTag
			tempQuestion = new Question();
			tempQuestion.setQuestionId(Long.parseLong(splittedLine[0].substring(1)));
			tempQuestion.setQuestionLevel(QuestionLevel.getQuestionLevelCodeFromQuestionLevelString((splittedLine[1])));
			tempQuestion.setQuestionTag(QuestionTag.getQuestionTagCodeFromTagCodeString(splittedLine[2]));
			
			//add the temp question to the questions list
			questions.add(tempQuestion);
		}
		return questions;
	}

}
