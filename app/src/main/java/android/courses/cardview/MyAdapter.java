package android.courses.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Podisto on 03/04/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<MyObject> list;

    // Ajouter un constructeur prenant en entree une liste
    public MyAdapter(List<MyObject> list) {
        this.list = list;
    }

    // Cette fonction permet de creer les viewHolder et par la meme indiquer la vue a inflater (a partir des layouts xml)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_card, parent, false);
        return new MyViewHolder(view);
    }

    // C'est ici que nous allons remplir notre cellule avec le texte/image de chaque MyObject
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyObject myObject = list.get(position);
        holder.bind(myObject);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
