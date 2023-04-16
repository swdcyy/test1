package ee9.e;
import erd.g;
import ee9.l;
import java.lang.Object;
import j4b.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hc9.e;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import ee9.h;
import java.lang.Runnable;
import i0d.g;

public final class e implements g	// class@002126
{
    public final l b;

    public void e(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "7")) {
       }else if(tb.q.g() != 7 && (p0.a != null && (tb.q.f() != null && !p0.a.equals(tb.q.f())))){
          g.b(new h(tb));
       }
       return;
    }
}
