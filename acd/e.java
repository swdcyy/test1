package acd.e;
import java.lang.Object;
import k2b.e0;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sy5.a;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import fbd.j;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;

public class e	// class@0000cf
{

    public void e(){
       super();
    }
    public static void a(e0 p0,String p1,String p2,String p3,boolean p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoe, "1")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AREA";
       if (p4) {
          uElementPack.params = (TextUtils.x(p2))? a.k().e("list_id", p3).i(): a.k().d(p2, a.k().e("list_id", p3).j()).i();
       }else {
          uElementPack.params = a.k().i();
       }
       ClientEvent$AreaPackage uAreaPackage = j.a(p1);
       if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(3), uElementPack, uAreaPackage, null, j.class, "8")) {
          j.l(p0, 3, uElementPack, uAreaPackage, null);
       }
       return;
    }
}
