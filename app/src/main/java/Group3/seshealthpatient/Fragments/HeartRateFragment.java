package Group3.seshealthpatient.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import Group3.seshealthpatient.R;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HeartRateFragment extends Fragment {


    public HeartRateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ButterKnife.bind(getActivity());

        return inflater.inflate(R.layout.fragment_heart_rate, container, false);
    }

}
