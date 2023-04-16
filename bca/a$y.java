package bca.a$y;
import erd.a;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public final class a$y implements a	// class@000462
{
    public final v b;

    public void a$y(v p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$y.class, "1")) {
          return;
       }
       this.b.onComplete();
       return;
    }
}
