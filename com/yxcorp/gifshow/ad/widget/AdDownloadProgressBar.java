package com.yxcorp.gifshow.ad.widget.AdDownloadProgressBar;
import com.yxcorp.gifshow.ad.widget.BaseAdProgressView;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.ad.widget.AdDownloadProgressBar$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.ad.widget.RoundCornerLayout;
import android.graphics.drawable.GradientDrawable;
import w59.d;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import java.lang.Boolean;
import w59.c;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Long;
import android.text.TextUtils;
import android.content.res.ColorStateList;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.ad.widget.a;
import java.util.Objects;
import android.animation.AnimatorSet;
import g59.k0;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.core.content.ContextCompat;
import w59.b;
import android.view.View$OnClickListener;
import java.lang.Float;
import w59.a;
import android.graphics.Typeface;
import android.text.TextPaint;

public class AdDownloadProgressBar extends BaseAdProgressView	// class@001917
{
    public TextView j;
    public ImageView k;
    public View l;
    public int m;
    public d n;
    public AdDownloadProgressBar$a o;
    public TextView p;
    public a q;

    public void AdDownloadProgressBar(Context p0){
       super(p0, null);
    }
    public void AdDownloadProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AdDownloadProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = new AdDownloadProgressBar$a(this);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDownloadProgressBar.class, "1")) {
       }else {
          this.m = a1.d(0x7f07042c);
          if (!PatchProxy.applyVoid(objArray, this, AdDownloadProgressBar.class, "20")) {
             a.d(this.getContext(), R.layout.arg_RES_7f0d004f, this, true);
             this.j = this.findViewById(0x7f0a010d);
             this.l = this.findViewById(0x7f0a010b);
             this.k = this.findViewById(0x7f0a010c);
          }
          if (!PatchProxy.applyVoid(objArray, this, AdDownloadProgressBar.class, "19")) {
             this.setRadius((float)this.m);
             d uod = new d(this.getContext(), this.g(0x7f061c10), this.g(0x7f06202f), 0);
             this.n = uod;
             this.k.setImageDrawable(uod);
             this.k.setBackground(super.getBackground());
             super.setBackground(objArray);
             this.setForeground(objArray);
             this.l.setBackgroundResource(R.drawable.arg_RES_7f080096);
          }
          this.setProgress(0);
       }
       return;
    }
    public void c(CharSequence p0,boolean p1){
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, AdDownloadProgressBar.class, "4")) {
          return;
       }
       AdDownloadProgressBar to = this.o;
       to.c = false;
       to.b = p0;
       k1.o(new c(this, p1));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressBar.class, "2")) {
          return;
       }
       this.setProgress(this.o.a);
       return;
    }
    public void e(String p0,long p1,long p2,long p3){
       AdDownloadProgressBar uAdDownloadP = this;
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, AdDownloadProgressBar.class, "15")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && uAdDownloadP.q == null) {
          if (!PatchProxy.applyVoid(null, uAdDownloadP, AdDownloadProgressBar.class, "17")) {
             if (uAdDownloadP.p == null) {
                TextView textView = new TextView(this.getContext());
                uAdDownloadP.p = textView;
                textView.setTextSize(0, uAdDownloadP.j.getTextSize());
                uAdDownloadP.p.setTextColor(uAdDownloadP.j.getTextColors());
                uAdDownloadP.p.setGravity(uAdDownloadP.j.getGravity());
             }
             if (uAdDownloadP.p.getParent() == null) {
                uAdDownloadP.p.setVisibility(8);
                uAdDownloadP.addView(uAdDownloadP.p, uAdDownloadP.j.getLayoutParams());
             }
          }
          AdDownloadProgressBar p = uAdDownloadP.p;
          if (p != null) {
             p.setText(p0);
             a uoa = new a(uAdDownloadP.j, uAdDownloadP.p, p1, p2, p3);
             uAdDownloadP.q = p;
             p.a(p3);
          }
       }
    label_00a6 :
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressBar.class, "16")) {
          return;
       }
       AdDownloadProgressBar tq = this.q;
       if (tq != null) {
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoid(null, tq, a.class, "2")) {
             tq.h.cancel();
             k1.m(tq.i);
             tq.b.setVisibility(8);
             tq.a.setVisibility(0);
             tq.a.setScaleX(0x3f800000);
             tq.a.setScaleY(0x3f800000);
             tq.b.setScaleX(0x3f800000);
             tq.b.setScaleY(0x3f800000);
             tq.a.setAlpha(0x3f800000);
          }
          this.q = null;
       }
       k0.e(this.p);
       this.p = null;
       return;
    }
    public final GradientDrawable g(int p0){
       GradientDrawable obj;
       if (PatchProxy.isSupport(AdDownloadProgressBar.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AdDownloadProgressBar.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new GradientDrawable();
       obj.setShape(0);
       obj.setColor(ContextCompat.getColor(this.getContext(), p0));
       return obj;
    }
    public Drawable getBackground(){
       AdDownloadProgressBar obj = PatchProxy.apply(null, this, AdDownloadProgressBar.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj != null) {
          return obj.getBackground();
       }
       return null;
    }
    public TextView getContentTextView(){
       return this.j;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, AdDownloadProgressBar.class, "18")) {
          return;
       }
       if (this.k.getDrawable() == null) {
          this.k.setImageDrawable(this.n);
       }
       return;
    }
    public void setBackground(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDownloadProgressBar.class, "12")) {
          return;
       }
       AdDownloadProgressBar tk = this.k;
       if (tk != null) {
          tk.setBackground(p0);
       }else {
          super.setBackground(p0);
       }
       return;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdDownloadProgressBar.class, "10")) {
          return;
       }
       AdDownloadProgressBar tk = this.k;
       if (tk != null) {
          tk.setBackgroundColor(p0);
       }else {
          super.setBackgroundColor(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdDownloadProgressBar.class, "11")) {
          return;
       }
       AdDownloadProgressBar tk = this.k;
       if (tk != null) {
          tk.setBackgroundResource(p0);
       }else {
          super.setBackgroundResource(p0);
       }
       return;
    }
    public void setKeepProgressInStatus(boolean p0){
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdDownloadProgressBar.class, "5")) {
          return;
       }
       this.o.d = p0;
       k1.o(new b(this));
       return;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDownloadProgressBar.class, "14")) {
          return;
       }
       super.setOnClickListener(p0);
       AdDownloadProgressBar tl = this.l;
       if (tl != null) {
          tl.setOnClickListener(p0);
       }
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AdDownloadProgressBar.class, "3")) {
          return;
       }
       AdDownloadProgressBar to = this.o;
       to.c = true;
       to.a = p0;
       k1.o(new a(this));
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdDownloadProgressBar.class, "7")) {
          return;
       }
       this.j.setTextColor(p0);
       return;
    }
    public void setTextIncludeFontPadding(boolean p0){
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdDownloadProgressBar.class, "9")) {
          return;
       }
       this.j.setIncludeFontPadding(p0);
       return;
    }
    public void setTextSize(float p0){
       if (PatchProxy.isSupport(AdDownloadProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AdDownloadProgressBar.class, "6")) {
          return;
       }
       this.j.setTextSize(0, (float)a1.e(p0));
       return;
    }
    public void setTextTypeface(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDownloadProgressBar.class, "8")) {
          return;
       }
       this.j.getPaint().setTypeface(p0);
       return;
    }
}
