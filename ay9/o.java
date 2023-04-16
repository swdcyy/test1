package ay9.o;
import erd.g;
import ay9.q;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import xx9.a;
import rd5.j;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;

public final class o implements g	// class@000304
{
    public final q b;

    public void o(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       tb.K = p0.booleanValue();
       if (p0.booleanValue()) {
          tb.z0();
       }else if(tb.G.c() && (tb.G.b() != null && tb.G.b().a == ChangeScreenVisibilityCause.CAPTION_DIALOG)){
          tb.v0(false);
       }
       return;
    }
}
