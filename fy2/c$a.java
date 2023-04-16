package fy2.c$a;
import java.lang.Runnable;
import fy2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c$a implements Runnable	// class@002a0f
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
