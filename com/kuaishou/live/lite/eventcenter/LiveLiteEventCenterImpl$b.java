package com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl$b;
import erd.g;
import com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import xp5.g;
import wa3.b;

public final class LiveLiteEventCenterImpl$b implements g	// class@0008f0
{
    public final LiveLiteEventCenterImpl b;

    public void LiveLiteEventCenterImpl$b(LiveLiteEventCenterImpl p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEventCenterImpl$b.class, "1")) {
       }else if(p0.d == null){
          n a = p0.a;
          a.o(a, "event.targetUser");
          if ((a.getId()).equals(this.b.k.d()) && p0.c != null) {
             this.b.K1(new b());
          }
       }
       return;
    }
}
