package com.kuaishou.live.tuna.presenter.b;
import im8.g;
import c12.f;
import com.kuaishou.live.tuna.presenter.b$a;
import java.util.HashSet;
import aq3.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import aq3.c;
import com.kuaishou.live.tuna.presenter.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import pp3.b;
import java.util.Set;
import t02.a0;
import mq5.h;
import mq5.b;
import tkd.b;
import tkd.d;
import nl9.r;
import com.kwai.framework.model.feed.BaseFeed;
import hf3.a;
import p91.m;
import lf3.g;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar;
import pp3.b$a;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import aq3.j;
import msd.a;
import c15.b;
import fg6.a;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.google.gson.Gson;
import xx5.d;
import aq3.i;
import java.lang.Exception;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import z12.x;
import op3.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState$Button;
import java.util.Map;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.d;
import ju5.g;
import aq3.h;
import com.kuaishou.live.tuna.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tj3.e;
import vq5.d;
import aq3.l;
import nl8.m;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.util.rx.RxBus;
import na6.b;
import brd.t;
import aq3.d;
import erd.g;
import t45.d;
import brd.z;
import aq3.f;
import crd.b;
import io.reactivex.subjects.PublishSubject;
import aq3.e;

public class b extends f implements g	// class@000fda
{
    public d K;
    public m L;
    public a0 M;
    public e N;
    public BaseFeed O;
    public GifshowActivity P;
    public LiveBsStateMessages$SCLiveCurrentBsState Q;
    public TunaButtonModel R;
    public int S;
    public b T;
    public b$a U;
    public final g U0;
    public boolean V;
    public final Queue V0;
    public boolean W;
    public final h W0;
    public String X;
    public b$c X0;
    public Set Y;
    public l Z;
    public static String sLivePresenterClassName = "LiveAudienceTunaBizBottomBarPresenter";

    public void b(){
       super();
       this.U = new b$a(this);
       this.V = false;
       this.W = false;
       this.X = null;
       this.Y = new HashSet();
       this.Z = null;
       this.U0 = new b(this);
       this.V0 = new ConcurrentLinkedQueue();
       this.W0 = new c(this);
       this.X0 = new b$b(this);
    }
    public void Q(boolean p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       b = false;
       this.a9().setVisible(b);
       this.a9().a();
       this.Y.clear();
       b tM = this.M;
       if (tM != null && tM.D2 != null) {
          b = true;
       }
       if (b) {
          tM.D2.le(this.W0);
       }
       d.a(0x691527a8).Ep(this.O);
       if (!PatchProxy.applyVoid(null, this, uob, "9")) {
          this.L.u().o(712, this.U0);
       }
       return;
    }
    public b a9(){
       LiveTunaAudienceBottomBar obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.T == null) {
          obj = new LiveTunaAudienceBottomBar();
          this.T = obj;
          obj.h(this.U);
       }
       return this.T;
    }
    public final void b9(LiveBsStateMessages$SCLiveCurrentBsState p0,boolean p1){
       String str2;
       int i1;
       b r1;
       ClientEvent$ElementPackage uElementPack;
       HashMap hashMap;
       ClientContent$KsOrderInfoPackage ksOrderInfoP;
       ClientContent$ContentPackage uContentPack;
       ClientEvent$ShowEvent showEvent;
       String str = this;
       g obj = p0;
       boolean b = p1;
       b uob = b.class;
       String str1 = "4";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), str, uob, str1)) {
          return;
       }
       int i = 0;
       int b1 = (obj != null && obj.activeButton != null)? true: false;
       boolean b2 = (str.Q != null)? true: false;
       b.f(KsgLogTunaLiveTag.BOTTOM_ICON.appendTag("onReceiveTunaMessage"), new j(b1, b, b2));
       if (b && b2) {
          return;
       }else if(!b1){
          str.Q = null;
          str.R = null;
          return;
       }else if(str.X == null){
          str2 = (b)? "TunaAudienceBottomTaskItemDidUpdate_Pre": "TunaAudienceBottomTaskItemDidUpdate";
          str.X = str2;
       }
       str.Q = obj;
       b1 = -734569516;
       try{
          str.R = a.a.h(obj.actionUrl, TunaButtonModel.class);
          d.a(b1).K4(str.R, str.O);
       }catch(java.lang.Exception e0){
          b.d(KsgLogTunaLiveTag.BOTTOM_ICON.appendTag("onMessageReceived"), new i(e0));
       }
       try{
          if (!PatchProxy.applyVoidOneRefs(obj, str, uob, "10")) {
             b uob1 = this.a9();
             LiveBsStateMessages$SCLiveCurrentBsState activeButton = obj.activeButton;
             LiveBsStateMessages$SCLiveCurrentBsState supportType = obj.supportType;
             str2 = (supportType == null || supportType == 2)? 1: null;
             if (str2) {
                uob1.g(obj);
                uob1.setVisible(true);
                ClientContent$LiveStreamPackage obj1 = PatchProxy.apply(null, str, uob, "16");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else {
                   f z = str.z;
                   b = (z != null)? z.U0(): false;
                }
                if (!b && (!TextUtils.x(obj.exposureId) && !str.Y.contains(obj.exposureId))) {
                   str.Y.add(obj.exposureId);
                   obj1 = str.L.a();
                   e0 uoe0 = x.l(str.M);
                   b r = str.R;
                   b o = str.O;
                   a uoa = a.class;
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray = new Object[]{obj1,obj,uoe0,r,o};
                      if (!PatchProxy.applyVoid(objArray, null, uoa, str1)) {
                      }
                   }else {
                   }
                }
             }else {
                uob1.setVisible(i);
             }
          label_0204 :
             b.f(KsgLogTunaLiveTag.BOTTOM_ICON.appendTag("toggleBottomBarTunaIcon"), new h(uob1));
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new d());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.r8("LIVE_BASIC_CONTEXT");
       this.M = this.q8(a0.class);
       this.N = this.r8("LIVE_LOG_REPORTER");
       this.K = this.t8("LIVE_ROUTER_SERVICE");
       this.O = this.r8("feed");
       this.Z = this.s8(l.class);
       this.a9().e(this);
       return;
    }
    public void x(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.P = this.getActivity();
       this.a9().b();
       if (!PatchProxy.applyVoid(null, this, uob, "8")) {
          this.L.u().u0(712, LiveBsStateMessages$SCLiveCurrentBsState.class, this.U0);
       }
       RxBus.f.f(b.class).doOnSubscribe(new d(this)).observeOn(d.a).subscribe(new f(this));
       b tM = this.M;
       uob = (tM != null && tM.D2 != null)? 1: null;
       if (uob) {
          tM.D2.Km(this.W0);
       }
       this.X7(this.Z.a().subscribe(new e(this)));
       return;
    }
}
