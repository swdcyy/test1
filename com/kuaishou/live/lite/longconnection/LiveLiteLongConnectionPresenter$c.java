package com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$c;
import erd.g;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import i51.d;

public final class LiveLiteLongConnectionPresenter$c implements g	// class@0009fc
{
    public final LiveLiteLongConnectionPresenter b;

    public void LiveLiteLongConnectionPresenter$c(LiveLiteLongConnectionPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLongConnectionPresenter$c.class, "1")) {
       }else {
          LiveLiteLongConnectionPresenter$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveLiteLongConnectionPresenter.class, "8")) {
             b.Z(LiveLogTag.LIVE_SOCKET, "onLoginEventMainThread, getNewRaceImmediately");
             p0 = tb.x;
             if (p0 == null) {
                a.S("liveLongConnectHelper");
             }
             p0.b();
          }
       }
       return;
    }
}
