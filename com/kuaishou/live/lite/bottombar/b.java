package com.kuaishou.live.lite.bottombar.b;
import z1.a;
import com.kuaishou.live.lite.bottombar.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.google.common.base.Optional;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import pp.c;
import com.kuaishou.android.live.log.b;
import i93.d;
import java.lang.Runnable;
import java.util.concurrent.Future;
import ec3.d;

public final class b implements a	// class@001eb6
{
    public final f a;

    public void b(f p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, f.class, "5")) {
       }else {
          p0 = ta.W2(p0);
          if (p0 != null) {
             LiveLiteBottomBarService$BottomBarItemChangeReason uBottomBarIt = ta.V2(p0).or(LiveLiteBottomBarService$BottomBarItemChangeReason.NORMAL_ADD);
             b.d0(LiveLiteLogTag.BOTTOM_BAR, "LiteBottomBarContainerController.dispatchItemAdded", "item", p0.getType(), "reason", uBottomBarIt);
             p0.f(uBottomBarIt);
             if (p0.c()) {
                d.a(new d(ta, p0));
             }
          }
       }
       return;
    }
}
