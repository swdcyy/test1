package gu1.f;
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
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public final class f implements Runnable	// class@002584
{
    public final boolean b;
    public final boolean c;
    public final c d;
    public final LivePkMessages$PkPlayerState[] e;
    public final ClientContent$LiveStreamPackage f;
    public final long g;
    public final e0 h;

    public void f(boolean p0,boolean p1,c p2,LivePkMessages$PkPlayerState[] p3,ClientContent$LiveStreamPackage p4,long p5,e0 p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       u1.B0(new ShowMetaData().setElementPackage(a.h(this.d, a.k(this.b, this.c))).setContentPackage(a.e(this.e, this.f, this.g)).setLogPage(this.h));
       return;
    }
}
