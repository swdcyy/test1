package god.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import k2b.e0;
import bod.d;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditOperationPackage;
import nuc.a;

public final class b	// class@000f56
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       String str = (p0)? "fold": "expand";
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MORE_TEXT_TEMPLATE";
       uElementPack.params = "style_type: "+str;
       u1.u(1, uElementPack, null);
       return;
    }
    public final void b(e0 p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       a.p(p0, "page");
       a.p(p1, "item");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RECORD_VIDEO_EDIT_OPERATION";
       uElementPack.name = "select_text";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$VideoEditOperationPackage videoEditOpe = new ClientContent$VideoEditOperationPackage();
       videoEditOpe.type = 10;
       videoEditOpe.subType = "EDIT_HIGH_TEXT";
       videoEditOpe.name = p1.k().r();
       uContentPack.videoEditOperationPackage = videoEditOpe;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
}
