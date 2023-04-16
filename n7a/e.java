package n7a.e;
import erd.g;
import n7a.f;
import java.lang.Object;
import rd5.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7a.a;
import o7a.d;

public final class e implements g	// class@0030f5
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "6")) {
       }else if(tb.r == null){
          tb.D = p0.a;
          if (tb.u != null) {
             boolean b = (tb.E != null || (tb.C == null && (!tb.X8() && tb.S8(p0.a))))? true: false;
             tb.u.setEnabled(b);
          }
       }
       return;
    }
}
