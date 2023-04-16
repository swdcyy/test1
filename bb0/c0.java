package bb0.c0;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.e;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class c0 implements g	// class@000256
{
    public final e b;

    public void c0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c0 tb = this.b;
       int i = p0.intValue();
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, uoe, "11")) {
          if (i) {
             if (i != 1) {
                tb.A = (i != 2)? "": "all";
             }else {
                tb.A = "picture";
             }
          }else {
             tb.A = "photo";
          }
          i = null;
          if (!PatchProxy.applyVoid(i, tb, uoe, "14")) {
             if (tb.I != null) {
                tb.S8(i);
             }
             if (tb.H != null) {
                tb.V8();
                tb.W8();
             }
          }
       }
    label_0056 :
       return;
    }
}
