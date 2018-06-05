package com.zc.demo.ui.list.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zc.demo.R;
import com.zc.demo.ui.list.ListActivity;
import com.zc.demo.util.AppToast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListAdapter extends RecyclerView.Adapter {
    private ListActivity activity;
    private List<Integer> mData;
    private Context context;

    public ListAdapter(ListActivity activity, List<Integer> mData) {
        this.activity = activity;
        this.mData = mData;
        this.context = activity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_rv, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder itemHolder = (ItemViewHolder) holder;
        itemHolder.tvTitle.setText("这里是标题文字");
        itemHolder.tvContent.setText("这里是对标题对详细内容描述");
        itemHolder.tvNum.setText("x9");
        itemHolder.tvPrice.setText("¥120.00");

        String img_path = "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1512/07/c2/16207712_1449499354274_800x800.jpg";
        Glide.with(context).load(img_path).into(itemHolder.ivImg);

        itemHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppToast.show("item click");
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.itemView)
        LinearLayout itemView;
        @BindView(R.id.iv_img)
        ImageView ivImg;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_content)
        TextView tvContent;
        @BindView(R.id.tv_num)
        TextView tvNum;
        @BindView(R.id.tv_price)
        TextView tvPrice;

        public ItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
