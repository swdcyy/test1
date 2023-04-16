package com.yxcorp.widget.selector.view.RoundedRelativeLayout$b$a;
import android.view.ViewOutlineProvider;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$b;
import android.view.View;
import android.graphics.Outline;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout;
import android.graphics.Rect;

public class RoundedRelativeLayout$b$a extends ViewOutlineProvider	// class@0009e7
{
    public final RoundedRelativeLayout$b a;

    public void RoundedRelativeLayout$b$a(RoundedRelativeLayout$b p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       RoundedRelativeLayout$b$a ta = this.a;
       p1.setRoundRect(ta.a, ta.d.d);
    }
}
