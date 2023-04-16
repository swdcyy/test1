package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import mn6.a;
import ml8.d;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import android.widget.FrameLayout;
import android.view.View;
import android.graphics.Rect;
import brd.t;
import ln6.c;
import java.lang.Object;
import android.widget.ImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.RelativeLayout;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import wtc.f;
import java.lang.Integer;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i$c;
import k2b.s;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import nn6.a;
import ekd.m1;
import wtc.h;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i$a;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.utility.n;
import psb.e;
import psb.f;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.g;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.b;
import erd.g;
import crd.b;
import lnc.b9;
import k2b.e0;
import android.animation.AnimatorSet;
import com.daimajia.easing.Skill;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.daimajia.easing.BaseEasingMethod$EasingListener;
import android.animation.ValueAnimator;
import com.daimajia.easing.Glider;
import android.animation.Animator;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i$b;
import android.animation.Animator$AnimatorListener;
import android.graphics.RectF;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo$VoteInfoExtParams;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView;

public class i implements a, d	// class@0012db
{
    public ImageView b;
    public Activity c;
    public FrameLayout d;
    public View e;
    public Rect f;
    public BaseFeed g;
    public VoteView h;
    public VoteResultResponse i;
    public c j;
    public t k;
    public b l;
    public boolean m;
    public b n;
    public AnimatorSet o;
    public i$c p;
    public i$c q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public a v;
    public boolean w;

    public void i(Activity p0,BaseFeed p1,FrameLayout p2,View p3,Rect p4,t p5,View p6,c p7){
       super();
       this.t = true;
       this.u = true;
       this.w = true;
       this.c = p0;
       this.g = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.k = p5;
       this.doBindView(p6);
       i tb = this.b;
       if (tb != null) {
          tb.setVisibility(4);
       }
       this.j = p7;
       return;
    }
    public boolean a(){
       return this.w;
    }
    public void b(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "9")) {
          return;
       }
       oi = this.h;
       if (oi != null) {
          float f = (p0)? 0x3f800000: 0;
          oi.setAlpha(f);
          if (p0 && this.t == null) {
             oi = this.i;
             if (oi != null && oi.mVoteInfo != null) {
                k1.p(new f(this), Integer.valueOf(0));
             }
          }
       }
    label_003d :
       this.t = p0;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, i.class, "12")) {
          return;
       }
       this.r = true;
       boolean b = false;
       this.w = b;
       i tb = this.b;
       if (tb != null && this.q != null) {
          int[] ointArray = new int[2];
          tb.getLocationOnScreen(ointArray);
          tb = this.q;
          tb.b = (float)ointArray[b];
          tb.d = (float)ointArray[1];
       }
       s.o("collapse_vote_sticker_dialog", 1870, this.g);
       if (this.q != null) {
          Object[] objArray = new Object[b];
          a.D().s("VoteViewHelper", "hideVoteView: "+this.q.toString(), objArray);
       }
       this.i(this.h, this.q, true);
       return;
    }
    public void d(a p0){
       this.v = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a153b);
       m1.a(p0, new h(this), R.id.iv_interact_sticker);
       return;
    }
    public void e(){
       int i;
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       boolean b = true;
       this.w = b;
       s.o("expand_vote_sticker_dialog", 1871, this.g);
       i tb = this.b;
       i = 0;
       if (tb != null && this.p != null) {
          int[] ointArray = new int[2];
          tb.getLocationOnScreen(ointArray);
          tb = this.p;
          tb.a = (float)ointArray[i];
          tb.c = (float)ointArray[b];
       }
       n.X(this.b, 4, 170, new i$a(this));
       if (this.p != null) {
          Object[] objArray = new Object[i];
          a.D().s("VoteViewHelper", "showVoteView: "+this.p.toString(), objArray);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{"request vote info"};
       a.D().s("ShowVoteView", "photo detail show vote", objArray);
       f.a().e(this.g.getId()).map(new e()).subscribe(new g(this), b.b);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       i th = this.h;
       if (th != null && this.m == null) {
          this.d.removeView(th);
       }
       this.m = true;
       b[] uobArray = new b[]{this.l,this.n};
       b9.b(uobArray);
       return;
    }
    public final e0 h(){
       i tc = this.c;
       if (tc instanceof e0) {
       }else {
          tc = null;
       }
       return tc;
    }
    public void i(View p0,i$c p1,boolean p2){
       float[] this;
       float alpha;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, i.class, "13")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       boolean b = false;
       this.s = b;
       i to = this.o;
       if (to != null) {
          to.cancel();
       }else {
          this.o = new AnimatorSet();
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
       i$c g = (this.t != null)? p1.g: p0.getAlpha();
       uofloatArray3[b] = g;
       p1 = (this.t != null)? p1.h: p0.getAlpha();
       uofloatArray3[1] = p1;
       BaseEasingMethod$EasingListener[] uEasingListe3 = new BaseEasingMethod$EasingListener[b];
       Animator[] uAnimatorArr = new Animator[]{valueAnimato,this1,valueAnimato1,valueAnimato2,Glider.glide(linear, 170.00f, ObjectAnimator.ofFloat(p0, aLPHA, uofloatArray3), uEasingListe3)};
       this.o.playTogether(uAnimatorArr);
       this.o.addListener(new i$b(this, p2));
       this.o.start();
       return;
    }
    public void j(){
       Rect left;
       int i;
       int i1;
       Rect rect;
       if (PatchProxy.applyVoid(null, this, i.class, "10")) {
          return;
       }
       i te = this.e;
       if (te == null) {
          i tf = this.f;
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
       this.h.a(this.i.mVoteInfo.getPosition(), i, i1, left, rect, this.i.getVoteInfoExtParams().mScale, this.i.getVoteInfoExtParams().mPhotoAspectRatio);
       return;
    }
}
