package jgd.i;
import wgc.n;
import java.lang.Object;
import sgd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class i implements n	// class@0016e5
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, null, c.class, "4")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.params = i3.f().e();
          uElementPack.action2 = "BLOCK_KEYWORDS_BUTTON";
          u1.u0(3, uElementPack, null);
       }
       return;
    }
}
