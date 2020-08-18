package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {

    Button btn;
    Tost tst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        onclick();

    }
    public void onclick(){
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context=getApplicationContext();
                        CharSequence text="You just click the ok button";
                        int duration=Tost.LENGTH_SHORT;
                        tst.setGravity(Gravity.CENTER);
                        tst.show();

                        tst=Tost.makeText(context,text,duration);
                       Intent i=new Intent("SecondActivity");
                    }
                }
        );
    }
}