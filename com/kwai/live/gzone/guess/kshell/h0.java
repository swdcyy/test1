package com.kwai.live.gzone.guess.kshell.h0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import p57.k1;
import com.kwai.live.gzone.guess.kshell.h0$a;
import com.kwai.live.gzone.guess.kshell.g0;
import p57.h1;
import p57.g1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.live.gzone.bean.LiveGzoneGuessTipConfig;
import f37.a;
import crd.b;
import lnc.b9;
import u37.d;
import u37.e;
import fq5.b;
import brd.t;
import cjd.e;
import erd.o;
import p57.j1;
import io.reactivex.internal.functions.Functions;
import erd.g;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import j47.d;
import h47.b;
import mrd.c;
import x67.j;
import com.kwai.live.gzone.guess.kshell.h0$b;
import java.lang.Runnable;
import ekd.k1;
import p57.i1;
import n57.b$a;
import n57.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import aq5.d;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import p57.n1;
import java.util.Map;
import java.util.HashMap;
import j47.a;
import j47.c;
import a77.k;
import k67.b;
import dt5.c;

public class h0 extends PresenterV2 implements g	// class@000d3d
{
    public int A;
    public LiveGzoneGuessTipConfig B;
    public b C;
    public boolean D;
    public c E;
    public boolean F;
    public Runnable G;
    public y1 H;
    public b I;
    public Runnable J;
    public b K;
    public b L;
    public b p;
    public d q;
    public d r;
    public b s;
    public c t;
    public a u;
    public c v;
    public k w;
    public b x;
    public j y;
    public long z;

    public void h0(){
       super();
       this.E = PublishSubject.g();
       this.G = new k1(this);
       this.I = new h0$a(this);
       this.J = new g0(this);
       this.K = new h1(this);
       this.L = new g1(this);
    }
    public static void P8(h0 p0,long p1){
       Objects.requireNonNull(p0);
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(p1), p0, oh0, "5") && p0.D == null)) {
          if (p1 - null > 0) {
             h0 b = p0.B;
             if (b != null && p1 - (b.mUtilSealedTimeMs / 1000) >= 0) {
             label_0035 :
                p0.D = true;
                int i = a.a();
                p0.A = i;
                h0 b1 = p0.B;
                if (b1 == null || (i < b1.mGuideDailyParticipationLimit && !PatchProxy.applyVoid(null, p0, oh0, "7"))) {
                   b9.a(p0.C);
                   p0.C = e.b().x(p0.s.getLiveStreamId()).map(new e()).subscribe(new j1(p0), Functions.e);
                }
             }
          }
          if (!p1 - -1) {
             goto label_0035 ;
          }
       }
    label_0079 :
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "2")) {
          return;
       }
       h0 tq = this.q;
       if (tq != null) {
          if (tq.Ue() == null) {
             this.q.Q1(this.K);
          }else {
             this.S8(this.q.Ue());
          }
       }
       tq = this.y;
       if (tq != null) {
          this.X7(tq.Ye().subscribe(new h0$b(this), Functions.d()));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "3")) {
          return;
       }
       this.F = false;
       this.D = false;
       this.R8();
       k1.m(this.J);
       k1.m(this.G);
       b9.a(this.C);
       h0 tq = this.q;
       if (tq != null) {
          tq.H8(this.K);
       }
       tq = this.p;
       if (tq != null) {
          tq.h(new i1(this));
       }
       a[] uoaArray = new a[]{AudienceBizRelation.PK};
       this.r.G5(this.L, uoaArray);
       this.B = null;
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "10")) {
          return;
       }
       h0 tH = this.H;
       if (tH != null && tH.K()) {
          this.H.q(0);
       }
       return;
    }
    public final void S8(LiveGzoneConfigResponse p0){
       SharedPreferences a;
       h0 oh0 = h0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh0, "4")) {
          return;
       }
       p0 = p0.mLiveGzoneGuessTipConfig;
       if (p0 != null) {
          this.B = p0;
          if (!PatchProxy.applyVoid(null, this, oh0, "6")) {
             long l = DateUtils.k(0, 0, 0, 0);
             a = a.a;
             String str = "user";
             long longx = a.getLong(b.d(str)+"guess_tip_last_displayed_day", 0);
             this.z = longx;
             if ((l - longx) - 0x5265c00 >= 0) {
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putLong(b.d(str)+"guess_tip_last_displayed_day", l);
                g.a(uEditor);
                a.h(0);
             }else {
                this.A = a.a();
             }
          }
          k1.r(this.J, this.B.mUserMinimumWatchTimeInRoomMs);
          a[] uoaArray = new a[]{AudienceBizRelation.PK};
          this.r.u5(this.L, uoaArray);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h0.class, new n1());
       }else {
          obj.put(h0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.p = this.s8(b.class);
       this.q = this.s8(d.class);
       this.r = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.q8(a.class);
       this.v = this.q8(c.class);
       this.w = this.s8(k.class);
       this.x = this.s8(b.class);
       this.t = this.q8(c.class);
       this.y = this.s8(j.class);
       return;
    }
}
