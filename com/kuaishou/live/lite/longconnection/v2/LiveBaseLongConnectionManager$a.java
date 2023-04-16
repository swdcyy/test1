package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$a;
import erd.g;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$Login;
import ut7.e;

public final class LiveBaseLongConnectionManager$a implements g	// class@000a08
{
    public final LiveBaseLongConnectionManager b;

    public void LiveBaseLongConnectionManager$a(LiveBaseLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager$a.class, "1")) {
       }else {
          this.b.M1(new LiveBaseLongConnectionManager$Login());
       }
       return;
    }
}
