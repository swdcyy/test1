package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$longConnection$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import hf3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ac3.j;
import ac3.i;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import ac3.c;
import lf3.g;
import i51.o;
import ac3.d;
import i51.g;

public final class LiveBaseLongConnectionManager$longConnection$2 extends Lambda implements a	// class@000a20
{
    public final LiveBaseLongConnectionManager this$0;

    public void LiveBaseLongConnectionManager$longConnection$2(LiveBaseLongConnectionManager p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       a obj = PatchProxy.apply(null, this, LiveBaseLongConnectionManager$longConnection$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.y1().a(this.this$0.p);
       LiveBaseLongConnectionManager$longConnection$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(obj, tthis$0, LiveBaseLongConnectionManager.class, "9")) {
          obj.u0(300, LiveStreamMessages$SCEnterRoomAck.class, new c(tthis$0));
          tthis$0.o = new o(obj, new d(tthis$0), false);
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
