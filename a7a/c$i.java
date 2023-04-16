package a7a.c$i;
import erd.g;
import a7a.c;
import java.lang.Object;
import d0a.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$i implements g	// class@00004a
{
    public final c b;

    public void c$i(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$i.class, "1")) {
       }else {
          p0 = p0.a;
          if (p0 == 1) {
             this.b.b9(9);
          }else if(p0 == 2){
             this.b.c9(9);
          }
          PatchProxy.onMethodExit(c$i.class, "1");
       }
       return;
    }
}
