package d61.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w51.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.Number;
import xf6.l;

public class f	// class@001f1a
{

    public void f(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = a.g();
       boolean b = false;
       if (!i) {
          return a.t().u("SOURCE_LIVE").d("enableLongConnectRegisterListenerOpt", b);
       }
       if (i == 1) {
          b = true;
       }
       return b;
    }
    public static String b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p1)) {
          p0 = p0+"##"+p1;
       }
       return p0;
    }
    public static boolean c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, f.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "107");
       boolean b = false;
       int i = (obj != patchProxyRe)? obj.intValue(): l.e("keyLimitLongConnectionThreadCnt", b);
       if (!i) {
          return true;
       }else if(i == 1){
          b = true;
       }
       return b;
    }
}
