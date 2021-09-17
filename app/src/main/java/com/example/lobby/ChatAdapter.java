package com.example.lobby;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lobby_row,parent,false);
        return new chatsViewholder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((chatsViewholder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return ContactsData.names.length;
    }

    private class chatsViewholder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView dp;
        private TextView name;
        private TextView LastText;

        public chatsViewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvName);
            LastText = itemView.findViewById(R.id.tvText);
            dp = itemView.findViewById(R.id.circularImageView);

        }

        public void bindView(int position)
        {
            name.setText(ContactsData.names[position]);
            LastText.setText(ContactsData.lastMessage[position]);
            dp.setImageResource(ContactsData.photos[position]);
        }


        @Override
        public void onClick(View view) {


        }
    }
}
