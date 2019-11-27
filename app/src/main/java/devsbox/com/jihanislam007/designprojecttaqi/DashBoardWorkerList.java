package devsbox.com.jihanislam007.designprojecttaqi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;

import devsbox.com.jihanislam007.designprojecttaqi.Adaptor.DashBord_Worker_List_adaptor;
import devsbox.com.jihanislam007.designprojecttaqi.Adaptor.TopRatedPetLober_adaptor;
import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.DashBoard_worker_list;
import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.FeaturePetLover;
import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.TopRatedPetLover;

public class DashBoardWorkerList extends AppCompatActivity {

    RecyclerView DashBoardWorkerList_RV;
    ArrayList<DashBoard_worker_list> dashBoardWorkerLists = new ArrayList<DashBoard_worker_list>();
    DashBord_Worker_List_adaptor dashBord_worker_list_adaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_worker_list);
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        DashBoardWorkerList_RV = findViewById(R.id.DashBoardWorkerList_RV);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(DashBoardWorkerList.this,WorkerOrderActivity.class);
                startActivity(in);
            }
        });


        DashBoardWorkerList_RV.setLayoutManager(new GridLayoutManager(this,1));
        dashBord_worker_list_adaptor = new DashBord_Worker_List_adaptor(this,dashBoardWorkerLists);
        DashBoardWorkerList_RV.setAdapter(dashBord_worker_list_adaptor);

        test_data_worker();

    }

    public void test_data_worker(){

        DashBoard_worker_list data1 = new DashBoard_worker_list(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","10-11-19");
        dashBoardWorkerLists.add(data1);

        DashBoard_worker_list data2 = new DashBoard_worker_list(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","10-11-19");
        dashBoardWorkerLists.add(data2);

        DashBoard_worker_list data3 = new DashBoard_worker_list(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","10-11-19");
        dashBoardWorkerLists.add(data3);

        DashBoard_worker_list data4 = new DashBoard_worker_list(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","10-11-19");
        dashBoardWorkerLists.add(data4);

        DashBoard_worker_list data5 = new DashBoard_worker_list(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","10-11-19");
        dashBoardWorkerLists.add(data5);

        DashBoard_worker_list data6 = new DashBoard_worker_list(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","10-11-19");
        dashBoardWorkerLists.add(data6);

        DashBoard_worker_list data7 = new DashBoard_worker_list(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","10-11-19");
        dashBoardWorkerLists.add(data7);

        DashBoard_worker_list data8 = new DashBoard_worker_list(1,"https://image.flaticon.com/icons/png/128/167/167707.png","Taqi Tahmid","123, Dhanmondhi","10-11-19");
        dashBoardWorkerLists.add(data8);


    }


}
