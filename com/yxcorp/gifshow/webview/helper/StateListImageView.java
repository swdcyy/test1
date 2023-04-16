package com.yxcorp.gifshow.webview.helper.StateListImageView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import android.view.View;
import ekd.m1;
import ayc.f;
import android.view.View$OnTouchListener;

public class StateListImageView extends FrameLayout implements d	// class@001757
{
    public KwaiImageView b;
    public KwaiImageView c;
    public int d;
    public int e;
    public static final int f;

    public void StateListImageView(Context p0){
       super(p0);
    }
    public void StateListImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void StateListImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(int p0){
       if (PatchProxy.isSupport(StateListImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StateListImageView.class, "3")) {
          return;
       }
       this.c.setVisibility(0);
       this.c.setImageResource(p0);
       return;
    }
    public void b(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateListImageView.class, "4")) {
          return;
       }
       this.c.setVisibility(0);
       this.c.setImageDrawable(p0);
       return;
    }
    public void c(int p0){
       if (PatchProxy.isSupport(StateListImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StateListImageView.class, "5")) {
          return;
       }
       this.b.setSelected(true);
       this.b.setVisibility(0);
       this.b.setImageResource(p0);
       return;
    }
    public void d(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateListImageView.class, "6")) {
          return;
       }
       this.b.setSelected(true);
       this.b.setVisibility(0);
       this.b.setImageDrawable(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StateListImageView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a31ba);
       this.c = m1.f(p0, 0x7f0a2e08);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, StateListImageView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.c.setVisibility(4);
       this.b.setVisibility(4);
       this.setOnTouchListener(new f(this));
       return;
    }
}
