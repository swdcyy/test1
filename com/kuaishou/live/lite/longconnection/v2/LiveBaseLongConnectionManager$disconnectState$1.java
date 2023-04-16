package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$disconnectState$1;
import ut7.c;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.String;
import ut7.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import crd.b;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$Login;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$disconnectState$1$handleLogin$1;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$disconnectState$1$handleLogin$2;
import msd.l;

public final class LiveBaseLongConnectionManager$disconnectState$1 extends c	// class@000a16
{
    public b f;
    public final LiveBaseLongConnectionManager g;

    public void LiveBaseLongConnectionManager$disconnectState$1(LiveBaseLongConnectionManager p0,String p1){
       this.g = p0;
       super(p1);
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager$disconnectState$1.class, "1")) {
          return;
       }
       a.p(p0, "reason");
       LiveBaseLongConnectionManager$disconnectState$1 tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       this.f = null;
       return;
    }
    public final boolean h(LiveBaseLongConnectionManager$Login p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBaseLongConnectionManager$disconnectState$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       LiveBaseLongConnectionManager$disconnectState$1 tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       this.f = this.g.C1(LiveBaseLongConnectionManager$disconnectState$1$handleLogin$1.INSTANCE, LiveBaseLongConnectionManager$disconnectState$1$handleLogin$2.INSTANCE);
       return true;
    }
}
