package com.englishforkids.fatmanur.englishforkids;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of " + QuizBook.questions.length);

        if (score == 40){
            mGrade.setText("congratulations");
        }else if (score == 39){
            mGrade.setText("Outstanding");
        }else if (score == 38||score == 37||score == 36||score == 35){
            mGrade.setText("Good Work");
        }else if (score == 34||score == 33||score == 32) {
            mGrade.setText("Good Effort");
        }else {
            mGrade.setText("Go over your notes");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });

    }
}
