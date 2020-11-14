package xyz.lob.referenceofcomputerscience.ui.formuls;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import xyz.lob.referenceofcomputerscience.recycle.Formul;
import xyz.lob.referenceofcomputerscience.recycle.FormulsAdapter;
import xyz.lob.referenceofcomputerscience.R;

public class FormulsFragment extends Fragment {

    private FormulsViewModel mViewModel;
    List<Formul> formuls = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        setInitialData();
        View view = inflater.inflate(R.layout.formuls_fragment, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerListFormuls);
        // создаем адаптер
        FormulsAdapter adapter = new FormulsAdapter(this.getContext(), formuls);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void setInitialData(){
        formuls.add(new Formul ("Huawei P10"));
        formuls.add(new Formul ("Elite z3"));
        formuls.add(new Formul ("Galaxy S8"));
        formuls.add(new Formul ("LG G 5"));
        formuls.add(new Formul ("Huawei P10"));
        formuls.add(new Formul ("Elite z3"));
        formuls.add(new Formul ("Galaxy S8"));
        formuls.add(new Formul ("LG G 5"));
        formuls.add(new Formul ("Huawei P10"));
        formuls.add(new Formul ("Elite z3"));
        formuls.add(new Formul ("Galaxy S8"));
        formuls.add(new Formul ("LG G 5"));
        formuls.add(new Formul ("Huawei P10"));
        formuls.add(new Formul ("Elite z3"));
        formuls.add(new Formul ("Galaxy S8"));
        formuls.add(new Formul ("LG G 5"));formuls.add(new Formul ("Huawei P10"));
        formuls.add(new Formul ("Elite z3"));
        formuls.add(new Formul ("Galaxy S8"));
        formuls.add(new Formul ("LG G 5"));

    }

}