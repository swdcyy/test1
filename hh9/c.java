package hh9.c;
import erd.g;
import fh9.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public final class c implements g	// class@002689
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("CameraTabTagRepo", "fetch data result:"+p0, objArray);
          c tb = this.b;
          if (tb != null) {
             tb.a(p0);
          }
       }
       return;
    }
}
