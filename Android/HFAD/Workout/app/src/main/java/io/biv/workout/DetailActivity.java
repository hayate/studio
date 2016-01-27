package io.biv.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "io.biv.workout.id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        WorkoutDetailFragment detail = (WorkoutDetailFragment)getSupportFragmentManager().
                findFragmentById(R.id.detail_frag);
        int workoutId = (int)getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        detail.setWorkoutId(workoutId);
    }
}
