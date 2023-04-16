package fh.j;
import fh.i;
import java.lang.Object;
import com.gifshow.kanim.parser.moshi.JsonReader;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jh.e;
import com.gifshow.kanim.parser.moshi.JsonReader$Token;
import com.gifshow.kanim.parser.moshi.JsonReader$a;

public class j implements i	// class@002009
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public Object a(JsonReader p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
       }else if(p0.s() == JsonReader$Token.NUMBER){
          obj = null;
       }else {
          p0.c();
          int i = 2;
          float[] uofloatArray = new float[i];
          int i1 = 0;
          double d = 0;
          JsonReader$Token token = 1;
          while (p0.g()) {
             int i2 = p0.v(i.a);
             if (i2) {
                if (i2 != token) {
                   p0.x();
                   p0.y();
                }else if(p0.s() == JsonReader$Token.BEGIN_ARRAY){
                   p0.a();
                   i2 = 0;
                   while (p0.g()) {
                      if (i2 < i) {
                         int i3 = i2 + 1;
                         uofloatArray[i2] = (float)p0.k();
                         i2 = i3;
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
          obj = new e(d, uofloatArray[i1], uofloatArray[token]);
          p0.f();
       }
       return obj;
    }
}
