package wh5.b;
import java.lang.Object;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wh5.d;
import java.lang.Boolean;
import java.util.Map;
import o56.c;
import o56.a;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.RuntimeException;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class b	// class@00275a
{

    public void b(){
       super();
    }
    public static TeenageModeConfig a(){
       Object obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b("teenageModeConfig", TeenageModeConfig.class);
    }
    public static void b(TeenageModeConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       d.e("teenageModeConfig", p0);
       return;
    }
    public static void c(boolean p0){
       Map b;
       Object obj1;
       String str;
       SharedPreferences$Editor uEditor;
       d uod = d.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uob, "3")) {
          return;
       }
       TeenageModeConfig teenageModeC = TeenageModeConfig.class;
       Map obj = PatchProxy.applyTwoRefs("teenageModeConfig", teenageModeC, null, uod, "4");
       if (obj == PatchProxyResult.class) {
          obj = d.b;
          if (obj.get(d.f("teenageModeConfig")) == null) {
             obj.put(d.f("teenageModeConfig"), d.c("teenageModeConfig", teenageModeC));
          }
          try{
             obj = obj.get(d.f("teenageModeConfig"));
          }catch(java.lang.Exception e1){
             if (!a.a().c()) {
                Log.e("ChildLockConfigPref", "unLoginSet sCacheMap.get convert error", e1);
                obj = null;
             }else {
                throw e1;
             }
          }
       }
    }
}
