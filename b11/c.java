package b11.c;
import erd.g;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper;

public final class c implements g	// class@0002f8
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       b.I(LiveLogTag.WEALTH_GRADE, "requestUserRightsInfo | error ", p0);
       tb.w = "defaultDataId";
       p0 = LiveUserRightsInfoHelper.a;
       tb.x = p0;
       tb.i(p0, false);
    }
}
