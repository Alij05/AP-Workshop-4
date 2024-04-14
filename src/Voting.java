import java.util.*;

public class Voting {
    private int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;

    Voting(int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
        choices = new HashMap<>();
        voters = new ArrayList<>();
    }

    public ArrayList<Person> getVoters() {
        if(isAnonymous == false)
            return voters;
        return null;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return new ArrayList<String>(choices.keySet());
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public void createChoice (String choice){
        this.choices.put(choice, new HashSet<Vote>());
    }
    public void vote(Person voter,ArrayList<String> voter_choices){
        this.voters.add(voter);
        for(String cho :voter_choices){
            HashSet<Vote> hashSet = this.choices.get(cho);
            hashSet.add(new Vote(voter, new Date().toString()));
        }

    }
    public void vote(Person voter){
        this.voters.add(voter);
        ArrayList<String> choices = this.getChoices();
        Random random = new Random();
        int index = random.nextInt(choices.size());
        String choice = choices.get(index);
        HashSet<Vote> hashSet = this.choices.get(choice);
        hashSet.add(new Vote(voter, new Date().toString()));
    }

    public void printResult() {
        for (String key : this.choices.keySet()) {
            System.out.println(key + "---->" + this.choices.get(key).size());
        }
    }

    public void printVoter() {
        for (Person voter : this.voters) {
            System.out.println(voter.toString());
        }
    }
}
