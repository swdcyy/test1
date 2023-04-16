package iq8.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Throwable;
import zp8.a;

public class l	// class@002715
{

    public void l(){
       super();
    }
    public static float a(String p0,float p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, ol, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       try{
          return Float.parseFloat(p0);
       }catch(java.lang.Exception e4){
          a.h("SafeString2Num", a.e(e4));
          return p1;
       }
    }
}
