package com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$e;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter;
import java.lang.Object;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vd3.c;

public final class LiveLiteTempPlayPresenter$e implements LiveLiteTempPlayService	// class@000b82
{
    public final LiveLiteTempPlayPresenter a;

    public void LiveLiteTempPlayPresenter$e(LiveLiteTempPlayPresenter p0){
       this.a = p0;
       super();
    }
    public void a(LiveLiteTempPlayService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter$e.class, "2")) {
          return;
       }
       a.p(p0, "tempPlayItem");
       this.a.G.d(p0);
       return;
    }
    public void b(LiveLiteTempPlayService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "tempPlayItem");
       this.a.G.a(p0);
       return;
    }
}
