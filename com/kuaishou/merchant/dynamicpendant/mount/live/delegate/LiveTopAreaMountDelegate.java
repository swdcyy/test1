package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveTopAreaMountDelegate;
import i08.a;
import ks5.g;
import lp3.i;
import java.lang.Object;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveTopAreaMountDelegate$tempPendantItems$2;
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
import ks5.j;
import gw3.o;
import java.lang.StringBuilder;
import com.kwaishou.merchant.daccore.mount.anim.DynamicTopRightPendantView;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveTopAreaMountDelegate$a;
import z1.a;
import com.kwaishou.merchant.daccore.mount.anim.BaseTopRightPendantView;
import i08.a$a;

public final class LiveTopAreaMountDelegate implements a	// class@0016a6
{
    public final p a;
    public g b;
    public i c;

    public void LiveTopAreaMountDelegate(g p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(LiveTopAreaMountDelegate$tempPendantItems$2.INSTANCE);
    }
    public boolean a(View p0,PendantMountInfo p1){
       View view;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveTopAreaMountDelegate liveTopAreaM = LiveTopAreaMountDelegate.class;
       Object obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, liveTopAreaM, "2");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       int i = System.identityHashCode(p0);
       PendantUtil$Companion a = PendantUtil.a;
       String str = a.d(obj1, p1.getMaterialId(), true);
       if (this.d().containsKey(Integer.valueOf(i))) {
          f$a.s(f.a, p1.getLiveId(), str, "mount error: this view has mounted", null, null, 24, null);
          return false;
       }else if(p1.getWidth() > 0 || p1.getHeight() > 0){
          view = a.i(obj1, obj2);
       }else {
          view = obj1;
       }
       a.g(view, obj2);
       o oo = PatchProxy.applyTwoRefs(view, obj2, obj, liveTopAreaM, "4");
       if (oo != patchProxyRe) {
       }else {
          oo = new o(view, obj2);
       }
       f$a.t(f.a, p1.getLiveId(), str, "mountParams bizType:"+p1.getBizType(), null, false, false, 56, null);
       if (obj1 instanceof DynamicTopRightPendantView) {
          obj1.setEnterAnimatorQueueConsumer(new LiveTopAreaMountDelegate$a(obj, oo));
       }
       obj.b.b(oo);
       this.d().put(Integer.valueOf(i), oo);
       return true;
    }
    public boolean b(View p0,PendantMountInfo p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, LiveTopAreaMountDelegate.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       j oj = this.d().remove(Integer.valueOf(System.identityHashCode(p0)));
       if (oj == null) {
          return false;
       }
       this.b.a(oj);
       return true;
    }
    public void c(Map p0,View p1,PendantMountInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveTopAreaMountDelegate.class, "5")) {
          return;
       }
       a$a.a(this, p0, p1, p2);
       return;
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, LiveTopAreaMountDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
