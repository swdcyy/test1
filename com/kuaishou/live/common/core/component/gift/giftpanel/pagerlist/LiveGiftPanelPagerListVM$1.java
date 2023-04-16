package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import wl1.j;
import java.util.Objects;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ch1.d;
import java.util.Map;
import wl1.e;
import ch1.e;
import trd.u;
import ul1.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftPanelPagerListVM$1 implements Model$a	// class@0012e5
{
    public final LiveGiftPanelPagerListVM b;

    public void LiveGiftPanelPagerListVM$1(LiveGiftPanelPagerListVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       p1 = PatchProxyResult.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelPagerListVM$1.class, "1")) {
       }else {
          a.p(p0, "source");
          LiveGiftPanelPagerListVM$1 tb = this.b;
          MutableLiveData mutableLiveD = tb.r0(tb.u0());
          p2 = this.b.w0();
          Objects.requireNonNull(p2);
          Object[] objArray = null;
          ArrayList uArrayList = PatchProxy.apply(objArray, p2, j.class, "5");
          if (uArrayList != p1) {
          }else {
             f uof = p2.a();
             if (uof != null) {
                List list = uof.c();
                if (list != null) {
                   ArrayList uArrayList1 = new ArrayList();
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      e uoe1 = p2.i.get(iterator.next().a());
                      if (uoe1 != null) {
                         uArrayList1.add(uoe1);
                      }
                   }
                   uArrayList = uArrayList1;
                }
             }
             uArrayList = new ArrayList();
          }
          p2 = PatchProxy.applyOneRefs(uArrayList, objArray, e.class, "1");
          if (p2 != p1) {
          }else {
             a.p(uArrayList, "$this$toPagerDataWrapper");
             p2 = new ArrayList(u.Y(uArrayList, 10));
             p1 = uArrayList.iterator();
             while (p1.hasNext()) {
                e uoe = p1.next();
                p2.add(new b(uoe, uoe.l));
             }
          }
          mutableLiveD.setValue(p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelPagerListVM$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
