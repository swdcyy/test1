package com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabDataBinding$bindViewModel$2$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import zl1.c;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabVM;
import java.lang.Boolean;
import zl1.f;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;

public final class LiveGiftPanelNormalTabDataBinding$bindViewModel$2$1 implements Model$a	// class@0012fb
{
    public final c b;

    public void LiveGiftPanelNormalTabDataBinding$bindViewModel$2$1(c p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalTabDataBinding$bindViewModel$2$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       f a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelNormalTabDataBinding$bindViewModel$2$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             Boolean value = this.b.d.u0().getValue();
             if (value == null) {
                value = Boolean.FALSE;
             }
             a.o(value, "viewModel.selected.value ?: false");
             p1 = this.b.b;
             a = p1.a;
             a.o(a, "titleView");
             p1.a(p2, value.booleanValue(), a);
          }
       }
       return;
    }
}
