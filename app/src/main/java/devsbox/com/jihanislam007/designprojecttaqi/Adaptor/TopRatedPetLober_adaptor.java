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

import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.TopRatedPetLover;
import devsbox.com.jihanislam007.designprojecttaqi.R;

public class TopRatedPetLober_adaptor extends RecyclerView.Adapter<TopRatedPetLober_adaptor.myViewHolder>{

    Context mcontext;
    ArrayList<TopRatedPetLover> categoryList;

    public TopRatedPetLober_adaptor(Context context, ArrayList<TopRatedPetLover> categoryList){
        this.mcontext = context;
        this.categoryList = categoryList;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_top_rated_pet_lover,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, final int position) {

         Glide.with(mcontext)
                .load(categoryList.get(position).getCategoryImage())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.topRatedPetLoverIV);

        //  Log.e("image",categoryList.get(position).getCategoryImage());

        holder.topRatedPetLoverNameTV.setText(categoryList.get(position).getCategoryName());
        holder.topRatedPetLoverSubTitleTV.setText(categoryList.get(position).getCategorySubTitle());
        //    holder.catagoryCounterTV.setText(String.valueOf(categoryList.get(position).getCounter()));

        holder.topRatedPetLoverIV.setOnClickListener(new View.OnClickListener() {
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
        TextView topRatedPetLoverNameTV,
                topRatedPetLoverSubTitleTV;
        ImageView topRatedPetLoverIV;

        public myViewHolder(View itemView) {
            super(itemView);


            backgroundLinearLayout = itemView.findViewById(R.id.backgroundLinearLayout);
            topRatedPetLoverIV = itemView.findViewById(R.id.topRatedPetLoverIV);
            topRatedPetLoverNameTV = itemView.findViewById(R.id.topRatedPetLoverNameTV);
            topRatedPetLoverSubTitleTV = itemView.findViewById(R.id.topRatedPetLoverSubTitleTV);


        }

        @Override
        public void onClick(View view) {

        }
    }
}