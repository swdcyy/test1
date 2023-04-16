package me9.h;
import io.reactivex.g;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import java.io.File;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import j8c.a;
import q87.c;
import t16.c;
import t16.a;
import me9.h$a;
import com.yxcorp.download.b;

public final class h implements g	// class@002ff0
{
    public final DownloadTask$DownloadRequest b;
    public final File c;

    public void h(DownloadTask$DownloadRequest p0,File p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Object[] objArray = new Object[0];
       a.D().w("MagicRequestDownloadHandler", "start download", objArray);
       c.a().d(new a("record", "inner_resource"), this.b, new h$a(this, p0));
       return;
    }
}
