package iq8.w;
import tx4.x;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import iq8.d;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.Throwable;
import zp8.a;
import java.lang.Number;
import com.tachikoma.core.utility.f;

public class w extends x	// class@002724
{

    public void w(){
       super();
    }
    public static String c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       p1 = p1.concat(x.a(p0, "bundle://"));
       if (d.a(p1)) {
          return p1;
       }
       a.g("showBundleImage", new Exception(p0+" not exist"));
       return null;
    }
    public static int d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return 0;
       }
       if (p0.startsWith("asset://")) {
          return f.a(x.b(p0), "drawable", null);
       }
       return f.a(p0, "drawable", null);
    }
    public static String e(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, w.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       obj = x.a(p0, "file://");
       if (d.a(obj)) {
          return obj;
       }
       a.g("showFileImage", new Exception(p0+" not exist"));
       return null;
    }
}
