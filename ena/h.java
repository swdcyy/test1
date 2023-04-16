package ena.h;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.lang.Float;
import q2b.h$b;

public final class h	// class@00277c
{

    public static final void a(Activity p0,ClientEvent$ElementPackage p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, h.class, "9")) {
          return;
       }
       if (!p0 instanceof e0) {
          p0 = obj;
       }
       u1.M("", p0, 1, p1, null, null);
       return;
    }
    public static final void b(Activity p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oh, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SCAN";
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("auto", Integer.valueOf(p1));
       uElementPack.params = jsonObject.toString();
       h.a(p0, uElementPack);
       return;
    }
    public static void c(Activity p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       h.b(p0, p1);
       return;
    }
    public static final void d(Activity p0,boolean p1,boolean p2,float p3,float p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oh, "7")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SCAN_FINISH_NO_CLEAN";
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("is_back", Integer.valueOf(p1));
       jsonObject.a0("is_rescan", Integer.valueOf(p2));
       jsonObject.a0("scan_total_size", Float.valueOf(p3));
       jsonObject.a0("last_scan_total_size", Float.valueOf(p4));
       uElementPack.params = jsonObject.toString();
       h$b uob = h$b.d(0, 0);
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
}
