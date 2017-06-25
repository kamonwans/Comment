package com.example.kamonwan.comment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kamonwan.comment.R;
import com.example.kamonwan.comment.model.Comment;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
    View view;
    ViewHolder viewHolder;
    private List<Comment> commentList;


    public RecyclerViewAdapter(Context context, List<Comment> commentList) {
        this.context = context;
        this.commentList = commentList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvName, tvDate, tvComment;
        public ImageView imgProfile;

        public ViewHolder(View v) {
            super(v);
            tvName = (TextView) v.findViewById(R.id.TextviewName);
            tvDate = (TextView) v.findViewById(R.id.TextviewDate);
            tvComment = (TextView) v.findViewById(R.id.TextviewComment);
            imgProfile = (ImageView) v.findViewById(R.id.imageUser);
        }
    }

    public void updateComment(List<Comment> commentList) {
        this.commentList = commentList;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context).inflate(R.layout.item_comment, parent, false);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvName.setText(commentList.get(position).getName());
        holder.tvDate.setText(commentList.get(position).getDate());
        holder.tvComment.setText(commentList.get(position).getMsg());
        holder.imgProfile.setImageResource(commentList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

}
