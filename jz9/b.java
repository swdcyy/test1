package jz9.b;
import erd.g;
import jz9.c;
import java.lang.Object;
import uq7.b;
import java.util.Objects;
import com.kwai.slide.play.detail.event.CleanType;
import qp7.x0;
import qp7.b;
import is7.d;

public final class b implements g	// class@002b8b
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.b() && p0.a() == CleanType.TYPE_NASA) {
          tb.E().g(true);
          tb.c0();
       }else {
          tb.E().g(false);
          tb.b0();
       }
       return;
    }
}
