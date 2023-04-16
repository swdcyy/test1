package bf9.b;
import hc9.e$a;
import bf9.h;
import java.lang.Object;
import java.util.Objects;
import hc9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class b implements e$a	// class@00048c
{
    public final h b;

    public void b(h p0){
       this.b = p0;
    }
    public final void onStateChanged(int p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 7) {
          boolean b = (!tb.x.e() || tb.x.e() == 3)? true: false;
          h oh = h.class;
          if (!PatchProxy.isSupport(oh) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oh, "18") && tb.w == null)) {
             tb.w = true;
             if (b) {
                tb.i2();
             }
          }
       }
    label_003f :
       return;
    }
}
