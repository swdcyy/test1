package ik1.k;
import ok.h;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.util.Objects;
import com.kuaishou.live.core.show.gift.GiftMessage;
import va1.a0;
import ci1.a;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import lm1.i;
import lm1.h;

public final class k implements h	// class@002930
{
    public final i b;
    public final boolean c;

    public void k(i p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       k tc = this.c;
       Objects.requireNonNull(tb);
       GiftMessage giftMessage = p0.cast();
       if (a0.g(giftMessage)) {
          a.a(giftMessage);
       }
       p0 = tb.K.Ig(p0.mId);
       p0.i(giftMessage);
       i oi = new i(p0);
       return new h(oi, giftMessage, 1, tc);
    }
}
