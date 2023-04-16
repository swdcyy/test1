package ad7.a;
import fr6.e;
import ad7.b;
import java.lang.Object;
import wq6.h;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import com.kwai.nearby.local.HomeLocalFragment;

public final class a implements e	// class@0000a9
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(h p0,float p1,int p2){
       a ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && (!PatchProxy.applyVoidTwoRefs(Float.valueOf(p1), Integer.valueOf(p2), ta, uob, "3") && (ta.f != null || (p1 && (p2 != 1 || ((double)p1 - 0x3feff7ced916872b < 0 || (!p2 && (double)p1 - 0x3f50624dd2f1a9fc > 0))))))) {
          b e = ta.e;
          if (e != null) {
             ta.f = true;
             e.ih();
          }
       }
    label_004a :
       return;
    }
}
