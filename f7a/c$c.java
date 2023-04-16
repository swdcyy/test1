package f7a.c$c;
import vy6.a;
import f7a.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.a;

public final class c$c implements a	// class@0022dd
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void B0(){
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       c$c tb = this.b;
       tb.E = false;
       c c = tb.C;
       if (c != null && c.g() == true) {
          c = this.b.C;
          if (c != null) {
             c.b();
          }
       }
       return;
    }
    public void i2(){
       this.b.E = true;
    }
    public void k1(){
    }
}
