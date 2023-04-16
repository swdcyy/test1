package b8a.h1;
import java.lang.Runnable;
import b8a.i1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h1 implements Runnable	// class@0003ab
{
    public final i1 b;

    public void h1(i1 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, h1.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
}
