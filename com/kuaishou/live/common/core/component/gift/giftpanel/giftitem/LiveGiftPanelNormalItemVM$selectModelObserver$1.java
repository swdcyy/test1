package com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM$selectModelObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM;
import java.lang.Object;
import java.lang.String;
import ul1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftPanelNormalItemVM$selectModelObserver$1 implements Model$a	// class@0012d4
{
    public final LiveGiftPanelNormalItemVM b;

    public void LiveGiftPanelNormalItemVM$selectModelObserver$1(LiveGiftPanelNormalItemVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalItemVM$selectModelObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          p0 = null;
          p1 = (p2 != null)? p2.d(): p0;
          a value = this.b.o.getValue();
          if (value != null) {
             p0 = value.d();
          }
          if (a.g(p1, p0)) {
             a value1 = this.b.o.getValue();
             if (value1 != null) {
                boolean b = a.g(p2, value1);
                p2 = this.b;
                if (a.g(p2.r0(p2.x0()).getValue(), Boolean.valueOf(b)) ^ 0x01) {
                   p2 = this.b;
                   p2.r0(p2.x0()).setValue(Boolean.valueOf(b));
                   a.o(value1, "it");
                   this.b.z0(value1);
                }
             }
          }
       }
    label_007e :
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalItemVM$selectModelObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
