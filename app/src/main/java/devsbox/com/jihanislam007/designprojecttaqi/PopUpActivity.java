package devsbox.com.jihanislam007.designprojecttaqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class PopUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.8));

        //////////////////////////////////

        TextView  textView=(TextView) findViewById(R.id.pop_up_serviceTV);
        TextView  timeTV=(TextView) findViewById(R.id.timeSpinner);
        TextView  dateTV=(TextView) findViewById(R.id.dateTV);


        Bundle bundle=getIntent().getExtras();
        String data=bundle.get("service").toString();
        textView.setText(data);

        String time = bundle.get("time").toString();
        timeTV.setText(time);

        String date = bundle.get("date").toString();
        dateTV.setText(date);



    }
}
