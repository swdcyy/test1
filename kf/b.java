package kf.b;
import java.lang.Object;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class b	// class@0024af
{

    public void b(){
       super();
    }
    public static int a(ReadableArray p0,float[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int len = (p0.size() > p1.length)? p1.length: p0.size();
       for (int i = 0; i < len; i = i + 1) {
          p1[i] = (float)p0.getDouble(i);
       }
       return p0.size();
    }
    public static float[] b(ReadableArray p0){
       float[] obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new float[p0.size()];
       b.a(p0, obj);
       return obj;
    }
}
