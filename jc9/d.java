package jc9.d;
import erd.g;
import jc9.j;
import java.lang.Object;
import zb9.j;
import java.util.Objects;
import jc9.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements g	// class@00293c
{
    public final j b;

    public void d(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j q = this.b.q;
       Objects.requireNonNull(q);
       if (PatchProxy.applyVoidOneRefs(p0, q, b0.class, "3")) {
       }else if(p0.a()){
          q.d(2);
       }
       return;
    }
}
