package gz9.c;
import erd.a;
import gz9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements a	// class@002518
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.b.a();
       return;
    }
}
