package me0.b;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mc0.d;
import mc0.c;
import me0.a;
import pd0.d;
import pd0.c;
import df0.a;
import df0.c;
import bg0.a;
import bg0.c;
import kotlin.jvm.internal.a;
import java.util.List;

public final class b	// class@003159
{
    public static final List a;
    public static final b b;

    static {
       b uob = new b();
       b.b = uob;
       b.a = new ArrayList();
       if (PatchProxy.applyVoid(null, null, b.class, "1")) {
       }else if(PatchProxy.applyVoid(null, null, d.class, "1")){
          uob.a(new c());
       }
       if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
          uob.a(new c());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
          uob.a(new c());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
          uob.a(new c());
       }
    }
    public void b(){
       super();
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "debugToolItem");
       b.a.add(p0);
       return;
    }
}
