package com.example.baibuoi3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonHocAdapter extends RecyclerView.Adapter<MonHocAdapter.ViewHolder> {

    private List<MonHoc> lstMonHoc;
    public MonHocAdapter(List<MonHoc> lstMonHoc){
        this.lstMonHoc = lstMonHoc;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View viewMonHoc = inflater.inflate(R.layout.rsc,parent,false);
        ViewHolder viewHolder = new ViewHolder(viewMonHoc);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MonHocAdapter.ViewHolder viewHolder, int i) {
        MonHoc temp = lstMonHoc.get(i);
        viewHolder.tenHP.setText(temp.MaHp + "-" + temp.TenGV);
        viewHolder.tenGV.setText(temp.getTenGV());
        Context context = viewHolder.imageView.getContext();
        int imgId = context.getResources().getIdentifier(temp.getTenHinh(),"mipmap", context.getPackageName());
        if (imgId != 0)
            viewHolder.imageView.setImageResource(imgId);
    }

    @Override
    public int getItemCount() {
        return lstMonHoc.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tenGV;
        TextView tenHP;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imgMonHoc);
            this.tenGV = (TextView) itemView.findViewById(R.id.txtHocPhan);
            this.tenHP = (TextView) itemView.findViewById(R.id.txtGiaoVien);
        }

    }
}
