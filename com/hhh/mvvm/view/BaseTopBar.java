package com.hhh.mvvm.view.BaseTopBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import gm.c;
import android.view.View$OnClickListener;
import gm.a;
import gm.b;

public class BaseTopBar extends ConstraintLayout	// class@000572
{
    public View B;
    public View C;
    public View D;
    public View$OnClickListener E;
    public View$OnClickListener F;
    public View$OnClickListener G;
    public boolean H;

    public void BaseTopBar(Context p0){
       super(p0);
       this.L(p0, null, 0);
    }
    public void BaseTopBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.L(p0, p1, 0);
    }
    public void BaseTopBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.L(p0, p1, p2);
    }
    public final void L(Context p0,AttributeSet p1,int p2){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.z, p2, 0);
       this.H = typedArray.getBoolean(0, true);
       typedArray.recycle();
    }
    public void onFinishInflate(){
       super.onFinishInflate();
       View view = this.findViewById(R.id.top_bar_left);
       this.B = view;
       if (view != null) {
          view.setOnClickListener(new c(this));
       }
       view = this.findViewById(R.id.top_bar_center);
       this.C = view;
       if (view != null) {
          view.setOnClickListener(new a(this));
       }
       view = this.findViewById(R.id.top_bar_right);
       this.D = view;
       if (view != null) {
          view.setOnClickListener(new b(this));
       }
       return;
    }
}
