package dra.c$b;
import erd.a;
import dra.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;

public final class c$b implements a	// class@002505
{
    public final a b;

    public void c$b(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$b.class, "1")) {
          return;
       }
       c$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "2")) {
          a = tb.a;
          if (a != null) {
             GrowthVfcUtilKt.a(a);
          }
       }
       return;
    }
}
