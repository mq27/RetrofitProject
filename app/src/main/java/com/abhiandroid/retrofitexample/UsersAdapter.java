package com.abhiandroid.retrofitexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by jarviisinfotech on 03/01/18.
 */

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UsersViewHolder> {

    Context context;
    List<UserListResponse> userListResponseData;

    public UsersAdapter(Context context, List<UserListResponse> userListResponseData) {
        this.userListResponseData = userListResponseData;
        this.context = context;
    }

    @Override
    public UsersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.users_list_items, null);
        UsersViewHolder usersViewHolder = new UsersViewHolder(view);
        return usersViewHolder;
    }

    @Override
    public void onBindViewHolder(UsersViewHolder holder, final int position) {
        // set the data
        holder.name.setText("Name: " + userListResponseData.get(position).getName());
        holder.email.setText("Real Name: " + userListResponseData.get(position).getRealname());
        holder.team.setText("Team: " + userListResponseData.get(position).getTeam());
        holder.firstAppearance.setText("First Appearance: "+userListResponseData.get(position).getFirstAppearance());
        holder.createdby.setText("Created By: "+userListResponseData.get(position).getCreatedBy());
        holder.publisher.setText("Publisher: "+userListResponseData.get(position).getPublisher());

        // implement setONCLickListtener on itemView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with user name
                Toast.makeText(context, userListResponseData.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userListResponseData.size(); // size of the list items
    }

    class UsersViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name, email, team, firstAppearance, createdby, publisher;

        public UsersViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.name);
            email = (TextView) itemView.findViewById(R.id.email);
            team = (TextView) itemView.findViewById(R.id.team);
            firstAppearance = (TextView) itemView.findViewById(R.id.firstApperance);
            createdby = (TextView) itemView.findViewById(R.id.createdby);
            publisher = (TextView) itemView.findViewById(R.id.publisher);

        }
    }
}
