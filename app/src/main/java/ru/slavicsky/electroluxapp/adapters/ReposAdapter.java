package ru.slavicsky.electroluxapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.slavicsky.electroluxapp.R;
import ru.slavicsky.electroluxapp.data.GithubRepo;

public class ReposAdapter extends RecyclerView.Adapter<ReposAdapter.ViewHolder>{

    private List<GithubRepo> repos;

    public ReposAdapter(List<GithubRepo> repos) {
        this.repos = repos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        if (repos == null)
            return 0;
        return repos.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        GithubRepo repo = repos.get(position);
        holder.stars.setText("1");
        holder.user.setText("coder coder");
        holder.repoName.setText("code is here");
        holder.lastUpdate.setText("1 year");
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView user;
        TextView repoName;
        TextView stars;
        TextView lastUpdate;

        public ViewHolder(View itemView) {
            super(itemView);
            lastUpdate = itemView.findViewById(R.id.last_update);
            user = itemView.findViewById(R.id.user);
            stars = itemView.findViewById(R.id.stars);
            repoName = itemView.findViewById(R.id.repo_name);
        }
    }
}
