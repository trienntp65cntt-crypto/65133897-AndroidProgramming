package com.trien.vieccanlam;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskRVadapter extends RecyclerView.Adapter {
    List<TASKS> dataSource;

    public TaskRVadapter(List<TASKS> dataSource) {
        this.dataSource = dataSource;
    }
    //
    public class TaskItemviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvTenVCl;
        TextView tvNgayHetHan;
        public int position;

        public TaskItemviewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvTenVCl =  itemView.findViewById(R.id.textViewTenVCL);
            tvNgayHetHan = itemView.findViewById(R.id.textViewThoiGian);
        }

        @Override
        public void onClick(View v) {
            // laay vi tri
            int vtClicked = getAdapterPosition();
            // luc o nguon
            TASKS tasksClicked = dataSource.get(vtClicked);
            // xu ly
            Toast.makeText(v.getContext(), "Bạn vừa chọn việc" + tasksClicked.getName(),Toast.LENGTH_SHORT).show();


        }
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item,parent,false);
        TaskItemviewHolder viewHolder = new TaskItemviewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        TaskItemviewHolder viewHolder = (TaskItemviewHolder) holder;
        viewHolder.position = position;
        TASKS tasks = dataSource.get(position);
        ((TaskItemviewHolder) holder).tvTenVCl.setText(tasks.getName());
        ((TaskItemviewHolder) holder).tvNgayHetHan.setText(tasks.getDate());
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}
