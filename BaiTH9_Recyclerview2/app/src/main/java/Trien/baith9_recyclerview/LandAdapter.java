package Trien.baith9_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandAdapter extends RecyclerView.Adapter<LandAdapter.ItemLandHolder>{
    Context context;
    ArrayList<LandScape> lstData;

    public LandAdapter(ArrayList<LandScape> lstData, Context context) {
        this.lstData = lstData;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
       View vItem = cai_bom.inflate(R.layout.item_land,parent,false);
       ItemLandHolder viewholderCreated = new ItemLandHolder(vItem);

        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        LandScape landScapeHienThi =lstData.get(position);

        String cation = landScapeHienThi.getLandCation();
        String tenAnh  = landScapeHienThi.getLangImagefileName();
        holder.tvCaption.setText(cation);
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenAnh,"ninap", packageName);
        holder.ivLandCaption.setImageResource(imageID);

    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivLandCaption;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandCaption = itemView.findViewById(R.id.imageViewLand);
        }
    }
}
