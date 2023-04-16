package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM;
import java.lang.Object;
import java.lang.String;
import ul1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$c;

public final class LiveGiftPanelNormalPagerVM$1 implements Model$a	// class@0012ec
{
    public final LiveGiftPanelNormalPagerVM b;

    public void LiveGiftPanelNormalPagerVM$1(LiveGiftPanelNormalPagerVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalPagerVM$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalPagerVM$1.class, "1")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
          p1 = this.b.u0().getValue();
          p1 = (p1 != null)? Integer.valueOf(CollectionsKt___CollectionsKt.M2(p1, p2)): null;
          p2 = this.b;
          p2.r0(p2.w0()).setValue(new LiveGiftPanelNormalPagerVM$c(p1, (a.g(p0, "[LiveGiftPanelNormalPagerVM][updateSelectGift]") ^ 0x01)));
       }
       return;
    }
}
