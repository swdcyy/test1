package lod.h;
import erd.g;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public final class h implements g	// class@001c82
{
    public final v b;

    public void h(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          this.b.onError(p0);
       }
       return;
    }
}
