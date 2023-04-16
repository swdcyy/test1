package com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$comboVisibleModelObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class LiveComboVM$comboVisibleModelObserver$1 implements Model$a	// class@00118a
{
    public final LiveComboVM b;

    public void LiveComboVM$comboVisibleModelObserver$1(LiveComboVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveComboVM$comboVisibleModelObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       Object obj = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, obj, p2, this, LiveComboVM$comboVisibleModelObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          b.e0(LiveGiftTag.COMBO, "[LiveComboVM]comboVisibleModel value change", "source", p0, "newValue", p2, "oldValue", obj);
          LiveComboVM$comboVisibleModelObserver$1 tb = this.b;
          p1 = Boolean.TRUE;
          tb.r0(tb.x0()).setValue(Boolean.valueOf(a.g(p2, p1)));
          tb = this.b;
          tb.r0(tb.w0()).setValue(Boolean.valueOf(a.g(p2, p1)));
          tb = this.b;
          tb.r0(tb.v0()).setValue(Boolean.valueOf(a.g(p2, p1)));
       }
       return;
    }
}
