package p0d.e;
import e0d.d$c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import c97.d;
import r97.a0;
import p0d.d;
import r97.p;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import com.yxcorp.image.common.log.Log;

public class e implements d$c	// class@00214e
{
    public static final String a = "e";
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       try{
          d.a().g().H(new d(p0));
       }catch(java.lang.IllegalStateException e3){
          Log.b(e.a, "initialize and invoke Azeroth.get\(\).setLogger\(\) first!!", e3.getCause());
       }
       return;
    }
}
