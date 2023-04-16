package o3c.p;
import qvb.f;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public abstract class p extends f	// class@003883
{

    public void p(){
       super();
    }
    public void h2(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       ExceptionHandler.handleException(a.B, p0);
       return;
    }
}
