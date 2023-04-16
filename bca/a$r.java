package bca.a$r;
import erd.f;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$r implements f	// class@00045b
{
    public final b a;

    public void a$r(b p0){
       this.a = p0;
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, a$r.class, "1")) {
          return;
       }
       this.a.dispose();
       return;
    }
}
