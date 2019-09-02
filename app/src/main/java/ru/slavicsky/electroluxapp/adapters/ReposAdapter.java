package ru.slavicsky.electroluxapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.slavicsky.electroluxapp.R;
import ru.slavicsky.electroluxapp.data.GithubRepo;

public class ReposAdapter extends RecyclerView.Adapter<ReposAdapter.ViewHolder>{

    public List<GithubRepo> repos;

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
        System.out.println(repos.size());
        holder.stars.setText("stars: "+repo.stars);
        holder.url.setText(repo.url);
        holder.repoName.setText(repo.repoName);
        holder.size.setText("size: "+repo.size);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView url;
        TextView repoName;
        TextView stars;
        TextView size;

        public ViewHolder(View itemView) {
            super(itemView);
            size = itemView.findViewById(R.id.size);
            url = itemView.findViewById(R.id.url);
            stars = itemView.findViewById(R.id.stars);
            repoName = itemView.findViewById(R.id.repo_name);
        }
    }
    public void setRepos(List<GithubRepo> repoList) {
        this.repos = new ArrayList<>();
        this.repos.addAll(repoList);
        notifyDataSetChanged();
    }
}
