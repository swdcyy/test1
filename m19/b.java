package m19.b;
import com.kwai.framework.player.core.b$b;
import m19.c;
import java.lang.Object;
import java.util.Objects;
import p5a.e;
import de5.a;
import p5a.c;

public final class b implements b$b	// class@002ddc
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void d(int p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 1 && tb.q.getPlayer().j()) {
          tb.R8();
       }
       return;
    }
}
