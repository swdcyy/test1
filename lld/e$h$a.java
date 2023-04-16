package lld.e$h$a;
import erd.f;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e$h$a implements f	// class@001c50
{
    public final b a;

    public void e$h$a(b p0){
       this.a = p0;
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, e$h$a.class, "1")) {
          return;
       }
       this.a.dispose();
       return;
    }
}
