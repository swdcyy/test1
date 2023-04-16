package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM;
import java.lang.Object;
import java.lang.String;
import ul1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import wl1.j;
import ch1.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import yg1.f;
import java.util.List;
import java.lang.Number;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class LiveGiftPanelPagerListVM$2 implements Model$a	// class@0012e6
{
    public final LiveGiftPanelPagerListVM b;

    public void LiveGiftPanelPagerListVM$2(LiveGiftPanelPagerListVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelPagerListVM$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       Integer integer;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelPagerListVM$2.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             j oj = this.b.w0();
             p1 = p2.b();
             Objects.requireNonNull(oj);
             p2 = PatchProxy.applyOneRefs(p1, oj, j.class, "6");
             if (p2 != PatchProxyResult.class) {
             }else {
                a.p(p1, "tabInfo");
                f uof = oj.a();
                if (uof != null) {
                   List list = uof.c();
                   if (list != null) {
                      integer = Integer.valueOf(list.indexOf(p1));
                   label_0055 :
                      if (integer != null && integer.intValue() == -1) {
                         integer = Integer.valueOf(0);
                      }
                      p2 = integer;
                   }
                }
                integer = null;
                goto label_0055 ;
             }
             if (p2 != null) {
                p1 = this.b;
                p1.r0(p1.v0()).setValue(Integer.valueOf(p2.intValue()));
             }
          }
       }
       return;
    }
}
