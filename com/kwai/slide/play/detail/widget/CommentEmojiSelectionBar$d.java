package com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$d;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import ct7.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$d$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Float;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.IllegalArgumentException;

public class CommentEmojiSelectionBar$d	// class@00188d
{
    public float a;
    public boolean b;
    public ValueAnimator c;
    public final CommentEmojiSelectionBar d;

    public void CommentEmojiSelectionBar$d(CommentEmojiSelectionBar p0,int p1){
       this.d = p0;
       super();
       this.a = (float)p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, CommentEmojiSelectionBar$d.class, "2")) {
          return;
       }
       this.c.cancel();
       return;
    }
    public final float b(float p0,float p1,float p2){
       return (p2 + ((p1 - p2) * p0));
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, CommentEmojiSelectionBar$d.class, "1")) {
          return;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.c = valueAnimato;
       valueAnimato.setDuration(150);
       this.c.setInterpolator(new DecelerateInterpolator());
       this.c.addUpdateListener(new a(this));
       this.c.addListener(new CommentEmojiSelectionBar$d$a(this));
       this.c.start();
       return;
    }
    public void d(float p0){
       float[] uofloatArray;
       CommentEmojiSelectionBar$d uod = CommentEmojiSelectionBar$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "3")) {
          return;
       }
       int i = 0;
       if (this.b == null) {
          uod = this.d;
          if (uod.g == null) {
             uofloatArray = new float[uod.getFixedChildCount()];
             uod.g = uofloatArray;
          }
          uod = this.d;
          if (uod.i == null) {
             uofloatArray = new float[uod.getFixedChildCount()];
             uod.i = uofloatArray;
          }
          int i1 = 0;
          while (true) {
             if (i1 < this.d.getFixedChildCount()) {
                View view = this.d.a(i1);
                if (view.getLayoutParams().height == view.getLayoutParams().width) {
                   this.d.g[i1] = (float)view.getLayoutParams().height;
                   this.d.i[i1] = view.getAlpha();
                   i1 = i1 + 1;
                }else {
                   throw new IllegalArgumentException("height must equals width ");
                }
             }else {
                this.b = true;
                uod = this.d;
                uod.n = (float)uod.m.getLayoutParams().height;
                uod = this.d;
                uod.k = uod.j;
             }
          }
       }
       float f = 0;
       while (i < this.d.getFixedChildCount()) {
          View view1 = this.d.a(i);
          CommentEmojiSelectionBar$d td = this.d;
          int i2 = td.g[i];
          int i3 = td.i[i];
          ViewGroup$LayoutParams layoutParams = view1.getLayoutParams();
          int d = CommentEmojiSelectionBar.D;
          CommentEmojiSelectionBar$d ta = this.a;
          float f1 = 0x3f800000;
          if (ta - f >= 0) {
             if (!(float)i - ta) {
                d = CommentEmojiSelectionBar.B;
             }else {
                d = CommentEmojiSelectionBar.C;
                f1 = 0.30f;
             }
          }
          f = this.b(p0, (float)d, i2);
          i2 = (int)f;
          layoutParams.width = i2;
          layoutParams.height = i2;
          this.d.h[i] = f;
          view1.requestLayout();
          view1.setAlpha(this.b(p0, f1, i3));
          i = i + 1;
       }
       ViewGroup$LayoutParams layoutParams1 = this.d.m.getLayoutParams();
       CommentEmojiSelectionBar p = (this.a - f >= 0)? this.d.p: this.d.o;
       layoutParams1.height = (int)this.b(p0, (float)p, this.d.n);
       uod = this.d;
       if (this.a - f >= 0) {
          f = (float)CommentEmojiSelectionBar.H;
       }
       uod.j = this.b(p0, f, uod.k);
       this.d.m.requestLayout();
       return;
    }
}
