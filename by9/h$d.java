package by9.h$d;
import erd.g;
import com.kuaishou.android.model.mix.CoCreateInfo;
import by9.h;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import ar7.r;

public final class h$d implements g	// class@00051d
{
    public final CoCreateInfo b;
    public final h c;

    public void h$d(CoCreateInfo p0,h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h$d.class, "1")) {
       }else {
          this.c.E().g(this.b);
          PatchProxy.onMethodExit(h$d.class, "1");
       }
       return;
    }
}
