package ho2.l;
import android.net.Uri;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class l	// class@002de9
{

    public static final Uri a(Uri p0,File p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = l.class;
       String obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ol, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(p0, "$this$absoluteUri");
       a.p(p1, "dir");
       Object obj2 = PatchProxy.applyOneRefs(p0, obj, ol, "1");
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          String scheme = p0.getScheme();
          b = (a.g("https", scheme) || a.g("http", scheme))? true: false;
       }
       if (!b) {
          if (l.b(p0)) {
             obj = p0.getPath();
             if (obj != null) {
                p0 = Uri.fromFile(new File(p1, obj));
                a.o(p0, "Uri.fromFile\(File\(dir, p¡­n\'t have path [$this]\"\)\)\)");
             }else {
                throw new IllegalArgumentException("file url don\'t have path ["+p0+']');
             }
          }else {
             throw new IllegalArgumentException("unsupported url: ["+p0+']');
          }
       }
       return p0;
    }
    public static final boolean b(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isLocalFileUri");
       return a.g("file", p0.getScheme());
    }
}
