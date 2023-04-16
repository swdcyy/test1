package com.yxcorp.gifshow.v3.widget.TimelineCoreView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import cw9.c;
import android.widget.HorizontalScrollView;
import java.lang.Boolean;
import bld.b;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;

public class TimelineCoreView extends RelativeLayout implements d	// class@00165f
{
    public EditorTimeLineView b;
    public ImageView c;
    public View d;
    public View e;
    public View f;

    public void TimelineCoreView(Context p0){
       super(p0, null);
    }
    public void TimelineCoreView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TimelineCoreView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineCoreView.class, "2")) {
       }else {
          this.doBindView(a.d(p0, R.layout.arg_RES_7f0d1603, this, true));
          this.setClipChildren(false);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TimelineCoreView.class, "4")) {
          return;
       }
       this.f.getLayoutParams().height = c.b(this.getResources(), 0x7f070d66);
       this.e.getLayoutParams().height = c.b(this.getResources(), 0x7f070d64);
       this.b.getLayoutParams().height = c.b(this.getResources(), 0x7f070d66);
       return;
    }
    public void b(boolean p0){
       b uob;
       Drawable uDrawable;
       if (PatchProxy.isSupport(TimelineCoreView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TimelineCoreView.class, "3")) {
          return;
       }
       TimelineCoreView tc = this.c;
       if (p0) {
          uob = new b();
          uob.o(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0807ee));
          uob.A(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0807ed));
          uDrawable = uob.a();
       }else {
          uob = new b();
          uob.o(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0807ef));
          uob.A(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f081c89));
          uDrawable = uob.a();
       }
       tc.setImageDrawable(uDrawable);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineCoreView.class, "1")) {
          return;
       }
       this.f = m1.f(p0, 0x7f0a3efd);
       this.d = m1.f(p0, 0x7f0a055b);
       this.e = m1.f(p0, 0x7f0a0695);
       this.b = m1.f(p0, 0x7f0a0cc1);
       this.c = m1.f(p0, 0x7f0a0559);
       return;
    }
    public View getCenterIndicator(){
       return this.e;
    }
    public View getPlayStatusView(){
       return this.d;
    }
    public EditorTimeLineView getTimeLineView(){
       return this.b;
    }
}
