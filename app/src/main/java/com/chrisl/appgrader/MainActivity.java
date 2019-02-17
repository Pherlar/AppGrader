package com.chrisl.appgrader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
   private int currentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitButton(View view){
        // reset currentScore on push of button
        currentScore = 0;

        // get Name or number input field
        EditText nameEditText = findViewById(R.id.nameEditTextView);
        String nameOrNumber = nameEditText.getText().toString();
        Log.i("MainActivity", "Student ID is " + nameOrNumber);

        // Check Result of Criteria 1 - Must be 4 or greater
        EditText numOfQsEditText = findViewById(R.id.numOfQsEditTextView);
        String stringNumOfQs = numOfQsEditText.getText().toString();
        int intNumOfQs;
        try {
            intNumOfQs = Integer.parseInt(stringNumOfQs);
        }
        catch (NumberFormatException e) {
            intNumOfQs = 0;
        }
        if(intNumOfQs >= 4)
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 1: Passed!");

        }
        else
        {
            Log.i("MainActivity", "Criteria 1: Failed");
        }

        // Check Result of Criteria 2 - Check box (all need to be checked to earn one point)
        CheckBox c2checkboxCheckbox = findViewById(R.id.c2checkbox_checkbox);
        CheckBox c2radioButtonCheckbox = findViewById(R.id.c2radioButton_checkbox);
        CheckBox c2TextEntry_checkbox = findViewById(R.id.c2TextEntry_checkbox);

                //check if all 3 checkboxes have been checked
        if(c2checkboxCheckbox.isChecked() && c2radioButtonCheckbox.isChecked() && c2TextEntry_checkbox.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 2: Passed!");

        }
        else
        {
            Log.i("MainActivity", "Criteria 2: Failed");
        }

        // Check Result of Criteria 3 - True/False
        RadioButton c3RadioButton1 = findViewById(R.id.c3RadioButton1);
        if(c3RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 3: Passed!");

        }

        // Check Result of Criteria 4 - True/False
        RadioButton c4RadioButton1 = findViewById(R.id.c4RadioButton1);
        if(c4RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 4: Passed!");

        }


        // Check Result of Criteria 5 - Check box (all need to be checked to earn one point)
        CheckBox c5checkbox1 = findViewById(R.id.c5checkbox1);
        CheckBox c5checkbox2 = findViewById(R.id.c5checkbox2);
        CheckBox c5checkbox3 = findViewById(R.id.c5checkbox3);

        //check if all 3 checkboxes have been checked
        if(c5checkbox1.isChecked() && c5checkbox2.isChecked() && c5checkbox3.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 5: Passed!");

        }
        else
        {
            Log.i("MainActivity", "Criteria 5: Failed");
        }


        // Check Result of Criteria 6 - Check box (at least 4 need to be checked to get one point)
        CheckBox c6checkbox1 = findViewById(R.id.c6checkbox1);
        CheckBox c6checkbox2 = findViewById(R.id.c6checkbox2);
        CheckBox c6checkbox3 = findViewById(R.id.c6checkbox3);
        CheckBox c6checkbox4 = findViewById(R.id.c6checkbox4);
        CheckBox c6checkbox5 = findViewById(R.id.c6checkbox5);
        CheckBox c6checkbox6 = findViewById(R.id.c6checkbox6);
        CheckBox c6checkbox7 = findViewById(R.id.c6checkbox7);
        CheckBox c6checkbox8 = findViewById(R.id.c6checkbox8);
        CheckBox c6checkbox9 = findViewById(R.id.c6checkbox9);
        CheckBox c6checkbox10 = findViewById(R.id.c6checkbox10);


        //check if all 3 checkboxes have been checked
        int c6checkboxcounter = 0;
        if(c6checkbox1.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox2.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox3.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox4.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox5.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox6.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox7.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox8.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox9.isChecked()) {
            c6checkboxcounter ++;
        }
        if(c6checkbox10.isChecked())
        {
            c6checkboxcounter ++;
        }

        if (c6checkboxcounter >=4){
            currentScore ++;
            Log.i("MainActivity", "Criteria 6: Passed!");
        }
        else
        {
            Log.i("MainActivity", "Criteria 6: Failed");
        }


        // Check Result of Criteria 7 - True/False
        RadioButton c7RadioButton1 = findViewById(R.id.c7RadioButton1);
        if(c7RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 7: Passed!");

        }

        // Check Result of Criteria 8 - True/False
        RadioButton c8RadioButton1 = findViewById(R.id.c8RadioButton1);
        if(c8RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 8: Passed!");

        }


        // Check Result of Criteria 9 - True/False
        RadioButton c9RadioButton1 = findViewById(R.id.c9RadioButton1);
        if(c9RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 9: Passed!");

        }


        // Check Result of Criteria 10 - True/False
        RadioButton c10RadioButton1 = findViewById(R.id.c10RadioButton1);
        if(c10RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 10: Passed!");

        }

        // Check Result of Criteria 11 - True/False
        RadioButton c11RadioButton1 = findViewById(R.id.c11RadioButton1);
        if(c11RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 11: Passed!");

        }

        // Check Result of Criteria 12 - True/False
        RadioButton c12RadioButton1 = findViewById(R.id.c12RadioButton1);
        if(c12RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 12: Passed!");

        }

        // Check Result of Criteria 13 - True/False
        RadioButton c13RadioButton1 = findViewById(R.id.c13RadioButton1);
        if(c13RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 13: Passed!");

        }

        // Check Result of Criteria 14 - True/False
        RadioButton c14RadioButton1 = findViewById(R.id.c14RadioButton1);
        if(c14RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 14: Passed!");

        }

        // Check Result of Criteria 15 - True/False
        RadioButton c15RadioButton1 = findViewById(R.id.c15RadioButton1);
        if(c15RadioButton1.isChecked())
        {
            currentScore ++;
            Log.i("MainActivity", "Criteria 15: Passed!");

        }


        if(currentScore >= 15)
        {
            Toast.makeText(this, "Success! \n" +
                    "Student - " + nameOrNumber + " has met all 15 criteria!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Failure :( \n" +
                    "Student - " + nameOrNumber + " has only met " + currentScore + " out of 15 criteria", Toast.LENGTH_LONG).show();
        }

}



}


