package com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM$visibleModelObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Collection;
import ekd.q;
import androidx.lifecycle.LiveData;
import ul1.a;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftPanelNormalItemVM$visibleModelObserver$1 implements Model$a	// class@0012d5
{
    public final LiveGiftPanelNormalItemVM b;

    public void LiveGiftPanelNormalItemVM$visibleModelObserver$1(LiveGiftPanelNormalItemVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalItemVM$visibleModelObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (!q.f(p2)) {
             a value = this.b.o.getValue();
             if (value != null) {
                p1 = this.b;
                p1 = p1.r0(p1.y0());
                boolean b = true;
                if (p2 == null || p2.contains(value) != b) {
                   b = false;
                }
                p1.setValue(Boolean.valueOf(b));
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalItemVM$visibleModelObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
