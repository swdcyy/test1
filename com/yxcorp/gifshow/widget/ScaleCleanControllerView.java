package com.yxcorp.gifshow.widget.ScaleCleanControllerView;
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
import ekd.m1;
import com.yxcorp.gifshow.widget.g0;
import android.view.View$OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import o56.a;
import com.yxcorp.utility.n;
import tyc.m4;
import android.view.View$OnClickListener;
import tyc.n4;
import tyc.o4;
import com.yxcorp.gifshow.widget.h0;
import com.yxcorp.gifshow.widget.i0;
import com.yxcorp.gifshow.widget.j0;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView$a;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import zf6.j;
import java.lang.Float;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class ScaleCleanControllerView extends RelativeLayout	// class@0018bd
{
    public ScaleCleanControllerView$a b;
    public ImageView c;
    public TextView d;
    public ImageView e;
    public ImageView f;
    public View g;
    public ImageView h;
    public float i;
    public static final int j;

    public void ScaleCleanControllerView(Context p0){
       super(p0, null);
    }
    public void ScaleCleanControllerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ScaleCleanControllerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = 0x3f800000;
       if (PatchProxy.applyVoid(null, this, ScaleCleanControllerView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d089e, this);
          m1.f(this, R.id.bottom_area).setOnTouchListener(g0.b);
          this.c = m1.f(this, 0x7f0a3710);
          this.d = m1.f(this, 0x7f0a3712);
          this.e = m1.f(this, 0x7f0a370e);
          this.f = m1.f(this, 0x7f0a370f);
          View view = m1.f(this, R.id.top_area);
          this.g = view;
          ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
          layoutParams.setMargins(0, n.A(a.B), 0, 0);
          this.g.setLayoutParams(layoutParams);
          this.h = m1.f(this, 0x7f0a3711);
          m1.f(this, R.id.scale_clean_controller_close).setOnClickListener(new m4(this));
          this.c.setOnClickListener(new n4(this));
          this.d.setOnClickListener(new o4(this));
          this.e.setOnClickListener(new h0(this));
          this.f.setOnClickListener(new i0(this));
          this.h.setOnClickListener(new j0(this));
       }
       return;
    }
    public float getSpeed(){
       return this.i;
    }
    public void setControllerListener(ScaleCleanControllerView$a p0){
       this.b = p0;
    }
    public void setDisableDownload(boolean p0){
       if (PatchProxy.isSupport(ScaleCleanControllerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleCleanControllerView.class, "4")) {
          return;
       }
       ScaleCleanControllerView tf = this.f;
       Context context = this.getContext();
       int i = (p0)? 0x7f080a77: 0x7f080a79;
       tf.setImageDrawable(j.k(context, i));
       return;
    }
    public void setImageScale(boolean p0){
       if (PatchProxy.isSupport(ScaleCleanControllerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleCleanControllerView.class, "3")) {
          return;
       }
       if (p0) {
          this.e.setVisibility(0);
          this.f.setVisibility(0);
          this.d.setVisibility(8);
          this.c.setVisibility(8);
       }else {
          this.e.setVisibility(8);
          this.f.setVisibility(8);
          this.d.setVisibility(0);
          this.c.setVisibility(0);
       }
       return;
    }
    public void setPauseStatus(boolean p0){
       if (PatchProxy.isSupport(ScaleCleanControllerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleCleanControllerView.class, "2")) {
          return;
       }
       ScaleCleanControllerView tc = this.c;
       Context context = this.getContext();
       int i = (p0)? 0x7f08059d: 0x7f08056f;
       tc.setImageDrawable(j.n(context, i, R.color.arg_RES_7f0606da));
       return;
    }
    public void setSmallWindowEnable(boolean p0){
       if (PatchProxy.isSupport(ScaleCleanControllerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleCleanControllerView.class, "6")) {
          return;
       }
       if (p0) {
          this.h.setVisibility(0);
       }else {
          this.h.setVisibility(8);
       }
       return;
    }
    public void setSpeed(float p0){
       if (PatchProxy.isSupport(ScaleCleanControllerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ScaleCleanControllerView.class, "5")) {
          return;
       }
       this.i = p0;
       int i = (int)p0;
       if (!((float)i - p0)) {
          this.d.setText(i+"x");
       }else {
          this.d.setText(p0+"x");
       }
       return;
    }
}
