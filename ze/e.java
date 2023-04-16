package ze.e;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.bridge.ReactContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;

public abstract class e extends a$a	// class@0031f6
{
    public final ReactContext c;

    public void e(ReactContext p0){
       super();
       this.c = p0;
    }
    public final void a(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "1")) {
          return;
       }
       try{
          this.c(p0);
       }catch(java.lang.RuntimeException e4){
          this.c.handleException(e4);
       }
       return;
    }
    public abstract void c(long p0);
}
