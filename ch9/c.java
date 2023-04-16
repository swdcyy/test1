package ch9.c;
import erd.g;
import ch9.g;
import java.lang.Object;
import ji9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.d0;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public final class c implements g	// class@0005ea
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "5")) {
       }else if(p0.b != tb.c || !tb.f2()){
          Object[] objArray = new Object[0];
          a.D().w("stability", "Ultra event "+p0.a, objArray);
          tb.n2();
          tb.p2();
       }
       return;
    }
}
