package b5a.e;
import erd.g;
import b5a.h;
import java.lang.Object;
import ub6.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b5a.l;
import com.yxcorp.gifshow.detail.nonslide.b;

public final class e implements g	// class@000369
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "9")) {
       }else if(tb.s != null){
          p0 = tb.x;
          if (p0 != null) {
             p0.c();
             tb.r.g(5);
          }
       }
       return;
    }
}
