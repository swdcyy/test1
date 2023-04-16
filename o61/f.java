package o61.f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.bottombar.component.widget.d;
import java.lang.Object;
import z61.b;
import java.util.Objects;

public final class f implements Observer	// class@003483
{
    public final d b;

    public void f(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else {
          tb.F(p0);
       }
       return;
    }
}
