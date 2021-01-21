package com.project.expandablelistview;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class PhoneViewHolder  extends ChildViewHolder {
    private final TextView phoneName;

    public PhoneViewHolder(View itemView) {
        super(itemView);

        phoneName = itemView.findViewById(R.id.phone_name);
    }

    public void onBind(Phone phone, ExpandableGroup group) {
        phoneName.setText(phone.getName());
//        if (group.getTitle().equals("Android")) {
////            phoneName.setVisibility(View.GONE);
//            phoneName.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_btn_expand, 0, 0, 0);
//        } else if (group.getTitle().equals("iOS")) {
//            phoneName.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_btn_collapse, 0, 0, 0);
//        } else {
//            phoneName.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_btn_expand, 0, 0, 0);
//        }
    }
}