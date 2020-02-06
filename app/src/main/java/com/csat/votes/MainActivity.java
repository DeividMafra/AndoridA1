package com.csat.votes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAvote;
    TextView txtBvote;
    TextView txtCvote;

//    public static String voteA = Main2Activity.A;
//    public static String voteB = Main2Activity.B;
//    public static String voteC = Main2Activity.C;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAvote = findViewById(R.id.cAVoteTxt);
        txtBvote = findViewById(R.id.cBVoteTxt);
        txtCvote = findViewById(R.id.cCVoteTxt);
    }

    public void voteScreen(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
//        intent.putExtra("fruit", textView.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

//        Intent intent = getIntent();
//        String aVote = intent.getExtras().getString("voteA");
//        String bVote = intent.getExtras().getString("voteB");
//        String cVote = intent.getExtras().getString("voteC");

        txtAvote.setText(Main2Activity.A);
        txtBvote.setText(Main2Activity.B);
        txtCvote.setText(Main2Activity.C);
    }
}
