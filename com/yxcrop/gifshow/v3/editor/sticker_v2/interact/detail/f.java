package com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import mn6.a;
import ml8.d;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import android.widget.FrameLayout;
import android.view.View;
import android.graphics.Rect;
import brd.t;
import hmd.d;
import java.lang.Object;
import android.widget.ImageView;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo$AttachData;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import hmd.c;
import java.lang.Integer;
import java.lang.Runnable;
import ekd.k1;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$c;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import nn6.a;
import ekd.m1;
import hmd.a;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$a;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.utility.n;
import t45.d;
import brd.z;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.d;
import erd.g;
import crd.b;
import lnc.b9;
import android.animation.AnimatorSet;
import com.daimajia.easing.Skill;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.daimajia.easing.BaseEasingMethod$EasingListener;
import android.animation.ValueAnimator;
import com.daimajia.easing.Glider;
import android.animation.Animator;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$b;
import android.animation.Animator$AnimatorListener;
import android.graphics.RectF;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;

public class f implements a, d	// class@000a93
{
    public ImageView b;
    public Activity c;
    public FrameLayout d;
    public View e;
    public Rect f;
    public BaseFeed g;
    public InteractStickerWrapperView h;
    public InteractStickerInfo i;
    public t j;
    public b k;
    public boolean l;
    public AnimatorSet m;
    public f$c n;
    public f$c o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public a t;
    public boolean u;
    public d v;

    public void f(Activity p0,BaseFeed p1,FrameLayout p2,View p3,Rect p4,t p5,View p6,d p7){
       super();
       this.r = true;
       this.s = true;
       this.u = true;
       this.c = p0;
       this.g = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.j = p5;
       this.doBindView(p6);
       f tb = this.b;
       if (tb != null) {
          tb.setVisibility(4);
       }
       this.v = p7;
       p7.a(p0.getIntent());
       return;
    }
    public boolean a(){
       return this.u;
    }
    public void b(boolean p0){
       float f;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "7")) {
          return;
       }
       uof = this.h;
       if (uof != null) {
          f = (p0)? 0x3f800000: 0;
          uof.setAlpha(f);
          if (p0 && this.r == null) {
             uof = this.i;
             if (uof != null && uof.getAttachData() != null) {
                k1.p(new c(this), Integer.valueOf(0));
             }
          }
       }
    label_003f :
       this.r = p0;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       f tb = this.b;
       if (tb == null) {
          return;
       }
       this.p = true;
       boolean b = false;
       this.u = b;
       if (tb != null && this.o != null) {
          int[] ointArray = new int[2];
          tb.getLocationOnScreen(ointArray);
          tb = this.o;
          tb.b = (float)ointArray[b];
          tb.d = (float)ointArray[1];
       }
       if (this.o != null) {
          Object[] objArray = new Object[b];
          a.D().s("InteractStickerViewHelper", "hideVoteView: "+this.o.toString(), objArray);
       }
       this.h(this.h, this.o, true);
       return;
    }
    public void d(a p0){
       this.t = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a153b);
       m1.a(p0, new a(this), R.id.iv_interact_sticker);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       boolean b = true;
       this.u = b;
       f tb = this.b;
       int i = 0;
       if (tb != null && this.n != null) {
          int[] ointArray = new int[2];
          tb.getLocationOnScreen(ointArray);
          tb = this.n;
          tb.a = (float)ointArray[i];
          tb.c = (float)ointArray[b];
       }
       n.X(this.b, 4, 170, new f$a(this));
       if (this.n != null) {
          Object[] objArray = new Object[i];
          a.D().s("InteractStickerViewHelper", "showVoteView: "+this.n.toString(), objArray);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{"request vote info"};
       a.D().s("ShowVoteView", "photo detail show vote", objArray);
       this.v.getData().subscribeOn(d.a).subscribe(new b(this), d.b);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.v.release();
       f th = this.h;
       if (th != null && this.l == null) {
          this.d.removeView(th);
       }
       this.l = true;
       b[] uobArray = new b[true];
       uobArray[0] = this.k;
       b9.b(uobArray);
       return;
    }
    public void h(View p0,f$c p1,boolean p2){
       float[] this;
       float alpha;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, f.class, "11")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       boolean b = false;
       this.q = b;
       f tm = this.m;
       if (tm != null) {
          tm.cancel();
       }else {
          this.m = new AnimatorSet();
       }
       Skill linear = Skill.Linear;
       this = new float[]{p1.e,p1.f};
       BaseEasingMethod$EasingListener[] ValueAnimator this1 = new BaseEasingMethod$EasingListener[b];
       ValueAnimator valueAnimato = Glider.glide(linear, 330.00f, ObjectAnimator.ofFloat(p0, View.SCALE_X, this), this1);
       float[] uofloatArray = new float[]{p1.e,p1.f};
       BaseEasingMethod$EasingListener[] uEasingListe = new BaseEasingMethod$EasingListener[b];
       this1 = Glider.glide(linear, 330.00f, ObjectAnimator.ofFloat(p0, View.SCALE_Y, uofloatArray), uEasingListe);
       float[] uofloatArray1 = new float[]{p1.a,p1.b};
       BaseEasingMethod$EasingListener[] uEasingListe1 = new BaseEasingMethod$EasingListener[b];
       ValueAnimator valueAnimato1 = Glider.glide(linear, 330.00f, ObjectAnimator.ofFloat(p0, View.TRANSLATION_X, uofloatArray1), uEasingListe1);
       float[] uofloatArray2 = new float[]{p1.c,p1.d};
       BaseEasingMethod$EasingListener[] uEasingListe2 = new BaseEasingMethod$EasingListener[b];
       ValueAnimator valueAnimato2 = Glider.glide(linear, 330.00f, ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray2), uEasingListe2);
       Property aLPHA = View.ALPHA;
       float[] uofloatArray3 = new float[2];
       f$c g = (this.r != null)? p1.g: p0.getAlpha();
       uofloatArray3[b] = g;
       p1 = (this.r != null)? p1.h: p0.getAlpha();
       uofloatArray3[1] = p1;
       BaseEasingMethod$EasingListener[] uEasingListe3 = new BaseEasingMethod$EasingListener[b];
       Animator[] uAnimatorArr = new Animator[]{valueAnimato,this1,valueAnimato1,valueAnimato2,Glider.glide(linear, 170.00f, ObjectAnimator.ofFloat(p0, aLPHA, uofloatArray3), uEasingListe3)};
       this.m.playTogether(uAnimatorArr);
       this.m.addListener(new f$b(this, p2));
       this.m.start();
       return;
    }
    public void i(){
       Rect left;
       int i;
       int i1;
       Rect rect;
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       f te = this.e;
       if (te == null) {
          f tf = this.f;
          left = tf.left;
          i = this.f.width();
          i1 = this.f.height();
          rect = tf.top;
       }else {
          int[] ointArray = new int[2];
          te.getLocationOnScreen(ointArray);
          left = ointArray[0];
          i = this.e.getMeasuredWidth();
          rect = ointArray[1];
          i1 = this.e.getMeasuredHeight();
       }
       this.h.a(this.i.getAttachData().getPosition(), i, i1, left, rect, this.i.getAttachData().getScale(), this.i.getAttachData().getPhotoAspectRatio());
       return;
    }
}
