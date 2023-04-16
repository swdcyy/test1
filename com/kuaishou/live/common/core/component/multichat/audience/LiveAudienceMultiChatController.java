package com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import hp1.d;
import com.kuaishou.live.viewcontroller.ViewController;
import lp1.e;
import lp1.d;
import lp1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yp1.g;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$chatRenderModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$renderDelegate$2;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$a;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$c;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$b;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import xd1.c;
import xd1.b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gp1.a;
import sz1.e;
import ee1.a;
import hf3.a;
import com.kwai.video.waynelive.LivePlayerController;
import op1.b;
import androidx.lifecycle.LiveData;
import ip1.a;
import androidx.lifecycle.Transformations;
import cu1.d;
import hp1.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import up1.b;
import java.util.concurrent.CopyOnWriteArrayList;
import xp1.b;
import androidx.lifecycle.MutableLiveData;
import lp1.c;
import mp1.a;
import fh3.f;
import pp1.a;
import com.kwai.robust.PatchProxyResult;
import lh3.b;
import java.util.Map;
import fq1.d;
import java.lang.Number;
import wp1.c;
import yp1.c;
import java.lang.Boolean;
import yp1.e;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import np1.a;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$renderDelegate$2$a;
import yp1.b;
import wp1.a;
import zp1.l;
import np1.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import hp1.c;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import kp1.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;

public final class LiveAudienceMultiChatController extends ViewController implements d	// class@0014bd
{
    public LiveAudienceMultiChatCoreModel j;
    public a k;
    public a l;
    public a m;
    public e n;
    public final g o;
    public final p p;
    public final p q;
    public final LiveAudienceMultiChatController$a r;
    public final Observer s;
    public final Observer t;
    public final e u;
    public final d v;
    public final b w;

    public void LiveAudienceMultiChatController(e p0,d p1,b p2){
       a.p(p0, "multiChatDependence");
       a.p(p1, "multiChatDelegate");
       a.p(p2, "multiChatCallback");
       super();
       this.u = p0;
       this.v = p1;
       this.w = p2;
       this.o = new g();
       this.p = s.c(new LiveAudienceMultiChatController$chatRenderModel$2(this));
       this.q = s.c(new LiveAudienceMultiChatController$renderDelegate$2(this));
       this.r = new LiveAudienceMultiChatController$a(this);
       this.s = new LiveAudienceMultiChatController$c(this);
       this.t = new LiveAudienceMultiChatController$b(this);
    }
    public static final LiveAudienceMultiChatCoreModel V2(LiveAudienceMultiChatController p0){
       p0 = p0.j;
       if (p0 == null) {
          a.S("multiChatCoreModel");
       }
       return p0;
    }
    public int B(){
       return b.a(this);
    }
    public void E1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatController.class, "10")) {
          return;
       }
       a.p(p0, "servingUserList");
       LiveAudienceMultiChatController tm = this.m;
       if (tm != null) {
          tm.E1(p0);
       }
       return;
    }
    public void F2(){
       a uoa;
       LiveAudienceMultiChatController liveAudience = LiveAudienceMultiChatController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "3")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0cad);
       LiveAudienceMultiChatController tu = this.u;
       e uoe = tu.b();
       tu = this.u;
       LiveAudienceMultiChatCoreModel liveAudience1 = new LiveAudienceMultiChatCoreModel(tu.a, this.v, uoe, this.u.c(), tu.d, tu.f);
       this.j = v2;
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "4")) {
          LiveData liveData = Transformations.distinctUntilChanged(this.v.f());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          d.a(liveData).observe(this, new b(this));
       }
       LiveAudienceMultiChatController tj = this.j;
       String str = "multiChatCoreModel";
       if (tj == null) {
          a.S(str);
       }
       tj.a();
       tj = this.j;
       if (tj == null) {
          a.S(str);
       }
       tj.n().add(this.r);
       tj = this.j;
       if (tj == null) {
          a.S(str);
       }
       tj.m().c().observeForever(this.s);
       this.o.b().observeForever(this.t);
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "14")) {
          if (this.u.a().b == null) {
             f uof = this.u.b().od();
             a.o(uof, "multiChatDependence.mult¡­Manager.onInviteProcessor");
             uoa = new a(uof, this.v, this.w);
             this.k = uoa;
             this.z2(uoa);
          }
          LiveAudienceMultiChatController tj1 = this.j;
          if (tj1 == null) {
             a.S(str);
          }
          uoa = new a(tj1, this.u.c(), this.v.r());
          this.l = uoa;
          this.z2(uoa);
       }
       return;
    }
    public String I1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiChatController.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       return this.u.b().gc().I1(p0);
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatController.class, "19")) {
          return;
       }
       LiveAudienceMultiChatController tj = this.j;
       if (tj == null) {
          a.S("multiChatCoreModel");
       }
       tj.m().c().removeObserver(this.s);
       this.o.b().removeObserver(this.t);
       tj = this.j;
       if (tj == null) {
          a.S("multiChatCoreModel");
       }
       tj.b();
       return;
    }
    public Map O0(){
       LiveAudienceMultiChatController obj = PatchProxy.apply(null, this, LiveAudienceMultiChatController.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          a.S("multiChatCoreModel");
       }
       return d.b(obj.f());
    }
    public int W(){
       Object[] objArray = null;
       LiveAudienceMultiChatController obj = PatchProxy.apply(objArray, this, LiveAudienceMultiChatController.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.j;
       if (obj == null) {
          a.S("multiChatCoreModel");
       }
       b uob = obj.m();
       String str = this.v.h();
       c uoc = this.o.a();
       if (uoc != null) {
          objArray = uoc.b();
       }
       return d.c(uob, str, objArray);
    }
    public final void W2(boolean p0){
       LiveAudienceMultiChatController liveAudience = LiveAudienceMultiChatController.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "15")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, liveAudience, "17") && this.n == null) {
          this.n = new e(this.o);
          View view = this.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          LiveAudienceMultiChatController tn = this.n;
          a.m(tn);
          this.y2(view, tn);
       }
       String str = "multiChatCoreModel";
       if (p0) {
          LiveAudienceMultiChatController tj = this.j;
          if (tj == null) {
             a.S(str);
          }
          a uoa = new a(tj, this.v, this.o, this.Y2(), this.X2());
       }else {
          LiveAudienceMultiChatController tj1 = this.j;
          if (tj1 == null) {
             a.S(str);
          }
          b uob = new b(tj1, this.v, this.o, this.Y2(), this.X2());
       }
       this.m = p0;
       a.m(p0);
       if (this.getLifecycle().getCurrentState() != Lifecycle$State.INITIALIZED || this.getLifecycle().getCurrentState() != Lifecycle$State.DESTROYED) {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.viewcontroller.ViewController");
          this.z2(p0);
       }else if(!SystemUtil.I()){
          throw new RuntimeException("createAudienceChildController error"+this.getLifecycle().getCurrentState());
       }
       return;
    }
    public final b X2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final LiveAudienceMultiChatController$renderDelegate$2$a Y2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public boolean Z0(String p0){
       LiveAudienceMultiChatController obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiChatController.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       if (obj == null) {
          a.S("multiChatCoreModel");
       }
       Map map = obj.g();
       Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
       return map.containsKey(p0);
    }
    public final void Z2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatController.class, "16")) {
          return;
       }
       LiveAudienceMultiChatController tm = this.m;
       if (tm != null) {
          if (this.getLifecycle().getCurrentState() != Lifecycle$State.INITIALIZED) {
             this.O2(tm);
          }else if(!SystemUtil.I()){
             throw new RuntimeException("releaseAudienceChildController error"+this.getLifecycle().getCurrentState());
          }
       }
       this.m = objArray;
       return;
    }
    public String f(){
       b obj = PatchProxy.apply(null, this, LiveAudienceMultiChatController.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u.b().gc();
       a.o(obj, "multiChatDependence.mult¡­er.liveInteractRtcManager");
       return obj.f();
    }
    public boolean k(String p0){
       return c.a(this, p0);
    }
    public void s(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatController.class, "9")) {
          return;
       }
       LiveAudienceMultiChatController tj = this.j;
       if (tj == null) {
          a.S("multiChatCoreModel");
       }
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(objArray, tj, LiveAudienceMultiChatCoreModel.class, "6") && MultiChatState.CHATTING == tj.D().u()) {
          LayoutConfig value = tj.m().c().getValue();
          if (value != null && value.c() == 1) {
             b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "CoreModel reloadChatLayoutConfig");
             tj.E();
          }
       }
       return;
    }
    public boolean v(String p0){
       return c.c(this, p0);
    }
    public void v0(int p0){
       LiveAudienceMultiChatController liveAudience = LiveAudienceMultiChatController.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveAudience, "8")) {
          return;
       }
       liveAudience = this.j;
       if (liveAudience == null) {
          a.S("multiChatCoreModel");
       }
       liveAudience.v0(p0);
       return;
    }
    public boolean v2(){
       LiveAudienceMultiChatController obj = PatchProxy.apply(null, this, LiveAudienceMultiChatController.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       if (obj == null) {
          a.S("multiChatCoreModel");
       }
       return obj.e();
    }
    public String y(){
       return c.b(this);
    }
}
