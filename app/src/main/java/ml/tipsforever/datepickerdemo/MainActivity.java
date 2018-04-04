package ml.tipsforever.datepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnId);
        textView = findViewById(R.id.showId);
        datePicker = findViewById(R.id.datePickerId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder builder = new StringBuilder();
                builder.append("Current Date : ");
                builder.append(datePicker.getDayOfMonth()+"/");
                builder.append(datePicker.getMonth()+1+"/");
                builder.append(datePicker.getYear());
                textView.setText(builder);
            }
        });
    }
}
