package com.example.minimezun;


import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MezunRecyclerViewAdapter extends RecyclerView.Adapter<MezunRecyclerViewAdapter.ViewHolder> {
    private List<Mezun> mMezunlar;

    public MezunRecyclerViewAdapter(List<Mezun> mezunlar) {
        mMezunlar = mezunlar;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mezun_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mezun mezun = mMezunlar.get(position);
        holder.mAdSoyadTextView.setText(mezun.getAdSoyad());
        holder.mBolumTextView.setText(mezun.getBolum());
    }

    @Override
    public int getItemCount() {
        return mMezunlar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mAdSoyadTextView;
        public TextView mBolumTextView;

        public ViewHolder(View view) {
            super(view);
            mAdSoyadTextView = view.findViewById(R.id.ad_soyad_text_view);
            mBolumTextView = view.findViewById(R.id.bolum_text_view);
        }
    }
}
