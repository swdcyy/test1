package h63.k0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h63.k0$c;
import c77.l;
import io.reactivex.subjects.PublishSubject;
import h63.j0;
import h63.k0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h63.h0;
import h63.r0;
import im8.a;
import h63.j;
import v53.l;
import h63.f0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import y43.a;
import h63.y;
import xp5.a;
import h63.h;
import android.view.View;
import v53.f;
import lp3.i;
import v53.a;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager;
import h63.a;
import java.util.List;
import h3.a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.gzone.widget.LiveGzoneScrollViewLogPager;
import v53.g;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager$a;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager;
import v53.h;
import android.view.View$OnLayoutChangeListener;
import v53.c;
import v53.d;
import oq5.c;
import oq5.a;
import mw1.d;
import mw1.b;
import h63.i0;
import h63.l0;
import h63.k0$b;
import mq5.h;
import mq5.b;
import lt5.b;
import lt5.a;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import z53.i;
import java.util.Objects;
import h47.b;
import j47.d;
import crd.b;
import lnc.b9;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import i63.b;
import com.kwai.live.gzone.tab.page.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabState$State;
import com.kwai.live.gzone.tab.page.LiveGzoneLifeStatePage;
import android.app.Activity;
import d61.y;
import lnc.a1;
import h63.m0;
import com.kwai.feature.api.live.service.show.rebroadcastbanner.BannerLocation;
import java.lang.Math;
import tkd.b;
import tkd.d;
import os5.h;
import android.view.ViewGroup;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import h63.p0;
import java.util.Map;
import java.util.HashMap;
import fq5.b;
import w37.b;
import dq5.b;
import c77.s;

public class k0 extends PresenterV2 implements g	// class@002c8a
{
    public b A;
    public ViewGroup B;
    public View C;
    public View D;
    public View E;
    public View F;
    public d G;
    public View$OnLayoutChangeListener H;
    public l I;
    public f J;
    public c K;
    public View$OnLayoutChangeListener L;
    public h M;
    public c N;
    public c O;
    public b P;
    public final ViewTreeObserver$OnGlobalLayoutListener Q;
    public PresenterV2 R;
    public p p;
    public b q;
    public s r;
    public a s;
    public b t;
    public a u;
    public b v;
    public i w;
    public i x;
    public b y;
    public a z;

    public void k0(){
       super();
       this.p = new k0$c(this);
       this.I = new l();
       this.O = PublishSubject.g();
       this.P = new j0(this);
       this.Q = new k0$a(this);
    }
    public void E8(){
       a v;
       k0 ok0 = k0.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, ok0, str)) {
          return;
       }
       this.N = PublishSubject.g();
       String str1 = "4";
       if (!PatchProxy.applyVoid(objArray, this, ok0, str1)) {
          this.G = new h0(this);
       }
       k0 tE = this.E;
       if (!PatchProxy.applyVoidOneRefs(tE, this, ok0, "10")) {
          a[] uoaArray = new a[]{this.I};
          r0 or0 = new r0(uoaArray);
          this.R = or0;
          or0.U7(new j());
          this.R.U7(new l());
          this.R.U7(new f0());
          if (this.u.R().mIsGzoneCompetitionLive == null && this.u.T()) {
             this.R.U7(new y());
          }else if(this.u.y4().g()){
             this.R.U7(new h());
          }
          this.R.f(tE);
       }
       String str2 = "9";
       if (!PatchProxy.applyVoid(objArray, this, ok0, str2)) {
          f uof = new f(this.E, this.u, this.I, this.x);
          this.J = uof;
          k0 tB = this.B;
          if (!PatchProxy.applyVoidOneRefs(tB, uof, f.class, str1)) {
             a uoa = a.class;
             if (!PatchProxy.applyVoidOneRefs(tB, uof, uoa, "2")) {
                uof.a = tB;
                if (!PatchProxy.applyVoidOneRefs(tB, uof, uoa, str)) {
                   uof.b = uof.a.findViewById(0x7f0a3cb6);
                   uof.c = uof.a.findViewById(0x7f0a1f93);
                   uof.d = uof.m();
                   List list = uof.n();
                   uof.c.setAdapter(uof.d);
                   if (list != null && !list.isEmpty()) {
                      uof.d.B(list);
                      uof.e = uof.f();
                   }
                   uof.b.setViewPager(uof.c);
                   uof.b.setOnPageChangeListener(uof.k);
                }
             }
             if (uof.m.n != null) {
                if (!PatchProxy.applyVoid(objArray, uof, f.class, "5")) {
                   v = uof.c;
                   if (v instanceof LiveGzoneScrollViewLogPager && uof.m.s != null) {
                      v.setOnSwipeOutListener(new g(uof));
                   }
                }
                if (!PatchProxy.applyVoid(objArray, uof, f.class, "7")) {
                   uof.c.addOnPageChangeListener(new h(uof));
                }
                if (!PatchProxy.applyVoid(objArray, uof, f.class, "11")) {
                   f o = uof.o;
                   if (o != null) {
                      uof.t.removeOnLayoutChangeListener(o);
                   }
                   c uoc = new c(uof);
                   uof.o = uoc;
                   uof.t.addOnLayoutChangeListener(uoc);
                }
                if (!PatchProxy.applyVoid(objArray, uof, f.class, str2)) {
                   v = uof.m.v;
                   if (v != null) {
                      d uod = new d(uof);
                      uof.p = uod;
                      v.H6(uod);
                   }
                }
             }
          }
       }
    label_0185 :
       Object[] objArray1 = new Object[]{this.t,this.u,this.J,this.I};
       this.R.i(objArray1);
       this.q.Y3(this.G);
       i0 oi0 = new i0(this);
       this.K = oi0;
       this.s.W0(oi0, 1);
       if (!PatchProxy.applyVoid(objArray, this, ok0, "5") && this.H == null) {
          l0 ol0 = new l0(this);
          this.H = ol0;
          this.D.addOnLayoutChangeListener(ol0);
       }
       k0$b uob = new k0$b(this);
       this.M = uob;
       this.v.Km(uob);
       ok0 = this.z;
       if (ok0 != null) {
          ok0.y2(this.P);
       }
       this.D.getViewTreeObserver().addOnGlobalLayoutListener(this.Q);
       return;
    }
    public void J8(){
       a q;
       a k;
       f q1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k0.class, "11")) {
          return;
       }
       if (this.L != null) {
          q = this.u.q;
          if (q != null) {
             q.b().removeOnLayoutChangeListener(this.L);
             this.L = objArray;
          }
       }
       k0 tH = this.H;
       if (tH != null) {
          this.D.removeOnLayoutChangeListener(tH);
          this.H = objArray;
       }
       this.u.A.X0(this.G);
       this.u.v.Q0(this.K);
       this.u.z.le(this.M);
       tH = this.J;
       if (tH != null) {
          Objects.requireNonNull(tH);
          f uof = f.class;
          if (!PatchProxy.applyVoid(objArray, tH, uof, "27")) {
             if (!PatchProxy.applyVoid(objArray, tH, uof, "6")) {
                a c = tH.c;
                if (c instanceof LiveGzoneScrollViewLogPager && tH.m.s != null) {
                   c.setOnSwipeOutListener(objArray);
                }
             }
             if (!PatchProxy.applyVoid(objArray, tH, uof, "12")) {
                q1 = tH.o;
                if (q1 != null) {
                   tH.t.removeOnLayoutChangeListener(q1);
                }
             }
             if (!PatchProxy.applyVoid(objArray, tH, uof, "10")) {
                a v = tH.m.v;
                if (v != null) {
                   f p = tH.p;
                   if (p != null) {
                      v.Q0(p);
                   }
                }
             }
             if (!PatchProxy.applyVoid(objArray, tH, uof, "14")) {
                k = tH.m.u;
                if (k != null) {
                   q1 = tH.q;
                   if (q1 != null) {
                      k.H8(q1);
                   }
                }
             }
             b9.a(tH.s);
             k = tH.k;
             if (k != null) {
                tH.c.removeOnPageChangeListener(k);
             }
             if (!q.f(tH.r)) {
                tH.r.clear();
                tH.r = objArray;
             }
             tH.c.setAdapter(objArray);
             q = tH.d;
             if (!q.f(q.d)) {
                Iterator iterator = q.d.iterator();
                while (iterator.hasNext()) {
                   b uob = iterator.next();
                   Objects.requireNonNull(uob);
                   if (PatchProxy.applyVoid(objArray, uob, a.class, "12")) {
                      continue ;
                   }
                   uob.i(LiveGzoneTabState$State.DESTROY);
                }
                q.d.clear();
             }
          }
          this.J = objArray;
       }
       tH = this.z;
       if (tH != null) {
          tH.R1(this.P);
       }
       this.D.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q);
       this.R.destroy();
       return;
    }
    public void P8(){
       k0 ok0 = k0.class;
       if (PatchProxy.applyVoid(null, this, ok0, "7")) {
          return;
       }
       boolean b = y.e(this.getActivity());
       int i = a1.d(R.dimen.arg_RES_7f0705e0);
       k0 tw = this.w;
       if (tw != null) {
          if (b) {
             if (this.D.getHeight() > 0) {
                i = this.D.getHeight();
             }
             tw.c(i);
          }else if(!tw.b().getHeight()){
             View view = this.w.b();
             if (!PatchProxy.applyVoidOneRefs(view, this, ok0, "8") && this.L == null) {
                m0 om0 = new m0(this, view);
                this.L = om0;
                view.addOnLayoutChangeListener(om0);
             }
             return;
          }else {
             int i1 = (((this.D.getBottom() - this.C.getBottom()) - a1.d(0x7f0707f6)) - (a1.d(0x7f070a2f) + a1.e(10.00f))) - this.w.b().getMeasuredHeight();
             k0 tz = this.z;
             if (tz != null && tz.a(BannerLocation.RIGHT_TOP_LOCATION)) {
                i1 = i1 - a1.d(0x7f0707e7);
             }
             this.w.c(Math.max(i1, i));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "2")) {
          return;
       }
       this.D = d.a(0x2cb5d4a8).lJ(p0);
       this.B = m1.f(p0, 0x7f0a121d);
       this.C = m1.f(p0, 0x7f0a30e6);
       this.E = m1.f(p0, 0x7f0a22df);
       this.F = m1.f(p0, 0x7f0a1f95);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k0.class, new p0());
       }else {
          obj.put(k0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.v = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.q8(a.class);
       this.w = this.q8(i.class);
       this.y = this.t8("LIVE_GZONE_AUDIENCE_ACTIVITY_BANNER_PRESENTER");
       this.A = this.q8(b.class);
       this.x = this.r8("LIVE_SERVICE_MANAGER");
       this.q = this.r8("LIVE_AUDIENCE_PLAY_VIEW_LAYOUT_SERVICE");
       this.r = this.q8(s.class);
       this.z = this.t8("LIVE_AUDIENCE_REBROADCAST_BANNER_SERVICE");
       return;
    }
}
