package com.example.saint.aukg.ui.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.saint.aukg.R;
import com.example.saint.aukg.ui.BaseFragment;

public class DialogNameFragment extends DialogFragment implements View.OnClickListener {

    private RadioGroup radioGroupRegime, radioGroupSalary;
    private RadioButton radioButtonRegimeAny, radioButtonFull, radioButtonFlexible, radioButtonRemotely, radioButtonNight, radioButtonSalaryAny, radioButtonFiveMore, radioButtonTenMore, radioButtonThirtyMore;
    private Button buttonReset, buttonSearch;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dialog, container, false);

        if(getDialog().getWindow() != null){
            getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        }

        radioGroupRegime = view.findViewById(R.id.radioGroupRegime);
        radioGroupSalary = view.findViewById(R.id.radioGroupSalary);

        radioButtonRegimeAny = view.findViewById(R.id.radioButtonRegimeAny);
        radioButtonFull = view.findViewById(R.id.radioButtonFull);
        radioButtonFlexible = view.findViewById(R.id.radioButtonFlexible);
        radioButtonRemotely = view.findViewById(R.id.radioButtonRemotely);
        radioButtonNight = view.findViewById(R.id.radioButtonNight);
        radioButtonSalaryAny = view.findViewById(R.id.radioButtonSalaryAny);
        radioButtonFiveMore = view.findViewById(R.id.radioButtonFiveMore);
        radioButtonTenMore = view.findViewById(R.id.radioButtonTenMore);
        radioButtonThirtyMore = view.findViewById(R.id.radioButtonThirtyMore);

        buttonReset = view.findViewById(R.id.buttonReset);
        buttonSearch = view.findViewById(R.id.buttonSearch);

        buttonReset.setOnClickListener(this);
        buttonSearch.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonReset:
                dismiss();
                break;
            case R.id.buttonSearch:

                break;
        }

    }
}
