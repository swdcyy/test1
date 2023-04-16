package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$b;
import erd.g;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$LiveOverRoomHighValueFrequencyConfig;
import kx0.a;

public final class a$b implements g	// class@000a59
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a k = this.b.k;
          p0 = p0.mLiveOverRoomHighValueFrequencyConfig;
          p0 = (p0 != null)? p0.mMaxShowOverRoomCountPerRoom: 10;
          k.d = p0;
       }
       return;
    }
}
