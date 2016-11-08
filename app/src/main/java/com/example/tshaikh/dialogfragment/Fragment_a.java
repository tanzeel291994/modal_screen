package com.example.tshaikh.dialogfragment;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment_a extends Fragment {


    public Fragment_a() {
        // Required empty public constructor
    }


    public static Fragment_a newInstance(String param1, String param2) {
        Fragment_a fragment = new Fragment_a();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_a, container, false);
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showEditDialog();
            }
        });
        return view;
    }

    private void showEditDialog()
    {
        FragmentManager fm = getFragmentManager();
        EditNameDialogFragment editNameDialogFragment = EditNameDialogFragment.newInstance("Dialogo");
        editNameDialogFragment.show(fm, "fragment_edit_name_dialog");
    }
}
