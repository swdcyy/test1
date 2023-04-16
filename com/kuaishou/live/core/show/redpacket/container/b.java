package com.kuaishou.live.core.show.redpacket.container.b;
import vq5.d;
import com.kuaishou.live.core.show.redpacket.container.b$a;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.container.a;
import java.lang.String;
import vq5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b	// class@000e6e
{
    public final d a;
    public final b$a b;
    public boolean c;
    public String d;
    public int e;
    public int f;
    public long g;
    public b h;

    public void b(d p0,b$a p1,long p2){
       super();
       this.e = 0;
       this.f = -1;
       this.g = 0x1d4c0;
       this.a = p0;
       this.b = p1;
       if (p2 > 0) {
          this.g = p2;
       }
       p0.t5("autoopenleeedialog", new a(this));
       return;
    }
    public final void a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "4")) {
          return;
       }
       b.c0(LiveLogTag.RED_PACKET, "reset local red packet type", "is timeout", Boolean.valueOf(p0));
       this.c = false;
       this.d = null;
       this.e = 0;
       this.f = -1;
       return;
    }
}
