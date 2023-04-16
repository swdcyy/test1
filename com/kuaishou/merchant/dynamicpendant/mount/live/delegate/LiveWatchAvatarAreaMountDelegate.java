package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveWatchAvatarAreaMountDelegate;
import i08.a;
import yq5.c;
import java.lang.Object;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveWatchAvatarAreaMountDelegate$tempPendantItems$2;
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
import yq5.b;
import gw3.q;
import i08.a$a;

public final class LiveWatchAvatarAreaMountDelegate implements a	// class@0016a8
{
    public final p a;
    public c b;

    public void LiveWatchAvatarAreaMountDelegate(c p0){
       super();
       this.b = p0;
       this.a = s.c(LiveWatchAvatarAreaMountDelegate$tempPendantItems$2.INSTANCE);
    }
    public boolean a(View p0,PendantMountInfo p1){
       Object obj = this;
       View obj1 = p0;
       Object obj2 = p1;
       LiveWatchAvatarAreaMountDelegate liveWatchAva = LiveWatchAvatarAreaMountDelegate.class;
       Object obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, liveWatchAva, "2");
       if (obj3 != PatchProxyResult.class) {
          return obj3.booleanValue();
       }
       int i = System.identityHashCode(p0);
       PendantUtil$Companion a = PendantUtil.a;
       String str = a.d(obj1, p1.getMaterialId(), true);
       if (this.d().containsKey(Integer.valueOf(i))) {
          f$a.s(f.a, p1.getLiveId(), str, "mount error: this view has mounted", null, null, 24, null);
          return false;
       }else {
          obj1 = a.i(obj1, obj2);
          a.g(obj1, obj2);
          q oq = PatchProxy.applyTwoRefs(obj1, obj2, obj, liveWatchAva, "4");
          if (oq != PatchProxyResult.class) {
          }else {
             oq = new q(obj2, obj1);
          }
          obj.b.b(oq);
          this.d().put(Integer.valueOf(i), oq);
          return true;
       }
    }
    public boolean b(View p0,PendantMountInfo p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, LiveWatchAvatarAreaMountDelegate.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       b uob = this.d().remove(Integer.valueOf(System.identityHashCode(p0)));
       if (uob == null) {
          return false;
       }
       this.b.c(uob);
       return true;
    }
    public void c(Map p0,View p1,PendantMountInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveWatchAvatarAreaMountDelegate.class, "5")) {
          return;
       }
       a$a.a(this, p0, p1, p2);
       return;
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, LiveWatchAvatarAreaMountDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
