package nf0.c$d;
import java.lang.Runnable;
import nf0.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$d implements Runnable	// class@003301
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "1")) {
          return;
       }
       c$d tb = this.b;
       tb.r = true;
       tb.P8();
       return;
    }
}
