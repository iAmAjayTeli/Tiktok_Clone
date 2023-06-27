package com.example.tiktokclone;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiktokclone.databinding.ReelDgBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.VideoHolder> {
    Context context;
    ArrayList<Model> ModelArrayList=new ArrayList<>();
     Boolean isPlaying=false;
    public Adapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        ModelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public VideoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.reel_dg,parent,false);
        return new VideoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoHolder holder, int position) {
        holder.binding.videoView.setVideoPath(ModelArrayList.get(position).getVediUrl());
        holder.binding.name.setText(ModelArrayList.get(position).getName());
        holder.binding.profileImage.setImageResource(ModelArrayList.get(position).getProfile());
        holder.binding.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                isPlaying=true;
            }
        });
        holder.binding.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.start();
                isPlaying=true;
            }
        });
        holder.binding.videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlaying)
                {
                    holder.binding.videoView.pause();
                    isPlaying=false;
                }
                else
                {
                    holder.binding.videoView.resume();
                    isPlaying=true;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return ModelArrayList.size();
    }

    public  class VideoHolder extends RecyclerView.ViewHolder {
        ReelDgBinding binding;
        public VideoHolder(@NonNull View itemView) {
            super(itemView);
            binding=ReelDgBinding.bind(itemView);
        }
    }

}
