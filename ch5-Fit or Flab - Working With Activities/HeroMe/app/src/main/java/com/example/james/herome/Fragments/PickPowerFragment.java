package com.example.james.herome.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.james.herome.Activities.MainActivity;
import com.example.james.herome.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PickPowerFragment.PickPowerInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PickPowerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PickPowerFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button turtleBtn;
    private Button lightingBtn;
    private Button flightBtn;
    private Button slightBtn;
    private Button laserBtn;
    private Button superBtn;
    private Button showBtn;

    private PickPowerInteractionListener mListener;

    public PickPowerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PickPowerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PickPowerFragment newInstance(String param1, String param2) {
        PickPowerFragment fragment = new PickPowerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pick_power, container, false);

        turtleBtn = (Button)view.findViewById(R.id.turtleBtn);
        lightingBtn = (Button)view.findViewById(R.id.lightingBtn);
        flightBtn = (Button)view.findViewById(R.id.flightBtn);
        slightBtn = (Button)view.findViewById(R.id.slightBtn);
        laserBtn = (Button)view.findViewById(R.id.laserBtn);
        superBtn = (Button)view.findViewById(R.id.superBtn);
        showBtn = (Button)view.findViewById(R.id.showBtn);

        turtleBtn.setOnClickListener(this);
        lightingBtn.setOnClickListener(this);
        flightBtn.setOnClickListener(this);
        slightBtn.setOnClickListener(this);
        laserBtn.setOnClickListener(this);
        superBtn.setOnClickListener(this);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.loadCharacterScreen();
            }
        });

        showBtn.setEnabled(false);
        showBtn.getBackground().setAlpha(128);

        return view;
    }

    @Override
    public void onClick(View v) {
        showBtn.setEnabled(true);
        showBtn.getBackground().setAlpha(255);

        Button button = (Button)v;
        int leftDrawable = 0;

        turtleBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.turtle_power, 0, 0, 0);
        lightingBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.thors_hammer, 0, 0, 0);
        flightBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_man_crest, 0, 0, 0);
        slightBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.spider_web, 0, 0, 0);
        laserBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.laser_vision, 0, 0, 0);
        superBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_strength, 0, 0, 0);

        if (button == turtleBtn) {
            leftDrawable = R.drawable.turtle_power;
        } else if (button == lightingBtn) {
            leftDrawable = R.drawable.thors_hammer;
        } else if (button == flightBtn) {
            leftDrawable = R.drawable.super_man_crest;
        } else if (button == slightBtn) {
            leftDrawable = R.drawable.spider_web;
        } else if (button == laserBtn) {
            leftDrawable = R.drawable.laser_vision;
        } else if (button == superBtn) {
            leftDrawable = R.drawable.super_strength;
        }

        button.setCompoundDrawablesWithIntrinsicBounds(leftDrawable, 0, R.drawable.item_selected, 0);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onPickPowerInteractionListener(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof PickPowerInteractionListener) {
            mListener = (PickPowerInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface PickPowerInteractionListener {
        // TODO: Update argument type and name
        void onPickPowerInteractionListener(Uri uri);
    }
}
