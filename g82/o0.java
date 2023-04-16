package g82.o0;
import erd.g;
import g82.q0;
import java.lang.Object;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupTaskAction;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.content.Context;
import vq5.d;

public final class o0 implements g	// class@002aae
{
    public final q0 b;

    public void o0(q0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.FANS_GROUP, "fetchFansGroupTaskAction", "routerUrl", TextUtils.k(p0.mRouterUrl));
       if (!TextUtils.x(p0.mRouterUrl)) {
          tb.a.r4(p0.mRouterUrl, null);
       }
       return;
    }
}
