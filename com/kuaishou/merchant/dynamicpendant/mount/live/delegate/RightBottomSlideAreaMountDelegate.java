package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightBottomSlideAreaMountDelegate;
import i08.a;
import ks3.l0;
import java.lang.Object;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightBottomSlideAreaMountDelegate$tempSlideShowPendants$2;
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
import bs3.b;
import android.content.Context;
import com.yxcorp.utility.n;
import i08.a$a;

public final class RightBottomSlideAreaMountDelegate implements a	// class@0016ae
{
    public final p a;
    public l0 b;

    public void RightBottomSlideAreaMountDelegate(l0 p0){
       super();
       this.b = p0;
       this.a = s.c(RightBottomSlideAreaMountDelegate$tempSlideShowPendants$2.INSTANCE);
    }
    public boolean a(View p0,PendantMountInfo p1){
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RightBottomSlideAreaMountDelegate rightBottomS = RightBottomSlideAreaMountDelegate.class;
       Object obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, rightBottomS, "2");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       int i = System.identityHashCode(p0);
       PendantUtil$Companion a = PendantUtil.a;
       String str = a.d(obj1, p1.getMaterialId(), true);
       if (this.d().containsKey(Integer.valueOf(i))) {
          f$a.s(f.a, p1.getLiveId(), str, "mount error: this view has mounted", null, null, 24, null);
          return false;
       }else {
          a.g(obj1, obj2);
          b uob = PatchProxy.applyTwoRefs(obj1, obj2, obj, rightBottomS, "4");
          if (uob != patchProxyRe) {
          }else {
             uob = new b();
             uob.a = p1.getType();
             uob.f = p1.getPriority();
             uob.d = obj1;
             uob.b = n.c(p0.getContext(), (float)p1.getWidth());
             uob.c = n.c(p0.getContext(), (float)p1.getHeight());
          }
          obj.b.i(uob);
          this.d().put(Integer.valueOf(i), uob);
          return true;
       }
    }
    public boolean b(View p0,PendantMountInfo p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, RightBottomSlideAreaMountDelegate.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       b uob = this.d().remove(Integer.valueOf(System.identityHashCode(p0)));
       if (uob == null) {
          return false;
       }
       this.b.j(uob);
       return true;
    }
    public void c(Map p0,View p1,PendantMountInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RightBottomSlideAreaMountDelegate.class, "5")) {
          return;
       }
       a$a.a(this, p0, p1, p2);
       return;
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, RightBottomSlideAreaMountDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
