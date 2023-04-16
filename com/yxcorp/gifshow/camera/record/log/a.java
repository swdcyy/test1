package com.yxcorp.gifshow.camera.record.log.a;
import com.kwai.camerasdk.videoCapture.CameraController$d;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.u1;
import kuaishou.perf.page.impl.d;
import android.content.Intent;
import android.app.Activity;
import be9.b;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.yxcorp.gifshow.camerasdk.q;

public class a extends d implements CameraController$d	// class@000e22
{
    public boolean n;
    public long o;

    public void a(CameraPageType p0,b p1){
       super(p0, p1);
       this.n = true;
    }
    public void N(long p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "4")) {
          return;
       }
       String str = null;
       if (this.n != null && this.o - str) {
          this.n = false;
          Object[] objArray = new Object[false];
          a.D().w("cameracost", "onReceivedFirstFrame "+(p1 - p0), objArray);
          d te = this.e;
          if (te != null) {
             Objects.requireNonNull(te);
          }
          CameraLogger.v();
       }
       if (p0 - str > 0 && p1 - p0 > 0) {
          p1 = p1 - p0;
          CameraLogger uCameraLogge = CameraLogger.class;
          if (!PatchProxy.isSupport(uCameraLogge) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p1), null, uCameraLogge, "25")) {
             ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
             resultPackag.timeCost = p1;
             h$b uob = h$b.d(7, 430);
             uob.q(resultPackag);
             u1.r0(uob);
          }
       }
       d.d("postSwitchCameraMonitor").c();
       return;
    }
    public void O(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (!this.o) {
          this.o = p0;
          if (!PatchProxy.applyVoid(null, this, uoa, "5") && this.o > 0) {
             d te = this.e;
             if (te != null) {
                Intent intent = te.getIntent();
                if (intent != null) {
                   c.k(new b(this, intent));
                }
             }
          }
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.nb(p0);
       this.h.j(this);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.onDestroyView();
       this.h.d0(this);
       return;
    }
}
