package me9.e;
import erd.g;
import me9.d;
import java.lang.String;
import java.lang.Object;
import android.util.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.io.File;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class e implements g	// class@002fec
{
    public final d b;
    public final String c;

    public void e(d p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          Pair first = p0.first;
          p0 = p0.second;
          if (first != null && (first.intValue() == 100 && new File(p0).exists())) {
             Object[] objArray = new Object[0];
             a.D().w("MagicRequestDownloadHandler", "download complete:"+p0, objArray);
             a.o(p0, "path");
             this.b.c.put(this.c, p0);
          }
       }
       return;
    }
}
