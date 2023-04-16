package bca.a$d;
import erd.f;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$d implements f	// class@00044d
{
    public final b a;

    public void a$d(b p0){
       this.a = p0;
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "1")) {
          return;
       }
       this.a.dispose();
       return;
    }
}
