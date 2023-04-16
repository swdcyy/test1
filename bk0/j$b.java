package bk0.j$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bk0.j;

public final class j$b implements Runnable	// class@0003a7
{
    public final String b;
    public final Object c;

    public void j$b(String p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "1")) {
          return;
       }
       j.b.d(this.b, this.c, false);
       return;
    }
}
