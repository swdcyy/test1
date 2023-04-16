package a7a.c$l;
import erd.g;
import a7a.c;
import java.lang.Object;
import tp7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$l implements g	// class@00004d
{
    public final c b;

    public void c$l(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$l.class, "1")) {
       }else if(p0.d != null){
          this.b.c9(11);
       }
       PatchProxy.onMethodExit(c$l.class, "1");
       return;
    }
}
