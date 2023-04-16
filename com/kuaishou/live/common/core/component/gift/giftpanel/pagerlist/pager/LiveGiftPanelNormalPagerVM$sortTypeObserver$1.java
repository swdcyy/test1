package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$sortTypeObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import java.util.List;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import xi1.a;
import java.util.Comparator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftPanelNormalPagerVM$sortTypeObserver$1 implements Model$a	// class@0012f9
{
    public final LiveGiftPanelNormalPagerVM b;

    public void LiveGiftPanelNormalPagerVM$sortTypeObserver$1(LiveGiftPanelNormalPagerVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalPagerVM$sortTypeObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             List value = this.b.u0().getValue();
             if (value != null) {
                a.o(value, "dataList.value ?: return");
                p1 = this.b;
                p1.r0(p1.u0()).setValue(CollectionsKt___CollectionsKt.f5(value, a.d.a(p2)));
                this.b.A0(true);
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalPagerVM$sortTypeObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
