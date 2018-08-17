package testApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class questionService {

	private List<Question> questionBank = new ArrayList<>(Arrays.asList(new Question(100,"Who invented JAVA?", Arrays.asList("JAVA")),
			new Question(101,"Which JAVA version is compatable with Glassfish server 4 ?", Arrays.asList("JAVA","Glassfish")),
			new Question(102,"What is null pointer Exception?", Arrays.asList("JAVA"))
			));

	public List<Question> getAllQuestions() {
		
		return questionBank;
	}

	public void addQuestion(Question newQuestion) {
		questionBank.add(newQuestion);
		
	}
	
}
