package lz9.e;
import erd.g;
import lz9.b0;
import java.lang.Object;
import d0a.g;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.x0;
import qp7.b;
import ks7.h0;

public final class e implements g	// class@002edb
{
    public final b0 b;

    public void e(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b0.class, "5")) {
       }else {
          tb.G = true;
          if (tb.t.hasGodCommentShow()) {
             tb.E().j(false);
             tb.t.setNeedShowGodComment(false);
             tb.t.setAlreadyShowGodComment(true);
          }
       }
       return;
    }
}
