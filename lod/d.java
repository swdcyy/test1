package lod.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lnc.i1;

public final class d implements g	// class@001c7e
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          i1.a("Sk2cResourceDownloader", "download exception: "+p0.getMessage());
       }
       return;
    }
}
