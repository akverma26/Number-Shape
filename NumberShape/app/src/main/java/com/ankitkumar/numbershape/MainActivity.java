package com.ankitkumar.numbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void disToast(String string) {

        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

    class Number {
        double n;

        public boolean isTriangular() {

            double sum=0;
            for(double i=1; sum <= n ;i++) {
                sum+=i;
                if(sum==n) return true;
            }
            return false;

        }

        public boolean isSqaure() {

            double root = Math.sqrt(n);
            if(root==Math.floor(root)) return true;
            else return false;

        }

        public void checkNumber(){

            if(isSqaure() && isTriangular()) disToast("It is a Triangular and Square Number !!!");
            else if(isSqaure()) disToast("It is only a Square Number !!!");
            else if(isTriangular()) disToast("It is only a Triangular Number !!!");
            else disToast("It is Neither a Triangular nor Sqaure Number !!!");
        }
    }



    public void check(View view){

        EditText text = (EditText)findViewById(R.id.number);
        if(text.getText().toString().isEmpty()) disToast("Please Enter the Number !!!");
        else{
        Number number = new Number();
        number.n=Double.parseDouble(text.getText().toString());
        number.checkNumber();}

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
