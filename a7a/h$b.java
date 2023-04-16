package a7a.h$b;
import ud5.e;
import a7a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class h$b implements e	// class@000056
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport2(h$b.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, h$b.class, "1")) {
          return;
       }
       this.a.Z8(p0);
       PatchProxy.onMethodExit(h$b.class, "1");
       return;
    }
}
