package j9a.g;
import erd.g;
import j9a.h;
import java.lang.Object;
import ub6.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j9a.d;

public final class g implements g	// class@00298f
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "3")) {
       }else {
          d.d();
       }
       return;
    }
}
