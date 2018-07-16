package com.ankush.curuss;

import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mQuestionOneRadioGroup;
    private EditText mQuestionTwoEditText;
    private CheckBox mQuestionThreeOptionOne;
    private CheckBox mQuestionThreeOptionTwo;
    private CheckBox mQuestionThreeOptionThree;
    private CheckBox mQuestionThreeOptionFour;
    private CheckBox mQuestionFourOptionOne;
    private CheckBox mQuestionFourOptionTwo;
    private CheckBox mQuestionFourOptionThree;
    private CheckBox mQuestionFourOptionFour;
    private View mSubmitButton;
    private int mScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViews();
        setCheckBoxTypeface();
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswersAndCalculateScore();
                Toast.makeText(MainActivity.this, getString(R.string.score_text, mScore), Toast.LENGTH_SHORT).show();
                resetQuiz();
            }
        });
    }

    /**
     * Finds all the required views by their IDs
     */
    private void findAllViews() {
        mQuestionOneRadioGroup = findViewById(R.id.question_1_radio_group);
        mQuestionTwoEditText = findViewById(R.id.question_2_edit_text);
        mQuestionThreeOptionOne = findViewById(R.id.question_3_option_1);
        mQuestionThreeOptionTwo = findViewById(R.id.question_3_option_2);
        mQuestionThreeOptionThree = findViewById(R.id.question_3_option_3);
        mQuestionThreeOptionFour = findViewById(R.id.question_3_option_4);
        mQuestionFourOptionOne = findViewById(R.id.question_4_option_1);
        mQuestionFourOptionTwo = findViewById(R.id.question_4_option_2);
        mQuestionFourOptionThree = findViewById(R.id.question_4_option_3);
        mQuestionFourOptionFour = findViewById(R.id.question_4_option_4);
        mSubmitButton = findViewById(R.id.submit_button);
    }

    /**
     * Checks all the answers and updates the scores accordingly
     */
    private void checkAnswersAndCalculateScore() {
        if (mQuestionOneRadioGroup.getCheckedRadioButtonId() == R.id.question_1_option_2) {
            mScore++;
        }
        if (mQuestionTwoEditText.getText().toString().trim().equalsIgnoreCase("lamborghini")) {
            mScore++;
        }
        if (mQuestionThreeOptionOne.isChecked() && mQuestionThreeOptionTwo.isChecked()
                && mQuestionThreeOptionFour.isChecked() && !mQuestionThreeOptionThree.isChecked()) {
            mScore++;
        }
        if (mQuestionFourOptionTwo.isChecked() && mQuestionFourOptionThree.isChecked()
                && mQuestionFourOptionFour.isChecked() && !mQuestionFourOptionOne.isChecked()) {
            mScore++;
        }
    }

    /**
     * Sets the font of the checkboxes
     */
    private void setCheckBoxTypeface() {
        Typeface font = ResourcesCompat.getFont(this, R.font.convergence);
        mQuestionThreeOptionOne.setTypeface(font);
        mQuestionThreeOptionTwo.setTypeface(font);
        mQuestionThreeOptionThree.setTypeface(font);
        mQuestionThreeOptionFour.setTypeface(font);
        mQuestionFourOptionOne.setTypeface(font);
        mQuestionFourOptionTwo.setTypeface(font);
        mQuestionFourOptionThree.setTypeface(font);
        mQuestionFourOptionFour.setTypeface(font);
    }

    /**
     * Resets the quiz
     */
    private void resetQuiz() {
        mScore = 0;
        mQuestionOneRadioGroup.clearCheck();
        mQuestionTwoEditText.setText("");
        mQuestionThreeOptionOne.setChecked(false);
        mQuestionThreeOptionTwo.setChecked(false);
        mQuestionThreeOptionThree.setChecked(false);
        mQuestionThreeOptionFour.setChecked(false);
        mQuestionFourOptionOne.setChecked(false);
        mQuestionFourOptionTwo.setChecked(false);
        mQuestionFourOptionThree.setChecked(false);
        mQuestionFourOptionFour.setChecked(false);
    }
}
