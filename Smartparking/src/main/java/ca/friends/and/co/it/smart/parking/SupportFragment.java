package ca.friends.and.co.it.smart.parking;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SupportFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SupportFragment extends Fragment {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SupportFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SupportFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SupportFragment newInstance() {
        SupportFragment fragment = new SupportFragment();
        Bundle args = new Bundle();
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

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = getActivity().findViewById(android.R.id.content);
        Snackbar.make(v, "Support Screen", Snackbar.LENGTH_LONG).show();

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_support, container, false);
        imageView1 = view.findViewById(R.id.imageView10);
        imageView2 = view.findViewById(R.id.imageView8);
        imageView3 = view.findViewById(R.id.imageView11);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Opening Live Chat", Toast.LENGTH_SHORT).show();
                }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Calling", Toast.LENGTH_SHORT).show();
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Opening Email", Toast.LENGTH_SHORT).show();
               }
        });

        return view;
    }
}