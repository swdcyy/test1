package l69.o$d;
import erd.a;
import l69.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n69.c;
import h69.g;
import q87.c;
import pb9.p;

public final class o$d implements a	// class@002ca5
{
    public final o b;

    public void o$d(o p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o$d.class, "1")) {
          return;
       }
       o c = this.b.c;
       if (c != null && !PatchProxy.applyVoid(objArray, c, c.class, "2")) {
          Object[] objArray1 = new Object[0];
          g.D().w("AICutMusicRecoManager", "frameUploader stop", objArray1);
          c a = c.a;
          if (a != null) {
             a.i(c.c);
          }
       }
       c = this.b.c;
       if (c != null) {
          c.a();
       }
       return;
    }
}
