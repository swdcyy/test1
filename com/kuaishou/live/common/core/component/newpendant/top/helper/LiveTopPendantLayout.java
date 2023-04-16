package com.kuaishou.live.common.core.component.newpendant.top.helper.LiveTopPendantLayout;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import k51.b;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Integer;
import android.widget.LinearLayout;
import ekd.m1;
import android.widget.FrameLayout;

public class LiveTopPendantLayout extends RelativeLayout implements d	// class@0016c9
{
    public LinearLayout b;
    public LinearLayout c;
    public FrameLayout d;

    public void LiveTopPendantLayout(Context p0){
       super(p0, null, 0);
    }
    public void LiveTopPendantLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveTopPendantLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTopPendantLayout.class, "2")) {
       }else {
          a.g(p0.getSystemService("layout_inflater"), b.a(R.layout.arg_RES_7f0d0e12, 0x7f0d0e13), this, true);
          this.doBindView(this);
       }
       return;
    }
    public void a(View p0,int p1){
       if (PatchProxy.isSupport(LiveTopPendantLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveTopPendantLayout.class, "3")) {
          return;
       }
       this.b.addView(p0, p1);
       return;
    }
    public void b(View p0,int p1){
       if (PatchProxy.isSupport(LiveTopPendantLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveTopPendantLayout.class, "4")) {
          return;
       }
       this.c.addView(p0, p1);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTopPendantLayout.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a26b8);
       this.c = m1.f(p0, 0x7f0a26b9);
       this.d = m1.f(p0, 0x7f0a26ba);
       return;
    }
    public LinearLayout getLeftPendantLayout(){
       return this.b;
    }
    public LinearLayout getRightPendantLayout(){
       return this.c;
    }
    public ViewGroup getRightPendantLayoutV2(){
       return this.d;
    }
}
