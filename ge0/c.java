package ge0.c;
import java.lang.Object;
import tx4.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import ce0.b;
import q87.c;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import ge0.e;

public class c	// class@0024a9
{

    public void c(){
       super();
    }
    public static int a(w p0){
       int i = (p0 == null)? -1: p0.d;
       return i;
    }
    public static boolean b(boolean p0){
       Object[] obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int a = PendantCoreConfig.a;
       int i = 0;
       if (a == 3) {
          obj = new Object[i];
          b.C().t("TkUtils", "isTkAvailable force close !", obj);
          return i;
       }else if(p0 || a == 2){
          p0 = true;
       }else {
          p0 = false;
       }
       Object[] objArray = new Object[i];
       b.C().t("TkUtils", "isOnlyTk = "+p0+" value = "+PendantCoreConfig.a, objArray);
       return p0;
    }
    public static boolean c(String p0){
       boolean b;
       Object[] obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (PendantCoreConfig.a == 3) {
          obj = new Object[i];
          b.C().t("TkUtils", "isTkAvailable force close !", obj);
          return i;
       }else if(TextUtils.isEmpty(p0)){
          obj = new Object[i];
          b.C().t("TkUtils", "isTkAvailable  id is empty ", obj);
          return i;
       }else {
          b = true;
          if (!b.a(-222275752).d(p0)) {
             int a = PendantCoreConfig.a;
             if (a != b && a != 2) {
                b = false;
             }
          }
          Object[] objArray = new Object[i];
          b.C().s("TkUtils", "isTkAvailable = "+b+" value = "+PendantCoreConfig.a, objArray);
          return b;
       }
    }
}
