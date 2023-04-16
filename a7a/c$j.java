package a7a.c$j;
import erd.g;
import a7a.c;
import java.lang.Object;
import fkc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$j implements g	// class@00004b
{
    public final c b;

    public void c$j(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$j.class, "1")) {
       }else if(p0.a()){
          this.b.b9(14);
       }else {
          this.b.c9(14);
       }
       PatchProxy.onMethodExit(c$j.class, "1");
       return;
    }
}
