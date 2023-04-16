package a2b.d;
import erd.g;
import a2b.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import tw5.d;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import bsb.a;

public final class d implements g	// class@000025
{
    public final h b;

    public void d(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       tb.y = p0.booleanValue();
       if (p0.booleanValue() && tb.u != null) {
          tb.P8(a.e(tb.r));
          tb.u = false;
       }
       return;
    }
}
