package com.kuaishou.live.core.show.clearscreen.d;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.clearscreen.c;
import com.kuaishou.live.core.show.clearscreen.d$a;
import com.kuaishou.live.core.show.clearscreen.d$b;
import com.kuaishou.live.core.show.clearscreen.d$c;
import e42.h;
import e42.i;
import e42.j;
import com.kuaishou.live.core.show.clearscreen.d$d;
import com.kuaishou.live.core.show.clearscreen.d$e;
import com.kuaishou.live.core.show.clearscreen.b;
import x61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import lp3.c;
import lp3.e;
import com.kuaishou.live.core.show.clearscreen.e;
import t02.a0;
import android.view.View;
import hb2.g$b;
import ds5.c;
import ds5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e42.k;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import e42.l;
import dt5.b;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import oq5.c;
import jv1.b;
import j77.f;
import j77.a;
import e42.m;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import a32.b;
import a32.j;
import android.view.View$OnClickListener;
import android.app.Activity;
import d61.y;
import sr5.a;
import u53.b;
import e53.a;
import xp5.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import yx2.k;
import com.kwai.framework.abtest.f;
import p91.m;
import com.kuaishou.live.basic.model.StreamType;
import lnc.d2;
import lnc.b5;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import e42.r;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.System;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TimeStatPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import z61.b;
import ekd.m1;
import android.widget.ImageView;
import e42.p;
import java.util.Map;
import java.util.HashMap;
import lp3.i;
import nl8.o;
import nl8.n;

public class d extends c implements g	// class@000a2a
{
    public b A;
    public e B;
    public final View$OnClickListener C;
    public final View$OnClickListener D;
    public c E;
    public final b F;
    public final c G;
    public final f H;
    public c I;
    public final b J;
    public final c p;
    public c q;
    public boolean r;
    public long s;
    public boolean t;
    public a0 u;
    public i v;
    public ViewGroup w;
    public View x;
    public ImageView y;
    public ViewGroup z;
    public static String sLivePresenterClassName = "LiveAudienceClearScreenPresenter";

    public void d(){
       super();
       this.p = new c();
       this.r = false;
       this.C = new d$a(this);
       this.D = new d$b(this);
       this.E = new d$c(this);
       this.F = new h(this);
       this.G = new i(this);
       this.H = new j(this);
       this.I = new d$d(this);
       this.J = new d$e(this);
    }
    public void E8(){
       boolean b;
       a0 z;
       View[] viewArray;
       b uob = b.class;
       c uoc = c.class;
       String str = "3";
       if (PatchProxy.applyVoid(null, this, d.class, str)) {
          return;
       }
       b uob1 = this.R8();
       Objects.requireNonNull(uob1);
       if (!PatchProxy.applyVoid(null, uob1, uob, str)) {
          uob1.b.setValue(uob1.a);
          uob1.d.a(uoc).v1(uob1.b);
       }
       e uoe = this.S8();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoid(null, uoe, e.class, str)) {
          uoe.b.setValue(uoe.a);
          uoe.d.a(uoc).v1(uoe.b);
       }
       a0 l1 = this.u.l1;
       if (l1 != null) {
          this.x = l1.i();
       }
       this.u.J.gd(this.I);
       this.Y8(this.V8());
       b uob2 = this.R8();
       Objects.requireNonNull(uob2);
       d obj = PatchProxy.apply(null, uob2, uob, "6");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): uob2.d.a(uoc).E1(1018);
       if (b) {
          obj = this.u;
          if (obj.Z2 != null && obj.h == null) {
             this.w.postDelayed(new k(this), 100);
          }
       }
       int i = 0;
       int i1 = 1;
       if (!PatchProxy.applyVoid(null, this, d.class, "5")) {
          z = this.u.c;
          int i2 = 2;
          if (z != null) {
             LiveStreamFeedWrapper mEntity = z.mEntity;
             if (mEntity != null) {
                LiveStreamFeed mLiveSideBar = mEntity.mLiveSideBarModel;
                if (mLiveSideBar != null && mLiveSideBar.mLiveSideType == i2) {
                   viewArray = new View[i2];
                   viewArray[i] = this.w;
                   viewArray[i1] = this.z;
                   this.p.c(viewArray);
                label_0102 :
                   this.p.a(new l(this));
                }
             }
          }
          viewArray = new View[i2];
          viewArray[i] = this.w;
          viewArray[i1] = this.z;
          this.p.c(viewArray);
          if (this.x != null && !b.d(this)) {
             viewArray = new View[i1];
             viewArray[i] = this.x;
             this.p.c(viewArray);
             goto label_0102 ;
          }else {
             goto label_0102 ;
          }
       }
       a[] uoaArray = new a[i1];
       uoaArray[i] = AudienceBizRelation.VOICE_PARTY;
       this.u.N().u5(this.F, uoaArray);
       this.u.x.H6(this.G);
       z = this.u.Z;
       if (z != null) {
          z.l(this.H);
       }
       if (this.u.h == null || (!PatchProxy.applyVoid(null, this, d.class, "13") && this.u.h != null)) {
          m om = new m(this);
          this.q = om;
          this.u.y2.P4(om);
       }
    label_0154 :
       z = this.u.f2;
       if (z != null) {
          z.a(this.J);
       }
       return;
    }
    public void J8(){
       c uoc = c.class;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       this.p.f();
       this.u.J.fo(this.I);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.u.N().G5(this.F, uoaArray);
       this.u.x.Q0(this.G);
       a0 z = this.u.Z;
       if (z != null) {
          z.t(this.H);
       }
       if (this.u.h != null) {
          if (!PatchProxy.applyVoid(objArray, this, uod, "14")) {
             uod = this.q;
             if (uod != null) {
                d tu = this.u;
                if (tu.h != null) {
                   tu.y2.d5(uod);
                }
             }
          }
       }else {
          this.X8();
       }
       a0 uoa0 = this.u.f2;
       if (uoa0 != null) {
          uoa0.b(this.J);
       }
       this.r = false;
       this.t = false;
       b uob = this.R8();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "4")) {
          uob.d.a(uoc).O0(1018);
       }
       e uoe = this.S8();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoid(objArray, uoe, e.class, "4")) {
          uoe.d.a(uoc).O0(1032);
       }
       return;
    }
    public void P8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "6")) {
          return;
       }
       if (this.V8()) {
          if (!PatchProxy.applyVoid(objArray, this, uod, "8")) {
             uod = this.p;
             if (uod != null) {
                uod.g(true);
             }
             this.Y8(true);
          }
       }else if(PatchProxy.applyVoid(objArray, this, uod, "9")){
          uod = this.p;
          if (uod != null) {
             uod.g(false);
          }
          this.Y8(false);
       }
       return;
    }
    public final b R8(){
       Object obj = PatchProxy.apply(null, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.A == null) {
          this.A = new b(this.C);
       }
       return this.A;
    }
    public e S8(){
       Object obj = PatchProxy.apply(null, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B == null) {
          this.B = new e(this.D);
       }
       return this.B;
    }
    public boolean V8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (y.d(this.getActivity())) {
          return b;
       }
       boolean b1 = true;
       if (b.g(this.u)) {
          obj = this.u;
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, a.class, "1");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(obj.l()){
             b1 = obj.t.c();
          }
          return b1;
       }else if(this.u.e.isLandscape() && this.u.e.mIsFromLiveMate != null){
          return b;
       }else if(this.u.N().r2(AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN)){
          return b1;
       }else if(this.u.N().r2(AudienceBizRelation.VOICE_PARTY)){
          Object obj2 = PatchProxy.apply(objArray, objArray, k.class, "1");
          boolean b2 = (obj2 != patchProxyRe)? obj2.booleanValue(): f.a("enableVoicePartyScreenClean");
          return b2;
       }else if(this.u.Z2.B0() == StreamType.AUDIO.toInt()){
          return b;
       }else if(d2.g() && (d2.k() && b5.a(this.getActivity()))){
          return b;
       }else {
          return b1;
       }
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       this.S8().setVisible(false);
       this.p.e();
       return;
    }
    public void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "15")) {
          return;
       }
       if (this.s) {
          a0 z2 = this.u.Z2;
          if (z2 != null) {
             ClientContent$LiveStreamPackage liveStreamPa = z2.a();
             d ts = this.s;
             r or = r.class;
             if (!PatchProxy.isSupport(or) || (!PatchProxy.applyVoidTwoRefs(liveStreamPa, Long.valueOf(ts), objArray, or, "4") && ts)) {
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                long l = System.currentTimeMillis();
                h$b uob = h$b.e(1, "CLEAR_SCREEN_STAT");
                ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
                ClientTaskDetail$TimeStatPackage timeStatPack = new ClientTaskDetail$TimeStatPackage();
                timeStatPack.enterTime = Long.toString(ts);
                timeStatPack.leaveTime = Long.toString(l);
                timeStatPack.duration = Long.toString((l - ts));
                taskDetailPa.timeStatPackage = timeStatPack;
                uob.i(new ClientContentWrapper$ContentWrapper());
                uob.h(uContentPack);
                uob.s(taskDetailPa);
                u1.r0(uob);
             }
             this.s = 0;
          }
       }
       return;
    }
    public void Y8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "10")) {
          return;
       }
       b uob = this.R8();
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, uob1, "5")) {
          uob.a.mIsVisible = Boolean.valueOf(p0);
          uob.b.setValue(uob.a);
       }
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       this.p.i();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a22af);
       this.z = m1.f(p0, 0x7f0a2006);
       this.y = m1.f(p0, 0x7f0a1b30);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new p());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.u = this.q8(a0.class);
       this.v = this.r8("LIVE_SERVICE_MANAGER");
       this.R8().i(n.a(this));
       this.S8().i(n.a(this));
       return;
    }
}
