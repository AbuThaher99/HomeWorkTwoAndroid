package com.example.homeworktwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


TextView tr;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arrayOfStrings = {"Mohammad didn't choose Computer sci." +
                " just for the money he had worked in computers and programming since he was 14" +
                " he learned how to code javascript to be able to program a discord bot with Node.Js" +
                ", and he published his first project when he was 15 and earned the first 100$ when he" +
                " was 15 by coding a music bot, Mohammad didn't enter this field for the money he entered it" +
                " for his passion in computer some people bought their first bicycle when they were 6, I bought my first computer when I was 6."};
        StringBuilder sb = new StringBuilder();

        for (String s : arrayOfStrings) {
            sb.append(s).append("\n");
        }

        String text = sb.toString();
        tr=findViewById(R.id.textArea);
        tr.setText(text);


    }


    public void add(View v){



        TextView plainText = findViewById(R.id.textF);

            if (!plainText.getText().toString().isEmpty()) {
                String text = plainText.getText().toString();

                LinearLayout linearLayout = findViewById(R.id.main);
                TextView textView = new TextView(this);
                textView.setText(text);
                textView.setTextSize(20);
                textView.setGravity(Gravity.CENTER);
                textView.setTextColor(Color.parseColor("#51087E"));



                linearLayout.addView(textView,5);

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Message")
                        .setMessage("Added Successfully ")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // do something when the OK button is clicked
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

                tr=findViewById(R.id.textArea);
                //  tr.setGravity(Gravity.BOTTOM);
                tr.setTranslationY(130
                );
                plainText.setText("");

            }else{

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Message")
                        .setMessage("You Must Fill the Text ")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // do something when the OK button is clicked
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }


    }
}