package e3a.a;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.content.ContextWrapper;

public final class a	// class@00205f
{

    public void a(){
       super();
    }
    public static Activity a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(p0.getContext());
    }
    public static Activity b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       while (true) {
          if (!p0 instanceof ContextWrapper) {
             return null;
          }
          if (p0 instanceof Activity) {
             break ;
          }else {
             p0 = p0.getBaseContext();
          }
       }
       return p0;
    }
}
