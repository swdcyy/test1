package hh1.b;
import yg1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import yg1.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rm1.j;
import java.util.Objects;
import rm1.j$a;
import ch1.a;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ExtraInfoType;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.gifshow.models.Gift;
import trd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ch1.c;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import java.util.Map;
import nsd.u;

public final class b implements c	// class@0026ac
{
    public final LiveGiftPanelConfig a;

    public void b(LiveGiftPanelConfig p0){
       a.p(p0, "config");
       super();
       this.a = p0;
    }
    public Object a(Object p0){
       return this.b(p0);
    }
    public f b(GiftPanelListResponse p0){
       j$a a;
       Object obj = this;
       GiftPanelListResponse obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, b.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = "response";
       a.p(obj1, obj2);
       a = j.a;
       b a1 = obj.a;
       Objects.requireNonNull(a);
       a uoa = PatchProxy.applyTwoRefs(a1, obj1, a, j$a.class, "3");
       if (uoa != patchProxyRe) {
       }else {
          a.p(a1, "config");
          a.p(obj1, obj2);
          GiftPanelListResponse mGiftToken = obj1.mGiftToken;
          GiftPanelListResponse giftPanelLis = (mGiftToken != null)? mGiftToken: "";
          mGiftToken = obj1.mRecoGiftLlsid;
          GiftPanelListResponse giftPanelLis1 = (mGiftToken != null)? mGiftToken: "";
          HashMap hashMap = new HashMap();
          GiftPanelListResponse mIntimacyInf = obj1.mIntimacyInfo;
          String str = "it";
          if (mIntimacyInf != null) {
             a.o(mIntimacyInf, str);
             hashMap.put(LiveGiftBoxConfig$ExtraInfoType.FANS_GROUP_INTIMACY, mIntimacyInf);
          }
          obj1 = obj1.mGiftPanelItems;
          a.o(obj1, "response.mGiftPanelItems");
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = obj1.iterator();
          b uob = null;
          while (iterator.hasNext()) {
             Object obj3 = iterator.next();
             Object obj4 = obj3;
             if (a1.f().contains(Integer.valueOf(obj4.mItemType))) {
                a.o(obj4, str);
                if (obj4.getGift() != null) {
                   uob = 1;
                }
             }
             if (uob) {
                uArrayList.add(obj3);
             }
          }
          ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator1 = uArrayList.iterator();
          int i = 0;
          while (iterator1.hasNext()) {
             Object obj5 = iterator1.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             Object obj6 = obj5;
             obj6.parseGift();
             a.o(obj6, "item");
             uArrayList1.add(j.a.b(a1, i, obj6, giftPanelLis, giftPanelLis1));
             i = i1;
          }
          a uoa1 = new a("FansGroupGift", uArrayList1, giftPanelLis, giftPanelLis1, null, hashMap, 16, null);
       }
       return new f(1, "", uoa);
    }
}
