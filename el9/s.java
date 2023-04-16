package el9.s;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import brd.y;

public final class s implements g	// class@002200
{
    public final b b;

    public void s(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uob, "4")) {
          tb.r = b;
          if (!PatchProxy.applyVoid(null, tb, uob, "5")) {
             b = tb.r;
             if (b != null && tb.s == null) {
                tb.t.onNext(Boolean.TRUE);
                tb.s = true;
             }else if(b == null && tb.s != null){
                tb.t.onNext(Boolean.FALSE);
                tb.s = false;
             }
          }
       }
       return;
    }
}
