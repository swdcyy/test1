package bpa.c;
import ay7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.Yoda;
import ny7.a;

public final class c	// class@00041c
{

    public static final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "2")) {
          return;
       }
       Yoda.get().registerFunction(p0.d(), p0.c(), p0);
       return;
    }
}
