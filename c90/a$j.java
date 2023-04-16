package c90.a$j;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z80.b;

public final class a$j implements a	// class@000cee
{
    public final boolean b;

    public void a$j(boolean p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$j.class, "1")) {
          return;
       }
       if (this.b != null) {
          b.a.e("downloadAudio");
       }
       return;
    }
}
