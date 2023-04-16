package g79.h;
import erd.a;
import k79.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h implements a	// class@002432
{
    public final f b;

    public void h(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.b.close();
       return;
    }
}
