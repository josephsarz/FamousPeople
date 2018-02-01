package com.codegene.femicodes.famouspeople;

import android.arch.persistence.room.Room;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by femicodes on 2/1/2018.
 */

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final UserAdapter.ViewHolder holder, final int position) {

        holder.firstname.setText(users.get(position).getFirstName());
        holder.lastname.setText(users.get(position).getLastName());
        holder.email.setText(users.get(position).getEmail());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView firstname;
        TextView lastname;
        TextView email;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            firstname = itemView.findViewById(R.id.first_name_tv);
            lastname = itemView.findViewById(R.id.last_name_tv);
            email = itemView.findViewById(R.id.user_email_tv);
        }

    }
}
