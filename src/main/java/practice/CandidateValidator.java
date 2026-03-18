package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    @Override
    public boolean test(Candidate candidate) {

        String[] periods = candidate.getPeriodsInUkr().split("-");

        if (candidate.getAge() >= 35 && candidate.isAllowedToVote() == true
                && candidate.getNationality().equals("Ukrainian")
                && Integer.parseInt(periods[1]) - Integer.parseInt(periods[0]) >= 10) {
            return true;
        }
        return false;
    }
}

