package a2b.c;
import erd.g;
import a2b.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import tw5.d;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import bsb.a;

public final class c implements g	// class@000024
{
    public final h b;

    public void c(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && tb.x != null) {
          tb.P8(a.e(tb.r));
          tb.x = false;
       }
       return;
    }
}
