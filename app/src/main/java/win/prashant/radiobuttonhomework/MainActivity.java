package win.prashant.radiobuttonhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton1,radioButton2,radioButton3;
    Button btn1;
    EditText EditText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view by id
        radioButton1 = findViewById(R.id.radioButtonMale);
        radioButton2 = findViewById(R.id.radioButtonFemale);
        radioButton3 = findViewById(R.id.radioButtonOther);

        btn1 = findViewById(R.id.buttonSubmit);
        EditText1= findViewById(R.id.editTextOther);

        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()){
                    EditText1.setVisibility(View.VISIBLE);
                }
                else {
                    EditText1.setVisibility(View.GONE);
                }
            }
        });

      //btn1.setOnClickListener(MainActivity.this);



    }

    public void buttonclickEvent(View view)
    {
        if(radioButton1.isChecked()){
           // Toast.makeText(getApplicationContext(),radioButton1.getText().toString(),Toast.LENGTH_SHORT).show();
            btn1.setText("Your choice: " + radioButton1.getText());
        }

        if(radioButton2.isChecked()){
            //Toast.makeText(getApplicationContext(),radioButton2.getText().toString(),Toast.LENGTH_SHORT).show();
            btn1.setText("Your choice: " + radioButton2.getText());
        }
        if(radioButton3.isChecked()){
           // Toast.makeText(getApplicationContext(),radioButton3.getText().toString(),Toast.LENGTH_SHORT).show();
            btn1.setText("Your choice: " + EditText1.getText());
        }
    }
}
