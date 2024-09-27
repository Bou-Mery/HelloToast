package ma.ensa.tp1.hellotoast;

import static ma.ensa.tp1.hellotoast.R.id.countBtn;

import android.os.Bundle;
import android.support.v4.os.IResultReceiver2;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LinearActivity extends AppCompatActivity {

    private Button countBtn , toastBtn ;
    private TextView cpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_linear);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        cpt = findViewById(R.id.cpt);
        countBtn = findViewById(R.id.countBtn);
        toastBtn = findViewById(R.id.toastBtn);


        /*countBtn.setOnClickListener(new View.OnClickListener() {
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
                Toast.makeText(LinearActivity.this,"Hello Toast",Toast.LENGTH_LONG).show();
            }
        });*/

    }

    public void onclick(View view) {
        int id = view.getId();
        cpt = findViewById(R.id.cpt);


        if(id==R.id.toastBtn){
            Toast.makeText(LinearActivity.this,"Hello 1",Toast.LENGTH_LONG).show();
        }
        else if(id==R.id.countBtn){
            Toast.makeText(LinearActivity.this,"Hello 2",Toast.LENGTH_LONG).show();
        }
    }
}