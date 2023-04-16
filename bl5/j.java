package bl5.j;
import erd.g;
import bl5.k;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;

public final class j implements g	// class@0004da
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.p.scrollToPosition(0);
       }
       return;
    }
}
