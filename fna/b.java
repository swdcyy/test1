package fna.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b	// class@002970
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;

    public void b(){
       super();
    }
    public final b a(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uob = new b();
       uob.a = this.a / p0;
       uob.b = this.b / p0;
       uob.c = this.c / p0;
       uob.d = this.d / p0;
       uob.e = this.e / p0;
       uob.f = this.f / p0;
       return uob;
    }
    public final long b(){
       return (((((this.c + this.d) + this.e) + this.f) + this.b) + this.a);
    }
    public final b c(b p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "other");
       obj = new b();
       obj.a = this.a - p0.a;
       obj.b = this.b - p0.b;
       obj.c = this.c - p0.c;
       obj.d = this.d - p0.d;
       obj.e = this.e - p0.e;
       obj.f = this.f - p0.f;
       return obj;
    }
    public final b d(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uob = new b();
       uob.a = this.a * p0;
       uob.b = this.b * p0;
       uob.c = this.c * p0;
       uob.d = this.d * p0;
       uob.e = this.e * p0;
       uob.f = this.f * p0;
       return uob;
    }
}
