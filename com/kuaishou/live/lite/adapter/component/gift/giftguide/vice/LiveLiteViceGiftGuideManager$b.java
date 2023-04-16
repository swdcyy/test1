package com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager$b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a$a;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import v91.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import com.kuaishou.live.lite.sidebar.e$a;

public final class LiveLiteViceGiftGuideManager$b implements a$a	// class@001de6
{
    public final e a;
    public final LiveLiteBottomBarService b;
    public final int c;
    public final b d;

    public void LiveLiteViceGiftGuideManager$b(e p0,LiveLiteBottomBarService p1,int p2,b p3){
       a.p(p0, "liteSideBarService");
       a.p(p1, "liteBottomBarService");
       a.p(p3, "frequencyConsumer");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(LiveLiteBottomBarService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteViceGiftGuideManager$b.class, "1")) {
          return;
       }
       a.p(p0, "item");
       this.b.e(LiveLiteBottomBarService$BottomBarType.GIFT, p0);
       return;
    }
    public void b(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteViceGiftGuideManager$b.class, "3")) {
          return;
       }
       a.p(p0, "item");
       this.a.f(3, p0, true);
       if (this.c == 4) {
          this.d.a();
       }
       return;
    }
    public void c(LiveLiteBottomBarService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteViceGiftGuideManager$b.class, "2")) {
          return;
       }
       a.p(p0, "item");
       this.b.h(LiveLiteBottomBarService$BottomBarType.GIFT, p0);
       return;
    }
    public void d(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteViceGiftGuideManager$b.class, "4")) {
          return;
       }
       a.p(p0, "item");
       this.a.h(3, p0, true);
       return;
    }
}
