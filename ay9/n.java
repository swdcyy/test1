package ay9.n;
import erd.g;
import ay9.q;
import java.lang.Object;
import java.lang.Boolean;
import xx9.a;
import rd5.j;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;

public final class n implements g	// class@000303
{
    public final q b;

    public void n(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       if (tb.G.c() && (tb.G.b() != null && tb.G.b().a == ChangeScreenVisibilityCause.CAPTION_DIALOG)) {
          tb.z0();
       }
    label_0023 :
       return;
    }
}
