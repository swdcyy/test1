package com.kuaishou.live.bottombar.component.widget.LiveBottomBarLinearLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

public class LiveBottomBarLinearLayout extends FrameLayout	// class@000d41
{
    public final LinearLayout b;
    public final LinearLayout c;
    public int d;

    public void LiveBottomBarLinearLayout(Context p0){
       super(p0, null);
    }
    public void LiveBottomBarLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveBottomBarLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0a7a);
       this.b = view.findViewById(0x7f0a1aa8);
       this.c = view.findViewById(0x7f0a1ab6);
       this.addView(view);
       this.setClipToPadding(false);
       this.setClipChildren(false);
    }
    public int getItemWidth(){
       return this.d;
    }
    public ViewGroup getLeftLayout(){
       return this.b;
    }
    public ViewGroup getRightLayout(){
       return this.c;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveBottomBarLinearLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveBottomBarLinearLayout.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.d = this.getMeasuredWidth() / 6;
       return;
    }
}
