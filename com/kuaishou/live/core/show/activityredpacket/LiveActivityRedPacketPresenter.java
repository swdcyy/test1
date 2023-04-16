package com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import im8.g;
import k51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.List;
import po3.a;
import java.lang.Object;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import h22.x;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$a;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$b;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$c;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$d;
import h22.b0;
import com.kuaishou.live.core.show.activityredpacket.pendant.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import h02.b;
import com.kuaishou.live.core.show.activityredpacket.h;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$SCLiveTreasureBoxShow;
import lf3.g;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRedPackConfig;
import wg3.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import n22.b;
import lp3.e;
import eg1.e;
import lp3.c;
import dg1.a;
import n22.b$b;
import java.util.Objects;
import lz2.c;
import h22.c0;
import lnc.c3$a;
import lnc.c3;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import crd.b;
import lnc.b9;
import ekd.k1;
import java.util.Set;
import pg2.a;
import pz2.c;
import h22.d0;
import o22.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import java.lang.Long;
import tw1.f;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService$RemoveRedPacketActionSource;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import h22.e0;
import erd.g;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$UpdateOption;
import uw1.m;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import y22.q;
import h62.c;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import h62.d;
import java.lang.Iterable;
import qk.m;
import h22.z;
import ok.o;
import android.content.Context;
import y22.p;
import el.a;
import pm8.a;
import d61.v;
import com.yxcorp.gifshow.util.DateUtils;
import h22.a0;
import com.kuaishou.live.core.show.activityredpacket.s;
import ok.x;
import java.lang.Math;
import java.lang.Runnable;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import rg2.b;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import e17.i;
import h22.n0;

public class LiveActivityRedPacketPresenter extends c implements g	// class@000937
{
    public d A;
    public final DialogInterface$OnShowListener B;
    public List C;
    public LiveActivityRedPacketService D;
    public LiveActivityRedPacketPresenter$e E;
    public b F;
    public final g G;
    public final b$b H;
    public m p;
    public m q;
    public b r;
    public b s;
    public final Map t;
    public final Map u;
    public final PublishSubject v;
    public final Map w;
    public List x;
    public int y;
    public LiveConfigStartupResponse$LiveRedPackConfig z;
    public static final List I;
    public static final Object J;
    public static final Object K;
    public static String sLivePresenterClassName;

    static {
       LiveActivityRedPacketPresenter.I = a.a(LiveLogTag.ACTIVITY_LEEE, "EntryPresenter");
       LiveActivityRedPacketPresenter.J = new Object();
       LiveActivityRedPacketPresenter.K = new Object();
    }
    public void LiveActivityRedPacketPresenter(boolean p0){
       super();
       this.t = new HashMap();
       this.u = new HashMap();
       this.v = PublishSubject.g();
       this.w = new HashMap();
       this.x = new ArrayList();
       this.B = new x(this);
       this.C = new ArrayList();
       this.D = new LiveActivityRedPacketPresenter$a(this);
       this.E = new LiveActivityRedPacketPresenter$b(this);
       this.F = new LiveActivityRedPacketPresenter$c(this);
       this.G = new LiveActivityRedPacketPresenter$d(this);
       this.H = new b0(this);
       this.U7(new e());
       if (p0) {
          this.U7(d.a(-204054297).xy());
       }else {
          this.U7(new h(this.E));
       }
       return;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveActivityRedPacketPresenter.class, "5")) {
          return;
       }
       this.p.u().u0(748, LiveTreasureBoxMessage$SCLiveTreasureBoxShow.class, this.G);
       LiveConfigStartupResponse$LiveRedPackConfig liveRedPackC = LiveConfigStartupResponse$LiveRedPackConfig.class;
       String str = a.a.getString("liveRedPackConfig", "{}");
       Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, liveRedPackC);
       this.z = objArray1;
       if (this.s == null) {
          this.s = new b(this.H, this.p.t5().a(e.class), this.p.t5().a(a.class));
       }
       LiveActivityRedPacketPresenter ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, b.class, "4")) {
          ts.b.B0(ts.f);
       }
       c3.c(this.q, new c0(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveActivityRedPacketPresenter.class, "6")) {
          return;
       }
       this.p.u().o(748, this.G);
       this.t.clear();
       this.u.clear();
       Iterator iterator = this.w.values().iterator();
       while (iterator.hasNext()) {
          b9.a(iterator.next());
       }
       this.w.clear();
       k1.n(LiveActivityRedPacketPresenter.J);
       k1.n(LiveActivityRedPacketPresenter.K);
       this.x.clear();
       this.C.clear();
       LiveActivityRedPacketPresenter ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, b.class, "5")) {
          ts.b.g1(ts.f);
          Iterator iterator1 = ts.d.keySet().iterator();
          while (iterator1.hasNext()) {
             a uoa = iterator1.next();
             ts.a(uoa);
             ts.f.i(uoa, false, "RELEASE_EFFECT_MANAGER");
          }
          ts.d.clear();
       }
       c3.c(this.q, new d0(this));
       return;
    }
    public void P8(String p0,b p1){
       LiveActivityRedPacketPresenter liveActivity = LiveActivityRedPacketPresenter.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, liveActivity, "7")) {
          return;
       }
       this.S8(p1.c.getValue(), LiveRedPacketAction.RED_PACK_CREATE);
       this.t.remove(p0);
       this.u.put(p0, p1);
       LiveTreasureBoxMessage$LiveTreasureBoxShow value = p1.c.getValue();
       if (value == null) {
          b.P(LiveActivityRedPacketPresenter.I, "addRedPacketToShowingRedPackets, liveTreasureBoxShow == null");
          return;
       }else {
          LiveTreasureBoxMessage$LiveTreasureBoxShow bizType = value.bizType;
          LiveTreasureBoxMessage$LiveTreasureBoxShow showDeadline = value.showDeadline;
          if (!PatchProxy.isSupport(liveActivity) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(bizType), p0, Long.valueOf(showDeadline), this, LiveActivityRedPacketPresenter.class, "9")) {
             b9.a(this.w.get(p0));
             long l = showDeadline - f.a();
             if (l - null <= 0) {
                this.D.d(bizType, p0, LiveActivityRedPacketService$RemoveRedPacketActionSource.ADD_REDPACKET_CHECK);
                this.w.remove(p0);
             }else {
                b.P(LiveActivityRedPacketPresenter.I, "set pendantView timer RedPacketId = "+p0+"bizType = "+bizType+"expiredDuration = "+l);
                this.w.put(p0, t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new e0(this, p0, bizType)));
             }
          }
          this.V8(this.u, LiveActivityRedPacketPresenter$UpdateOption.ADD, p1);
          LiveActivityRedPacketPresenter tq = this.q;
          if (tq != null) {
             tq.b(p1.c.getValue());
          }
          return;
       }
    }
    public final boolean R8(LiveTreasureBoxMessage$LiveTreasureBoxShow p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p0.autoShowTime - p0.grabTime <= 0) {
          LiveActivityRedPacketPresenter tz = this.z;
          LiveTreasureBoxMessage$LiveTreasureBoxShow liveTreasure = (tz == null)? null: tz.mActivityRedPacketMaxShowTimes;
          if (!this.p.e()) {
             if (this.y < liveTreasure) {
                b = true;
             }
             return b;
          }else if(q.h(p0.boxType) == 1){
             liveTreasure = 1;
          }else {
             liveTreasure = 0;
          }
          int i = (!q.h(p0.boxType) && !q.j(p0.boxType, p0.authorMaxAutoShowTimes))? 1: 0;
          if (liveTreasure || i) {
             b = true;
          }
       }
    label_005a :
       return b;
    }
    public void S8(LiveTreasureBoxMessage$LiveTreasureBoxShow p0,LiveRedPacketAction p1){
       Object obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, this, LiveActivityRedPacketPresenter.class, "18")) {
          return;
       }
       if (obj == null) {
          return;
       }
       c uoc = new c(e.c(p0), LiveRedPacketStage.RED_PACKET_COUNTDOWN, p1, obj.treasureBoxId, RedPacketType.RED_PACKET_TYPE_ACTIVITY, -1, -1, FirstReportType.DEFAULT, ActionType.DEFAULT, ActionStatus.SUCCESS, "1.0");
       d.j(v1.e(obj.boxType));
       return;
    }
    public final void V8(Map p0,LiveActivityRedPacketPresenter$UpdateOption p1,b p2){
       boolean this;
       LiveActivityRedPacketPresenter liveActivity = LiveActivityRedPacketPresenter.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveActivityRedPacketPresenter.class, "10")) {
          return;
       }
       this.v.onNext(this.u);
       LiveActivityRedPacketPresenter tq = this.q;
       if (tq != null && tq.e()) {
          b.P(LiveActivityRedPacketPresenter.I, "[doAutoShowRedPacketContainer] 自动弹失败 被业务方阻止");
          return;
       }else {
          Objects.requireNonNull(p0);
          ArrayList uArrayList = new ArrayList();
          m.s(this.x).p(new z(p0)).n(uArrayList);
          this.x = uArrayList;
          Iterator iterator = p0.values().iterator();
          Map obj = null;
          LiveTreasureBoxMessage$LiveTreasureBoxShow liveTreasure = obj;
          this = false;
          while (iterator.hasNext()) {
             LiveTreasureBoxMessage$LiveTreasureBoxShow value = iterator.next().c.getValue();
             LiveTreasureBoxMessage$LiveTreasureBoxShow obj1 = PatchProxy.applyOneRefs(value, this, liveActivity, "15");
             if (obj1 != PatchProxyResult.class) {
                this = obj1.booleanValue();
             }else if(this.getContext() == null){
                obj1 = value.treasureBoxId;
                if (!this.x.contains(obj1)) {
                   this.x.add(obj1);
                   if (!this.p.e() || (value.disableAuthorAutoShow == null && value.autoShow != null)) {
                      this = true;
                   }
                }
             }
             if (this && (liveTreasure == null || value.grabTime - liveTreasure.grabTime < 0)) {
                liveTreasure = value;
             }
          }
          if (liveTreasure != null) {
             LiveTreasureBoxMessage$LiveTreasureBoxShow boxType = liveTreasure.boxType;
             long l = this.p.s();
             q oq = q.class;
             if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(boxType), Long.valueOf(l), obj, oq, "24")) {
                obj = a.t(new p().getType());
                if (obj != null && !DateUtils.I(l, v.i(obj.get(Integer.valueOf(boxType))))) {
                   q.o(boxType, l);
                   q.n(boxType, this);
                   q.p(boxType, this);
                }
             }
          }
          if (this.R8(liveTreasure)) {
             a0 uoa0 = new a0(liveTreasure);
             if (!PatchProxy.applyVoidTwoRefs(liveTreasure, uoa0, this, liveActivity, "11") && this.q != null) {
                k1.s(new s(this, liveTreasure, uoa0, liveTreasure.treasureBoxId), LiveActivityRedPacketPresenter.J, Math.max((liveTreasure.autoShowTime - this.p.s()), 0));
             }
          }else if(p1 == LiveActivityRedPacketPresenter$UpdateOption.ADD && (p2 != null && (p2.c.getValue() != null && this.p.u5() == LiveSceneType.Audience))){
             LiveActivityRedPacketPresenter tr = this.r;
             if (tr != null) {
                tr.a(13, p2.c.getValue().boxType);
             }
          }
          return;
       }
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketPresenter.class, "3")) {
          return;
       }
       if (SystemUtil.I()) {
          i.d(R.style.arg_RES_7f11066a, p0);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveActivityRedPacketPresenter.class, new n0());
       }else {
          obj.put(LiveActivityRedPacketPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(m.class);
       this.r = this.s8(b.class);
       return;
    }
}
