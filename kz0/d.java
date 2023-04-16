package kz0.d;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import java.lang.Object;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.LiveGiftActivityBannerResponse;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.LiveGiftActivityBannerResponse$Notice;

public final class d implements g	// class@002e2d
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mNotice;
       LiveGiftActivityBannerResponse$Notice mNoticeInter = p0.mNoticeIntervalMillis;
       if (mNoticeInter <= null) {
          mNoticeInter = 6000;
       }
       tb.u = mNoticeInter;
       tb.v = p0.mActivityList;
       tb.S8(false);
       return;
    }
}
