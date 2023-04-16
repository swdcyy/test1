package cra.d;
import cra.e;
import java.lang.Object;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class d implements e	// class@00237c
{
    public final boolean a;

    public void d(boolean p0){
       super();
       this.a = p0;
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "elseBlock");
       p0.invoke(Boolean.valueOf(this.a));
       return;
    }
}
