package com.kuaishou.ax2c.layouts.X2C_Share_Photos_Preview_Container_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import cw9.c;
import android.view.ViewStub;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.kuaishou.ax2c.layouts.X2C_Share_At_Topic_Layout_V2;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;

public class X2C_Share_Photos_Preview_Container_V2 implements IViewCreator	// class@00112b
{

    public void X2C_Share_Photos_Preview_Container_V2(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       uConstraintL.setId(R.id.preview_root);
       uConstraintL.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -2));
       RecyclerView recyclerView = new RecyclerView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-1, -2);
       recyclerView.setId(R.id.photo_preview_wrap);
       layoutParams.topMargin = c.b(resources, 0x7f07025d);
       layoutParams.d = 0;
       layoutParams.h = 0;
       layoutParams.c();
       recyclerView.setLayoutParams(layoutParams);
       uConstraintL.addView(recyclerView);
       ViewStub viewStub = new ViewStub(uConstraintL.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new ConstraintLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 96.00f, c.c(resources)));
       viewStub.setId(R.id.editor_stub);
       layoutParams.leftMargin = c.b(resources, 0x7f070cb5);
       layoutParams.topMargin = c.b(resources, 0x7f0702a4);
       layoutParams.rightMargin = c.b(resources, 0x7f070cb5);
       layoutParams.d = 0;
       layoutParams.i = 0x7f0a305a;
       layoutParams.c();
       viewStub.setLayoutParams(layoutParams);
       uConstraintL.addView(viewStub);
       View view = new X2C_Share_At_Topic_Layout_V2().createView(uConstraintL.getContext());
       layoutParams = view.getLayoutParams();
       view.setId(R.id.topic_container);
       layoutParams.leftMargin = c.b(resources, 0x7f070cb5);
       layoutParams.rightMargin = c.b(resources, 0x7f070cb5);
       layoutParams.d = 0;
       layoutParams.i = 0x7f0a0ca7;
       layoutParams.g = 0;
       layoutParams.c();
       view.setLayoutParams(layoutParams);
       uConstraintL.addView(view);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.tv_topic_hint);
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, 27.00f, c.c(resources));
       layoutParams.rightMargin = c.b(resources, 0x7f070cb5);
       uAppCompatTe.setText(R.string.arg_RES_7f104015);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060bd3));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f71));
       uAppCompatTe.setVisibility(8);
       layoutParams.d = 0;
       layoutParams.h = 0x7f0a0ca7;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       view = new View(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams1 = new ConstraintLayout$LayoutParams(-1, (int)TypedValue.applyDimension(0, 0x3f800000, c.c(resources)));
       view.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060a83));
       view.setId(R.id.visibility_container_divider);
       layoutParams1.leftMargin = c.b(resources, 0x7f070cb5);
       layoutParams1.topMargin = c.b(resources, 0x7f0702b8);
       layoutParams1.rightMargin = c.b(resources, 0x7f070cb5);
       layoutParams1.d = 0;
       layoutParams1.i = 0x7f0a4023;
       layoutParams1.c();
       view.setLayoutParams(layoutParams1);
       uConstraintL.addView(view);
       return uConstraintL;
    }
}
