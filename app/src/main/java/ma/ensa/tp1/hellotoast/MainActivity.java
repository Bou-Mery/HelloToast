package ma.ensa.tp1.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button countBtn , toastBtn , constraintBtn;
    private TextView cpt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        cpt = findViewById(R.id.cpt);
        countBtn = findViewById(R.id.countBtn);
        toastBtn = findViewById(R.id.toastBtn);

        constraintBtn = findViewById(R.id.constraintBtn);


        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cptInt = Integer.parseInt(cpt.getText().toString());
                cptInt ++;
                String cptStr = String.valueOf(cptInt);
                cpt.setText(cptStr);
            }
        });

        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello Toast",Toast.LENGTH_LONG).show();
            }
        });

        constraintBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , LinearActivity.class);
                startActivity(intent);
            }
        });


    }

}