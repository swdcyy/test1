package ai5.j;
import zjd.d;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Application;
import o56.a;

public class j implements d	// class@0000ae
{

    public void j(){
       super();
    }
    public Activity c(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActivityContext.g().e();
    }
    public Application getApplication(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b();
    }
}
