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

import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.FeaturePetLover;
import devsbox.com.jihanislam007.designprojecttaqi.ModelClass.TopRatedPetLover;
import devsbox.com.jihanislam007.designprojecttaqi.R;

public class FeaturePetLober_adaptor extends RecyclerView.Adapter<FeaturePetLober_adaptor.myViewHolder>{

    Context mcontext;
    ArrayList<FeaturePetLover> featurePetLovers;

    public FeaturePetLober_adaptor(Context context, ArrayList<FeaturePetLover> featurePetLovers){
        this.mcontext = context;
        this.featurePetLovers = featurePetLovers;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_featured_pet_lover,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, final int position) {

         Glide.with(mcontext)
                .load(featurePetLovers.get(position).getCategoryImage())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.featurePetLoverIV);

        //  Log.e("image",categoryList.get(position).getCategoryImage());

        holder.featurePetLoverNameTV.setText(featurePetLovers.get(position).getCategoryName());
        holder.featurePetLoverAddressTV.setText(featurePetLovers.get(position).getCategoryAddress());
        holder.featurePetLoverFeatureTV.setText(featurePetLovers.get(position).getCategoryFeature());
        holder.featurePetLoverDetailsTV.setText(featurePetLovers.get(position).getCategoryDetails());

        holder.featurePetLoverIV.setOnClickListener(new View.OnClickListener() {
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
        return featurePetLovers.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        LinearLayout backgroundLinearLayout;
        TextView featurePetLoverNameTV,
                featurePetLoverAddressTV,
                featurePetLoverFeatureTV,
                featurePetLoverDetailsTV;
        ImageView featurePetLoverIV;

        public myViewHolder(View itemView) {
            super(itemView);


            backgroundLinearLayout = itemView.findViewById(R.id.backgroundLinearLayout);
            featurePetLoverIV = itemView.findViewById(R.id.featurePetLoverIV);

            featurePetLoverNameTV = itemView.findViewById(R.id.featurePetLoverNameTV);
            featurePetLoverAddressTV = itemView.findViewById(R.id.featurePetLoverAddressTV);
            featurePetLoverFeatureTV = itemView.findViewById(R.id.featurePetLoverFeatureTV);
            featurePetLoverDetailsTV = itemView.findViewById(R.id.featurePetLoverDetailsTV);


        }

        @Override
        public void onClick(View view) {

        }
    }
}