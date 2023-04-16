package a2b.f;
import erd.g;
import a2b.h;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw5.d;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import bsb.a;

public final class f implements g	// class@000027
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "5")) {
       }else if(tb.y != null){
          tb.P8(a.e(tb.r));
       }else {
          tb.u = true;
       }
       return;
    }
}
