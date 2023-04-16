package com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a$a;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.sidebar.e$a;

public final class LiveLiteGiftGuideManager$b implements a$a	// class@001dd4
{
    public final e a;
    public final LiveLiteBottomBarService b;

    public void LiveLiteGiftGuideManager$b(e p0,LiveLiteBottomBarService p1){
       a.p(p0, "liteSideBarService");
       a.p(p1, "liteBottomBarService");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(LiveLiteBottomBarService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftGuideManager$b.class, "1")) {
          return;
       }
       a.p(p0, "item");
       this.b.a(p0);
       return;
    }
    public void b(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftGuideManager$b.class, "3")) {
          return;
       }
       a.p(p0, "item");
       this.a.b(p0);
       return;
    }
    public void c(LiveLiteBottomBarService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftGuideManager$b.class, "2")) {
          return;
       }
       a.p(p0, "item");
       this.b.c(p0);
       return;
    }
    public void d(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftGuideManager$b.class, "4")) {
          return;
       }
       a.p(p0, "item");
       this.a.d(p0);
       return;
    }
}
