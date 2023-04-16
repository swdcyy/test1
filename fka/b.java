package fka.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.lang.Thread;
import java.lang.StackTraceElement;
import lnc.i3;
import k2b.u1;

public class b	// class@00295e
{

    public void b(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          String[] stringArray = p0.split(",");
          if (stringArray.length > 0) {
             return stringArray[(stringArray.length - 1)];
          }
       }
       return null;
    }
    public static void b(String p0,String p1,String p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "1")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       StringBuilder obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uob, "2");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else {
          obj1 = "";
          int i = 0;
          if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
             String obj2 = PatchProxy.applyTwoRefs(p0, p1, obj, uob, "3");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                String str = b.a(p0);
                obj2 = b.a(p1);
                b = (!TextUtils.x(str) && str.equals(obj2))? true: false;
             }
             if (b) {
             label_007a :
                i3 oi3 = i3.f();
                oi3.d("old", p0);
                oi3.d("new", p1);
                oi3.d("path", p2);
                oi3.a("equals", Boolean.valueOf(TextUtils.n(p0, p1)));
                oi3.d("trace", obj);
                u1.R("follow_refer_stack_check", oi3.e(), 13);
                return;
             }
          }
       label_005a :
          StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
          int len = stackTrace.length;
          for (; i < len; i = i + 1) {
             obj1 = obj1+stackTrace[i].toString()+10;
          }
          obj = obj1;
          goto label_007a ;
       }
    }
}
