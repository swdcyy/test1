package aic.e$b;
import erd.g;
import aic.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e$b implements g	// class@00012b
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
       }else {
          this.b.c();
       }
       return;
    }
}
