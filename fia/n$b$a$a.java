package fia.n$b$a$a;
import java.lang.Runnable;
import fia.n$b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fia.n$b;
import fia.n;
import bf5.d;

public final class n$b$a$a implements Runnable	// class@002923
{
    public final n$b$a b;

    public void n$b$a$a(n$b$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, n$b$a$a.class, "1")) {
          return;
       }
       n v = this.b.b.a.v;
       if (v != null) {
          v.s();
       }
       PatchProxy.onMethodExit(n$b$a$a.class, "1");
       return;
    }
}
