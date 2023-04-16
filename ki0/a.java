package ki0.a;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.ref.ReferenceQueue;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.Reference;

public final class a extends WeakReference	// class@002d3b
{
    public long a;
    public final String b;
    public final Map c;
    public final long d;

    public void a(Object p0,String p1,Map p2,long p3,ReferenceQueue p4){
       a.p(p0, "referent");
       a.p(p1, "key");
       a.p(p2, "description");
       a.p(p4, "referenceQueue");
       super(p0, p4);
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.a = -1;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.clear();
       this.a = -1;
       return;
    }
}
