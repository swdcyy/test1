package com.kuaishou.commercial.photoreduce.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z8c.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import com.yxcorp.gifshow.entity.QPhoto;
import l29.d;
import com.kuaishou.commercial.photoreduce.g$b;
import com.kuaishou.commercial.photoreduce.g$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import com.kuaishou.commercial.photoreduce.f;
import android.view.View$OnClickListener;
import android.view.View;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import java.util.concurrent.TimeUnit;
import brd.a0;
import ky.j0;
import sfc.a;
import erd.g;
import crd.b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import com.kuaishou.commercial.photoreduce.a$a;
import com.kuaishou.commercial.photoreduce.g$e;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import ky.k0;
import ky.l0;
import wkd.b;
import mxb.f0;
import ky.h0;
import ky.i0;
import com.yxcorp.utility.n;
import ky.d0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ky.m0;
import android.animation.Animator$AnimatorListener;
import java.lang.Float;
import ky.e0;
import ky.n0;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import ky.f0;
import ky.g0;

public class g extends PresenterV2	// class@00152e
{
    public int A;
    public int B;
    public int C;
    public AnimatorSet D;
    public ValueAnimator E;
    public ValueAnimator F;
    public View p;
    public RecyclerView q;
    public View r;
    public RecyclerView s;
    public QPhoto t;
    public View$OnClickListener u;
    public c v;
    public List w;
    public boolean x;
    public a$a y;
    public g$e z;
    public static final int G;

    static {
       g.G = a1.e(50.50f);
    }
    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "5")) {
          int i = a1.e(19.00f);
          boolean b = false;
          this.q.setLayoutManager(new LinearLayoutManager(this.getContext()));
          this.q.addItemDecoration(this.S8(b, b, i, i));
          this.q.setItemAnimator(objArray);
          g$b uob = (d.a(this.t))? new g$b(this): new g$a(this);
          this.q.setAdapter(uob);
          this.s.setLayoutManager(new LinearLayoutManager(this.getContext()));
          this.s.addItemDecoration(this.S8(b, b, i, i));
          this.s.setItemAnimator(objArray);
          uob.W0(this.w);
       }
       DislikeHelper.d(this.t, this.x);
       this.p.setOnClickListener(f.b);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "16")) {
          return;
       }
       g tE = this.E;
       if (tE != null) {
          tE.removeAllListeners();
       }
       tE = this.F;
       if (tE != null) {
          tE.removeAllListeners();
       }
       tE = this.D;
       if (tE != null) {
          tE.cancel();
       }
       return;
    }
    public void R8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "8")) {
          return;
       }
       a0.Y(300, TimeUnit.MILLISECONDS).R(new j0(this), new a());
       this.v.q(4);
       g tu = this.u;
       if (tu != null) {
          tu.onClick(p0);
       }
       return;
    }
    public final a S8(boolean p0,boolean p1,int p2,int p3){
       a obj;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, g.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       obj.p(p0);
       obj.q(p1);
       obj.m(p2);
       obj.n(p3);
       if (!d.a(this.t)) {
          obj.o(a1.f(R.drawable.arg_RES_7f081e25));
       }else {
          obj.o(a1.f(R.drawable.arg_RES_7f080685));
       }
       return obj;
    }
    public void V8(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       if (this.z == null) {
          g$e uoe = new g$e(this);
          this.z = uoe;
          this.s.setAdapter(uoe);
       }
       this.y = p0;
       g tz = this.z;
       tz.w = p0;
       tz.W0(p0.i);
       this.z.k0();
       this.A = this.p.getWidth();
       this.B = this.p.getHeight();
       int i = (p0.i.size() + 1) * g.G;
       this.C = i;
       this.Y8(this.B, i, false);
       if (d.a(this.t)) {
          DislikeHelper.f(p0, this.t, this.x);
       }else {
          this.X8();
       }
       return;
    }
    public void W8(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "17")) {
          return;
       }
       if (this.t.isLiveStream()) {
          i0.a().e(306, this.t.mEntity).d(new k0(this, p0)).a();
       }else {
          i0.a().e(18, this.t.mEntity).d(new l0(this, p0)).a();
       }
       b.a(-762347696).r1(this.t.mEntity, "key_feedbacktype", "-1");
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, g.class, "18")) {
          return;
       }
       a$a a = this.y.a;
       if (a == 10) {
          i0.a().e(222, this.t.mEntity).d(new h0(this)).a();
       }else if(a == 6){
          i0.a().e(223, this.t.mEntity).d(new i0(this)).a();
       }
       return;
    }
    public final void Y8(int p0,int p1,boolean p2){
       ValueAnimator valueAnimato;
       ValueAnimator valueAnimato1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, g.class, "11")) {
          return;
       }
       this.P8();
       View[] viewArray = new View[]{this.r};
       n.Z(0, viewArray);
       if (PatchProxy.isSupport(g.class)) {
          valueAnimato = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, g.class, "12");
          if (valueAnimato != patchProxyRe) {
          label_0069 :
             this.E = valueAnimato;
             float f = 0;
             float f1 = (p2)? (float)(- this.A): 0;
             if (!p2) {
                f = (float)(- this.A);
             }
             if (PatchProxy.isSupport(g.class)) {
                valueAnimato1 = PatchProxy.applyTwoRefs(Float.valueOf(f1), Float.valueOf(f), this, g.class, "14");
                if (valueAnimato1 != patchProxyRe) {
                label_00b5 :
                   this.F = valueAnimato1;
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   this.D = uAnimatorSet;
                   uAnimatorSet.setInterpolator(new DecelerateInterpolator(2.00f));
                   this.D.setDuration(300);
                   Animator[] uAnimatorArr = new Animator[]{this.E,this.F};
                   this.D.playTogether(uAnimatorArr);
                   this.D.start();
                   return;
                }
             }
             this.a9(this.q, this.r, f1);
             float[] uofloatArray = new float[]{f1,f};
             valueAnimato1 = ValueAnimator.ofFloat(uofloatArray);
             valueAnimato1.addUpdateListener(new e0(this));
             valueAnimato1.addListener(new n0(this, f));
             goto label_00b5 ;
          }
       }
       this.Z8(this.p, p0);
       int[] ointArray = new int[]{p0,p1};
       valueAnimato = ValueAnimator.ofInt(ointArray);
       valueAnimato.addUpdateListener(new d0(this));
       valueAnimato.addListener(new m0(this, p1));
       goto label_0069 ;
    }
    public void Z8(View p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "13")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.height = p1;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void a9(View p0,View p1,float p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, g.class, "15")) {
          return;
       }
       p0.setTranslationX(p2);
       p1.setTranslationX((p2 + (float)this.A));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a37f3);
       this.q = m1.f(p0, 0x7f0a0ec7);
       this.p = m1.f(p0, 0x7f0a0b73);
       this.r = m1.f(p0, 0x7f0a37f6);
       m1.a(p0, new f0(this), R.id.back_iv);
       m1.a(p0, new g0(this), R.id.cancel_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.t = this.q8(QPhoto.class);
       this.u = this.s8(View$OnClickListener.class);
       this.v = this.r8("PHOTO_REDUCE_POPUP");
       this.w = this.r8("PHOTO_REDUCE_REASONS");
       this.x = this.v8("PHOTO_REDUCE_LONG_CLICK", Boolean.class).booleanValue();
       return;
    }
}
