package com.example.numadd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private TextView textView1;
    private TextView textView2;
    private EditText editText;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);

        button.setOnClickListener(new View.OnClickListener() {
//            @Override
           double sum = 0;
            public void onClick(View view) {
                String num1 = editText.getText().toString();
//                double a = Double.parseDouble(num1);
                String num2 = editText1.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    textView2.setText("Enter both numbers");
                    return;
                }
                double b = Double.parseDouble(num2);
                double a = Double.parseDouble(num1);

                sum = a + b;
                textView2.setText("Sum: " + sum);

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
