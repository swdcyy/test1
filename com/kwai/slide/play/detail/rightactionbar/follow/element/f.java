package com.kwai.slide.play.detail.rightactionbar.follow.element.f;
import qp7.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.animation.ValueAnimator;
import ns7.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import lnc.a1;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import android.content.Context;
import android.app.Activity;
import wkd.b;
import com.kwai.slide.play.detail.performance.ElementViewAsyncFactory;
import java.util.Objects;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import as7.a;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import java.lang.StringBuilder;
import com.kwai.slide.play.detail.performance.ElementViewAsyncFactory$b;
import java.util.Map;
import java.util.Queue;
import com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarWithFollowLiving;
import qp7.x0;
import os7.a;
import qp7.t0;
import com.kwai.slide.play.detail.rightactionbar.follow.element.AvatarWithFollow;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import ns7.q;
import android.view.View$OnClickListener;
import ns7.r;
import com.kwai.slide.play.detail.rightactionbar.follow.element.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import ns7.n;
import com.kwai.slide.play.detail.rightactionbar.follow.element.a;
import ns7.d;
import ns7.i;
import ns7.f;
import ns7.o;
import com.kwai.slide.play.detail.rightactionbar.follow.element.c;
import ns7.e;
import ns7.j;
import ns7.k;
import ns7.x;
import ns7.c;
import ns7.g;
import ns7.l;
import ns7.s;
import ns7.t;
import ns7.h;
import o56.a;
import java.lang.CharSequence;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.graphics.Typeface;
import ekd.d0;

public abstract class f extends d	// class@001858
{
    public boolean A;
    public SpFollowBubbleLayout B;
    public a l;
    public KwaiImageView m;
    public AvatarWithPendantView n;
    public ImageView o;
    public ImageView p;
    public ImageView q;
    public ImageView r;
    public View s;
    public KwaiLottieAnimationView t;
    public Boolean u;
    public TextView v;
    public Boolean w;
    public View x;
    public ValueAnimator y;
    public a z;

    public void f(){
       super();
    }
    public void A(boolean p0,boolean p1){
       int i;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uof, "13")) {
          return;
       }
       uof = this.y;
       if (uof != null) {
          uof.cancel();
          this.y = null;
       }
       if (p1) {
          i = 2;
          this.y = (p0)? ValueAnimator.ofArgb(new int[i]{0,-1}): ValueAnimator.ofArgb(new int[i]{-1,0});
          this.y.setDuration(300);
          this.y.addUpdateListener(new b(this, p0));
          this.y.start();
       }else if(p0){
          i = 0x7f061c32;
       }else {
          i = 0x7f061c31;
       }
       this.x(a1.a(i), p0);
       return;
    }
    public View i(){
       Object[] objArray1;
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ElementViewAsyncFactory obj = PatchProxy.apply(objArray, this, f.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       boolean b = false;
       this.g.setClipChildren(b);
       if (this.g.getContext() instanceof Activity) {
          obj = b.a(-912202812);
          Activity context = this.g.getContext();
          int i = 1;
          Objects.requireNonNull(obj);
          ElementViewAsyncFactory uElementView = ElementViewAsyncFactory.class;
          if (PatchProxy.isSupport(uElementView)) {
             Object obj1 = PatchProxy.applyTwoRefs(context, Integer.valueOf(i), obj, uElementView, "3");
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }else {
             label_004e :
                a.p(context, "context");
                if (!obj.a()) {
                   objArray1 = new Object[b];
                   a.C().w("ElementViewAsyncFactory", "disable", objArray1);
                }else if(!context instanceof FragmentActivity){
                   Object[] objArray2 = new Object[b];
                   a.C().t("ElementViewAsyncFactory", "getView need FragmentActivity, but cur is "+context, objArray2);
                }else {
                   ElementViewAsyncFactory$b uob = obj.b(context);
                   Queue queue = uob.o0().get(Integer.valueOf(i));
                   view = (queue != null)? queue.poll(): objArray;
                   if (view != null) {
                      a uoa = a.C();
                      StringBuilder str = "poll view async key "+i+", cache view count ";
                      Queue queue1 = uob.o0().get(Integer.valueOf(i));
                      if (queue1 != null) {
                         objArray = Integer.valueOf(queue1.size());
                      }
                      objArray = new Object[b];
                      uoa.w("ElementViewAsyncFactory", str+objArray, objArray);
                   }
                   objArray = view;
                }
             }
          }else {
             goto label_004e ;
          }
          if (objArray != null) {
             return objArray;
          }
       }
       objArray1 = new Object[b];
       a.C().w("AvatarAndFollowBaseElementView", "no async view, create new AvatarWithFollowLiving", objArray1);
       return new AvatarWithFollowLiving(this.h);
    }
    public void q(x0 p0){
       this.w(p0);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       if (this.b.h()) {
          View view = this.f.findViewById(R.id.slide_play_right_follow);
          if (view instanceof AvatarWithFollow) {
             view.setAdapt(true);
          }
       }
       return;
    }
    public final View v(){
       f tx = this.x;
       if (tx != null) {
          return tx;
       }
       return this.m;
    }
    public void w(a p0){
       float f;
       f uof = f.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "3")) {
          return;
       }
       View view = this.f.findViewById(R.id.follow_avatar_view);
       if (view instanceof KwaiImageView) {
          this.m = view;
       }else {
          this.n = view;
          view.q(true);
          this.m = this.n.getAvatar();
       }
       this.o = this.f.findViewById(0x7f0a3a0f);
       this.p = this.f.findViewById(0x7f0a3a0a);
       this.q = this.f.findViewById(0x7f0a3a16);
       this.r = this.f.findViewById(0x7f0a3a15);
       this.v = this.f.findViewById(0x7f0a3a0b);
       this.x = this.f.findViewById(0x7f0a39c6);
       if (!PatchProxy.applyVoid(null, this, uof, "6")) {
          int i = 48;
          f tn = this.n;
          if (tn == null) {
             ViewGroup$LayoutParams layoutParams = this.m.getLayoutParams();
             f = (float)i;
             layoutParams.width = a1.e(f);
             layoutParams.height = a1.e(f);
             this.m.setLayoutParams(layoutParams);
          }else {
             f = (float)i;
             int i1 = a1.e(f);
             tn.setAvatarParam(new ViewGroup$LayoutParams(i1, a1.e(f)));
          }
       }
       this.r.setImageDrawable(a1.f(R.drawable.arg_RES_7f080146));
       this.s = this.f.findViewById(0x7f0a3a0c);
       this.t = this.f.findViewById(0x7f0a3a14);
       this.s.setOnClickListener(new q(this));
       this.o.setOnClickListener(new r(this));
       b uob = new b(this);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(uob, p0, uoa, "2")) {
          p0.i.d(p0.a, uob);
       }
       n on = new n(this);
       if (!PatchProxy.applyVoidOneRefs(on, p0, uoa, "27")) {
          p0.m.d(p0.a, on);
       }
       a uoa1 = new a(this);
       if (!PatchProxy.applyVoidOneRefs(uoa1, p0, uoa, "23")) {
          p0.A.d(p0.a, uoa1);
       }
       d uod = new d(this);
       if (!PatchProxy.applyVoidOneRefs(uod, p0, uoa, "25")) {
          p0.B.d(p0.a, uod);
       }
       i oi = new i(this);
       if (!PatchProxy.applyVoidOneRefs(oi, p0, uoa, "16")) {
          p0.f.d(p0.a, oi);
       }
       f uof1 = new f(this);
       if (!PatchProxy.applyVoidOneRefs(uof1, p0, uoa, "31")) {
          p0.l.d(p0.a, uof1);
       }
       o oo = new o(this);
       if (!PatchProxy.applyVoidOneRefs(oo, p0, uoa, "19")) {
          p0.g.d(p0.a, oo);
       }
       c uoc = new c(this);
       if (!PatchProxy.applyVoidOneRefs(uoc, p0, uoa, "21")) {
          p0.h.d(p0.a, uoc);
       }
       e uoe = new e(this);
       if (!PatchProxy.applyVoidOneRefs(uoe, p0, uoa, "29")) {
          p0.n.d(p0.a, uoe);
       }
       j oj = new j(this);
       if (!PatchProxy.applyVoidOneRefs(oj, p0, uoa, "34")) {
          p0.p.d(p0.a, oj);
       }
       k ok = new k(this);
       if (!PatchProxy.applyVoidOneRefs(ok, p0, uoa, "44")) {
          p0.y.d(p0.a, ok);
       }
       x ox = new x(this);
       if (!PatchProxy.applyVoidOneRefs(ox, p0, uoa, "40")) {
          p0.s.d(p0.a, ox);
       }
       uoc = new c(this);
       if (!PatchProxy.applyVoidOneRefs(uoc, p0, uoa, "42")) {
          p0.t.d(p0.a, uoc);
       }
       g og = new g(this);
       if (!PatchProxy.applyVoidOneRefs(og, p0, uoa, "38")) {
          p0.r.d(p0.a, og);
       }
       l ol = new l(this);
       if (!PatchProxy.applyVoidOneRefs(ol, p0, uoa, "36")) {
          p0.q.d(p0.a, ol);
       }
       this.p.setOnClickListener(new s(this));
       this.q.setOnClickListener(new t(this));
       h oh = new h(this);
       if (!PatchProxy.applyVoidOneRefs(oh, p0, uoa, "45")) {
          p0.k.d(p0.a, oh);
       }
       if (!PatchProxy.applyVoid(null, this, uof, "4") && a.d()) {
          f tm = this.m;
          if (tm != null) {
             tm.setContentDescription(a1.p(R.string.arg_RES_7f10031d));
          }
          if (this.p != null) {
             this.o.setContentDescription(a1.p(R.string.arg_RES_7f100f8f));
          }
          tm = this.p;
          if (tm != null) {
             tm.setContentDescription(a1.p(R.string.arg_RES_7f100df8));
          }
          tm = this.r;
          if (tm != null) {
             tm.setContentDescription(a1.p(R.string.arg_RES_7f101cca));
          }
       }
    label_029d :
       return;
    }
    public final void x(int p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uof, "14")) {
          return;
       }
       RoundingParams roundingPara = this.m.getHierarchy().n();
       if (roundingPara != null && p0 != roundingPara.d()) {
          if (p1) {
             roundingPara.j(p0, (float)a1.e(2.00f));
          }else {
             roundingPara.k(p0);
          }
          this.m.getHierarchy().L(roundingPara);
       }
       return;
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.v.setTypeface(d0.a("fonts/AvenirNext-BoldItalic.ttf", a1.c()));
       return;
    }
    public final void z(View p0,int p1,int p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f.class, "7")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = a1.e((float)p1);
       layoutParams.height = a1.e((float)p2);
       p0.setLayoutParams(layoutParams);
       return;
    }
}
