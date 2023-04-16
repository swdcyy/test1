package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$refreshObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import androidx.lifecycle.LiveData;
import ul1.b;

public final class LiveGiftPanelNormalPagerVM$refreshObserver$1 implements Model$a	// class@0012f8
{
    public final LiveGiftPanelNormalPagerVM b;

    public void LiveGiftPanelNormalPagerVM$refreshObserver$1(LiveGiftPanelNormalPagerVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalPagerVM$refreshObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalPagerVM$refreshObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          Object obj = this.b.l.getValue();
          if (obj != null && a.g(p2, obj.a())) {
             LiveGiftPanelNormalPagerVM.z0(this.b, obj, false, false, 0, 8, null);
          }
       }
       return;
    }
}
