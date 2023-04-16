package ck5.i$a;
import erd.g;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import ok5.a;
import com.kwai.emotionsdk.core.j;

public final class i$a implements g	// class@0006d7
{
    public static final i$a b;

    static {
       i$a.b = new i$a();
    }
    public void i$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          Thread thread = Thread.currentThread();
          a.o(thread, "Thread.currentThread\(\)");
          a.a("EmotionDataProcessor", "loadData - 11 doOnNext "+thread.getName());
          j.e().i();
          j.e().k(p0);
       }
       return;
    }
}
