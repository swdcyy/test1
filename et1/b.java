package et1.b;
import java.lang.Runnable;
import st1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map;
import st1.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class b implements Runnable	// class@0021f1
{
    public final boolean b;
    public final c c;
    public final ClientContent$LiveStreamPackage d;
    public final e0 e;

    public void b(boolean p0,c p1,ClientContent$LiveStreamPackage p2,e0 p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_PK_TOP_SCORE_USER_CLICK";
       int i = 2;
       int i1 = (this.b != null)? 1: 2;
       uElementPack.type = i1;
       uElementPack.params = e.j(this.c, objArray, i, objArray);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.d;
       u1.B(new ClickMetaData().setLogPage(this.e).setElementPackage(uElementPack).setContentPackage(uContentPack));
       return;
    }
}
