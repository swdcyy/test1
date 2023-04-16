package kf0.p;
import java.lang.Runnable;
import kf0.o;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;

public final class p implements Runnable	// class@002d1b
{
    public final o b;
    public final List c;

    public void p(o p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       p tb = this.b;
       p tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, o.class, "10")) {
          tb.o.p0();
          tb.b(tc);
       }
       return;
    }
}
