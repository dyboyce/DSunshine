package dboyce.net.dsunshine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class listFragment extends Fragment {


    public listFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<String> fakedata = new ArrayList<String>();
        fakedata.add("TODAY - SUN - 88");
        fakedata.add("SUNDAY - MOON - 32");
        fakedata.add("SUPERDOME - RAIN - 84");
        fakedata.add("TUESDAY - SUN - 58");
        fakedata.add("WEDNESDAY - SUN - 49");
        fakedata.add("THURSDAY - SUN - 83");
        fakedata.add("GIT - SUM - 81");
        fakedata.add("REKT - SUN - 88");
        fakedata.add("GITGUD - CLOUDY - 88");
        fakedata.add("FAKE - SUN - 88");
        fakedata.add("LIGHT - FOG - 88");
        fakedata.add("SUNDAAAYYY - HAIL - 88");
        fakedata.add("MONDAY - MEGAHAIL - 88");
        fakedata.add("SUNDAAAY - MOWERS - BE THERE");

        ArrayAdapter<String> putfake = new ArrayAdapter<String>(rootView.getContext(), R.layout.list_item_forecast, R.id.list_item_forecast_textView, fakedata);


        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(putfake);


        return rootView;
    }

}
