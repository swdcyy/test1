package com.kuaishou.live.audience.component.blessingbag.a;
import oj0.a;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gx0.c;
import java.lang.Runnable;
import e93.f;

public final class a implements a	// class@000a44
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void W(Map p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          String str = "status";
          if (p0.get(str) == null) {
          label_0035 :
             b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveAudienceBlessingBagPresenter"), "mCountDownReceiveListener, value error");
          }else {
             String str1 = p0.get(str);
             b.S(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveAudienceBlessingBagPresenter"), "mCountDownReceiveListener, updateBlessingBagPendant", str, str1);
             if (!TextUtils.x(str1)) {
                f.i("handleBlessingBagEvent", new c(tb, str1), "LiveAudienceBlessingBagPresenter");
             }
          }
       }else {
          goto label_0035 ;
       }
       return;
    }
}
