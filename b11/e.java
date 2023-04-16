package b11.e;
import erd.g;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveUserRightsInfo;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper;

public final class e implements g	// class@0002fa
{
    public final e b;

    public void e(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.WEALTH_GRADE, "requestUserRightsInfo succeed", "RightsInfo", p0);
       tb.w = p0.a();
       tb.x = p0.b();
       tb.i(p0.b(), LiveUserRightsInfoHelper.c(p0));
    }
}
