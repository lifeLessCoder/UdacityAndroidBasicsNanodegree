package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int runsTeamA = 0;
    int wicketsTeamA = 0;
    int runsTeamB = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increases runs of Team A by 1
     */
    public void addOneRunForTeamA(View view) {
        if (wicketsTeamA == 10) {
            return;
        }
        runsTeamA = runsTeamA + 1;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * Increases runs of Team A by 2
     */
    public void addTwoRunsForTeamA(View view) {
        if (wicketsTeamA == 10) {
            return;
        }
        runsTeamA = runsTeamA + 2;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * Increases runs of Team A by 4
     */
    public void addFourRunsForTeamA(View view) {
        if (wicketsTeamA == 10) {
            return;
        }
        runsTeamA = runsTeamA + 4;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * Increases runs of Team A by 6
     */
    public void addSixRunsForTeamA(View view) {
        if (wicketsTeamA == 10) {
            return;
        }
        runsTeamA = runsTeamA + 6;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * Increases no of out players of Team A by 1
     */
    public void addOneOutForTeamA(View view) {
        if (wicketsTeamA == 10) {
            return;
        }
        wicketsTeamA = wicketsTeamA + 1;
        displayNoOfOutPlayersForTeamA(wicketsTeamA);
    }

    /**
     * Increases runs of Team B by 1
     */
    public void addOneRunForTeamB(View view) {
        if (wicketsTeamB == 10) {
            return;
        }
        runsTeamB = runsTeamB + 1;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * Increases runs of Team B by 2
     */
    public void addTwoRunsForTeamB(View view) {
        if (wicketsTeamB == 10) {
            return;
        }
        runsTeamB = runsTeamB + 2;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * Increases runs of Team B by 4
     */
    public void addFourRunsForTeamB(View view) {
        if (wicketsTeamB == 10) {
            return;
        }
        runsTeamB = runsTeamB + 4;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * Increases runs of Team B by 6
     */
    public void addSixRunsForTeamB(View view) {
        if (wicketsTeamB == 10) {
            return;
        }
        runsTeamB = runsTeamB + 6;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * Increases no of out players of Team B by 1
     */
    public void addOneOutForTeamB(View view) {
        if (wicketsTeamB == 10) {
            return;
        }
        wicketsTeamB = wicketsTeamB + 1;
        displayNoOfOutPlayersForTeamB(wicketsTeamB);
    }

    /**
     * Reset the values
     */
    public void reset(View view) {
        runsTeamA = 0;
        runsTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        displayRunsForTeamA(runsTeamA);
        displayRunsForTeamB(runsTeamB);
        displayNoOfOutPlayersForTeamA(wicketsTeamA);
        displayNoOfOutPlayersForTeamB(wicketsTeamB);
    }

    /**
     * Displays Runs for Team A
     */
    private void displayRunsForTeamA(int runs) {
        TextView runsTextView = findViewById(R.id.runs_A);
        runsTextView.setText(String.valueOf(runs));
    }

    /**
     * Displays Wickets gone for Team A
     */
    private void displayNoOfOutPlayersForTeamA(int wickets) {
        TextView wicketsTextView = findViewById(R.id.wickets_A);
        wicketsTextView.setText(String.valueOf(wickets));
    }

    /**
     * Displays Runs for Team B
     */
    private void displayRunsForTeamB(int runs) {
        TextView runsTextView = findViewById(R.id.runs_B);
        runsTextView.setText(String.valueOf(runs));
    }

    /**
     * Displays Wickets gone for Team B
     */
    private void displayNoOfOutPlayersForTeamB(int wickets) {
        TextView wicketsTextView = findViewById(R.id.wickets_B);
        wicketsTextView.setText(String.valueOf(wickets));
    }
}
