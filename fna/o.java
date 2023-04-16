package fna.o;
import erd.a;
import msd.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.lang.Boolean;

public final class o implements a	// class@002990
{
    public final p b;

    public void o(p p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.b.invoke(new ArrayList(), Boolean.TRUE);
       return;
    }
}
