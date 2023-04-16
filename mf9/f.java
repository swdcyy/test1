package mf9.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import oc9.e0;
import java.util.Iterator;
import oc9.t;
import mf9.a;

public final class f implements Runnable	// class@003026
{
    public final b b;
    public final int c;
    public final int d;

    public void f(b p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(tc), Integer.valueOf(td), tb, uob, "15") && tb.s != null)) {
          Iterator iterator = tb.getChildren().iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             if (ot instanceof a) {
                ot.j1(tc, td);
             }
          }
       }
       return;
    }
}
