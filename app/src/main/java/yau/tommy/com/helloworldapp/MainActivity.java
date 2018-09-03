package yau.tommy.com.helloworldapp;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView txtHello;
    Button btnChTxtStr;
    Button btnChViewColor;
    Button btnChTxtColor;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChTxtStr = findViewById(R.id.btnChTxtStr);
        btnChViewColor = findViewById(R.id.btnChViewColor);
        btnChTxtColor = findViewById(R.id.btnChTxtColor);

        editText = findViewById(R.id.editText);
        txtHello = findViewById(R.id.txtHello);

        constraintLayout = findViewById(R.id.myConstraint);


        btnChTxtStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                if(!text.equals("")){
                    txtHello.setText(text);
                }else{
                    txtHello.setText("Android is Awesome!");
                }
            }
        });

        btnChViewColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });

        btnChTxtColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHello.setTextColor(getResources().getColor(R.color.white));
            }
        });


        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                txtHello.setTextColor(getResources().getColor(R.color.black));
                txtHello.setText(getResources().getString(R.string.hello));
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            }
        });
    }
}
