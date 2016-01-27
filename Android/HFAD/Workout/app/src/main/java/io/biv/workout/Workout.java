package io.biv.workout;

/**
 * Created by andrea on 1/27/16.
 */
public class Workout {
    private String mName;
    private String mDescription;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull ups"),
    };

    private Workout(String name, String description) {
        this.mName = name;
        this.mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String toString() {
        return this.mName;
    }
}
