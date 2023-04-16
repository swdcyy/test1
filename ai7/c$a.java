package ai7.c$a;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class c$a implements ThreadFactory	// class@0000d1
{

    public void c$a(){
       super();
    }
    public Thread newThread(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Thread(p0, "KwaiPlayerReleasePool");
    }
}
