package com.example.lenovo.bicycle.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.bicycle.R;
import com.example.lenovo.bicycle.receiver.Msg;

import java.util.List;

/**
 * Created by lenovo on 2016/5/6.
 */
public class MagAdapter extends ArrayAdapter<Msg> {

    private  int resourceId;

    public MagAdapter(Context context,int textViewResourceId,List<Msg>objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
        Log.d("MsgAdApter","adapter");
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Msg msg = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder = new ViewHolder();
            viewHolder.leftLayout = (LinearLayout)view.findViewById(R.id.left_layout);
            viewHolder.rightLayout = (LinearLayout)view.findViewById(R.id.right_layout);
            viewHolder.leftMsg = (TextView)view.findViewById(R.id.left_msg);
            viewHolder.rightMsg = (TextView)view.findViewById(R.id.right_msg);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        if(msg.getType() == Msg.TYPE_RECEIVED){
            //如果收到消息，则显示左边消息布局，将右边的消息布局隐藏
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightLayout.setVisibility(View.GONE);
            viewHolder.leftMsg.setText(msg.getContent());
        }else if(msg.getType() == Msg.TYPE_SEND){
            //如果是发出的消息，则显示在右边的消息布局，将在左边的消息布局隐藏
            viewHolder.rightLayout.setVisibility(View.VISIBLE);
            viewHolder.leftLayout.setVisibility(View.GONE);
            viewHolder.rightMsg.setText(msg.getContent());
        }
        return view;
    }
    class ViewHolder{
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftMsg;
        TextView rightMsg;
    }
}
