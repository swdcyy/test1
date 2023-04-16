package com.kuaishou.live.gzone.treasurebox.presenter.w;
import c12.f;
import p53.e2;
import com.kuaishou.live.gzone.treasurebox.presenter.w$a;
import p53.f2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.gzone.treasurebox.widget.ILiveTreasureBoxPendantView;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import mrd.a;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import j47.d;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel$BoxListTipsStatus;
import java.lang.System;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import k67.g$a;
import k67.g;
import k67.p;
import oq5.c;
import oq5.a;
import f67.n0;
import k67.d;
import f37.o0;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import android.text.TextUtils;
import o53.b;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import lnc.a1;
import com.kuaishou.live.gzone.treasurebox.presenter.w$b;
import r53.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import k67.b;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import android.widget.FrameLayout;
import com.kuaishou.live.gzone.treasurebox.widget.LiveGzoneTreasurePendantV2;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import k67.e$a;
import p53.b2;
import p53.q1;
import com.kuaishou.live.gzone.treasurebox.presenter.b0;
import android.view.View$OnClickListener;
import t57.a;
import com.kuaishou.live.gzone.treasurebox.presenter.u;
import o56.a;
import android.app.Application;
import r53.j;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
import r53.b$c;
import com.yxcorp.gifshow.model.CDNUrl;
import p91.m;
import pq5.c;
import c77.p;
import tj3.e;
import tj3.k;
import p53.g2;
import erd.g;
import crd.b;
import brd.t;
import p53.h2;
import com.kuaishou.live.gzone.treasurebox.presenter.t;
import j77.f;
import j77.a;
import com.kuaishou.live.gzone.treasurebox.presenter.x;
import com.kuaishou.live.gzone.treasurebox.presenter.y;
import p53.i2;
import mrd.c;
import com.kuaishou.live.gzone.treasurebox.presenter.z;
import p53.j2;

public class w extends f	// class@001ca1
{
    public long K;
    public ILiveTreasureBoxPendantView L;
    public b M;
    public m N;
    public c O;
    public g P;
    public a Q;
    public p R;
    public b S;
    public a T;
    public d U;
    public boolean U0;
    public e$a V;
    public boolean V0;
    public LiveTreasureBoxModel W;
    public boolean W0;
    public String X;
    public n0 X0;
    public int Y;
    public n0 Y0;
    public String Z;
    public e Z0;
    public d a1;
    public p b1;
    public final g$a c1;
    public c d1;
    public f e1;
    public static String sLivePresenterClassName = "TreasureBoxPedantPresenter";

    public void w(){
       super();
       this.b1 = new e2(this);
       this.c1 = new w$a(this);
       this.e1 = new f2(this);
    }
    public void Q(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "3")) {
          return;
       }
       Object[] objArray = null;
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, ow, "5")) {
          if (this.V != null) {
             ow = this.L;
             if (ow != null) {
                TreasureBoxCommonModel treasureBoxC = (ow.d != null && ow.e != null)? 1: null;
                if (treasureBoxC && !this.b9().l()) {
                   ow = 1;
                label_0044 :
                   if (!ow) {
                      ow = (this.b9().r.i() != null)? 1: null;
                      TreasureBoxCommonModel$BoxListTipsStatus uBoxListTips = -99;
                      int i = -1;
                      if (!ow) {
                         uBoxListTips = -1;
                      }
                      ow = this.a1;
                      if (ow != null && ow.Ue() != null) {
                         i = (this.a1.Ue().mShowKShell == null)? 0: uBoxListTips;
                      }
                   label_0075 :
                      TreasureBoxCommonModel$BoxListTipsStatus uBoxListTips1 = this.b9().q.i();
                      if (uBoxListTips1 == TreasureBoxCommonModel$BoxListTipsStatus.UN_LOGIN) {
                         i = 109;
                      }else if(uBoxListTips1 == TreasureBoxCommonModel$BoxListTipsStatus.FAILED){
                         i = 1;
                      }
                      i3 oi3 = i3.f();
                      oi3.c("result", Integer.valueOf(i));
                      oi3.c("duration_ms", Long.valueOf((System.currentTimeMillis() - this.K)));
                      String str = oi3.e();
                      u1.R("GZONE_SHOW_CHEST_FAILED", str, 8);
                      b.c0(LiveLogTag.GZONE, "game_app_custom_event", "shownPendant: ", str);
                   }
                }
             }
          }
          ow = null;
          goto label_0044 ;
       }
       this.W0 = b;
       this.W = objArray;
       this.d9();
       this.P.Jj(this.c1);
       ow = this.L;
       if (ow != null) {
          ow.b();
          this.L = objArray;
       }
       this.P.j3(this.b1);
       this.Q.Q0(this.d1);
       this.U.c(this.X0);
       this.U.c(this.Y0);
       this.U0 = false;
       this.V0 = false;
       return;
    }
    public void a9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, w.class, "9")) {
          return;
       }
       if (TextUtils.equals(o0.g(), a.a.getString(b.d("user")+"treasureTaskCountDownBubble", ""))) {
          return;
       }
       if (this.b9() == null) {
          return;
       }
       b uob = this.b9().s.i();
       if (uob != null) {
          objArray = uob.b;
       }
       if (objArray != null && objArray.mTaskStatus == 2) {
          String str = String.valueOf(System.currentTimeMillis());
          this.M.a(a1.p(R.string.arg_RES_7f102487), str, true, new w$b(this, objArray, str));
       }
       return;
    }
    public TreasureBoxCommonModel b9(){
       Object obj = PatchProxy.apply(null, this, w.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.p();
    }
    public final void c9(String p0,String p1,n0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, w.class, "10")) {
          return;
       }
       this.M.a(p0, p1, false, p2);
       return;
    }
    public void d9(){
       Iterator obj;
       boolean b2;
       w ow = w.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow, "12")) {
          return;
       }
       this.h9();
       if (this.W != this.b9().g()) {
          this.W = this.b9().g();
       }
       boolean b = this.b9().a();
       w ow1 = 8;
       int i = 0;
       int i1 = (b)? 0: 8;
       int b1 = this.b9().c();
       w tS = this.S;
       if (tS != null && tS.S2()) {
          this.S.ec(LiveGzoneAudienceFeatureEntranceItem.TREASURE_BOX.mEntranceId, b1);
       }
       w tL = this.L;
       tL = (tL == null)? 8: tL.getVisibility();
       i1 = (tL != i1)? 1: 0;
       if (b && this.W0 == null) {
          if (this.L == null) {
             this.L = new LiveGzoneTreasurePendantV2(this.getContext());
             this.e9(b.a(this.b9().s.i()));
             this.V = this.P.Sc(LiveGzoneAudienceFeatureEntranceItem.TREASURE_BOX, this.L);
             if (!PatchProxy.applyVoid(objArray, this, ow, "16")) {
                ow1 = this.L;
                if (ow1 != null) {
                   ow1.setLogProvider(new b2(this));
                   this.L.setOnClickListener(new b0(this));
                }
             }
             this.h9();
          }
          obj = PatchProxy.apply(objArray, this, ow, "13");
          if (obj != PatchProxyResult.class) {
             b2 = obj.booleanValue();
          }else if(this.b9() == null || this.b9().v == null){
             ow = this.T;
             if (ow == null || !ow.b()) {
                b2 = a.D0();
             }
          }
          b2 = false;
          if (b2 && this.U0 == null) {
             this.U0 = true;
             this.b9().e("¡¾treasurePendantHint¡¿");
             this.X0 = u.a;
             this.c9(a.B.getString(R.string.arg_RES_7f1018ea), "treasure_box", this.X0);
          }
          this.P.y8(this.V, i);
       }else {
          ow = this.V;
          if (ow != null) {
             this.P.y8(ow, ow1);
          }
       }
       ow = this.L;
       if (ow != null) {
          ow.d(this.W);
       }
       if (i1) {
          ow = this.M;
          if (ow instanceof j) {
             Objects.requireNonNull(ow);
             j oj = j.class;
             if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), ow, oj, "22")) {
                obj = ow.b.iterator();
                while (obj.hasNext()) {
                   obj.next().a(b);
                }
             }
          }
       }
       return;
    }
    public void e9(LiveGzoneTreasureTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "8")) {
          return;
       }
       if (this.L instanceof LiveGzoneTreasurePendantV2) {
          if (p0 != null && p0.canShowPendant()) {
             this.L.f(p0.mPendantIcon, p0.mStatusBarIcon);
          }else {
             this.L.f(null, null);
          }
       }
       return;
    }
    public final void h9(){
       if (PatchProxy.applyVoid(null, this, w.class, "14")) {
          return;
       }
       if (this.L != null && this.b9() != null) {
          this.L.e(this.b9().h());
       }
       if (this.b9() != null) {
          this.b9().t();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       super.j8();
       this.N = this.r8("LIVE_BASIC_CONTEXT");
       this.M = this.r8("LIVE_GZONE_TREASUREBOX_SERVICE");
       this.O = this.q8(c.class);
       this.U = this.r8("LIVE_GZONE_FEATURE_PENDANT_BUBBLE_SERVICE");
       this.P = this.q8(g.class);
       this.Q = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.R = this.s8(p.class);
       this.S = this.s8(b.class);
       this.a1 = this.s8(d.class);
       this.T = this.s8(a.class);
       this.Z0 = this.r8("LIVE_LOG_REPORTER");
       return;
    }
    public void x(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ow, "7")) {
          this.W0 = false;
          this.P.Om(this.c1);
          if (this.b9().j()) {
             this.K = this.Z0.x().M();
             this.d9();
             this.X7(this.b9().d.subscribe(new g2(this)));
             this.X7(this.b9().f.subscribe(new h2(this)));
             this.X7(this.b9().h.subscribe(new t(this)));
             this.P.p4(this.b1);
             this.M.l(this.e1);
             this.X7(this.b9().s.subscribe(new x(this)));
             this.X7(this.b9().r.subscribe(new y(this)));
             this.X7(this.b9().n.subscribe(new i2(this)));
             w tR = this.R;
             if (tR != null) {
                this.X7(tR.sf().subscribe(new z(this)));
             }
             j2 oj2 = new j2(this);
             this.d1 = oj2;
             this.Q.W0(oj2, true);
          }
       }
       return;
    }
}
