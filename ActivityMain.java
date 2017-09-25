package com.andreseptian.android.basketballscoreapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tigaPoinA(View v) {
        scoreTeamA = scoreTeamA + 3;
        tampilScoreA(scoreTeamA);
    }

    public void duaPoinA(View v) {
        scoreTeamA = scoreTeamA + 2;
        tampilScoreA(scoreTeamA);
    }

    public void satuPoinA(View v) {
        scoreTeamA = scoreTeamA + 1;
        tampilScoreA(scoreTeamA);
    }

    public void foulA(View v) {
        foulTeamA = foulTeamA + 1;
        tampilFoulA(foulTeamA);
    }


    public void tigaPoinB(View v) {
        scoreTeamB = scoreTeamB + 3;
        tampilScoreB(scoreTeamB);
    }

    public void duaPoinB(View v) {
        scoreTeamB = scoreTeamB + 2;
        tampilScoreB(scoreTeamB);
    }

    public void satuPoinB(View v) {
        scoreTeamB = scoreTeamB + 1;
        tampilScoreB(scoreTeamB);
    }

    public void foulB(View v) {
        foulTeamB = foulTeamB + 1;
        tampilFoulB(foulTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;

        tampilScoreA(scoreTeamA);
        tampilScoreB(scoreTeamB);
        tampilFoulA(foulTeamA);
        tampilFoulB(foulTeamB);

    }


    public void tampilScoreA(int score) {
        TextView scoreA = (TextView) findViewById(R.id.score_teamA);
        scoreA.setText(String.valueOf(score));
    }

    public void tampilScoreB(int score) {
        TextView scoreB = (TextView) findViewById(R.id.score_teamB);
        scoreB.setText(String.valueOf(score));
    }

    public void tampilFoulA(int score) {
        TextView foulA = (TextView) findViewById(R.id.foul_teamA);
        foulA.setText(String.valueOf(score));
    }

    public void tampilFoulB(int score) {
        TextView foulB = (TextView) findViewById(R.id.foul_teamB);
        foulB.setText(String.valueOf(score));
    }
}
