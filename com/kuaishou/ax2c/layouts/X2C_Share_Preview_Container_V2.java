package com.kuaishou.ax2c.layouts.X2C_Share_Preview_Container_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.TextView;
import android.view.ViewStub;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.kuaishou.ax2c.layouts.X2C_Share_At_Topic_Layout_V2;
import com.kuaishou.ax2c.layouts.X2C_Share_Preview_Cover_Container;

public class X2C_Share_Preview_Container_V2 implements IViewCreator	// class@00112d
{

    public void X2C_Share_Preview_Container_V2(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(p0);
       uConstraintL.setId(R.id.preview_root);
       uConstraintL.setPadding(c.b(resources, R.dimen.arg_RES_7f07054b), c.b(resources, R.dimen.arg_RES_7f070271), c.b(resources, R.dimen.arg_RES_7f070549), c.b(resources, R.dimen.arg_RES_7f070295));
       uConstraintL.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, c.b(resources, R.dimen.arg_RES_7f07028a)));
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.tv_topic_hint);
       layoutParams.setMarginStart(c.b(resources, R.dimen.pv));
       uAppCompatTe.setText(R.string.arg_RES_7f104015);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f060bd3));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f71));
       uAppCompatTe.setVisibility(8);
       layoutParams.d = 0;
       layoutParams.h = 0;
       layoutParams.c();
       uAppCompatTe.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatTe);
       ViewStub viewStub = new ViewStub(uConstraintL.getContext());
       viewStub.setInflatedId(-1);
       layoutParams = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), (int)TypedValue.applyDimension(1, 0, c.c(resources)));
       viewStub.setId(R.id.editor_stub);
       layoutParams.setMarginEnd(c.b(resources, R.dimen.arg_RES_7f070295));
       layoutParams.j = 0x7f0a4023;
       layoutParams.d = 0;
       layoutParams.f = 0x7f0a0ef1;
       layoutParams.h = 0;
       layoutParams.c();
       viewStub.setLayoutParams(layoutParams);
       uConstraintL.addView(viewStub);
       View view = new X2C_Share_At_Topic_Layout_V2().createView(uConstraintL.getContext());
       layoutParams = view.getLayoutParams();
       view.setId(R.id.topic_container);
       layoutParams.k = 0;
       layoutParams.d = 0;
       layoutParams.f = 0x7f0a0ef1;
       layoutParams.c();
       view.setLayoutParams(layoutParams);
       uConstraintL.addView(view);
       view = new X2C_Share_Preview_Cover_Container().createView(uConstraintL.getContext());
       layoutParams = view.getLayoutParams();
       view.setId(R.id.fl_preview_container);
       view.setVisibility(4);
       layoutParams.g = 0;
       layoutParams.h = 0;
       layoutParams.c();
       view.setLayoutParams(layoutParams);
       uConstraintL.addView(view);
       view = new View(uConstraintL.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f0702c5);
       layoutParams = new ConstraintLayout$LayoutParams(i, c.b(resources, 0x7f0702f8));
       view.setId(R.id.right_mask);
       view.setBackgroundResource(R.drawable.arg_RES_7f081fed);
       layoutParams.k = 0x7f0a4023;
       layoutParams.g = 0x7f0a4023;
       layoutParams.c();
       view.setLayoutParams(layoutParams);
       uConstraintL.addView(view);
       return uConstraintL;
    }
}
