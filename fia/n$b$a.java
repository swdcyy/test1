package fia.n$b$a;
import java.util.TimerTask;
import fia.n$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fia.n$b$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class n$b$a extends TimerTask	// class@002924
{
    public final n$b b;

    public void n$b$a(n$b p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, n$b$a.class, "1")) {
          return;
       }
       k1.o(new n$b$a$a(this));
       return;
    }
}
