package cl9.v2;
import erd.g;
import cl9.y2;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import e17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.t0;

public final class v2 implements g	// class@000676
{
    public final y2 b;
    public final QComment c;

    public void v2(y2 p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       v2 tb = this.b;
       v2 tc = this.c;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f104d66);
       p0 = tb.s;
       if (PatchProxy.applyVoidOneRefs(p0, tb, y2.class, "4")) {
       }else {
          p0.q().a();
       }
       tb.v.h(tb.p, tc, false);
       return;
    }
}
