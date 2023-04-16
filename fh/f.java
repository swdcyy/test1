package fh.f;
import java.lang.Object;
import com.gifshow.kanim.parser.moshi.JsonReader;
import fh.i;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fh.c;
import java.util.ArrayList;
import com.gifshow.kanim.parser.moshi.JsonReader$Token;
import com.gifshow.kanim.parser.moshi.JsonReader$a;

public class f	// class@002005
{

    public void f(){
       super();
    }
    public static List a(JsonReader p0,i p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       ArrayList obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, f.class, "5");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, c.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = new ArrayList();
          if (p0.s() != JsonReader$Token.STRING) {
             p0.c();
             while (p0.g()) {
                if (p0.v(c.a)) {
                   p0.y();
                }else if(p0.s() == JsonReader$Token.BEGIN_ARRAY){
                   p0.a();
                   while (p0.g()) {
                      Object obj2 = p1.a(p0);
                      if (obj2 != null) {
                         obj1.add(obj2);
                      }else {
                         p0.y();
                         continue ;
                      }
                   }
                   p0.e();
                }
             }
             p0.f();
          }
       }
       return obj1;
    }
}
