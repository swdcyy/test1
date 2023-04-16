package el9.o;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.a;
import java.lang.Object;
import zca.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nk9.k;
import com.kuaishou.android.model.mix.QComment;

public final class o implements g	// class@0021fc
{
    public final a b;

    public void o(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "18")) {
       }else if(p0.a != null){
          if (tb.P != null) {
             tb.Z8();
          }
       }else {
          p0 = tb.R;
          if (p0 != null) {
             tb.a9(p0.a, p0.b);
             tb.R = null;
          }
       }
       return;
    }
}
