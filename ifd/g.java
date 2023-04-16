package ifd.g;
import erd.g;
import ifd.h;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import ifd.h$d;
import java.lang.Enum;

public final class g implements g	// class@001007
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       int i = h$d.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2) {
             tb.P8(true);
          }
       }else {
          tb.P8(false);
       }
       return;
    }
}
