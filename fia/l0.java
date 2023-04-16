package fia.l0;
import java.lang.Runnable;
import fia.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class l0 implements Runnable	// class@00291a
{
    public final m0 b;

    public void l0(m0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, l0.class, "1")) {
          return;
       }
       this.b.X8();
       return;
    }
}
