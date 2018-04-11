package com.example.android.paperfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.paperfootball.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamAway = 0;
    int scoreTeamHome = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


/**
 * Display for Home Team
 *
 */

public void displayHomeScore (int score) {
    TextView scoreView = (TextView) findViewById(R.id.home);
    scoreView.setText(String.valueOf(score));
}

/**
 *  Method for touchdown 6+ points for home team
 */
public void touchDownHome(View view) {
    scoreTeamHome = scoreTeamHome + 6;
    displayHomeScore(scoreTeamHome);
}

    /**
     *  Method for field goal 1+ points for home team
     */
    public void fieldGoalHome(View view) {
        scoreTeamHome = scoreTeamHome + 1;
        displayHomeScore(scoreTeamHome);
    }



    /**
     * Display for Away Team
     *
     */

    public void displayAwayScore (int score) {
        TextView scoreView = (TextView) findViewById(R.id.away);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  Method for touchdown 6+ points for away team
     */
    public void touchDownAway(View view) {
        scoreTeamAway = scoreTeamAway + 6;
        displayAwayScore(scoreTeamAway);
    }

    /**
     *  Method for field goal 1+ points for away team
     */
    public void fieldGoalAway(View view) {
        scoreTeamAway = scoreTeamAway + 1;
        displayAwayScore(scoreTeamAway);
    }


    /**
     * Following is for free throw button B
     */
    public void reset(View view) {
        scoreTeamHome = 0;
        scoreTeamAway = 0;
        displayHomeScore(scoreTeamHome);
        displayAwayScore(scoreTeamAway);
    }

}


