package d5a.a$d;
import j1b.e;
import d5a.a;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import bm5.e;
import bm5.e$a;
import mrd.c;
import brd.y;

public final class a$d extends e	// class@001e75
{
    public final a g;

    public void a$d(a p0,Context p1){
       this.g = p0;
       super(p1);
    }
    public void c(int p0){
       a$d uod = a$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (e.a.a()) {
          a.P8(this.g).onNext(Integer.valueOf(p0));
       }
       return;
    }
}
