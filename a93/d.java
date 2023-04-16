package a93.d;
import erd.g;
import com.kuaishou.live.lite.background.a;
import java.lang.Object;
import kotlin.Pair;
import java.util.Objects;
import android.graphics.Rect;
import z81.a;

public final class d implements g	// class@000085
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.getSecond();
       a u = tb.u;
       if (u != null) {
          u.a(p0);
       }
       return;
    }
}
