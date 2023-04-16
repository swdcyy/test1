package com.kwai.live.gzone.guess.kshell.x;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.guess.kshell.x$e;
import com.kwai.live.gzone.guess.kshell.x$a;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import p57.x;
import com.kwai.live.gzone.guess.kshell.x$b;
import com.kwai.live.gzone.guess.kshell.v;
import p57.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.kwai.live.gzone.guess.kshell.k;
import fq5.b;
import hf3.a;
import h47.b;
import j47.d;
import com.kwai.live.gzone.guess.kshell.x$c;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import ekd.k1;
import crd.b;
import lnc.b9;
import android.os.CountDownTimer;
import mq5.h;
import mq5.b;
import oq5.c;
import oq5.a;
import com.kwai.library.widget.popup.common.c;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import u37.b;
import u37.e;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.guess.kshell.c0;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.kwai.live.gzone.guess.kshell.w;
import brd.w;
import erd.c;
import java.lang.Number;
import java.util.Random;
import java.lang.System;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.a;
import com.kwai.live.gzone.common.keyswitch.b;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import com.kwai.live.gzone.common.keyswitch.b$d;
import p57.d0;
import erd.g;
import p57.e0;
import com.kwai.live.gzone.guess.kshell.u;
import android.view.View;
import k67.e$a;
import k67.g;
import java.lang.Integer;
import com.kwai.live.gzone.guess.bean.KShellGuessPaperResponse;
import java.util.Collection;
import ekd.q;
import dt5.c;
import com.kwai.live.gzone.guess.kshell.n0$b;
import android.app.Activity;
import p57.b0;
import com.kwai.live.gzone.guess.kshell.n0;
import x57.e;
import x57.a;
import java.util.List;
import com.kwai.live.gzone.guess.bean.LiveGzoneAudienceGuessQuestion;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import com.kwai.live.gzone.guess.kshell.x$d;
import java.lang.Enum;
import n57.b;
import p57.i0;
import java.util.Iterator;
import gq5.f;
import j47.a;
import d61.y;
import android.view.ViewStub;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import p57.h0;
import k67.p;
import f37.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.live.gzone.guess.kshell.z;
import ekd.m1;
import p57.m0;
import java.util.Map;
import java.util.HashMap;
import s57.b;
import j47.c;
import k67.b;
import lp3.i;
import c77.p;

public class x extends PresenterV2 implements g	// class@000d81
{
    public KwaiImageView A;
    public KwaiImageView B;
    public TextView C;
    public b D;
    public c E;
    public b F;
    public b G;
    public d H;
    public boolean I;
    public LiveSlidePlayService J;
    public g K;
    public b L;
    public f M;
    public a N;
    public i O;
    public p P;
    public a Q;
    public c R;
    public k S;
    public Random T;
    public b U;
    public c U0;
    public b V;
    public CountDownTimer V0;
    public boolean W;
    public int W0;
    public KShellGuessQuestionStatus X;
    public List X0;
    public a Y;
    public View Y0;
    public c Z;
    public View Z0;
    public View a1;
    public n0 b1;
    public h c1;
    public View$OnClickListener d1;
    public e$a e1;
    public b f1;
    public c g1;
    public boolean h1;
    public c i1;
    public String p;
    public String q;
    public b r;
    public p s;
    public boolean t;
    public List u;
    public boolean v;
    public a w;
    public b x;
    public p1 y;
    public ViewStub z;

    public void x(){
       super();
       this.p = "https://static.yximgs.com/udata/pkg/kwai-client-image/gzone/live_game_widget_bet_icon_new.png";
       this.q = "https://static.yximgs.com/udata/pkg/kwai-client-image/gzone/live_gzone_activity_pendant_bottom_shap_purple.png";
       this.t = false;
       this.x = new x$e(this);
       this.y = new x$a(this);
       this.U0 = PublishSubject.g();
       this.W0 = 0;
       this.X0 = new ArrayList();
       this.c1 = new x(this);
       this.d1 = new x$b(this);
       this.f1 = new v(this);
       this.g1 = new a0(this);
       this.i1 = PublishSubject.g();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "3")) {
          return;
       }
       this.Y = a.g();
       this.Z = a.g();
       this.S = new k(this.G.getLiveStreamId(), this.G.u());
       x tH = this.H;
       if (tH != null) {
          tH.di(this.f1, true);
       }
       if (this.I != null) {
          tH = this.J;
          if (tH != null) {
             tH.P4(new x$c(this));
          }
       }
       return;
    }
    public void J8(){
       x ox = x.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ox, "16")) {
          return;
       }
       k1.n(this);
       if (!PatchProxy.applyVoid(objArray, this, ox, "34")) {
          this.W = false;
          this.X = objArray;
          ox = this.S;
          ox.a = objArray;
          ox.b = -1;
          b9.a(this.U);
          b9.a(this.V);
          this.P8();
          ox = this.V0;
          if (ox != null) {
             ox.cancel();
             this.V0 = objArray;
             this.W0 = 0;
          }
       }
       ox = this.H;
       if (ox != null) {
          ox.H8(this.f1);
       }
       this.L.le(this.c1);
       this.w.Q0(this.g1);
       this.h1 = false;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, x.class, "35")) {
          return;
       }
       this.R8();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, x.class, "28")) {
          return;
       }
       x tb1 = this.b1;
       if (tb1 != null) {
          tb1.q(0);
          this.b1 = null;
       }
       return;
    }
    public final t S8(long p0){
       t obj;
       if (PatchProxy.isSupport(x.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, x.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(x.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, x.class, "22");
          if (obj != PatchProxyResult.class) {
          label_004e :
             t ot = PatchProxy.apply(null, this, x.class, "23");
             if (ot != PatchProxyResult.class) {
             }else {
                ot = t.create(new c0(this)).subscribeOn(d.c);
             }
             return t.zip(obj, ot, w.a);
          }
       }
       obj = e.a().a(this.getLiveStreamId()).delaySubscription((long)this.V8(p0), TimeUnit.MILLISECONDS).map(new e());
       goto label_004e ;
    }
    public final int V8(long p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ox, "29");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.T == null) {
          this.T = new Random(System.currentTimeMillis());
       }
       int i = (p0 - null > 0)? this.T.nextInt((int)p0): 0;
       return i;
    }
    public boolean W8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, x.class, "38");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.h1 != null) {
          obj = PatchProxy.apply(null, null, a.class, "11");
          b = (obj != patchProxyRe)? obj.booleanValue(): b.b().a(LiveGzoneKeys.KEY_SWITCH_GUESS_SQUARE).a();
          if (b) {
             b = true;
          label_003c :
             return b;
          }
       }
       b = false;
       goto label_003c ;
    }
    public void X8(long p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ox, "20")) {
          return;
       }
       b9.a(this.U);
       this.U = this.S8(p0).observeOn(d.a).doOnNext(new d0(this)).subscribe(new e0(this), u.b);
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, x.class, "9")) {
          return;
       }
       x ta1 = this.a1;
       if (ta1 != null) {
          ta1.setVisibility(8);
       }
       if (this.e1 != null) {
          if (this.W8()) {
             this.K.sg(this.e1, 8);
          }else {
             this.K.y8(this.e1, 8);
          }
       }
       this.t = false;
       return;
    }
    public final void Z8(int p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ox, "6")) {
          return;
       }
       ox = this.Z0;
       if (ox != null) {
          ox.setVisibility(p0);
       }
       return;
    }
    public final void a9(KShellGuessPaperResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "26")) {
          return;
       }
       if (p0 != null && !q.f(p0.mBets)) {
          this.Y.onNext(p0);
          if (q.f(p0.mUserBetInfos)) {
             return;
          }else {
             this.P8();
             if (this.R.c()) {
                return;
             }else {
                n0$b uob = new n0$b(this.getActivity());
                uob.I = p0;
                uob.K = this.G;
                uob.L = this.E;
                uob.J = new b0(this);
                n0 on0 = new n0(uob, this.getActivity(), true);
                this.b1 = on0;
                on0.Z();
             }
          }
       }
       return;
    }
    public final void b9(KShellGuessPaperResponse p0){
       x tV0;
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ox, "30")) {
          return;
       }
       long l = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, ox, "33") && p0 != null) {
          KShellGuessPaperResponse mServerTime = p0.mServerTime;
          if (mServerTime - l > 0) {
             KShellGuessPaperResponse mTotalKShell = p0.mTotalKShell;
             if (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(mTotalKShell), Long.valueOf(mServerTime), this, ox, "15")) {
                a.a().d(mTotalKShell, mServerTime, "guess");
             }
             a.a().e(p0.mLotteryPanelH5Url);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ox, "36")) {
          int i = 0;
          KShellGuessQuestionStatus kShellGuessQ = KShellGuessQuestionStatus.fromStatus(p0.mBets.get(i).mStatus);
          this.X = kShellGuessQ;
          if (x$d.a[kShellGuessQ.ordinal()] != 1) {
             tV0 = this.V0;
             if (tV0 != null) {
                tV0.cancel();
             }
             this.x.j(l);
          }else {
             LiveGzoneAudienceGuessQuestion mRemainTime = p0.mBets.get(i).mRemainTime;
             if (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mRemainTime), this, ox, "37")) {
                tV0 = this.V0;
                if (tV0 != null) {
                   tV0.cancel();
                }
                v1 = mRemainTime - l;
                if (tV0 <= 0) {
                   if (!tV0) {
                      int i1 = -1;
                      this.W0 = i1;
                      this.x.j((long)i1);
                   }
                }else {
                   i0 oi0 = new i0(this, (mRemainTime * 1000), 100);
                   this.V0 = tV0;
                   this.W0 = (int)mRemainTime;
                   tV0.start();
                   this.d9();
                }
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ox, "32")) {
          this.X0.clear();
          if (p0 != null && !q.f(p0.mBets)) {
             Iterator iterator = p0.mBets.iterator();
             while (iterator.hasNext()) {
                this.X0.add(iterator.next().mTitle);
             }
          }
       }
       this.d9();
       return;
    }
    public final void c9(String p0,int p1){
       SharedPreferences a;
       x tz;
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ox, "7")) {
          return;
       }
       if (p0.equals(this.getLiveStreamId())) {
          Object[] objArray = null;
          if (!p1) {
             boolean b = this.M.m();
             boolean b1 = this.N.uk();
             if (y.d(this.getActivity()) && (!b && !b1)) {
                this.M.q(false);
                this.M.t();
             }
          label_0047 :
             if (!PatchProxy.applyVoid(objArray, this, ox, "10")) {
                b9.a(this.r);
                if (!PatchProxy.applyVoid(objArray, this, ox, "11") && this.e1 != null) {
                   if (this.a1 == null) {
                      tz = this.z;
                      if (tz != null) {
                         tz.setLayoutResource(R.layout.arg_RES_7f0d0be6);
                         View view = this.z.inflate();
                         this.a1 = view;
                         this.Y0 = view.findViewById(0x7f0a1d8b);
                         this.A = this.a1.findViewById(0x7f0a1f1e);
                         this.C = this.a1.findViewById(0x7f0a1f28);
                         this.B = this.a1.findViewById(0x7f0a1f27);
                         this.Z0 = this.a1.findViewById(0x7f0a1f5f);
                         this.a1.setOnClickListener(this.d1);
                         view.b = this.a1;
                         d0.b(this.B, this.q);
                      }
                   }
                   this.a1.setVisibility(false);
                   if (this.s == null) {
                      h0 oh0 = new h0(this);
                      this.s = oh0;
                      this.K.p4(oh0);
                   }
                   this.K.y8(this.e1, false);
                   if (!PatchProxy.applyVoid(objArray, this, ox, "13")) {
                      tz = this.A;
                      if (tz != null) {
                         tz.setPlaceHolderImage(R.drawable.arg_RES_7f08127b);
                         this.A.i0();
                      }
                   }
                }
             label_00ff :
                if (!PatchProxy.applyVoid(objArray, this, ox, "5")) {
                   int i = 8;
                   if (a.c()) {
                      this.Z8(i);
                   }else {
                      ArrayList uArrayList = ArrayList.class;
                      a = a.a;
                      String str = a.getString(b.d("user")+"live_gzone_guess_new_corner_mark_displayed_rooms", "null");
                      if (str != null && str != "") {
                         objArray = b.a(str, uArrayList);
                      }
                      if (objArray != null && objArray.size() >= 3) {
                         this.Z8(i);
                      }else {
                         this.Z8(false);
                         if (objArray == null) {
                            objArray = new ArrayList();
                         }
                         objArray.add(this.G.d());
                         SharedPreferences$Editor uEditor = a.edit();
                         uEditor.putString(b.d("user")+"live_gzone_guess_new_corner_mark_displayed_rooms", b.e(objArray));
                         g.a(uEditor);
                      }
                   }
                }
             }
          }else if(p1 == 2){
             this.Y8();
          }else if(p1 != 1 || PatchProxy.applyVoid(objArray, this, ox, "8")){
             this.r = t.just(Integer.valueOf(0x2710)).delaySubscription(0x2710, TimeUnit.MILLISECONDS, d.a).subscribe(new z(this));
          }
       }else {
          this.Y8();
       }
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, x.class, "31")) {
          return;
       }
       x tX = this.X;
       if (tX != null && this.C != null) {
          int i = x$d.a[tX.ordinal()];
          if (i != 1) {
             if (i != 2) {
                this.C.setText(R.string.arg_RES_7f101437);
             }else {
                this.C.setText(R.string.arg_RES_7f10143a);
             }
          }else if(this.W0 == null){
             this.C.setText(R.string.arg_RES_7f10143a);
          }else {
             this.C.setText(R.string.arg_RES_7f101438);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a1f20);
       return;
    }
    public final String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, x.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getLiveStreamId();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, x.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(x.class, new m0());
       }else {
          obj.put(x.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.w = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.D = this.s8(b.class);
       this.E = this.q8(c.class);
       this.F = this.s8(b.class);
       this.G = this.r8("LIVE_BASIC_CONTEXT");
       this.H = this.s8(d.class);
       this.I = this.r8("LIVE_IS_SLIDE_CONTAINER").booleanValue();
       this.J = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.K = this.q8(g.class);
       this.L = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.M = this.q8(f.class);
       this.N = this.q8(a.class);
       this.O = this.r8("LIVE_SERVICE_MANAGER");
       this.P = this.s8(p.class);
       this.Q = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.R = this.q8(c.class);
       return;
    }
}
