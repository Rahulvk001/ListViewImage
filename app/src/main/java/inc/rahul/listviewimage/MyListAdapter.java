package inc.rahul.listviewimage;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter  extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] progName;
    private final Integer[]progImages;


    public MyListAdapter(Activity context, String[] progName, Integer[] progImages) {
        super(context,R.layout.activity_image_list,progName);
        this.context = context;
        this.progName = progName;
        this.progImages = progImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_image_list,null,true);
        TextView txtTitle = rowView.findViewById(R.id.textView2);
        ImageView imageView = rowView.findViewById(R.id.imageView1);

        txtTitle.setText(progName[position]);
        imageView.setImageResource(progImages[position]);


        return rowView;
    }
}
