package com.yxcorp.gifshow.camera.record.tab.d;
import eh9.a;
import java.lang.Object;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.Handler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import eh9.t;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import os5.l;
import j8c.a;
import q87.c;
import android.os.Build$VERSION;
import ssb.c;
import ssb.d;
import brd.t;
import wkd.b;
import rfc.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.camera.record.tab.d$a;
import eh9.s;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import eh9.n;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import java.lang.StringBuilder;
import android.view.View;
import android.view.ViewGroup;
import zca.a;

public class d	// class@000f4f
{
    public CameraActivity a;
    public boolean b;
    public final a c;
    public CameraScrollTabViewGroup d;
    public a e;
    public b f;
    public b g;

    public void d(a p0){
       super();
       this.b = true;
       this.e = new a();
       this.c = p0;
    }
    public void a(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "5")) {
          return;
       }
       if (p0 == -1) {
          this.a.V2().post(new t(this));
       }
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d() && d.a(-1492894991).isAvailable())? true: false;
       return b;
    }
    public final void c(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       int i = 0;
       String str = "LiveTabTagManager";
       if (!this.b()) {
          objArray = new Object[i];
          a.D().w(str, "live status is unavailable.", objArray);
          return;
       }else {
          objArray = new Object[i];
          a.D().w(str, "refreshLiveStatusConfig: LivePlugIn is available ", objArray);
          t ot = (Build$VERSION.SDK_INT == 23)? d.a().c(): b.a(0x4a533fa).f(RequestTiming.DEFAULT);
          this.e.c(ot.map(new e()).subscribe(new d$a(this), new s(this)));
          return;
       }
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.ME.isLogined() && this.b != null)? true: false;
       return b;
    }
    public void e(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       Intent intent = this.a.getIntent();
       String str = "LiveTabTagManager";
       if (intent != null && j0.a(intent, "panel_disabled", false)) {
          this.c.f(8);
          objArray = new Object[false];
          a.D().w(str, "updateLiveStatus panel_disabled", objArray);
          return;
       }else if(!this.d()){
          this.c.k(CameraTab.CAMERA_TAB_LIVE, false);
          objArray = new Object[false];
          a.D().w(str, "updateLiveStatus should not ShowLive", objArray);
          return;
       }else {
          CameraBaseFragment uCameraBaseF = this.a.o0();
          if (uCameraBaseF != null && uCameraBaseF.x2()) {
             this.c.f(false);
          }
          LiveStreamStatus liveStreamSt = PatchProxy.apply(objArray, this, uod, "10");
          if (liveStreamSt != PatchProxyResult.class) {
          }else {
             liveStreamSt = d.a(-1492894991).c20();
             if (liveStreamSt == null) {
                liveStreamSt = LiveStreamStatus.HIDDEN;
             }
          }
          Object[] objArray1 = new Object[false];
          a.D().w(str, "updateLiveStatus isLiveOnAndAvailable = "+this.b()+"£¬ liveStreamStatus = "+liveStreamSt, objArray1);
          if (!PatchProxy.applyVoid(objArray, this, uod, "9")) {
             CameraTab cAMERA_TAB_L = CameraTab.CAMERA_TAB_LIVE;
             View view = this.d.findViewById(cAMERA_TAB_L.getTabId());
             View view1 = this.d.findViewById(R.id.live_locked_iamgeview);
             if (view != null && view1 != null) {
                view.setPadding(false, false, false, false);
                view1.setVisibility(8);
                this.c.k(cAMERA_TAB_L, true);
             }
          }
          this.c.k(CameraTab.CAMERA_TAB_LIVE, true);
          return;
       }
    }
    public void onBindPhoneEvent(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       this.c();
       return;
    }
}
