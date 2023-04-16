package ck5.p;
import erd.g;
import java.lang.Object;
import bk5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Collection;
import com.kwai.emotionsdk.core.EmotionResourceProcessor;
import java.util.concurrent.atomic.AtomicInteger;
import ek5.a;

public final class p implements g	// class@0006e3
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          p0 = EmotionResourceProcessor.f;
          a.a(true, "", (p0.a().isEmpty() ^ 0x01), p0.c().getAndIncrement(), p0.b());
       }
       return;
    }
}
