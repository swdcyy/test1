package lod.i$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public final class i$b implements g	// class@001c84
{
    public static final i$b b;

    static {
       i$b.b = new i$b();
    }
    public void i$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
          return;
       }
       throw new RuntimeException("downloadFonts error "+p0);
    }
}
