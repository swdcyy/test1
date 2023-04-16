package me9.f;
import erd.g;
import me9.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;
import java.util.HashMap;

public final class f implements g	// class@002fed
{
    public final d b;
    public final String c;

    public void f(d p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          a.D().e("MagicRequestDownloadHandler", "download error", p0);
          this.b.c.remove(this.c);
       }
       return;
    }
}
