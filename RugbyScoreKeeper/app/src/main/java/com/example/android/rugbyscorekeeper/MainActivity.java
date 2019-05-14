package com.example.android.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int homeScore = 0;
    int awayScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHome(0);
        displayForAway(0);

    }

    /**
     * Displays the given score for Home.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Sets home and away score to 0 when RESET button is clicked.
     */
    public void reset(View v) {
        homeScore = 0;
        awayScore = 0;
        displayForHome(0);
        displayForAway(0);
    }

    /**
     * Adds five points for Home when TRY button is clicked.
     */
    public void addTryHome(View v) {
        homeScore = homeScore + 5;
        displayForHome(homeScore);
    }

    /**
     * Adds two points for Home when CONVERSION button is clicked.
     */
    public void addConvHome(View v) {
        homeScore = homeScore + 2;
        displayForHome(homeScore);
    }

    /**
     * Adds three points for Home when PENALTY button is clicked.
     */
    public void addPenHome(View v) {
        homeScore = homeScore + 3;
        displayForHome(homeScore);
    }

    /**
     * Adds two points for Home when DROP GOAL button is clicked.
     */
    public void addDropHome(View v) {
        homeScore = homeScore + 2;
        displayForHome(homeScore);
    }

    /**
     * Displays the given score for Away.
     */
    public void displayForAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds five points for Away when TRY button is clicked.
     */
    public void addTryAway(View v) {
        awayScore = awayScore + 5;
        displayForAway(awayScore);
    }

    /**
     * Adds two points for Away when CONVERSION button is clicked.
     */
    public void addConvAway(View v) {
        awayScore = awayScore + 2;
        displayForAway(awayScore);
    }

    /**
     * Adds three points for Away when PENALTY button is clicked.
     */
    public void addPenAway(View v) {
        awayScore = awayScore + 3;
        displayForAway(awayScore);
    }

    /**
     * Adds two points for Away when DROP GOAL button is clicked.
     */
    public void addDropAway(View v) {
        awayScore = awayScore + 2;
        displayForAway(awayScore);
    }
}