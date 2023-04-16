package nj0.x;
import zj0.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import nj0.x$a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;

public final class x extends v	// class@003346
{

    public void x(){
       super();
    }
    public void d(long p0){
       if (PatchProxy.isSupport(x.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, x.class, "1")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new x$a(this));
       return;
    }
}
