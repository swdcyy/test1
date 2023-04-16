package fh.g;
import fh.i;
import java.lang.Object;
import com.gifshow.kanim.parser.moshi.JsonReader;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jh.c;
import com.gifshow.kanim.parser.moshi.JsonReader$Token;
import com.gifshow.kanim.parser.moshi.JsonReader$a;

public class g implements i	// class@002006
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public Object a(JsonReader p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
       }else if(p0.s() == JsonReader$Token.NUMBER){
          obj = null;
       }else {
          p0.c();
          float f = 0;
          double d = 0;
          while (p0.g()) {
             int i = p0.v(i.a);
             if (i) {
                if (i != 1) {
                   p0.x();
                   p0.y();
                }else if(p0.s() == JsonReader$Token.BEGIN_ARRAY){
                   p0.a();
                   i = 0;
                   while (p0.g()) {
                      if (i < 1) {
                         f = (float)p0.k();
                         i = i + 1;
                      }else {
                         p0.y();
                         continue ;
                      }
                   }
                   p0.e();
                }
             }else {
                d = (int)p0.k();
             }
          }
          p0.f();
          obj = new c(d, f);
       }
       return obj;
    }
}
