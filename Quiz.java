package game.rpg;

import java.util.*;

public class Quiz extends Game{

	   private List<Question> listQuestion = new ArrayList<>();;

	    public Quiz(String name, Key keyCondition, Key keyReward, List<Question> listQuestion) {
	        super(name, keyCondition, keyReward);
	        this.listQuestion = listQuestion;

	    }


	    @Override
	    public Key reward() {
	        return getKeyReward();
	    }

	    void  printList(int index) {
	            System.out.println(listQuestion.get(index).getQuestion());
	            System.out.println(listQuestion.get(index).getResponse1());
	            System.out.println(listQuestion.get(index).getResponse2());
	            System.out.println(listQuestion.get(index).getResponse3());
	            System.out.println(listQuestion.get(index).getResponse4());

	    }

	    @Override
	    public boolean play(Key k,String input) {
	        if(canPlay(k) == true) {
	            System.out.println("Welcome to the quiz");
	            Scanner answerValue = new Scanner(input);
	            String value;
	            int i = 0;
	            while (i < listQuestion.size()) {
	                printList(i);
	                value = answerValue.next();

	                if (listQuestion.get(i).getAnswer().equals(value)) {
	                        System.out.println("Correct");
	                }

	                if(!(listQuestion.get(i).getAnswer().equals(value))){
	                        System.out.println("Wrong");
	                        return false;
	                    }

	                if(i == listQuestion.size() && value.equals(listQuestion.get(i).getAnswer())) {
	                    System.out.println("Win");
	                    return true;
	                }

	                i++;
	            }

	            answerValue.close();
	            return true;
	        }

	    else {
	        System.out.println("Key required");
	        return false;
	    }
	  }
	    
	  @Override
	  public boolean canPlay(Key k) {
	        if (getKeyCondition() == null){
	            return false;
	        }
	        if (k.equals(getKeyCondition())){
	            return true;
	        }
	        return false;

	    }

}
