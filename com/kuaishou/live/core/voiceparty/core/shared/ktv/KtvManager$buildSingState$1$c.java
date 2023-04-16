package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1$c;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$NextMineMusicOrder;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import ut7.i$a;
import ut7.h;
import ut7.i$b;

public final class KtvManager$buildSingState$1$c implements o	// class@00141a
{
    public static final KtvManager$buildSingState$1$c a;

    static {
       KtvManager$buildSingState$1$c.a = new KtvManager$buildSingState$1$c();
    }
    public void KtvManager$buildSingState$1$c(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, KtvManager$buildSingState$1$c.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "context");
          if (a.g(p0.a().musicOrderId, p1.b().musicOrderId) ^ 1) {
             p1.o(1);
             uoa = new i$a(p0.a(), h.b);
          }else {
             uoa = new i$b();
          }
       }
       return uoa;
    }
}
