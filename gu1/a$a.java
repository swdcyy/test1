package gu1.a$a;
import java.lang.Runnable;
import java.lang.String;
import st1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import msd.p;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map;
import st1.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import qrd.l1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class a$a implements Runnable	// class@00257d
{
    public final String b;
    public final c c;
    public final ClientContent$LiveStreamPackage d;
    public final String e;
    public final p f;
    public final e0 g;

    public void a$a(String p0,c p1,ClientContent$LiveStreamPackage p2,String p3,p p4,e0 p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = this.b;
       uElementPack.params = e.j(this.c, objArray, 2, objArray);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.d;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = this.e;
       uContentPack.userPackage = userPackage;
       a$a tf = this.f;
       if (tf != null) {
          l1 ol1 = tf.invoke(uElementPack, uContentPack);
       }
       u1.B(new ClickMetaData().setElementPackage(uElementPack).setContentPackage(uContentPack).setLogPage(this.g));
       return;
    }
}
