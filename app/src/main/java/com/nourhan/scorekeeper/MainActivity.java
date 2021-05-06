package com.nourhan.scorekeeper;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int score_team2=0;
    int score_team1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View view) {
        TextView score1_text = findViewById(R.id.score1_text);
        TextView score2_text = findViewById(R.id.score2_text);
        score1_text.setText("0");
        score2_text.setText("0");
        score_team2=0;
        score_team1=0;
    }
    public void increment_team1(View view) {
        score_team1 =score_team1+ 1;
        display_team1(score_team1);
    }
    public void increment_team2(View view) {
        score_team2 = score_team2+ 1;
        display_team2(score_team2);
    }
    private void display_team1(int number){
        TextView score1_text = findViewById(R.id.score1_text);
        score1_text.setText("" + score_team1);
    }
    private void display_team2(int number){
        TextView score2_text = findViewById(R.id.score2_text);
        score2_text.setText("" + score_team2);
    }
}