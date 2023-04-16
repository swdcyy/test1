package gu1.e;
import java.lang.Runnable;
import st1.c;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkPlayerState;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import gu1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class e implements Runnable	// class@002583
{
    public final boolean b;
    public final boolean c;
    public final c d;
    public final LivePkMessages$PkPlayerState[] e;
    public final ClientContent$LiveStreamPackage f;
    public final e0 g;

    public void e(boolean p0,boolean p1,c p2,LivePkMessages$PkPlayerState[] p3,ClientContent$LiveStreamPackage p4,e0 p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       u1.L("", this.g, 1, a.h(this.d, a.k(this.b, this.c)), a.e(this.e, this.f, 0));
       return;
    }
}
