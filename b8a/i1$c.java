package b8a.i1$c;
import com.kwai.framework.player.core.b$b;
import b8a.i1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class i1$c implements b$b	// class@0003b1
{
    public final i1 b;

    public void i1$c(i1 p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       i1$c uoc = i1$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0 == 3) {
          this.b.S8();
       }else if(p0 == 4){
          this.b.V8();
       }
       return;
    }
}
