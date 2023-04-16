package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$j;
import erd.g;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$c;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$ConfigUpdated;
import ut7.e;

public final class LiveBaseLongConnectionManager$j implements g	// class@000a1c
{
    public final LiveBaseLongConnectionManager b;

    public void LiveBaseLongConnectionManager$j(LiveBaseLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager$j.class, "1")) {
       }else {
          p0.a = true;
          this.b.M1(new LiveBaseLongConnectionManager$ConfigUpdated());
       }
       return;
    }
}
