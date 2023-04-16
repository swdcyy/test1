package com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabVM$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabVM;
import java.lang.Object;
import ul1.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import msd.l;
import ah1.c;

public final class LiveGiftPanelNormalTabVM$b implements Observer	// class@0012fe
{
    public final LiveGiftPanelNormalTabVM b;

    public void LiveGiftPanelNormalTabVM$b(LiveGiftPanelNormalTabVM p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalTabVM$b.class, "1")) {
       }else {
          LiveGiftPanelNormalTabVM$b tb = this.b;
          tb.r0(tb.u0()).setValue(Boolean.valueOf(this.b.w0()));
          tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveGiftPanelNormalTabVM.class, "5") && tb.a == null) {
             tb.a = true;
             MutableLiveData mutableLiveD = tb.r0(tb.b);
             mutableLiveD.setValue(tb.l.invoke(p0.a()));
          }
          this.b.x0(p0);
          this.b.k.e("tab_show", p0);
       }
       return;
    }
}
