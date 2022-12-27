package com.UAS.petshop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterPetshop extends RecyclerView.Adapter<AdapterPetshop.VHPetshop> {
    private ArrayList<ModelPetshop> dataPetshop;
    private Context ctx;

    public AdapterPetshop(ArrayList<ModelPetshop> dataPetshop, Context ctx){
        this.dataPetshop = dataPetshop;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public VHPetshop onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View VW = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new VHPetshop(VW);
    }

    @Override
    public void onBindViewHolder(@NonNull VHPetshop holder, int position) {
        ModelPetshop Petshop = dataPetshop.get(position);

        holder.tvNama.setText(Petshop.getNama());
        holder.tvTentang.setText(Petshop.getTentang());
        holder.tvAlamat.setText(Petshop.getAlamat());
        holder.tvKoordinat.setText(Petshop.getKoordinat());


        Glide
                .with(ctx)
                .load(Petshop.getFoto())
                .centerCrop()
                .into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNama, xTentang, xFoto, xAlamat, xKoordinat;

                xNama = Petshop.getNama();
                xTentang = Petshop.getTentang();
                xFoto = Petshop.getFoto();
                xAlamat = Petshop.getAlamat();
                xKoordinat = Petshop.getKoordinat();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xFoto", xFoto);
                kirim.putExtra("xTentang", xTentang);
                kirim.putExtra("xAlamat", xAlamat);
                kirim.putExtra("xKoordinat", xKoordinat);
                ctx.startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataPetshop.size();
    }

    public class VHPetshop extends RecyclerView.ViewHolder {
        TextView tvNama, tvTentang, tvAlamat, tvKoordinat;
        ImageView ivFoto;

        public VHPetshop(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
            ivFoto = itemView.findViewById(R.id.iv_foto);
            tvAlamat = itemView.findViewById(R.id.tv_alamat);
            tvKoordinat = itemView.findViewById(R.id.tv_koordinat);
        }
    }
}



