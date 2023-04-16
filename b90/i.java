package b90.i;
import erd.a;
import b90.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.logic.c;
import z80.c;
import java.util.List;

public final class i implements a	// class@000afc
{
    public final e b;

    public void i(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.b.i.b();
       c.j.v().clear();
       return;
    }
}
