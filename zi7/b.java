package zi7.b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.HashSet;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import android.content.pm.PackageInfo;

public final class b	// class@00293f
{
    public Context a;
    public final String b;

    public void b(Context p0){
       super();
       this.b = p0.getPackageName();
       this.a = p0;
    }
    public final String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.split("\\.config\\.")[0];
    }
    public final Set b(){
       HashSet obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       ApplicationInfo applicationI = this.a.getPackageManager().getApplicationInfo(this.b, 128);
       if (applicationI != null) {
          applicationI = applicationI.metaData;
          if (applicationI != null) {
             String str = applicationI.getString("shadow.bundletool.com.android.dynamic.apk.fused.modules");
             if (str != null && !str.isEmpty()) {
                Collections.addAll(obj, str.split(",", -1));
                obj.remove("");
             }
          }
       }
       return obj;
    }
    public final String[] c(){
       Object[] objArray = null;
       PackageInfo obj = PatchProxy.apply(objArray, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getPackageManager().getPackageInfo(this.b, 0);
       if (obj != null) {
          objArray = obj.splitNames;
       }
       return objArray;
    }
}
