package ix0.a;
import erd.g;
import ix0.b;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$BlindDateConfig;

public final class a implements g	// class@0029ab
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          p0 = p0.mBlindDateConfig;
          if (p0 != null) {
             tb.y = p0.mIsAuthorPaidMatchmaker;
          }
       }
       return;
    }
}
