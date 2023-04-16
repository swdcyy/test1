package l79.p;
import c79.e;
import l79.o;
import r79.c;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import k79.j;
import l79.p$a;
import java.lang.Runnable;
import ekd.k1;

public final class p extends e	// class@002ccd
{
    public final o c;
    public final c d;

    public void p(o p0,c p1,long p2,long p3){
       this.c = p0;
       this.d = p1;
       super(p2, p3);
    }
    public void b(Bitmap p0,long p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, op, "1")) {
          return;
       }
       if (p0 != null) {
          k1.o(new p$a(j.d(p0.getWidth(), p0.getHeight(), 0), this, p0));
       }
       return;
    }
}
