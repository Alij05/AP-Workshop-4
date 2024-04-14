import java.util.ArrayList;
import java.util.Objects;

public class VotingSystem {
    private ArrayList<Voting> votingArrayList;

    VotingSystem() {
        votingArrayList = new ArrayList<>();
    }

    public ArrayList<Voting> getVotingArrayList() {
        return votingArrayList;
    }

    public Voting getVoting(int index) {
        return votingArrayList.get(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VotingSystem that = (VotingSystem) o;
        return votingArrayList.equals(that.votingArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(votingArrayList);
    }

    public void createVoting(String question, boolean anonymous, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question, anonymous);
        for (String choice : choices) {
            voting.createChoice(choice);
        }
        votingArrayList.add(voting);
    }
    public void vote(int index,Person voter,ArrayList<String> voter_choices) {
        if (index < 0 || index >= votingArrayList.size()) {
            System.out.println("wrong input ");
            return;
        }
        votingArrayList.get(index).vote(voter, voter_choices);

    }

    public void vote(int index, Person voter) {
        if (index < 0 || index >= votingArrayList.size()) {
            System.out.println("wrong input ");
            return;
        }
        votingArrayList.get(index).vote(voter);
    }
    public void printVoting(int index) {
        System.out.println("this is " + index + "th vote");
        String ques = votingArrayList.get(index).getQuestion();
        for (String choices : votingArrayList.get(index).getChoices()) {
            System.out.println(choices + ".");
        }
    }

    public void printVoter(int index) {
        System.out.println("the " + index + "th voting");
        System.out.println(votingArrayList.get(index).getVoters());

    }
}
