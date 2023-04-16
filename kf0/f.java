package kf0.f;
import kf0.f$c;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import crd.b;
import lnc.b9;

public final class f	// class@002d0d
{
    public final Map a;
    public final String b;
    public static final f$c c;

    static {
       f.c = new f$c(null);
    }
    public void f(String p0){
       a.p(p0, "mReason");
       super();
       this.b = p0;
       this.a = new HashMap();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       Iterator iterator = this.a.keySet().iterator();
       while (iterator.hasNext()) {
          b9.a(this.a.get(iterator.next()));
       }
       this.a.clear();
       return;
    }
}
