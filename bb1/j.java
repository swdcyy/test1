package bb1.j;
import erd.g;
import bb1.n;
import java.lang.Object;
import kb1.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;

public final class j implements g	// class@000336
{
    public final n b;

    public void j(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "4")) {
       }else if(!tb.d.contains(p0.a)){
          tb.d.add(p0.a);
       }
       tb.c.remove(p0.a);
       return;
    }
}
