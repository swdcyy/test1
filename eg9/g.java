package eg9.g;
import erd.g;
import eg9.j;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import android.view.View;

public final class g implements g	// class@00213d
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.intValue() <= 1) {
          tb.o.setVisibility(4);
          tb.o.setEnabled(false);
          tb.o.setClickable(false);
       }
       return;
    }
}
