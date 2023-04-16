package cea.i;
import erd.g;
import cea.l;
import java.lang.Object;
import g50.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ff6.d;

public final class i implements g	// class@0004ee
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "4")) {
       }else if(p0 == null){
          tb.r.i(p0.a());
          tb.P8();
       }
       return;
    }
}
