package FindMean;

public class FindMean {

    public static String findMean(float[] scores) {
        float sumOfScores = 0.0f;
        int numberOfScores = 0;

        int i = 0;
        while (i < scores.length) {
            float score = scores[i];
            if (score > 0.0f) {
                sumOfScores += score;
                numberOfScores++;
            }
            i++;
        }

        if (numberOfScores > 0) {
            float mean = sumOfScores / numberOfScores;
            return String.format("Mean score is %.1f", mean);
        } else {
            return "No scores found in file";
        }
    }
}
