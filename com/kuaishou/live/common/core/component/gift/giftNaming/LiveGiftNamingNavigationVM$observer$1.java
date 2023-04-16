package com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM$observer$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM;
import java.lang.Object;
import java.lang.String;
import sl1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM$FlipperPosition;
import androidx.lifecycle.LiveData;
import com.kwai.robust.PatchProxyResult;
import rl1.h;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import rl1.g;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftNamingNavigationVM$observer$1 implements Model$a	// class@0012bf
{
    public final LiveGiftNamingNavigationVM b;

    public void LiveGiftNamingNavigationVM$observer$1(LiveGiftNamingNavigationVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       int i;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftNamingNavigationVM$observer$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             LiveGiftNamingNavigationVM$observer$1 tb = this.b;
             Objects.requireNonNull(tb);
             p1 = LiveGiftNamingNavigationVM.class;
             if (!PatchProxy.applyVoidOneRefs(p2, tb, p1, "6")) {
                LiveGiftNamingNavigationVM$FlipperPosition uFlipperPosi = tb.v0();
                LiveData liveData = tb.u0(uFlipperPosi);
                p1 = PatchProxy.applyOneRefs(uFlipperPosi, tb, p1, "5");
                if (p1 != PatchProxyResult.class) {
                }else {
                   i = h.b[uFlipperPosi.ordinal()];
                   if (i != 1) {
                      if (i == 2) {
                         i = tb.a;
                      }else {
                         throw new NoWhenBranchMatchedException();
                      }
                   }else {
                      i = tb.b;
                   }
                }
                a value = liveData.getValue();
                if (value == null || value.d() == p2.d()) {
                   tb.r0(liveData).setValue(p2);
                }else {
                   tb.r0(p1).setValue(p2);
                   MutableLiveData mutableLiveD = tb.r0(tb.c);
                   i = h.c[uFlipperPosi.ordinal()];
                   if (i != 1) {
                      if (i == 2) {
                         i = LiveGiftNamingNavigationVM$FlipperPosition.FIRST;
                      }else {
                         throw new NoWhenBranchMatchedException();
                      }
                   }else {
                      i = LiveGiftNamingNavigationVM$FlipperPosition.SECOND;
                   }
                   mutableLiveD.setValue(i);
                }
             }
             this.b.h.b(p2);
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftNamingNavigationVM$observer$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
