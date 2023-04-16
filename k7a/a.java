package k7a.a;
import com.kwai.framework.player.core.b$b;
import k7a.d;
import java.lang.Object;
import java.util.Objects;
import p5a.e;
import de5.a;
import p5a.c;

public final class a implements b$b	// class@002c06
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void d(int p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 1 && tb.q.getPlayer().j()) {
          tb.V8();
       }
       return;
    }
}
