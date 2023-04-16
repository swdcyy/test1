package com.kuaishou.live.audience.component.treasurebox.LiveAudienceTreasureBoxPresenter;
import im8.g;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import com.kuaishou.live.audience.component.treasurebox.LiveAudienceTreasureBoxPresenter$b;
import xp5.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a51.c;
import kotlin.jvm.internal.a;
import lp3.c;
import lp3.e;
import k2b.u1;
import n31.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import v51.a;
import j02.m;
import hf3.a;
import aq5.d;
import xp5.i;
import com.kuaishou.live.audience.component.treasurebox.LiveAudienceTreasureBoxPresenter$onBind$1;
import vq5.d;
import msd.a;
import jv1.b;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.audience.component.treasurebox.LiveAudienceTreasureBoxPresenter$a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.robust.PatchProxyResult;
import rp5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import n31.c;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;

public final class LiveAudienceTreasureBoxPresenter extends LiveVCHostPresenter implements g	// class@000bee
{
    public a A;
    public LiveSlidePlayService B;
    public FrameLayout C;
    public m D;
    public final b E;
    public e w;
    public a0 x;
    public d y;
    public b z;
    public static String sLivePresenterClassName = "LiveAudienceTreasureBoxPresenter";

    public void LiveAudienceTreasureBoxPresenter(){
       super();
       this.E = new LiveAudienceTreasureBoxPresenter$b(this);
    }
    public void E8(){
       LiveAudienceTreasureBoxPresenter tw;
       c uoc;
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, LiveAudienceTreasureBoxPresenter.class, "4")) {
          return;
       }
       super.E8();
       String str = "serviceManager.getServic¡­eInfoManager::class.java\)";
       if (this.C == null) {
          tw = this.w;
          if (tw == null) {
             a.S("serviceManager");
          }
          uoc = tw.a(og);
          a.o(uoc, str);
          u1.R("LiveAudienceTreasureBoxPresenterNPE", uoc.getLiveStreamId(), 3);
          b.P(d.a, "treasureBoxDraggableContainer == null ");
          return;
       }else {
          tw = this.w;
          if (tw == null) {
             a.S("serviceManager");
          }
          c uoc1 = tw.a(a.class);
          a.o(uoc1, "serviceManager.getServic¡­nnectManager::class.java\)");
          this.A = uoc1;
          if (uoc1 == null) {
             a.S("longConnectionManager");
          }
          a uoa = uoc1.u();
          a.o(uoa, "longConnectionManager.liveLongConnection");
          tw = this.w;
          if (tw == null) {
             a.S("serviceManager");
          }
          uoc = tw.a(og);
          a.o(uoc, str);
          c uoc2 = uoc;
          LiveAudienceTreasureBoxPresenter ty = this.y;
          if (ty == null) {
             a.S("liveRouterManager");
          }
          LiveAudienceTreasureBoxPresenter tw1 = this.w;
          if (tw1 == null) {
             a.S("serviceManager");
          }
          uoc = tw1.a(d.class);
          a.o(uoc, "serviceManager.getServic¡­veBizManager::class.java\)");
          c uoc3 = uoc;
          tw1 = this.w;
          if (tw1 == null) {
             a.S("serviceManager");
          }
          uoc = tw1.a(i.class);
          a.o(uoc, "serviceManager.getServic¡­kageProvider::class.java\)");
          m om = new m(uoa, uoc2, ty, uoc3, uoc, LiveAudienceTreasureBoxPresenter$onBind$1.INSTANCE, this.z);
          this.D = v12;
          tw1 = this.C;
          a.m(tw1);
          tw = this.D;
          a.m(tw);
          this.E2(tw1, tw);
          tw1 = this.B;
          if (tw1 == null) {
             a.S("liveSlidePlayService");
          }
          tw1.P4(new LiveAudienceTreasureBoxPresenter$a(this));
          return;
       }
    }
    public LifecycleOwner V8(){
       LiveAudienceTreasureBoxPresenter obj = PatchProxy.apply(null, this, LiveAudienceTreasureBoxPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("serviceManager");
       }
       return obj.a(a.class).t();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTreasureBoxPresenter.class, "3")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a1939);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceTreasureBoxPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceTreasureBoxPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceTreasureBoxPresenter.class, new c());
       }else {
          obj.put(LiveAudienceTreasureBoxPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTreasureBoxPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.w = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.x = obj;
       obj = this.r8("LIVE_ROUTER_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_ROUTER_SERVICE\)");
       this.y = obj;
       this.z = this.s8(b.class);
       obj = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       a.o(obj, "inject\(AccessIds.LIVE_SLIDE_PLAY_SERVICE\)");
       this.B = obj;
       return;
    }
}
