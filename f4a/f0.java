package f4a.f0;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.Float;

public final class f0	// class@0022a3
{
    public static final f0 a;

    static {
       f0.a = new f0();
    }
    public void f0(){
       super();
    }
    public static final void a(String p0,Object p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f0.class, "2")) {
          return;
       }
       if (!p2.containsKey(p0)) {
          p2.put(p0, p1);
       }
       return;
    }
    public static final void b(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f0.class, "1")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          Uri uri = Uri.parse(p0);
          a.o(uri, "uri");
          Boolean uBoolean = (TextUtils.n(uri.getScheme(), "kwai") && TextUtils.n(uri.getHost(), "servicehalfwebview"))? 1: null;
          if (uBoolean) {
             f0.a("disableJsSetHeight", Boolean.TRUE, p1);
             f0.a("needLoadingView", Boolean.FALSE, p1);
             f0.a("halfDialogFixedHeightRatio", Float.valueOf(0x3f1e353f), p1);
          }
       }
       return;
    }
}
