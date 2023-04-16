package com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter;
import k51.c;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$a;
import ij2.k;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$b;
import ij2.l;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$c;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.screenrecord.k;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import com.kuaishou.livestream.message.nano.SCLiveRecordState;
import ij2.j;
import lf3.g;
import hf3.a;
import t02.a0;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import tkd.b;
import tkd.d;
import ym5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.io.File;
import ia1.e;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.lang.System;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import qkd.b;
import mq5.h;
import mq5.b;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.screenrecord.b;
import android.view.View$OnClickListener;
import androidx.fragment.app.c$b;
import kq5.b;
import oq5.c;
import jv1.b;
import oq5.d;
import oq5.b;
import com.kuaishou.live.core.show.screenrecord.d;
import com.kuaishou.live.common.core.basic.widget.LiveAudienceScreenRecordControllerView$a;
import com.kuaishou.live.common.core.basic.widget.LiveAudienceScreenRecordControllerView;
import ij2.i;
import android.view.View;
import r16.f;
import lnc.x6;
import lnc.y6;
import r26.e;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kwai.library.widget.popup.common.c;
import ekd.k1;
import com.kuaishou.live.core.show.screenrecord.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import android.view.ViewGroup;
import cc1.a;
import ekd.m1;
import p91.m;
import u32.k;
import m91.b;
import dt5.c;
import nl8.m;

public class LiveAudienceScreenRecordBottomBarPresenter extends c	// class@000fd4
{
    public boolean A;
    public f B;
    public LiveAudienceScreenRecordContainerFragment C;
    public LiveAudienceScreenRecordControllerView D;
    public e E;
    public boolean F;
    public boolean G;
    public LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason H;
    public long I;
    public long J;
    public long K;
    public int L;
    public b M;
    public k N;
    public final d O;
    public final h P;
    public final c$b Q;
    public final c R;
    public final c S;
    public final m$a T;
    public a0 p;
    public m q;
    public a r;
    public b s;
    public k t;
    public m u;
    public b v;
    public b w;
    public b x;
    public c y;
    public LiveSlidePlayService z;
    public static String sLivePresenterClassName = "LiveAudienceScreenRecordBottomBarPresenter";

    public void LiveAudienceScreenRecordBottomBarPresenter(){
       super();
       this.H = LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_INVALID;
       this.I = 0;
       this.J = 5000;
       this.K = 0xdea8;
       this.L = 1;
       this.O = new LiveAudienceScreenRecordBottomBarPresenter$a(this);
       this.P = new k(this);
       this.Q = new LiveAudienceScreenRecordBottomBarPresenter$b(this);
       this.R = new l(this);
       this.S = new LiveAudienceScreenRecordBottomBarPresenter$c(this);
       this.T = new LiveAudienceScreenRecordBottomBarPresenter$d(this);
    }
    public void E8(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceScreenRecordBottomBarPresenter.class, str)) {
          return;
       }
       k ok = this.P8();
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoid(objArray, ok, k.class, str)) {
          ok.c.setValue(ok.b);
          ok.a.a(c.class).v1(ok.c);
       }
       this.r.u0(700, SCLiveRecordState.class, new j(this));
       if (this.p.h != null) {
          LiveAudienceScreenRecordBottomBarPresenter tz = this.z;
          if (tz != null) {
             tz.P4(this.S);
          label_0053 :
             if (d.a(0x4c5dd1b8).f2()) {
                this.L = this.getActivity().getRequestedOrientation();
             }
             return;
          }
       }
       this.R8();
       goto label_0053 ;
    }
    public void J8(){
       LiveAudienceScreenRecordBottomBarPresenter liveAudience = LiveAudienceScreenRecordBottomBarPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "4")) {
          return;
       }
       if (this.p.h != null) {
          LiveAudienceScreenRecordBottomBarPresenter tz = this.z;
          if (tz != null) {
             tz.d5(this.S);
          }
       }
       this.H = LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_INVALID;
       this.S8();
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "18")) {
          File uFile = new File(LiveResourceFileUtil.k(e.a));
          if (uFile.exists() && uFile.isDirectory()) {
             File[] uFileArray = uFile.listFiles();
             if (uFileArray != null && uFileArray.length > 0) {
                long l = System.currentTimeMillis();
                int len = uFileArray.length;
                int i = 0;
                while (i < len) {
                   object oobject = uFileArray[i];
                   long l1 = l - oobject.lastModified();
                   if (l1 - 0x5265c00 > 0) {
                      try{
                         b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "deleteUnusedRecordFiles : "+oobject.getName());
                         b.x(oobject);
                      }catch(java.lang.Exception e0){
                         b.B(LiveLogTag.LIVE_SCREEN_RECORD, "deleteUnusedRecordFiles error...");
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }
       this.s.le(this.P);
       b9.a(this.M);
       k ok = this.P8();
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoid(objArray, ok, k.class, "4")) {
          ok.a.a(c.class).O0(1023);
       }
       return;
    }
    public final k P8(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceScreenRecordBottomBarPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.N == null) {
          this.N = new k(new b(this));
       }
       return this.N;
    }
    public void R8(){
       LiveAudienceScreenRecordBottomBarPresenter liveAudience = LiveAudienceScreenRecordBottomBarPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "8")) {
          return;
       }
       this.v.c(this.Q);
       this.s.Km(this.P);
       this.x.W0(this.R, false);
       a0 p1 = this.p.p1;
       if (p1 != null) {
          p1.c(this.O);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "10")) {
          this.D.setLiveScreenRecordControllerCallback(new d(this));
          this.D.setOnClickListener(new i(this));
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceScreenRecordBottomBarPresenter.class, "9")) {
          return;
       }
       this.x.Q0(this.R);
       this.v.a(this.Q);
       if (this.E != null) {
          y6.r(f.class).K3(this.E);
       }
       a0 p1 = this.p.p1;
       if (p1 != null) {
          p1.a(this.O);
       }
       this.V8(LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_DELETE, "");
       this.D.setLiveScreenRecordControllerCallback(null);
       this.D.setOnClickListener(null);
       x.E(this.C);
       LiveAudienceScreenRecordBottomBarPresenter tB = this.B;
       if (tB != null) {
          tB.o();
       }
       k1.n(this);
       this.I = 0;
       return;
    }
    public void V8(LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceScreenRecordBottomBarPresenter.class, "15")) {
          return;
       }
       if (this.G != null) {
          this.H = p0;
          this.u.stopRecord();
          if (!TextUtils.x(p1)) {
             i.d(R.style.arg_RES_7f11066a, p1);
          }
          this.G = false;
          this.D.a();
          this.D.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceScreenRecordBottomBarPresenter.class, "2")) {
          return;
       }
       this.D = m1.f(a.a(p0), 0x7f0a19d2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceScreenRecordBottomBarPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.r8("LIVE_LONG_CONNECTION");
       this.s = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.t = this.r8("LIVE_AUDIENCE_BOTTOM_BAR_SERVICE");
       this.u = this.r8("LIVE_SCREEN_RECORD_SERVICE");
       this.v = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.w = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.x = this.q8(b.class);
       this.y = this.q8(c.class);
       this.z = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.P8().e(this);
       return;
    }
}
