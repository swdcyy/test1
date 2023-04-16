package a7a.c$g;
import erd.g;
import a7a.c;
import java.lang.Object;
import bxb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$g implements g	// class@000048
{
    public final c b;

    public void c$g(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$g.class, "1")) {
       }else if(p0.a == 1){
          this.b.c9(6);
       }else {
          this.b.b9(6);
       }
       PatchProxy.onMethodExit(c$g.class, "1");
       return;
    }
}
