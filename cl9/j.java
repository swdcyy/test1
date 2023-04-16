package cl9.j;
import erd.g;
import cl9.y;
import java.lang.Object;
import y8c.c;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;

public final class j implements g	// class@00063b
{
    public final y b;

    public void j(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a;
       if (p0 == 4 || p0 == 2) {
          p0 = tb.J;
          if (p0 != null) {
             p0.o();
          }
          p0 = tb.K;
          if (p0 != null) {
             p0.o();
             tb.K = null;
          }
       }
       return;
    }
}
