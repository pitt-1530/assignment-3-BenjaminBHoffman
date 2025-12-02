package edu.pitt.se;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlaylistRecommenderTest {

    @Test
    void testClassifyEnergy() {
        //Empty
        assertEquals(null, PlaylistRecommender.classifyEnergy(List.of()));

        //Null
        assertEquals(null, PlaylistRecommender.classifyEnergy(null));

        //High
        assertEquals("High", PlaylistRecommender.classifyEnergy(List.of(150, 160, 170)));

        //Medium
        assertEquals("Medium", PlaylistRecommender.classifyEnergy(List.of(110, 120, 130)));

        //Low
        assertEquals("Low", PlaylistRecommender.classifyEnergy(List.of(70, 80, 90)));

    }

    @Test
    void testisValidTrackTitle() {
        //Null
        assertEquals(false, PlaylistRecommender.isValidTrackTitle(null));

        //0-30 chars, only letters and spaces
        assertEquals(true, PlaylistRecommender.isValidTrackTitle("Valid Title"));

        //More than 30 chars
        assertEquals(false, PlaylistRecommender.isValidTrackTitle("This title is definitely way too long to be valid"));

        //Special characters
        assertEquals(false, PlaylistRecommender.isValidTrackTitle("Invalid@Title!"));

    }

    @Test
    void testnormalizeVolume() {
        //greater than 100
        assertEquals(100, PlaylistRecommender.normalizeVolume(150));
        //less than 0
        assertEquals(0, PlaylistRecommender.normalizeVolume(-20));
        //between 0 and 100
        assertEquals(75, PlaylistRecommender.normalizeVolume(75));

    }

}
