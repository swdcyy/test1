package et1.a;
import java.lang.Runnable;
import st1.c;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import st1.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import k2b.u1;

public final class a implements Runnable	// class@0021f0
{
    public final c b;
    public final String c;
    public final ClientContent$LiveStreamPackage d;
    public final boolean e;
    public final e0 f;

    public void a(c p0,String p1,ClientContent$LiveStreamPackage p2,boolean p3,e0 p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = "MULTI_HIT_TIME";
       uElementPack.action2 = str;
       uElementPack.params = e.i(this.b, ImmutableMap.of("crit_moment_id", this.c));
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.d;
       int i = (this.e != null)? 1: 10;
       h$b uob = h$b.e(i, str);
       uob.k(uElementPack);
       uob.h(uContentPack);
       u1.p0("", this.f, uob);
       return;
    }
}
