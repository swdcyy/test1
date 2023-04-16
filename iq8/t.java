package iq8.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public class t	// class@002720
{

    public void t(){
       super();
    }
    public static boolean a(float p0,float p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), null, ot, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (Float.isNaN(p0) || Float.isNaN(p1)) {
          if (!Float.isNaN(p0) || !Float.isNaN(p1)) {
             b = false;
          }
          return b;
       }else if(Math.abs((p1 - p0)) - 0x3727c5ac < 0){
          b = false;
       }
       return b;
    }
}
