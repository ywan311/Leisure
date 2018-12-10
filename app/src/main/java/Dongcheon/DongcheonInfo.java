package Dongcheon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.skhu.NaverMap.DongcheonMap;
import net.skhu.leisure.R;

public class DongcheonInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dongcheoninfo);
        final Button button1 = (Button)findViewById(R.id.btnmap);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DongcheonMap.class);
                startActivity(intent);
            }
        });
    }

}
