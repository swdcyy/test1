package f3b.b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ukd.a;
import java.lang.Integer;

public class b	// class@00287e
{

    public void b(){
       super();
    }
    public static int a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return a.d(p0, "mIdent").intValue();
       }catch(java.lang.Exception e0){
          return p0.hashCode();
       }
    }
}
