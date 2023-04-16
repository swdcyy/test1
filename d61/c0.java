package d61.c0;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.File;
import zsd.u;
import java.lang.StringBuilder;
import d61.j;

public final class c0	// class@001f13
{
    public static final c0 a;

    static {
       c0.a = new c0();
    }
    public void c0(){
       super();
    }
    public final Uri a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "resourcePath");
       Uri uri = Uri.parse(this.b(p0));
       a.o(uri, "Uri.parse\(getResourceCdnUrl\(resourcePath\)\)");
       return uri;
    }
    public final String b(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, c0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "resourcePath");
       obj = File.separator;
       a.o(obj, "File.separator");
       p0 = (u.q2(p0, obj, false, 2, null))? "https://static.yximgs.com"+p0: "https://static.yximgs.com"+obj+p0;
       p0 = j.a(p0);
       a.o(p0, "LiveCDNUrlUtils.composeCdnSafeUrl\(originUrl\)");
       return p0;
    }
}
