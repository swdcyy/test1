package kv8.e;
import android.app.Activity;
import java.lang.String;
import ev8.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import kv8.f;
import kv8.g;
import kv8.d;
import kv8.c;

public class e	// class@002c24
{

    public static a a(Activity p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0xaba96a4a:
             if (p1.equals("alipay")) {
                i = 0;
             }
             break;
           case 0xbd19c7f9:
             if (p1.equals("kscoin")) {
                i = 1;
             }
             break;
           case 0xd0ce8b26:
             if (p1.equals("wechat")) {
                i = 2;
             }
             break;
           case 0xdc1b3738:
             if (p1.equals("union_pay")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return new c(p0);
           case 1:
             return new d(p0);
           case 2:
             return new g(p0);
           case 3:
             return new f(p0);
           default:
             return null;
       }
    }
}
