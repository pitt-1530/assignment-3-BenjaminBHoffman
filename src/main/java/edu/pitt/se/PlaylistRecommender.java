package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {

        int av = 0;

        if (bpms == null || bpms.isEmpty()) {
            return null;
        }

        for (int i: bpms){
            av += i;
        }
        av /= bpms.size();

        if (av >= 140){
            return "High";
        } else if (av >= 100) {
            return "Medium";
        } else{
            return "Low";
        }
    }

    public static boolean isValidTrackTitle(String title) {
        if (title == null) {
            return false;
        }
        return title.matches("[A-Za-z ]{1,30}");
    }

    public static int normalizeVolume(int volumeDb) {
        if (volumeDb > 100) {
            return 100;
        } else if (volumeDb < 0) {
            return 0;
        } else {
            return volumeDb;
        }
    }
}
