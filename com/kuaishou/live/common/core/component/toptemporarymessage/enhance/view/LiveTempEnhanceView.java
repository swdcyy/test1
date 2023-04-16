package com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import ml8.d;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import va1.n0;
import android.animation.ValueAnimator;
import com.kuaishou.live.widget.ShootMarqueeView;
import yb7.p;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import android.widget.ImageView;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.CharSequence;
import ny1.d;
import java.lang.Integer;

public class LiveTempEnhanceView extends RelativeLayout implements d	// class@0017ae
{
    public ViewGroup b;
    public ShootMarqueeView c;
    public ImageView d;
    public ValueAnimator e;
    public ValueAnimator f;
    public long g;
    public Runnable h;
    public boolean i;
    public boolean j;
    public Runnable k;
    public static final int l;

    static {
       LiveTempEnhanceView.l = a1.e(20.00f);
    }
    public void LiveTempEnhanceView(Context p0){
       super(p0, null);
    }
    public void LiveTempEnhanceView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveTempEnhanceView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveTempEnhanceView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0e07, this);
          this.doBindView(this);
          n0.a(this.b, (float)a1.d(R.dimen.arg_RES_7f07025d));
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveTempEnhanceView.class, "12")) {
          return;
       }
       LiveTempEnhanceView te = this.e;
       if (te != null && te.isRunning()) {
          this.e.end();
       }
       if (this.f != null && this.e.isRunning()) {
          this.f.end();
       }
       this.b();
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveTempEnhanceView.class, "14")) {
          return;
       }
       this.k = objArray;
       this.j = false;
       this.i = false;
       this.c.y();
       p.c(this);
       this.b.setVisibility(4);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveTempEnhanceView.class, "6")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
       layoutParams.width = -2;
       this.b.setLayoutParams(layoutParams);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveTempEnhanceView.class, "9")) {
          return;
       }
       this.c.setMarqueeDpPerSecond(40);
       this.j = true;
       this.c.v(100);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTempEnhanceView.class, "2")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a2693);
       this.c = m1.f(p0, 0x7f0a2695);
       this.d = m1.f(p0, 0x7f0a2694);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveTempEnhanceView.class, "5")) {
          return;
       }
       this.c.getViewTreeObserver().addOnGlobalLayoutListener(new LiveTempEnhanceView$a(this));
       return;
    }
    public void setContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTempEnhanceView.class, "4")) {
          return;
       }
       if (this.i != null) {
          this.c();
          if (this.j != null) {
             this.e();
          }
          this.c.setText(p0);
       }else {
          this.k = new d(this, p0);
       }
       return;
    }
    public void setNoticeIcon(int p0){
       if (PatchProxy.isSupport(LiveTempEnhanceView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveTempEnhanceView.class, "15")) {
          return;
       }
       this.d.setImageResource(p0);
       return;
    }
}
