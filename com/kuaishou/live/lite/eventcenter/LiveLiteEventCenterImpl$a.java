package com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl$a;
import erd.g;
import com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wa3.a;

public final class LiveLiteEventCenterImpl$a implements g	// class@0008ef
{
    public final LiveLiteEventCenterImpl b;

    public void LiveLiteEventCenterImpl$a(LiveLiteEventCenterImpl p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEventCenterImpl$a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.e == null && p0.f == null) {
             int i = p0.g + 1;
             p0.g = i;
             p0.K1(new a(i));
          }
       }
       return;
    }
}
