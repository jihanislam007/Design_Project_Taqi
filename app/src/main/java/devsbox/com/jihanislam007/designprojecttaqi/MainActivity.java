package devsbox.com.jihanislam007.designprojecttaqi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import devsbox.com.jihanislam007.designprojecttaqi.Adaptor.FeaturePetLober_adaptor;
import devsbox.com.jihanislam007.designprojecttaqi.Adaptor.TopRatedPetLober_adaptor;
import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.FeaturePetLover;
import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.TopRatedPetLover;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    RecyclerView FeaturePetLover_RV,TopRatedPetLover_RV,newOnDogGaz_RV;
    ArrayList<TopRatedPetLover> categoryList = new ArrayList<TopRatedPetLover>();
    TopRatedPetLober_adaptor topRatedPetLober_adaptor;

    ArrayList<FeaturePetLover> featurePetLovers = new ArrayList<FeaturePetLover>();
    FeaturePetLober_adaptor featurePetLober_adaptor;

    ImageView image;

    LinearLayout index;

    private int[] images_data = {R.drawable.profile,
    R.drawable.slide};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image);
        index = (LinearLayout) findViewById(R.id.index);


        FeaturePetLover_RV = findViewById(R.id.FeaturePetLover_RV);
        TopRatedPetLover_RV = findViewById(R.id.TopRatedPetLover_RV);
        newOnDogGaz_RV = findViewById(R.id.newOnDogGaz_RV);

        FeaturePetLover_RV.setLayoutManager(new GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false));
        featurePetLober_adaptor = new FeaturePetLober_adaptor(this,featurePetLovers);
        FeaturePetLover_RV.setAdapter(featurePetLober_adaptor);

        TopRatedPetLover_RV.setLayoutManager(new GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false));
        topRatedPetLober_adaptor = new TopRatedPetLober_adaptor(this,categoryList);
        TopRatedPetLover_RV.setAdapter(topRatedPetLober_adaptor);

        newOnDogGaz_RV.setLayoutManager(new GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL, false));
        topRatedPetLober_adaptor = new TopRatedPetLober_adaptor(this,categoryList);
        newOnDogGaz_RV.setAdapter(topRatedPetLober_adaptor);

        test_data_feature();
        test_data_topRated();


        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,DashboardActivity.class);
                startActivity(in);
            }
        });

        index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,WorkerOrderActivity.class);
                startActivity(in);
            }
        });



    }

    public void test_data_topRated(){


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profile);


        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String temp = Base64.encodeToString(b, Base64.DEFAULT);


        Toast.makeText(this, temp, Toast.LENGTH_SHORT).show();


        TopRatedPetLover data1 = new TopRatedPetLover(temp,"Taqi Tahmid","Lover",1);
        categoryList.add(data1);

        TopRatedPetLover data2 = new TopRatedPetLover(temp,"Taqi Tahmid","Lover",2);
        categoryList.add(data2);

        TopRatedPetLover data3 = new TopRatedPetLover("https://i.udemycdn.com/course/750x422/403678_1d20_4.jpg","Taqi Tahmid","Lover",3);
        categoryList.add(data3);

        TopRatedPetLover data4 = new TopRatedPetLover("https://images-na.ssl-images-amazon.com/images/I/71iU53Q-gaL.png","Taqi Tahmid","Lover",4);
        categoryList.add(data4);

    }

    public void test_data_feature(){

        FeaturePetLover data1 = new FeaturePetLover(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","Lover",this.getString(R.string.string));
        featurePetLovers.add(data1);

        FeaturePetLover data2 = new FeaturePetLover(2,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","Lover",this.getString(R.string.string));
        featurePetLovers.add(data2);

        FeaturePetLover data3 = new FeaturePetLover(3,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","Lover",this.getString(R.string.string));
        featurePetLovers.add(data3);

        FeaturePetLover data4 = new FeaturePetLover(4,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","Lover",this.getString(R.string.string));
        featurePetLovers.add(data4);

    }


}
