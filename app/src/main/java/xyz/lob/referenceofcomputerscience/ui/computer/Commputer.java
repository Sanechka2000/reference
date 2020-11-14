package xyz.lob.referenceofcomputerscience.ui.computer;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.lob.referenceofcomputerscience.R;

public class Commputer extends Fragment {

    private CommputerViewModel mViewModel;

    public static Commputer newInstance() {
        return new Commputer();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.commputer_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CommputerViewModel.class);
        // TODO: Use the ViewModel
    }

}