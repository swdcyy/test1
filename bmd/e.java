package bmd.e;
import java.lang.Object;
import k2b.e0;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class e	// class@000282
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void a(e0 p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p1;
       if (!TextUtils.x(p2)) {
          uElementPack.params = p2;
       }
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setLogPage(p0);
       uClickMetaDa.setElementPackage(uElementPack);
       u1.B(uClickMetaDa);
       return;
    }
}
