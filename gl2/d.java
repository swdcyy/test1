package gl2.d;
import erd.g;
import gl2.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fl2.a;
import pm8.a;

public final class d implements g	// class@002b40
{
    public final e b;
    public final String c;

    public void d(e p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.b.c.a(this.c, "SYS_ENTER");
          p0 = this.b;
          int i = p0.b + 1;
          p0.b = i;
          a.W1(i);
       }
       return;
    }
}
