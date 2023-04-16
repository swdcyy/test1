package bb3.b;
import xc3.l;
import bb3.e;
import java.lang.Object;
import xc3.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import mrd.a;

public final class b implements l	// class@00035b
{
    public final e a;

    public void b(e p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       k.a(this, p0);
    }
    public void b(float p0){
       k.b(this, p0);
    }
    public void c(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.a().onNext(Float.valueOf(p0));
       return;
    }
    public void d(float p0){
       k.d(this, p0);
    }
}
