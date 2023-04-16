package bb1.h;
import erd.g;
import bb1.n;
import java.lang.Object;
import kb1.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;

public final class h implements g	// class@000334
{
    public final n b;

    public void h(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "2")) {
       }else if(!tb.c.contains(p0.a)){
          tb.c.add(p0.a);
       }
       tb.d.remove(p0.a);
       return;
    }
}
