package b4d.j0;
import erd.g;
import b4d.n0;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import b4d.n0$b;
import java.lang.Enum;
import uk5.b;

public final class j0 implements g	// class@000377
{
    public final n0 b;

    public void j0(n0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j0 tb = this.b;
       Objects.requireNonNull(tb);
       if (n0$b.a[p0.ordinal()] != 1) {
       }else {
          p0 = tb.F;
          if (p0 != null) {
             p0.f();
          }
       }
       return;
    }
}
