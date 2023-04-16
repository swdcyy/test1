package mf9.d;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import java.lang.Object;
import kd9.l0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import oc9.e0;
import java.util.Iterator;
import oc9.t;
import mf9.a;

public final class d implements g	// class@003024
{
    public final b b;

    public void d(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uob, "22")) {
       }else if(p0.a == 3 && tb.hasSticker()){
          tb.o2();
       }else if(p0.a == 1 && (!tb.hasSticker() || (PatchProxy.applyVoid(null, tb, uob, "16") || tb.s == null))){
          p0 = tb.getChildren().iterator();
          while (p0.hasNext()) {
             t ot = p0.next();
             if (ot instanceof a) {
                ot.X();
             }
          }
       }
       return;
    }
}
