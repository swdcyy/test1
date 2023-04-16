package iz0.e;
import erd.g;
import iz0.i;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import mk1.h;
import mk1.f;

public final class e implements g	// class@0029d8
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       b.I(LiveLogTag.GIFT, "[GiftOpt][requestAnchorGiftImmediately]", p0);
       if (tb.t.c.l()) {
          tb.S8();
       }else {
          tb.R8(p0);
       }
       return;
    }
}
