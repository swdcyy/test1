package com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$a;
import vc3.j;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import vc3.f;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import uc3.a;
import com.kuaishou.live.lite.quickinteractive.LiveLiteQuickGiftConfig;
import vq5.d;
import e93.a;
import ip3.a;
import vc3.j$a;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;

public final class LiveLiteQuickGiftTriggerManager$a implements j	// class@000ab9
{
    public final LiveLiteQuickGiftTriggerManager a;

    public void LiveLiteQuickGiftTriggerManager$a(LiveLiteQuickGiftTriggerManager p0){
       this.a = p0;
       super();
    }
    public ViewController a(LiveData p0,f p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteQuickGiftTriggerManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       a.p(p1, "delegate");
       LiveLiteQuickGiftTriggerManager$a ta = this.a;
       a uoa = new a(p0, ta.j, p1, ta.q, ta.p, ta.t, ta.u, ta.v);
       return obj;
    }
    public ViewController b(LiveData p0,f p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteQuickGiftTriggerManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       a.p(p1, "delegate");
       return j$a.a(this, p0, p1);
    }
    public LiveLiteQuickInteractiveAreaItemType getType(){
       return LiveLiteQuickInteractiveAreaItemType.QUICK_GIFT;
    }
}
