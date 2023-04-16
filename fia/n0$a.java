package fia.n0$a;
import erd.g;
import fia.n0;
import java.lang.Object;
import rd5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class n0$a implements g	// class@002926
{
    public final n0 b;

    public void n0$a(n0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, n0$a.class, "1")) {
       }else {
          this.b.onReceiveProgressEvent(p0);
          PatchProxy.onMethodExit(n0$a.class, "1");
       }
       return;
    }
}
