package f6a.h$b;
import com.kwai.framework.player.core.b$b;
import f6a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import f6a.f;

public final class h$b implements b$b	// class@0022d6
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       if (PatchProxy.isSupport2(h$b.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, h$b.class, "1")) {
          return;
       }
       h$b tb = this.b;
       boolean b = (p0 == 3)? true: false;
       tb.b9(b);
       PatchProxy.onMethodExit(h$b.class, "1");
       return;
    }
}
