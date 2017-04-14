package me.weyye.colortracktablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.weyye.library.R;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_my, null);
    }

    public static MyFragment newInstance() {
        return new MyFragment();
    }
}
