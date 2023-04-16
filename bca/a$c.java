package bca.a$c;
import erd.f;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$c implements f	// class@00044c
{
    public final b a;

    public void a$c(b p0){
       this.a = p0;
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       this.a.dispose();
       return;
    }
}
