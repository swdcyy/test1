package com.kuaishou.commercial.home.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.home.c$a;
import com.kuaishou.commercial.home.c$b;
import com.kuaishou.commercial.home.c$c;
import com.kuaishou.commercial.home.c$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import kz8.c;
import com.kuaishou.commercial.home.c$g;
import android.content.Context;
import android.view.WindowManager;
import android.view.Display;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverMetaExt;
import com.facebook.drawee.view.DraweeView;
import android.widget.ImageView;
import com.kuaishou.commercial.home.c$e;
import android.view.View$OnTouchListener;
import com.kuaishou.commercial.home.c$f;
import android.app.Activity;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.commercial.home.c$h;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import erd.g;
import crd.b;
import jp.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import tw.j;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl;
import android.net.Uri;
import ekd.x0;
import java.lang.Runnable;
import ekd.k1;
import lnc.b9;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.graphics.drawable.Animatable;
import java.lang.System;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import qx.x;
import android.animation.ValueAnimator;
import qx.w;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends PresenterV2	// class@0014e1
{
    public int[] A;
    public final long B;
    public final float C;
    public final long D;
    public Uri E;
    public c$g F;
    public long G;
    public long H;
    public long I;
    public boolean J;
    public int K;
    public ViewTreeObserver L;
    public boolean M;
    public boolean N;
    public RecyclerFragment O;
    public b P;
    public c$f Q;
    public ViewTreeObserver$OnScrollChangedListener R;
    public Runnable S;
    public Runnable T;
    public Runnable U;
    public KwaiImageView p;
    public PhotoAdvertisement q;
    public CommonMeta r;
    public CoverMeta s;
    public BaseFeed t;
    public BaseFragment u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public Animatable z;

    public void c(){
       super();
       this.v = true;
       this.w = true;
       int[] ointArray = new int[2];
       this.A = ointArray;
       this.B = 200;
       this.C = 100.00f;
       this.D = 2000;
       this.G = 0;
       this.H = 0;
       this.R = new c$a(this);
       this.S = new c$b(this);
       this.T = new c$c(this);
       this.U = new c$d(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       if (!c.a(this.q)) {
          return;
       }
       if (this.y != null) {
          return;
       }
       this.y = true;
       this.F = new c$g(this);
       this.K = this.getContext().getSystemService("window").getDefaultDisplay().getHeight();
       float coverAspectR = CoverMetaExt.getCoverAspectRatioPrioritizeAdCover(this.s, this.r);
       if (coverAspectR - 0x3fe38e39 > 0) {
          coverAspectR = 0x3fe38e39;
       }
       c tp = this.p;
       if (tp != null) {
          tp.setAspectRatio((0x3f800000 / coverAspectR));
          this.p.setVisibility(0);
          this.p.setAlpha(0);
          this.p.setOnTouchListener(new c$e(this));
       }
       this.Q = new c$f(this);
       this.getActivity().getApplication().registerActivityLifecycleCallbacks(this.Q);
       c tu = this.u;
       if (tu instanceof RecyclerFragment) {
          this.O = tu;
          this.P = this.O.I5().compose(c.c(this.u.m(), FragmentEvent.DESTROY)).subscribe(new c$h(this));
       }
       if (!PatchProxy.applyVoidThreeRefs(this.p, this.t, a.c, this, c.class, "6")) {
          if (j.m(this.q).mCoverUrls == null || !j.m(this.q).mCoverUrls.size()) {
             this.E = objArray;
          }else if(j.m(this.q).mCoverUrls.get(0).mUrl == null){
             this.E = objArray;
          }else {
             this.E = x0.f(j.m(this.q).mCoverUrls.get(0).mUrl);
          }
          k1.r(this.U, 500);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.y = false;
       this.N = false;
       this.x = false;
       if (this.Q != null) {
          this.getActivity().getApplication().unregisterActivityLifecycleCallbacks(this.Q);
       }
       c tP = this.P;
       if (tP != null) {
          b9.a(tP);
       }
       tP = this.L;
       if (tP != null) {
          if (tP.isAlive()) {
             this.L.removeOnScrollChangedListener(this.R);
          }else {
             tP = this.p;
             if (tP != null) {
                tP.getViewTreeObserver().removeOnScrollChangedListener(this.R);
             }
          }
          k1.m(this.S);
          k1.m(this.T);
          k1.m(this.U);
          tP = this.z;
          if (tP != null) {
             tP.stop();
          }
          tP = this.p;
          if (tP != null) {
             tP.setVisibility(8);
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       if (this.J != null) {
          return;
       }
       this.J = true;
       long l = 0;
       if (this.G - l) {
          l = System.currentTimeMillis() - this.G;
       }
       c tq = this.q;
       if (tq != null && j.m(tq) != null) {
          o.z().e(387, this.t).d(new x(this, l)).a();
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       if (this.z == null) {
          return;
       }
       this.P8();
       if (this.w == null || !this.z.isRunning()) {
          k1.m(this.S);
          k1.m(this.T);
          return;
       }else {
          this.w = false;
          this.N = false;
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x42c80000});
          valueAnimato.setDuration(200);
          valueAnimato.setStartDelay(0);
          valueAnimato.start();
          valueAnimato.addUpdateListener(new w(this));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a310f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.t8("AD");
       this.r = this.q8(CommonMeta.class);
       this.s = this.q8(CoverMeta.class);
       this.t = this.r8("feed");
       this.u = this.r8("FRAGMENT");
       return;
    }
}
