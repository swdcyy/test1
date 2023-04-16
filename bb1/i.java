package bb1.i;
import erd.g;
import bb1.n;
import java.lang.Object;
import kb1.d;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;

public final class i implements g	// class@000335
{
    public final n b;

    public void i(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "3")) {
       }else {
          tb.c.remove(p0.a);
       }
       return;
    }
}
