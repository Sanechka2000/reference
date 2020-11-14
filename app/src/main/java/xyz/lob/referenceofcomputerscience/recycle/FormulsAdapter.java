package xyz.lob.referenceofcomputerscience.recycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import xyz.lob.referenceofcomputerscience.R;

public class FormulsAdapter extends RecyclerView.Adapter<FormulsAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Formul> formuls;

    public FormulsAdapter(Context context, List<Formul> formuls) {
        this.formuls = formuls;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public  FormulsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView formulText;
        final Button furmulButton;
        ViewHolder(View view){
            super(view);
            formulText = (TextView) view.findViewById(R.id.textView2);
            furmulButton = (Button) view.findViewById(R.id.button);
        }
    }

    @Override
    public void onBindViewHolder(FormulsAdapter.ViewHolder holder, int position) {
        Formul formul = formuls.get(position);
        holder.formulText.setText(formul.getFormul());
    }

    @Override
    public int getItemCount() {
        return formuls.size();
    }


}
