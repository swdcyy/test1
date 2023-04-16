package ik1.v;
import erd.g;
import com.kuaishou.live.common.core.component.gift.gift.l;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveAnchorStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.effect.LiveEffectConfig;

public final class v implements g	// class@00293b
{
    public final l b;

    public void v(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLiveEffectConfig;
       tb.q = p0.mIsLogGiftFeedEnabled;
       tb.p = p0.mGiftFeedMaxLogCount;
    }
}
