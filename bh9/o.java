package bh9.o;
import erd.g;
import bh9.r;
import java.lang.Object;
import zb9.t;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bh9.b;
import java.lang.Runnable;
import ekd.k1;

public final class o implements g	// class@0004a4
{
    public final r b;

    public void o(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, r.class, "9")) {
       }else if(TextUtils.n(p0.a(), "SWAP_IMAGE_SHOW_EVENT") || TextUtils.n(p0.a(), "WISH_INPUT_SHOW_EVENT")){
          if (!p0.b()) {
             k1.r(new b(tb), 0);
          }else {
             tb.l2();
          }
       }
       return;
    }
}
