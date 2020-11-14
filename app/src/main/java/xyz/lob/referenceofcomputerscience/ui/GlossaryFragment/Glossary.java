package xyz.lob.referenceofcomputerscience.ui.GlossaryFragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.lob.referenceofcomputerscience.R;

public class Glossary extends Fragment {

    private GlossaryViewModel mViewModel;

    public static Glossary newInstance() {
        return new Glossary();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.glossary_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(GlossaryViewModel.class);
        // TODO: Use the ViewModel
    }

}