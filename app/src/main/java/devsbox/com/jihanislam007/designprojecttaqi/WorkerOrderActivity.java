package devsbox.com.jihanislam007.designprojecttaqi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class WorkerOrderActivity extends AppCompatActivity {

    TextView request;
    Spinner serviceSpinner,
            TimeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_order);

        request = findViewById(R.id.request);


        ////////////////////////////////////////////
        // Spinner element
        serviceSpinner = (Spinner) findViewById(R.id.serviceSpinner);
        TimeSpinner = (Spinner) findViewById(R.id.TimeSpinner);


        // Spinner Drop down elements
        List<String> service = new ArrayList<String>();
        service.add("Service one");
        service.add("Service Two");
        service.add("Service Three");
        service.add("Service Four");
        service.add("Service Five");

        List<String> time = new ArrayList<String>();
        time.add("1 ");
        time.add("2 ");
        time.add("3 ");
        time.add("4 ");
        time.add("5 ");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, service);

        ArrayAdapter<String> timeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, time);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        timeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        serviceSpinner.setAdapter(dataAdapter);
        TimeSpinner.setAdapter(timeAdapter);

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(WorkerOrderActivity.this,PopUpActivity.class);
                intent.putExtra("service",String.valueOf(serviceSpinner.getSelectedItem()));
                intent.putExtra("time",String.valueOf(TimeSpinner.getSelectedItem()));
                startActivity(intent);
            }
        });
    }

}
