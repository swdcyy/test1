package lz0.c$a;
import bk2.e$a;
import lz0.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import xz6.d;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.yxcorp.gifshow.models.Gift;
import androidx.collection.ArrayMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.util.Map;
import w91.a;
import lp3.c;
import lp3.i;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import mk1.b;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;
import k2b.e0;
import ik1.a0;
import java.util.Objects;

public class c$a implements e$a	// class@003080
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       c$a a;
       Object obj = this;
       int i = p0;
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uoa, "2")) {
          return;
       }
       if (!q.f(obj.a.J.d()) && (i < obj.a.J.d().size() && (obj.a.J.d().get(i) != null && obj.a.J.d().get(i).getGift() != null))) {
          ArrayMap uArrayMap = new ArrayMap();
          uArrayMap.put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
          uArrayMap.putAll(obj.a.x.a(a.class).d6());
          a0.k(obj.a.w.Z2.b(), obj.a.w.Z2.a(), obj.a.w.Z2.y(), obj.a.B.i(), obj.a.q.getCurrentPosition(), obj.a.W8(), uArrayMap, obj.a.J.d().get(i).getGift(), (i + 1));
          a = obj.a;
          c b = a.B;
          Gift gift = a.J.d().get(i).getGift();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(b, gift, a, c.class, "34")) {
             a.h9(b, gift, "CLIENT_GIFT_BOX_ITEM_SHOW", "[LiveAudienceGiftBoxSimpleGiftPresenter][logRecyclerViewGiftItemExposeTraceInfo]gift item show", 1);
          }
       }
    label_00f4 :
       return;
    }
    public void b(int p0,Object p1){
       Object obj = this;
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, obj, uoa, "1")) {
          return;
       }
       ArrayMap uArrayMap = new ArrayMap();
       uArrayMap.put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
       uArrayMap.putAll(obj.a.x.a(a.class).d6());
       a0.l(obj.a.w.Z2.b(), obj.a.w.Z2.a(), obj.a.w.Z2.y(), obj.a.B.i(), obj.a.J.d(), obj.a.q.getPageSize(), obj.a.q.getCurrentPosition(), obj.a.W8(), uArrayMap);
       uoa = obj.a;
       c b = uoa.B;
       c q = uoa.q;
       c j = uoa.J;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidThreeRefs(b, q, j, uoa, c.class, "33")) {
          int pageSize = q.getPageSize();
          int currentPosit = q.getCurrentPosition();
          List list = j.d();
          int i = pageSize * currentPosit;
          int i1 = currentPosit + 1;
          i1 = i1 * pageSize;
          while (i < i1 && i < list.size()) {
             Gift gift = list.get(i).getGift();
             if (gift != null) {
                uoa.h9(b, gift, "CLIENT_GIFT_BOX_ITEM_SHOW", "[LiveAudienceGiftBoxSimpleGiftPresenter][logGiftItemExposeTraceInfo]gift item show", 1);
             }
             i = i + 1;
          }
       }
       return;
    }
}
