package ik1.n;
import ok.o;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import lm1.h;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.live.basic.model.QLiveMessage;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;

public final class n implements o	// class@002933
{
    public final i b;

    public void n(i p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b = this.b.V8(p0);
       if (!b) {
          b.Z(LiveLogTag.LIVE_EFFECT, "[showBroadcastGiftEffect]: filter illegal gift "+p0.b());
       }
       p0.mRank = 0x7ffff7fd;
       return b;
    }
}
