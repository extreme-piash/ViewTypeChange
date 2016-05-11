package com.example.piash.custeomviewtype;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piash on 4/26/16.
 */
public class RAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String > names = new ArrayList<>();
    private Context context;
    private int layout;
    public RAdapter(Context context, List<String > names) {

    this.names = names;
    }

    class ViewHolder0 extends RecyclerView.ViewHolder {

        TextView textView1;
        public ViewHolder0(View itemView) {
            super(itemView);
            textView1 = (TextView)itemView.findViewById(R.id.viewholder1);
        }
    }

    class ViewHolder2 extends RecyclerView.ViewHolder {

        TextView textView2;
        public ViewHolder2(View itemView) {
            super(itemView);
            textView2 = (TextView)itemView.findViewById(R.id.viewholder2);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_viewholder1,
                parent, false);

        View v2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_viewholder2,
                parent, false);
        switch (viewType) {
            case 1: return new ViewHolder0(v1);
            case 2: return new ViewHolder2(v2);

        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch ( holder.getItemViewType () ) {

            case 1:
                ViewHolder0 viewHolder0 = (ViewHolder0)holder;
                viewHolder0.textView1.setText(names.get(position));
                break;
            case 2:
               ViewHolder2 viewHolder2 = (ViewHolder2)holder;
                viewHolder2.textView2.setText(names.get(position));
                break;
        }

    }


    @Override
    public int getItemViewType ( int position ) {

        int viewType = getLayout();

        return viewType;
    }
    @Override
    public int getItemCount() {
        return names.size();
    }

    public void setLayout(int piash){
        this.layout = piash;
    }
    public int getLayout(){
        return layout;
    }

}
