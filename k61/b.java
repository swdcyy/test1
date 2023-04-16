package k61.b;
import androidx.lifecycle.Observer;
import k61.c;
import java.lang.Object;
import z61.b;
import java.util.Objects;

public final class b implements Observer	// class@002c93
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else {
          tb.b(p0);
       }
       return;
    }
}
