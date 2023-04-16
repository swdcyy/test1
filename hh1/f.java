package hh1.f;
import yg1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.giftstore.api.PrivilegeGiftListResponse;
import yg1.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rm1.j;
import java.util.Objects;
import rm1.j$a;
import ch1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGiftWrapper;
import java.util.List;
import java.lang.Integer;
import trd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGift;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import rm1.f;
import ch1.c;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import java.util.Map;
import nsd.u;

public final class f implements c	// class@0026b6
{
    public final LiveGiftPanelConfig a;

    public void f(LiveGiftPanelConfig p0){
       a.p(p0, "config");
       super();
       this.a = p0;
    }
    public Object a(Object p0){
       return this.b(p0);
    }
    public f b(PrivilegeGiftListResponse p0){
       j$a a;
       Object obj3;
       ArrayList uArrayList1;
       Object obj = this;
       PrivilegeGiftListResponse obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, f.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = "response";
       a.p(obj1, obj2);
       a = j.a;
       f a1 = obj.a;
       Objects.requireNonNull(a);
       a uoa = PatchProxy.applyTwoRefs(a1, obj1, a, j$a.class, "2");
       if (uoa != patchProxyRe) {
       }else {
          a.p(a1, "config");
          a.p(obj1, obj2);
          PrivilegeGiftListResponse mGiftToken = obj1.mGiftToken;
          PrivilegeGiftListResponse privilegeGif = (mGiftToken != null)? mGiftToken: "";
          obj1 = obj1.mGiftWrappers;
          if (obj1 != null) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = obj1.iterator();
             int i = 0;
             while (iterator.hasNext()) {
                obj3 = iterator.next();
                Object obj4 = obj3;
                if (a1.f().contains(Integer.valueOf(obj4.giftType)) && obj4.mGift != null) {
                   i = 1;
                }
                if (i) {
                   uArrayList.add(obj3);
                }
             }
             uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
             Iterator iterator1 = uArrayList.iterator();
             int i1 = 0;
             while (iterator1.hasNext()) {
                obj3 = iterator1.next();
                i = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                GiftPanelItem giftPanelIte = f.k(obj3.convertToPrivilegeGift(), 4);
                giftPanelIte.mWealthGradeScore = (long)obj3.mWealthGradeScore;
                giftPanelIte.mLiveVipGradeScore = obj3.mLiveVipGradeScore;
                a.o(giftPanelIte, "item");
                uArrayList1.add(j.a.b(a1, i1, giftPanelIte, privilegeGif, ""));
                i1 = i;
             }
          }else {
             uArrayList1 = CollectionsKt__CollectionsKt.E();
          }
          a uoa1 = new a("PrivilegeGift", uArrayList1, privilegeGif, "", null, null, 48, null);
       }
       return new f(1, "", uoa);
    }
}
