package gl9.e;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import u0.d;
import ukd.a;
import java.lang.Integer;

public class e	// class@0024c5
{

    public void e(){
       super();
    }
    public static int a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       try{
          if (p0 instanceof d) {
             return p0.c();
          }
          Object[] objArray = new Object[i];
          Integer integer = a.a(p0, "getThemeResId", objArray);
          if (integer != null) {
             return integer.intValue();
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}
