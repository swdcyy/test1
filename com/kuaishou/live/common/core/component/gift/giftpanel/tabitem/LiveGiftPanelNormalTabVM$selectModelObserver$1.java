package com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabVM$selectModelObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabVM;
import java.lang.Object;
import java.lang.String;
import ul1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;

public final class LiveGiftPanelNormalTabVM$selectModelObserver$1 implements Model$a	// class@0012ff
{
    public final LiveGiftPanelNormalTabVM b;

    public void LiveGiftPanelNormalTabVM$selectModelObserver$1(LiveGiftPanelNormalTabVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalTabVM$selectModelObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalTabVM$selectModelObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          d value = this.b.i.getValue();
          if (value != null) {
             p1 = this.b;
             p1.r0(p1.u0()).setValue(Boolean.valueOf(this.b.w0()));
             a.o(value, "it");
             this.b.x0(value);
          }
       }
       return;
    }
}
