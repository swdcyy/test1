package ked.e;
import erd.g;
import ked.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import jed.h;

public final class e implements g	// class@00176d
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = p0.booleanValue();
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oh, "3") && !b)) {
          b = tb.q;
          if (b != null) {
             b.dismiss();
          }
       }
       return;
    }
}
