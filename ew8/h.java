package ew8.h;
import erd.g;
import ew8.k;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.action.RealActionBizType;
import java.util.Map;

public final class h implements g	// class@002241
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "17")) {
       }else {
          tb.b.remove(RealActionBizType.SEARCH.bizType());
       }
       return;
    }
}
