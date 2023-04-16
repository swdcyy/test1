package bdc.g;
import erd.g;
import bdc.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bdc.b;
import bdc.c;

public final class g implements g	// class@000457
{
    public final h b;

    public void g(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          this.b.h().j("Failed to observer real show", objArray);
       }
       return;
    }
}
