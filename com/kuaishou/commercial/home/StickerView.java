package com.kuaishou.commercial.home.StickerView;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import android.view.ViewTreeObserver;
import com.kuaishou.commercial.home.StickerView$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.Typeface;

public abstract class StickerView extends FrameLayout	// class@0014d2
{
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public TextView m;
    public View n;
    public TextPaint o;
    public int[] p;
    public float[] q;
    public int r;
    public int s;
    public View t;
    public int u;
    public int v;
    public int w;

    public void StickerView(Context p0,View p1){
       super(p0);
       this.c = 50;
       this.d = 50;
       this.e = 50;
       this.f = 50;
       this.g = 0.10f;
       this.h = 0.10f;
       this.i = 0.10f;
       this.j = 0.10f;
       this.k = 50.00f;
       this.l = 50.00f;
       this.n = p1;
       int i = 0x7f0a3b6c;
       if (this.getLayoutId() != -1) {
          this.t = a.k(this, this.getLayoutId(), true);
          this.m = this.findViewById(i);
       }else {
          this.t = a.k(this, 0x7f0d0045, true);
          this.m = this.findViewById(i);
       }
       this.o = new TextPaint(7);
       return;
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, StickerView.class, "3")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = this.m.getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-1, -2);
       }
       layoutParams.leftMargin = (int)((float)this.n.getWidth() * this.i);
       layoutParams.rightMargin = (int)((float)this.n.getWidth() * this.j);
       this.m.setLayoutParams(layoutParams);
       return;
    }
    public void c(){
    }
    public int getBottomMargin(){
       Object obj = PatchProxy.apply(null, this, StickerView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(this.h * (float)this.n.getHeight());
    }
    public int getLayoutId(){
       return -1;
    }
    public int getTopMargin(){
       Object obj = PatchProxy.apply(null, this, StickerView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(this.g * (float)this.n.getHeight());
    }
    public void setBackgroundColor(int p0){
       this.s = p0;
    }
    public void setBackgroundDrawableRes(int p0){
       if (PatchProxy.isSupport(StickerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StickerView.class, "4")) {
          return;
       }
       this.r = p0;
       if (p0 > 0) {
          this.m.setBackgroundResource(p0);
       }
       return;
    }
    public void setMarginsPct(float[] p0){
       int i;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerView.class, "2")) {
          return;
       }
       this.q = p0;
       if (p0 != null && p0.length > 0) {
          i = p0[0];
          this.i = i;
          this.k = i * (float)this.n.getWidth();
       }
       StickerView tq = this.q;
       if (tq != null) {
          i1 = 1;
          if (tq.length > i1) {
             this.g = tq[i1];
          }
       }
       if (tq != null) {
          i1 = 2;
          if (tq.length > i1) {
             i = tq[i1];
             this.j = i;
             this.l = i * (float)this.n.getWidth();
          }
       }
       tq = this.q;
       if (tq != null && tq.length > 3) {
          this.h = tq[3];
       }
       return;
    }
    public void setMaxLines(int p0){
       if (PatchProxy.isSupport(StickerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StickerView.class, "10")) {
          return;
       }
       StickerView tm = this.m;
       if (tm != null) {
          tm.setMaxLines(p0);
       }
       return;
    }
    public void setPaddings(int[] p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerView.class, "1")) {
          return;
       }
       this.p = p0;
       if (p0 != null && p0.length > 0) {
          this.e = n.c(this.getContext(), (float)this.p[0]);
       }
       StickerView tp = this.p;
       if (tp != null) {
          i = 1;
          if (tp.length > i) {
             this.c = n.c(this.getContext(), (float)this.p[i]);
          }
       }
       tp = this.p;
       if (tp != null) {
          i = 2;
          if (tp.length > i) {
             this.f = n.c(this.getContext(), (float)this.p[i]);
          }
       }
       tp = this.p;
       if (tp != null) {
          i = 3;
          if (tp.length > i) {
             this.d = n.c(this.getContext(), (float)this.p[i]);
          }
       }
       this.m.setPadding(this.e, this.c, this.f, this.d);
       return;
    }
    public void setStickerTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerView.class, "9")) {
          return;
       }
       this.b = p0;
       this.m.setText(p0);
       this.m.getViewTreeObserver().addOnPreDrawListener(new StickerView$a(this));
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(StickerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StickerView.class, "5")) {
          return;
       }
       this.w = p0;
       if (p0 > 0) {
          this.m.setTextColor(p0);
       }
       this.o.setColor(p0);
       return;
    }
    public void setTextMaxEms(int p0){
       this.u = p0;
    }
    public void setTextSize(int p0){
       if (PatchProxy.isSupport(StickerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StickerView.class, "6")) {
          return;
       }
       this.v = p0;
       if (p0 > 0) {
          this.m.setTextSize(1, (float)p0);
       }
       this.o.setTextSize(this.m.getTextSize());
       this.o.setTypeface(this.m.getTypeface());
       return;
    }
}
