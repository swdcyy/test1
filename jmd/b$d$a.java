package jmd.b$d$a;
import erd.g;
import jmd.b$d;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import mn6.a;

public final class b$d$a implements g	// class@00170b
{
    public final b$d b;

    public void b$d$a(b$d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("ThreeOptionsVote", "onOptionVoted: success", objArray);
          if (this.b.c.a()) {
             this.b.c.c();
          }
       }
       return;
    }
}
