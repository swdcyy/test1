package com.yxcorp.gifshow.prettify.beauty.RecordBeautySwitchEntrance;
import ml8.d;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import android.widget.TextView;
import lnc.a1;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import ekd.m1;
import com.yxcorp.gifshow.prettify.beauty.RecordBeautySwitchEntrance$a;

public class RecordBeautySwitchEntrance extends LinearLayout implements d, View$OnClickListener	// class@0010f6
{
    public ViewGroup b;
    public ImageView c;
    public ImageView d;
    public TextView e;
    public boolean f;
    public RecordBeautySwitchEntrance$a g;

    public void RecordBeautySwitchEntrance(Context p0){
       super(p0, null);
    }
    public void RecordBeautySwitchEntrance(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RecordBeautySwitchEntrance(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = false;
       a.c(p0, R.layout.arg_RES_7f0d12cf, this);
       this.doBindView(this);
       this.setOnClickListener(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RecordBeautySwitchEntrance.class, "7")) {
          return;
       }
       this.setAlpha(0.36f);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, RecordBeautySwitchEntrance.class, "6")) {
          return;
       }
       this.setAlpha(0x3f800000);
       return;
    }
    public void c(int p0,boolean p1){
       if (PatchProxy.isSupport(RecordBeautySwitchEntrance.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, RecordBeautySwitchEntrance.class, "2")) {
          return;
       }
       this.f = p1;
       int i = 0;
       Object[] objArray = null;
       if (p1) {
          if (!PatchProxy.applyVoid(objArray, this, RecordBeautySwitchEntrance.class, "8")) {
             this.e.setText(R.string.arg_RES_7f100399);
             this.e.setTextColor(a1.a(R.color.arg_RES_7f061ff3));
             this.c.setVisibility(i);
             this.d.setVisibility(8);
             this.b.setBackground(a1.f(R.drawable.arg_RES_7f081dff));
          }
       }else if(PatchProxy.applyVoid(objArray, this, RecordBeautySwitchEntrance.class, "9")){
          this.e.setText(R.string.arg_RES_7f100397);
          this.e.setTextColor(a1.a(R.color.arg_RES_7f061f7e));
          this.c.setVisibility(8);
          this.d.setVisibility(i);
          this.b.setBackground(a1.f(R.drawable.arg_RES_7f081e00));
       }
       if (p0) {
          this.a();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBeautySwitchEntrance.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a0d5c);
       this.c = m1.f(p0, 0x7f0a023b);
       this.d = m1.f(p0, 0x7f0a023a);
       this.e = m1.f(p0, 0x7f0a43df);
       return;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordBeautySwitchEntrance.class, "4")) {
          return;
       }
       this.b();
       this.g.a();
       return;
    }
    public void setListener(RecordBeautySwitchEntrance$a p0){
       this.g = p0;
    }
}
