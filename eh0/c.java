package eh0.c;
import erd.g;
import com.kuaishou.house.live.prerequest.a;
import oy.a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.System;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.String;
import com.kuaishou.house.live.bottombar.HouseLiveIconMessage;
import mrd.a;
import com.kuaishou.house.live.prerequest.a$b;

public final class c implements g	// class@00215e
{
    public final a b;
    public final a c;
    public final long d;

    public void c(a p0,a p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       tc.a0((System.currentTimeMillis() - this.d));
       tc.b0(0);
       int errorCode = (v3 = p0 instanceof KwaiException)? p0.getErrorCode(): 0;
       tc.E(errorCode);
       String message = (v3)? p0.getMessage(): p0.getMessage();
       tc.F(message);
       tc.r();
       tb.s.onNext(new HouseLiveIconMessage());
       a w = tb.w;
       w.e = false;
       w.d = p0.getMessage();
       return;
    }
}
