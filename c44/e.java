package c44.e;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class e	// class@0004b1
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void a(ClientContent$LiveStreamPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FLOATING_BUBBLE";
       i3 oi3 = i3.f();
       oi3.d("text", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
       return;
    }
    public final void b(ClientContent$LiveStreamPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FLOATING_BUBBLE";
       i3 oi3 = i3.f();
       oi3.d("text", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack));
       return;
    }
}
