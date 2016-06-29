package android.courses.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Podisto on 03/04/2016.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView textViewView;
    private ImageView imageView;

    // itemView est la vue correspondante a une cellule
    public MyViewHolder(View itemView) {
        super(itemView);

        textViewView = (TextView) itemView.findViewById(R.id.text);
        imageView = (ImageView) itemView.findViewById(R.id.image);

    }

    // Remplir la cellule en fonction d'un MyObject
    public void bind(MyObject myObject) {
        textViewView.setText(myObject.getText());
        Picasso.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().fit().into(imageView);
    }
}
