package b5a.f;
import erd.g;
import b5a.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import b5a.l;

public final class f implements g	// class@00036a
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "12")) {
       }else if(tb.x == null){
          h w = tb.w;
          if (w != null && w.isValid()) {
             tb.x.a(p0);
          }
       }
       return;
    }
}
