package lq1.c$j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq1.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import s91.d;

public final class c$j implements g	// class@003000
{
    public static final c$j b;

    static {
       c$j.b = new c$j();
    }
    public void c$j(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$j.class, "1")) {
       }else {
          b.y(d.a, "updateMultiLineState", p0);
          new d().a(p0);
       }
       return;
    }
}
