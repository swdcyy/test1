package n0d.c;
import com.kwai.video.ksheifdec.KSHeifSoLoader;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import i0d.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i0d.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Exception;

public final class c implements KSHeifSoLoader	// class@001ef7
{
    public final Context a;

    public void c(Context p0){
       this.a = p0;
    }
    public final void loadLibrary(String p0){
       c ta = this.a;
       Object obj = null;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, ta, obj, e.class, str)) {
       }else {
          Object obj1 = PatchProxy.applyOneRefs(ta, obj, a.class, str);
          int i = (obj1 != PatchProxyResult.class)? obj1.intValue(): ta.getPackageManager().getPackageInfo(ta.getPackageName(), 64).versionCode;
       }
       return;
    }
}
