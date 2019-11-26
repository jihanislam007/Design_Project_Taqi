package devsbox.com.jihanislam007.designprojecttaqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WorkerOrderActivity extends AppCompatActivity {

    TextView request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_order);

        request = findViewById(R.id.request);

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),PopUpActivity.class);
                startActivity(intent);
            }
        });

    }
}
