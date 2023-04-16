package a2b.e;
import erd.g;
import a2b.h;
import java.lang.Object;
import irb.b;
import java.util.Objects;
import com.kwai.feature.api.social.nearby.model.CityInfo;

public final class e implements g	// class@000026
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a != null && (p0.b == null && p0.c == null)) {
          p0 = tb.t;
          if (p0 != null) {
             if (tb.v != null) {
                tb.v = false;
             }else {
                tb.w = true;
                tb.P8(p0);
             }
          }
       }
       return;
    }
}
