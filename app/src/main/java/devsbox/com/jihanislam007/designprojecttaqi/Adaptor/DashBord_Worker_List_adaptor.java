package devsbox.com.jihanislam007.designprojecttaqi.Adaptor;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

import devsbox.com.jihanislam007.designprojecttaqi.DashBoardWorkerList;
import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.DashBoard_worker_list;
import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.TopRatedPetLover;
import devsbox.com.jihanislam007.designprojecttaqi.R;

public class DashBord_Worker_List_adaptor extends RecyclerView.Adapter<DashBord_Worker_List_adaptor.myViewHolder>{

    Context mcontext;
    ArrayList<DashBoard_worker_list> categoryList;

    public DashBord_Worker_List_adaptor(Context context, ArrayList<DashBoard_worker_list> categoryList){
        this.mcontext = context;
        this.categoryList = categoryList;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_dash_board_worker_list,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, final int position) {

         Glide.with(mcontext)
                .load(categoryList.get(position).getCategoryImage())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.dashboardworkerIV);

        //  Log.e("image",categoryList.get(position).getCategoryImage());

        holder.dashBoardWorkerNameTV.setText(categoryList.get(position).getCategoryName());
        holder.dashBoardWorkerTimeSheduleTV.setText(categoryList.get(position).getCategoryTimeShedule());
        holder.dashBoardWorkerDateTV.setText(categoryList.get(position).getCategoryDate());

        holder.dashboardworkerIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();

                /*bundle.putInt("category_id",categoryList.get(position).CategoryId);

                bundle.putString("category_name",categoryList.get(position).getCategoryName());
                bundle.putString("CategoryImage",categoryList.get(position).getCategoryImage());

                RecipeListFragment recipeListFragment = new RecipeListFragment();
                recipeListFragment.setArguments(bundle);
                //   Toast.makeText(mcontext, "Image :"+String.valueOf(bundle), Toast.LENGTH_SHORT).show();
                FragmentTransaction fragTransaction = ((DashBoardActivity)mcontext).getSupportFragmentManager().beginTransaction();
                fragTransaction.replace(R.id.frag_container,recipeListFragment );
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();*/
            }
        });


        holder.backgroundLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Bundle bundle=new Bundle();
                bundle.putInt("category_id",categoryList.get(position).CategoryId);

                bundle.putString("category_name",categoryList.get(position).getCategoryName());
                bundle.putString("CategoryImage",categoryList.get(position).getCategoryImage());

                RecipeListFragment recipeListFragment = new RecipeListFragment();
                recipeListFragment.setArguments(bundle);
                //   Toast.makeText(mcontext, "Image :"+String.valueOf(bundle), Toast.LENGTH_SHORT).show();
                FragmentTransaction fragTransaction = ((DashBoardActivity)mcontext).getSupportFragmentManager().beginTransaction();
                fragTransaction.replace(R.id.frag_container,recipeListFragment );
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();*/

            }
        });


    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        LinearLayout backgroundLinearLayout;
        TextView dashBoardWorkerNameTV,
                dashBoardWorkerTimeSheduleTV,
                dashBoardWorkerDateTV;
        ImageView dashboardworkerIV;

        public myViewHolder(View itemView) {
            super(itemView);


            backgroundLinearLayout = itemView.findViewById(R.id.backgroundLinearLayout);
            dashboardworkerIV = itemView.findViewById(R.id.dashboardworkerIV);

            dashBoardWorkerNameTV = itemView.findViewById(R.id.dashBoardWorkerNameTV);
            dashBoardWorkerTimeSheduleTV = itemView.findViewById(R.id.dashBoardWorkerTimeSheduleTV);
            dashBoardWorkerDateTV = itemView.findViewById(R.id.dashBoardWorkerDateTV);


        }

        @Override
        public void onClick(View view) {

        }
    }
}