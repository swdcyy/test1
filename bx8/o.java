package bx8.o;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;

public final class o implements g	// class@000484
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.b().w("ShareReEditRepo", "uploadPhoto result", objArray);
       }
       return;
    }
}
