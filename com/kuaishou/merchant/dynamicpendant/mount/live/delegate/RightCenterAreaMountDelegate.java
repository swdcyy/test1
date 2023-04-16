package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightCenterAreaMountDelegate;
import i08.a;
import ls3.b;
import java.lang.Object;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightCenterAreaMountDelegate$tempRightCenterPendants$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.System;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import java.util.Map;
import java.lang.Integer;
import f08.f;
import f08.f$a;
import java.lang.Throwable;
import ms3.b;
import gw3.x;
import com.kuaishou.merchant.api.live.service.pendant.model.PendantArea;
import i08.a$a;

public final class RightCenterAreaMountDelegate implements a	// class@0016b0
{
    public final p a;
    public b b;

    public void RightCenterAreaMountDelegate(b p0){
       super();
       this.b = p0;
       this.a = s.c(RightCenterAreaMountDelegate$tempRightCenterPendants$2.INSTANCE);
    }
    public boolean a(View p0,PendantMountInfo p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RightCenterAreaMountDelegate rightCenterA = RightCenterAreaMountDelegate.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, rightCenterA, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = System.identityHashCode(p0);
       String liveId = p1.getLiveId();
       PendantUtil$Companion a = PendantUtil.a;
       boolean b = true;
       String str = a.d(p0, p1.getMaterialId(), b);
       if (this.d().containsKey(Integer.valueOf(i))) {
          f$a.s(f.a, liveId, str, "mount error: this view has mounted", null, null, 24, null);
          return false;
       }else {
          a.g(p0, p1);
          x ox = PatchProxy.applyTwoRefs(p0, p1, this, rightCenterA, "4");
          if (ox != patchProxyRe) {
          }else {
             ox = new x(p1, p0);
          }
          int i1 = (p1.getAnimationSwitch())? 9: 1;
          this.b.b(ox, PendantArea.AREA_RIGHT, i1);
          this.d().put(Integer.valueOf(i), ox);
          return b;
       }
    }
    public boolean b(View p0,PendantMountInfo p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, RightCenterAreaMountDelegate.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       b uob = this.d().remove(Integer.valueOf(System.identityHashCode(p0)));
       if (uob == null) {
          return false;
       }
       this.b.f(uob, PendantArea.AREA_RIGHT);
       return true;
    }
    public void c(Map p0,View p1,PendantMountInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RightCenterAreaMountDelegate.class, "5")) {
          return;
       }
       a$a.a(this, p0, p1, p2);
       return;
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, RightCenterAreaMountDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
