package com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ClientProgressSync;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ClientProgressSync$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import usd.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;

public final class ClientProgressSync	// class@0019bf
{
    public ProgressSource a;
    public long b;
    public final long c;
    public final long d;
    public final ClientProgressSync$a e;
    public final long f;
    public final long g;

    public void ClientProgressSync(ClientProgressSync$a p0,long p1,long p2,long p3,long p4){
       a.p(p0, "syncHandler");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p4;
       this.c = q.v(p2, (p1 / (long)2));
       this.d = p1 + p3;
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, ClientProgressSync.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return SystemClock.uptimeMillis();
    }
}
