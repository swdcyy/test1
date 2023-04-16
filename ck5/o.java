package ck5.o;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.core.EmotionResourceProcessor;
import java.util.concurrent.atomic.AtomicInteger;
import ek5.a;

public final class o implements g	// class@0006e2
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          p0 = EmotionResourceProcessor.f;
          a.a(false, p0.toString(), true, p0.c().getAndIncrement(), p0.b());
       }
       return;
    }
}
