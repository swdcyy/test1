package et1.d;
import java.lang.Runnable;
import st1.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map;
import st1.e;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import qrd.l1;
import k2b.u1;

public final class d implements Runnable	// class@0021f3
{
    public final c b;
    public final e0 c;
    public final ClientContent$LiveStreamPackage d;

    public void d(c p0,e0 p1,ClientContent$LiveStreamPackage p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_CHAT_PROGRESS_CARD";
       uElementPack.params = e.j(this.b, objArray, 2, objArray);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.d;
       u1.B0(new ShowMetaData().setLogPage(this.c).setType(9).setElementPackage(uElementPack).setContentPackage(uContentPack));
       return;
    }
}
