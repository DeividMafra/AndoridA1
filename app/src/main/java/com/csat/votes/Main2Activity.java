package com.csat.votes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    EditText txtName;
    EditText txtId;
    Spinner Cspinner;
    int a,b,c;
    public static String A, B, C;


    public void vote(View view) {
        if (!txtName.getText().toString().isEmpty() && !txtId.getText().toString().isEmpty()) {
            System.out.println(Cspinner.getSelectedItemId());
            System.out.println("myTest");
            switch (((int) Cspinner.getSelectedItemId())) {
                case 0:
                    a++;
                    A = new Integer(a).toString();
                    System.out.println(A);
                    break;
                case 1:
                    b++;
                    B = new Integer(b).toString();
                    break;
                case 2:
                    c++;
                    C = new Integer(c).toString();
                    break;
                default:
//                    some message
                    break;

            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtName = findViewById(R.id.nameTxt);
        txtId = findViewById(R.id.idTxt);
        Cspinner = findViewById(R.id.candidatesItems);
        System.out.println("m2==============================================");
        System.out.println(A);

    }
}
