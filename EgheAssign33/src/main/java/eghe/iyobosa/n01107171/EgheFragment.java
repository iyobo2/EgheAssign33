package eghe.iyobosa.n01107171;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EgheFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EgheFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EgheFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EgheFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EgheFragment newInstance(String param1, String param2) {
        EgheFragment fragment = new EgheFragment();
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
    private CanvasView customCanvas;
    ImageButton currpaint, drawwbtn, erase, newbtn, black , teal , blue;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eghe, container, false);
        customCanvas = (CanvasView) view.findViewById(R.id.signature_canvas);
        LinearLayout paintLayout = (LinearLayout)view.findViewById(R.id.paintColor);
        drawwbtn = view.findViewById(R.id.draw_btn);
        newbtn = view.findViewById(R.id.new_btn);
        erase = view.findViewById(R.id.erase_btn);
        blue = view.findViewById(R.id.blue);
        black = view.findViewById(R.id.black);
        teal = view.findViewById(R.id.teal);

        drawwbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setupDrawing();
            }
        });
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setErase(true);
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setColor("#000000");
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setColor("#f1f1f1");
            }
        });
        teal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customCanvas.setColor("#f100f1");
            }
        });
        CanvasView canvasView;

        return view;
    }

}
