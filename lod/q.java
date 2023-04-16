package lod.q;
import erd.a;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.g;
import faa.a;
import q87.c;

public final class q implements a	// class@001c8d
{
    public final v b;

    public void q(v p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.b.onNext(Integer.valueOf(100));
       this.b.onComplete();
       Object[] objArray = new Object[0];
       a.D().w("TextTemplateDownloadHelper", "downloadFontAndSk2c complete", objArray);
       return;
    }
}
