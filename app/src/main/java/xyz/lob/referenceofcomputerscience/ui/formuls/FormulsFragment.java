package xyz.lob.referenceofcomputerscience.ui.formuls;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import xyz.lob.referenceofcomputerscience.R;
import xyz.lob.referenceofcomputerscience.ui.gallery.GalleryViewModel;

public class FormulsFragment extends Fragment {

    private FormulsViewModel FormulsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FormulsViewModel =
                new ViewModelProvider(this).get(FormulsViewModel.class);
        View root = inflater.inflate(R.layout.formuls_fragment, container, false);

        return root;
    }
}
