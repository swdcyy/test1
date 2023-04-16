package nz9.j1;
import erd.g;
import nz9.l1;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import nz9.z0;

public final class j1 implements g	// class@00322a
{
    public final l1 b;

    public void j1(l1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j1 tb = this.b;
       Objects.requireNonNull(tb);
       if (VisitorModeManager.g(4)) {
       }else {
          tb.G0(false);
          tb.w0();
       }
       return;
    }
}
