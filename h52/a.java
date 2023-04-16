package h52.a;
import java.lang.Runnable;
import h52.b;
import java.lang.Object;
import j52.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a implements Runnable	// class@002c47
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       b s = this.b.s;
       if (PatchProxy.applyVoidOneRefs(s, null, a.class, "6")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ENTER_LIVE_MORE_SQUARE";
          u1.C0("", s, 3, uElementPack, null);
       }
       return;
    }
}
