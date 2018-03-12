package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;
    int redCardHomeTeam = 0;
    int yellowCardHomeTeam = 0;
    int redCardAwayTeam = 0;
    int yellowCardAwayTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("SCORE_HOME_TEAM", scoreHomeTeam);
        outState.putInt("SCORE_AWAY_TEAM", scoreAwayTeam);
        outState.putInt("RED_CARD_HOME_TEAM", redCardHomeTeam);
        outState.putInt("YELLOW_CARD_HOME_TEAM", yellowCardHomeTeam);
        outState.putInt("RED_CARD_AWAY_TEAM", redCardAwayTeam);
        outState.putInt("YELLOW_CARD_AWAY_TEAM", yellowCardAwayTeam);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scoreHomeTeam = savedInstanceState.getInt("SCORE_HOME_TEAM");
        displayForHomeTeamScore(scoreHomeTeam);

        scoreAwayTeam = savedInstanceState.getInt("SCORE_AWAY_TEAM");
        displayForAwayTeamScore(scoreAwayTeam);

        redCardHomeTeam = savedInstanceState.getInt("RED_CARD_HOME_TEAM");
        displayForHomeTeamRedCard(redCardHomeTeam);

        yellowCardHomeTeam = savedInstanceState.getInt("YELLOW_CARD_HOME_TEAM");
        displayForHomeTeamYellowCard(yellowCardHomeTeam);

        redCardAwayTeam = savedInstanceState.getInt("RED_CARD_AWAY_TEAM");
        displayForAwayTeamRedCard(redCardAwayTeam);

        yellowCardAwayTeam = savedInstanceState.getInt("YELLOW_CARD_AWAY_TEAM");
        displayForAwayTeamYellowCard(yellowCardAwayTeam);


    }

    public void addGoalForHomeTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + 1;
        displayForHomeTeamScore(scoreHomeTeam);
    }

    public void addRedCardForHomeTeam(View v) {
        redCardHomeTeam = redCardHomeTeam + 1;
        displayForHomeTeamRedCard(redCardHomeTeam);
    }

    public void addYellowCardForHomeTeam(View v) {
        yellowCardHomeTeam = yellowCardHomeTeam + 1;
        displayForHomeTeamYellowCard(yellowCardHomeTeam);
    }

    public void addGoalForAwayTeam(View v) {
        scoreAwayTeam = scoreAwayTeam + 1;
        displayForAwayTeamScore(scoreAwayTeam);
    }

    public void addRedCardForAwayTeam(View v) {
        redCardAwayTeam = redCardAwayTeam + 1;
        displayForAwayTeamRedCard(redCardAwayTeam);
    }

    public void addYellowCardForAwayTeam(View v) {
        yellowCardAwayTeam = yellowCardAwayTeam + 1;
        displayForAwayTeamYellowCard(yellowCardAwayTeam);
    }

    public void resetScore (View v) {
        scoreHomeTeam = 0;
        scoreAwayTeam = 0;
        redCardHomeTeam = 0;
        redCardAwayTeam = 0;
        yellowCardHomeTeam = 0;
        yellowCardAwayTeam = 0;
        displayForHomeTeamScore(scoreHomeTeam);
        displayForAwayTeamScore(scoreAwayTeam);
        displayForHomeTeamRedCard(redCardHomeTeam);
        displayForAwayTeamRedCard(redCardAwayTeam);
        displayForHomeTeamYellowCard(yellowCardHomeTeam);
        displayForAwayTeamYellowCard(yellowCardAwayTeam);
    }

    /**
     * Displays the given score for Home Team.
     */

    public void displayForHomeTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method displays the given red cards for home team.
     */

    public void displayForHomeTeamRedCard(int redCardHomeTeam) {
        TextView redCardView = (TextView) findViewById(R.id.home_team_red_card);
        redCardView.setText(String.valueOf(redCardHomeTeam));
    }

    /**
     * This method displays the given yellow cards for home team.
     */

    public void displayForHomeTeamYellowCard(int yellowCardHomeTeam) {
        TextView yellowCardView = (TextView) findViewById(R.id.home_team_yellow_card);
        yellowCardView.setText(String.valueOf(yellowCardHomeTeam));
    }

    /**
     * Displays the given score for Away Team.
     */
    public void displayForAwayTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the given red cards for away team.
     */

    public void displayForAwayTeamRedCard(int redCardAwayTeam) {
        TextView redCardView = (TextView) findViewById(R.id.away_team_red_card);
        redCardView.setText(String.valueOf(redCardAwayTeam));
    }

    /**
     * This method displays the given offside for away team.
     */

    public void displayForAwayTeamYellowCard(int yellowCardAwayTeam) {
        TextView yellowCardView = (TextView) findViewById(R.id.away_team_yellow_card);
        yellowCardView.setText(String.valueOf(yellowCardAwayTeam));
    }
}
