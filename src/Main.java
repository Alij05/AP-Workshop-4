import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        ArrayList<String> choiceTeam = new ArrayList<>();
        choiceTeam.add("Barcelona");
        choiceTeam.add("Real Madrid");
        choiceTeam.add("None");

        ArrayList<String> choiceColor = new ArrayList<>();
        choiceColor.add("Red");
        choiceColor.add("Blue");
        choiceColor.add("White");
        choiceColor.add("Yellow");
        choiceColor.add("Pink");
        choiceColor.add("None");

        ArrayList<String> choiceEnemy = new ArrayList<>();
        choiceEnemy.add("Classmate");
        choiceEnemy.add("Neighbor");
        choiceEnemy.add("Friends");
        choiceEnemy.add("None");

        Person firstPerson = new Person("Sara", "Ahmadi");
        ArrayList<String> firstOnechoiceForFirstVote = new ArrayList<>();
        firstOnechoiceForFirstVote.add("Barcelona");

        ArrayList<String> firstOnechoiceForThirdVote = new ArrayList<>();
        firstOnechoiceForThirdVote.add("Classmate");

        Person secondPerson = new Person("Ali", "Mohebbi");
        ArrayList<String> secondOnechoiceForFirstVote = new ArrayList<>();
        secondOnechoiceForFirstVote.add("Real Madrid");

        ArrayList<String> secondOnechoiceForThirdVote = new ArrayList<>();
        secondOnechoiceForThirdVote.add("Classmate");

        Person thirdPerson = new Person("Shiva", "Samadi");
        ArrayList<String> thirdOnechoiceForFirstVote = new ArrayList<>();
        thirdOnechoiceForFirstVote.add("Real Madrid");

        ArrayList<String> thirdOnechoiceForSecondVote = new ArrayList<>();
        thirdOnechoiceForSecondVote.add("White");

        ArrayList<String> thirdOnechoiceForThirdVote = new ArrayList<>();
        thirdOnechoiceForThirdVote.add("Neighbor");

        Person forthPerson = new Person("Reza", "Qasemi");
        ArrayList<String> forthOnechoiceForSecondVote = new ArrayList<>();
        forthOnechoiceForSecondVote.add("Yellow");

        ArrayList<String> forthOnechoiceForThirdVote = new ArrayList<>();
        forthOnechoiceForThirdVote.add("None");

        Person fivethPerson = new Person("Neda", "Mohammadi");
        ArrayList<String> fivethOnechoiceForSecondVote = new ArrayList<>();
        fivethOnechoiceForSecondVote.add("Blue");
        fivethOnechoiceForSecondVote.add("Yellow");

        ArrayList<String> fivethOnechoiceForThirdVote = new ArrayList<>();
        fivethOnechoiceForThirdVote.add("Friends");


        votingSystem.createVoting("what's your favorite team?", false, 0, choiceTeam);
        votingSystem.createVoting("what's your favorite color?", false, 1, choiceColor);
        votingSystem.createVoting("who is your crush?", true, 0, choiceEnemy);

        votingSystem.vote(0, firstPerson, firstOnechoiceForFirstVote);
        votingSystem.vote(0, secondPerson, secondOnechoiceForFirstVote);
        votingSystem.vote(0, thirdPerson, thirdOnechoiceForFirstVote);
        votingSystem.vote(1, thirdPerson, thirdOnechoiceForSecondVote);
        votingSystem.vote(1, forthPerson, forthOnechoiceForSecondVote);
        votingSystem.vote(1, fivethPerson, fivethOnechoiceForSecondVote);
        votingSystem.vote(2, firstPerson, firstOnechoiceForThirdVote);
        votingSystem.vote(2, secondPerson, secondOnechoiceForThirdVote);
        votingSystem.vote(2, thirdPerson, thirdOnechoiceForThirdVote);
        votingSystem.vote(2, forthPerson, forthOnechoiceForThirdVote);
        votingSystem.vote(2, fivethPerson, fivethOnechoiceForThirdVote);

        votingSystem.printVoter(0);
        votingSystem.getVoting(0).printResult();
        System.out.println("************");

        votingSystem.printVoter(1);
        votingSystem.getVoting(1).printResult();
        System.out.println("************");

        votingSystem.printVoter(2);
        votingSystem.getVoting(2).printResult();
        System.out.println("************");

    }
}
