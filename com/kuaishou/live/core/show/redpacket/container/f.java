package com.kuaishou.live.core.show.redpacket.container.f;
import im8.g;
import k51.c;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashSet;
import androidx.collection.ArrayMap;
import rg2.a0;
import rg2.p;
import com.kuaishou.live.core.show.redpacket.container.f$a;
import com.kuaishou.live.core.show.redpacket.container.f$b;
import com.kuaishou.live.core.show.redpacket.container.f$c;
import com.kuaishou.live.core.show.redpacket.container.f$d;
import o63.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import yh2.d;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import p91.m;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import rp5.a;
import lp3.c;
import lp3.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rg2.v;
import b12.a;
import com.kwai.framework.model.user.QCurrentUser;
import rg2.w;
import rg2.x;
import t02.a0;
import xp5.i;
import rg2.s;
import androidx.lifecycle.LifecycleOwner;
import z1.k;
import uw1.m;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import vq5.d;
import mq5.b;
import wu1.g;
import kq5.b;
import msd.a;
import rg2.z;
import mq5.h;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.container.b;
import com.kuaishou.live.core.show.redpacket.container.h;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.core.show.redpacket.container.b$a;
import oq5.c;
import oq5.a;
import vq5.b;
import java.util.Objects;
import androidx.fragment.app.c$b;
import uw1.d;
import crd.b;
import lnc.b9;
import z1.a;
import d61.g;
import tkd.b;
import tkd.d;
import ou5.b;
import rg2.q;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import java.util.Iterator;
import java.util.List;
import uw1.g;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.Fragment;
import d61.y;
import oq5.b;
import rg2.r;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import uw1.f;
import java.lang.Integer;
import java.util.Set;
import rg2.h0;
import java.util.Comparator;
import java.util.Collections;
import java.io.Serializable;
import rg2.o;
import android.content.DialogInterface$OnDismissListener;
import rg2.t;
import com.kuaishou.live.core.show.redpacket.container.f$e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Number;
import uw1.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.HashMap;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import rg1.a;
import rg2.u;
import rg2.f0;
import h22.b;

public class f extends c implements g	// class@000e78
{
    public LiveActivityRedPacketService A;
    public a B;
    public h C;
    public d D;
    public b E;
    public g F;
    public final c G;
    public b H;
    public b I;
    public Runnable J;
    public LiveRichCardCoreManager K;
    public final b L;
    public final LiveRedPacketContainerDialogFragment$e M;
    public final c N;
    public m O;
    public b P;
    public final PublishSubject p;
    public final List q;
    public final Set r;
    public final Map s;
    public final Set t;
    public final Set u;
    public LiveRedPacketContainerDialogFragment v;
    public m w;
    public a0 x;
    public i y;
    public a z;
    public static String sLivePresenterClassName = "LiveRedPacketDialogContainerPresenter";

    public void f(){
       super();
       this.p = PublishSubject.g();
       this.q = new ArrayList();
       this.r = new HashSet();
       this.s = new ArrayMap();
       this.t = new HashSet();
       this.u = new HashSet();
       this.G = new a0(this);
       this.L = new p(this);
       this.M = new f$a(this);
       this.N = new f$b(this);
       this.O = new f$c(this);
       this.P = new f$d(this);
    }
    public void E8(){
       f a;
       f d;
       f uof1;
       LiveRichCardCoreManager liveRichCard = this;
       a uoa = a.class;
       f uof = f.class;
       if (PatchProxy.applyVoid(null, liveRichCard, uof, "2")) {
          return;
       }
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       b.c0(h.f(), "暴富卡业务开关", "switch", Boolean.valueOf(h.b()));
       if (h.b()) {
          d.a("暴富卡业务开关开启");
       }
       if (liveRichCard.w.u5() == LiveSceneType.Audience && h.b()) {
          BaseFragment uBaseFragmen = liveRichCard.y.a(a.class).t();
          Activity activity = this.getActivity();
          v ov = new v(liveRichCard);
          f o = liveRichCard.O;
          a = liveRichCard.A;
          d = liveRichCard.D;
          c uoc = liveRichCard.y.a(uoa);
          c uoc1 = liveRichCard.y.a(a.class);
          String id = QCurrentUser.me().getId();
          String str = liveRichCard.w.d();
          String liveStreamId = liveRichCard.w.getLiveStreamId();
          x ox = new x(liveRichCard);
          w ow = new w(liveRichCard);
          f x = liveRichCard.x;
          a0 uoa0 = (x != null)? x.D2: null;
          uof1 = uof;
          s os = uoa;
          s os1 = new s(liveRichCard);
          LiveRichCardCoreManager liveRichCard1 = new LiveRichCardCoreManager(uBaseFragmen, activity, ov, o, a, d, uoc, uoc1, id, str, liveStreamId, ow, ox, uoa0, liveRichCard.F, liveRichCard.y.a(i.class), liveRichCard.y.a(uoa), liveRichCard.I, os);
          liveRichCard.K = h;
       }else {
          uof1 = uof;
       }
       f x1 = liveRichCard.x;
       if (x1 != null) {
          z oz = new z(liveRichCard);
          liveRichCard.C = oz;
          x1.D2.Km(oz);
          liveRichCard.x.y2.P4(liveRichCard.N);
          b uob = PatchProxy.apply(null, liveRichCard, uof1, "4");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = new b(liveRichCard.D, new h(liveRichCard), a.t().u("SOURCE_LIVE").b("autoOpenIEEEDialogExpireTimeMs", 0x1d4c0));
          }
          liveRichCard.E = uob;
       }
       x1 = liveRichCard.z;
       if (x1 != null) {
          x1.H6(liveRichCard.G);
       }
       liveRichCard.D.t5("openleeedialog", liveRichCard.L);
       x1 = liveRichCard.K;
       if (x1 != null) {
          Objects.requireNonNull(x1);
          if (!PatchProxy.applyVoid(null, x1, LiveRichCardCoreManager.class, "5")) {
             x1.u = false;
             x1.b0.c(x1.J);
             x1.O.e(x1.H);
          }
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, f.class, str)) {
          return;
       }
       f tx = this.x;
       boolean b = false;
       if (tx != null) {
          tx.D2.le(this.C);
          this.x.y2.d5(this.N);
          tx = this.E;
          if (tx != null) {
             Objects.requireNonNull(tx);
             if (!PatchProxy.applyVoid(objArray, tx, b.class, "2")) {
                tx.a.Z4("autoopenleeedialog");
                tx.a(b);
                b9.a(tx.h);
             }
          }
       }
       tx = this.z;
       if (tx != null) {
          tx.Q0(this.G);
       }
       this.D.Z4("openleeedialog");
       this.X8();
       tx = this.K;
       if (tx != null) {
          Objects.requireNonNull(tx);
          if (!PatchProxy.applyVoid(objArray, tx, LiveRichCardCoreManager.class, "6")) {
             tx.u = b;
             tx.b0.a(tx.J);
             tx.O.b(tx.H);
             LiveRichCardCoreManager obj = PatchProxy.apply(objArray, objArray, d.class, str);
             boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableDisposeRichCardRequestWhenUnbind", true);
             if (b1) {
                obj = tx.z;
                if (obj != null) {
                   obj.dispose();
                }
                obj = tx.y;
                if (obj != null) {
                   obj.dispose();
                }
                obj = tx.B;
                if (obj != null) {
                   obj.dispose();
                }
                obj = tx.A;
                if (obj != null) {
                   obj.dispose();
                }
                LiveRichCardCoreManager c = tx.C;
                if (c != null) {
                   c.dispose();
                }
             }
          }
       }
       return;
    }
    public final void P8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "7")) {
          return;
       }
       Activity activity = this.getActivity();
       if (g.h(activity)) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          d.a(-1712118428).ne(activity, "", "", 0, "", null, null, null, new q(p0)).h();
       }else {
          p0.accept(null);
       }
       return;
    }
    public final boolean R8(){
       Iterator obj = PatchProxy.apply(null, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (!q.f(obj.next().a())) {
             break ;
          }
       }
       return true;
    }
    public boolean S8(){
       f obj = PatchProxy.apply(null, this, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj == null || !obj.isAdded())? true: false;
       return b;
    }
    public final void V8(List p0,String p1,String p2,boolean p3){
       int this;
       long l;
       a0 p1;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, f.class, "9")) {
          return;
       }
       Object[] objArray = null;
       int i = 0;
       if (y.d(this.getActivity())) {
          this = 400;
          if (!PatchProxy.applyVoid(objArray, this, uof, "11")) {
             f tx = this.x;
             if (tx != null) {
                p1 = tx.p1;
                if (p1 != null) {
                   p1.d();
                }
             }
             y.f(this.getActivity());
          }
          l = this;
       }else {
          l = i;
       }
       this.Y8();
       if (l - i <= 0) {
          this.W8(p0, p1, objArray, p3);
       }else {
          r or = new r(this, p0, p1, p2, p3);
          this.J = v6;
          k1.r(v6, l);
       }
       return;
    }
    public final void W8(List p0,String p1,String p2,boolean p3){
       LiveRedPacketContainerDialogFragment liveRedPacke;
       int i1;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, f.class, "10")) {
          return;
       }
       if (!this.R8()) {
          b.Z(LiveLogTag.RED_PACKET, "can not open red packet dialog, cause no red packet entity");
          return;
       }else {
          f tK = this.K;
          if (tK != null) {
             tK.z();
          }
          x.E(this.v);
          tK = this.M;
          int i = 0;
          if (PatchProxy.isSupport(LiveRedPacketContainerDialogFragment.class)) {
             Object[] objArray = new Object[]{p0,p1,tK,p2,Boolean.valueOf(p3)};
             liveRedPacke = PatchProxy.apply(objArray, null, LiveRedPacketContainerDialogFragment.class, "14");
             if (liveRedPacke != PatchProxyResult.class) {
             label_00c8 :
                this.v = liveRedPacke;
                liveRedPacke.k0(new o(this));
                f tv = this.v;
                tv.J = new t(this);
                tv.I = this.s;
                tv.Q = new f$e(this);
                x.F(this.v, this.w.b(), "LiveRedPacketContainer");
                this.r.add(p1);
                if (this.v != null) {
                   ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.w.y();
                   ClientContent$LiveStreamPackage liveStreamPa = this.w.a();
                   f tv1 = this.v;
                   Objects.requireNonNull(tv1);
                   Object obj = PatchProxy.apply(null, tv1, LiveRedPacketContainerDialogFragment.class, "23");
                   if (obj != PatchProxyResult.class) {
                      i1 = obj.intValue();
                   }else if(q.f(tv1.y)){
                      i = tv1.y.size();
                   }
                   i1 = i;
                   if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidThreeRefs(liveVoicePar, liveStreamPa, Integer.valueOf(i1), null, i.class, "1")) {
                      HashMap hashMap = new HashMap();
                      hashMap.put("packet_count", String.valueOf(i1));
                      u1.u0(9, i.b("RED_PACKET_QUEUE_LIST", hashMap), i.a(liveVoicePar, liveStreamPa));
                   }
                }
                tv = this.B;
                if (tv != null) {
                   tv.a();
                }
                return;
             }
          }
          liveRedPacke = new LiveRedPacketContainerDialogFragment();
          if (!PatchProxy.applyVoidOneRefs(p0, liveRedPacke, LiveRedPacketContainerDialogFragment.class, "13")) {
             liveRedPacke.x = p0;
             liveRedPacke.y = new ArrayList();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                List list = iterator.next().a();
                if (!q.f(list)) {
                   liveRedPacke.y.addAll(list);
                   liveRedPacke.H.add(Integer.valueOf(q.d(list, i).g()));
                }
             }
             Collections.sort(liveRedPacke.y, new h0());
          }
          liveRedPacke.lh("key_select_red_packet_id", p1);
          liveRedPacke.P = tK;
          liveRedPacke.R = p2;
          liveRedPacke.S = p3;
          goto label_00c8 ;
       }
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, f.class, "15")) {
          return;
       }
       x.E(this.v);
       this.q.clear();
       this.s.clear();
       this.t.clear();
       this.u.clear();
       this.r.clear();
       this.Y8();
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, f.class, "16")) {
          return;
       }
       f tJ = this.J;
       if (tJ != null) {
          k1.m(tJ);
       }
       return;
    }
    public void Z8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "5")) {
          return;
       }
       this.P8(new u(this, p0, p1));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new f0());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.w = this.r8("LIVE_BASIC_CONTEXT");
       this.x = this.s8(a0.class);
       this.B = this.s8(a.class);
       this.y = this.r8("LIVE_SERVICE_MANAGER");
       this.z = this.t8("LIVE_CONFIGURATION_SERVICE");
       this.D = this.r8("LIVE_ROUTER_SERVICE");
       this.A = this.s8(LiveActivityRedPacketService.class);
       this.F = this.s8(g.class);
       this.H = this.s8(b.class);
       this.I = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       return;
    }
}
