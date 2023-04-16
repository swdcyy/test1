package l8a.b;
import erd.g;
import l8a.c;
import java.lang.Object;
import e6a.d;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l8a.a;

public final class b implements g	// class@002d60
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "5")) {
       }else if(tb.t == null && tb.s != null){
          tb.p.b(true);
          tb.t = true;
       }
       return;
    }
}
