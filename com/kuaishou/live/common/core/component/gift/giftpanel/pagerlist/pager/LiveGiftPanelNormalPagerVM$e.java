package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$e;
import yg1.a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM;
import ul1.b;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import ch1.a;
import java.util.List;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ch1.c;
import ul1.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import xi1.a;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$PagerStatus;

public final class LiveGiftPanelNormalPagerVM$e implements a	// class@0012f7
{
    public final LiveGiftPanelNormalPagerVM a;
    public final b b;
    public final int c;

    public void LiveGiftPanelNormalPagerVM$e(LiveGiftPanelNormalPagerVM p0,b p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftPanelNormalPagerVM$e.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          LiveGiftPanelNormalPagerVM$e ta = this.a;
          String str = this.b.a();
          LiveGiftPanelNormalPagerVM$e tc = this.c;
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(LiveGiftPanelNormalPagerVM.class) || !PatchProxy.applyVoidThreeRefs(p1, str, Integer.valueOf(tc), ta, LiveGiftPanelNormalPagerVM.class, "6")) {
             int i = 1;
             if (tc != i || ta.a.getValue() == null) {
                if (p1.e()) {
                   p1 = p1.c();
                   if (p1 != null && (i ^ p1.a().isEmpty())) {
                      ArrayList uArrayList = PatchProxy.applyTwoRefs(p1, str, ta, LiveGiftPanelNormalPagerVM.class, "4");
                      if (uArrayList != PatchProxyResult.class) {
                      }else {
                         p1 = p1.a();
                         uArrayList = new ArrayList(u.Y(p1, 10));
                         int i1 = 0;
                         p1 = p1.iterator();
                         while (p1.hasNext()) {
                            Object obj = p1.next();
                            int i2 = i1 + 1;
                            if (i1 < 0) {
                               CollectionsKt__CollectionsKt.W();
                            }
                            int i3 = i1 % 8;
                            i1 = i1 / 8;
                            uArrayList.add(new a(i3, i1, obj, str));
                            i1 = i2;
                         }
                      }
                      p1 = ta.g;
                      p1 = (p1 != null)? p1.a(): null;
                      if (p1 != null) {
                         uArrayList = CollectionsKt___CollectionsKt.f5(uArrayList, a.d.a(p1));
                      }
                      ta.r0(ta.a).setValue(uArrayList);
                      ta.r0(ta.b).setValue(LiveGiftPanelNormalPagerVM$PagerStatus.SUCCESS);
                   }else {
                      ta.r0(ta.b).setValue(LiveGiftPanelNormalPagerVM$PagerStatus.EMPTY);
                   }
                }else {
                   ta.r0(ta.b).setValue(LiveGiftPanelNormalPagerVM$PagerStatus.FAIL);
                }
             }
          }
       }
       return;
    }
}
