package jc9.e;
import erd.g;
import jc9.j;
import java.lang.Object;
import j4b.l;
import java.util.Objects;
import jc9.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ad9.i;

public final class e implements g	// class@00293d
{
    public final j b;

    public void e(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j q = this.b.q;
       Objects.requireNonNull(q);
       if (PatchProxy.applyVoidOneRefs(p0, q, b0.class, "5")) {
       }else if(q.d.l != null){
          q.d(2);
       }
       return;
    }
}
