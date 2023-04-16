package hh1.d;
import yg1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fh1.b;
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

public final class d implements c	// class@0026b1
{
    public final LiveGiftPanelConfig a;

    public void d(LiveGiftPanelConfig p0){
       a.p(p0, "config");
       super();
       this.a = p0;
    }
    public Object a(Object p0){
       return this.b(p0);
    }
    public f b(b p0){
       j$a a;
       Object obj3;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, d.class, str);
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = "response";
       a.p(obj1, obj2);
       a = j.a;
       d a1 = obj.a;
       Objects.requireNonNull(a);
       a uoa = PatchProxy.applyTwoRefs(a1, obj1, a, j$a.class, str);
       if (uoa != patchProxyRe) {
       }else {
          a.p(a1, "config");
          a.p(obj1, obj2);
          b giftToken = obj1.giftToken;
          b uob = (giftToken != null)? giftToken: "";
          giftToken = obj1.recoGiftLlsid;
          b uob1 = (giftToken != null)? giftToken: "";
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = obj1.giftPanelItems.iterator();
          j$a uoa1 = null;
          while (iterator.hasNext()) {
             obj3 = iterator.next();
             Object obj4 = obj3;
             if (a1.f().contains(Integer.valueOf(obj4.mItemType)) && obj4.getGift() != null) {
                uoa1 = 1;
             }
             if (uoa1) {
                uArrayList.add(obj3);
             }
          }
          ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator1 = uArrayList.iterator();
          int i = 0;
          while (iterator1.hasNext()) {
             obj3 = iterator1.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             uArrayList1.add(j.a.b(a1, i, obj3, uob, uob1));
             i = i1;
          }
          a uoa2 = new a("NormalGift", uArrayList1, uob, uob1, obj1.newGiftInfo, null, 32, null);
       }
       return new f(1, "", uoa);
    }
}
