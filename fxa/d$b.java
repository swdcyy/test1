package fxa.d$b;
import java.lang.Object;
import fxa.d$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import dc5.c;

public abstract class d$b	// class@002a4d
{

    public void d$b(){
       super();
    }
    public void d$b(d$a p0){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       this.c("enter");
       return;
    }
    public abstract String b();
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "3")) {
          return;
       }
       c.g("IMRTCMachine", this.b()+" "+p0);
       return;
    }
    public abstract boolean d(int p0,String p1);
}
