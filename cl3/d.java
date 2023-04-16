package cl3.d;
import erd.g;
import cl3.f;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import android.widget.FrameLayout;

public final class d implements g	// class@00058d
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.intValue() == 1) {
          p0 = tb.t;
          if (p0 != null) {
             p0.setVisibility(8);
          }
       }
       return;
    }
}
