package com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$a;
import vc3.j;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import vc3.f;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import vc3.d;
import vq5.d;
import vc3.j$a;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;

public final class LiveLiteQuickInteractiveCommonTriggerManager$a implements j	// class@000aab
{
    public final LiveLiteQuickInteractiveCommonTriggerManager a;

    public void LiveLiteQuickInteractiveCommonTriggerManager$a(LiveLiteQuickInteractiveCommonTriggerManager p0){
       this.a = p0;
       super();
    }
    public ViewController a(LiveData p0,f p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteQuickInteractiveCommonTriggerManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       a.p(p1, "delegate");
       return new d(p0, p1, this.a.j);
    }
    public ViewController b(LiveData p0,f p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteQuickInteractiveCommonTriggerManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       a.p(p1, "delegate");
       return j$a.a(this, p0, p1);
    }
    public LiveLiteQuickInteractiveAreaItemType getType(){
       return LiveLiteQuickInteractiveAreaItemType.COMMON_TRIGGER;
    }
}
