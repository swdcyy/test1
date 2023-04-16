package cta.b$b;
import dr6.i;
import java.lang.Object;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xn5.a;
import java.util.Objects;
import java.util.Map;
import xn5.a$a;

public final class b$b implements i	// class@0023b0
{

    public void b$b(){
       super();
    }
    public void a(DynamicTabConfig p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "1")) {
          return;
       }
       a.p(p0, "config");
       a.p(p1, "reason");
       a.c.a(p0, p1);
       return;
    }
    public void b(DynamicTabConfig p0){
       Map a;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       String str = "config";
       a.p(p0, str);
       a c = a.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(p0, c, a.class, "6")) {
          a.p(p0, str);
          a = a.a;
          a$a uoa = a.get(p0);
          if (uoa == null) {
             uoa = new a$a(p0);
             a.put(p0, uoa);
          }
          uoa.c(true);
       }
       return;
    }
}
