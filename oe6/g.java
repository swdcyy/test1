package oe6.g;
import java.lang.Object;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.tencent.mmkv.MMKV;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class g	// class@002016
{
    public static long a = 0xff;

    public void g(){
       super();
    }
    public static void a(SharedPreferences$Editor p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "1")) {
          return;
       }
       if (g.a < 0) {
          g.a = a.t().b("MMKVSyncOpt", -1);
       }
       if (g.a - 2 < 0) {
          p0.apply();
          return;
       }else if(p0 instanceof MMKV){
          return;
       }else {
          p0.apply();
          return;
       }
    }
    public static boolean b(SharedPreferences$Editor p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (g.a < 0) {
          g.a = a.t().b("MMKVSyncOpt", -1);
       }
       if (g.a - 1 < 0) {
          return p0.commit();
       }else if(p0 instanceof MMKV){
          return true;
       }else {
          return p0.commit();
       }
    }
}
