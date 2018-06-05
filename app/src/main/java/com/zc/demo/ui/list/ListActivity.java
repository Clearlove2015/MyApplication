package com.zc.demo.ui.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zc.demo.R;
import com.zc.demo.ui.list.adapter.ListAdapter;
import com.zc.demo.util.InitDataUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {

    @BindView(R.id.rv)
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        initRV();
    }

    public void initRV(){
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ListAdapter(this,InitDataUtil.getFData()));
    }

}
