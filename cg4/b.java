package cg4.b;
import eg4.a;
import java.lang.Object;
import java.util.ArrayList;
import gd4.b;
import cg4.b$k;
import java.lang.String;
import su.a;
import java.lang.Class;
import cg4.b$v;
import cg4.b$y;
import nsd.u;
import cg4.b$z;
import cg4.b$a0;
import cg4.b$b0;
import cg4.b$c0;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailCouponInfo;
import cg4.b$d0;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemStockInfo;
import cg4.b$e0;
import com.kuaishou.merchant.transaction.base.model.live.CertificatePropInfo;
import cg4.b$a;
import ch4.a;
import cg4.b$b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceWrapper;
import cg4.b$c;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.global.DetailGlobalInfo;
import cg4.b$d;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailExpressInfo;
import cg4.b$e;
import vg4.k;
import cg4.b$f;
import vg4.l;
import cg4.b$g;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse$ShopInfo;
import cg4.b$h;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailSaleRoomResponse;
import cg4.b$i;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailPositiveInfo;
import cg4.b$j;
import hg4.a;
import cg4.b$l;
import vh4.a;
import cg4.b$m;
import mh4.a;
import cg4.b$n;
import cg4.b$o;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import cg4.b$p;
import ed4.a;
import cg4.b$q;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.LoveRecyclingInfo;
import cg4.b$r;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.UseRuleInfo;
import cg4.b$s;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.AtmosphereInfo;
import cg4.b$t;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.PreSellProgressInfo;
import cg4.b$u;
import yf4.a;
import cg4.b$w;
import com.kuaishou.merchant.transaction.detail.expandandcollapse.ExpandAndCollapseInfo;
import cg4.b$x;
import com.kwai.robust.PatchProxy;
import java.util.List;

public final class b	// class@00052c
{
    public final List a;

    public void b(){
       b uob = this;
       super();
       uob.a = new ArrayList();
       uob.a(new b("detail_half_delete", b$k.a, a.class));
       uob.a(new b("detail_full_delete", b$v.a, a.class));
       b uob1 = new b("detail_half_head_photo", b$y.a, null, 4, null);
       uob.a(v2);
       b uob2 = new b("detail_full_head_photo", b$z.a, null, 4, null);
       uob.a(v2);
       b uob3 = new b("detail_sku_list", b$a0.a, null, 4, null);
       uob.a(v2);
       uob.a(new b("detail_installment", b$b0.a, a.class));
       uob.a(new b("detail_coupon", b$c0.a, DetailCouponInfo.class));
       uob.a(new b("detail_progress_bar", b$d0.a, ItemStockInfo.class));
       uob.a(new b("detail_certificate", b$e0.a, CertificatePropInfo.class));
       uob.a(new b("detail_divider", b$a.a, a.class));
       uob.a(new b("detail_service", b$b.a, DetailServiceWrapper.class));
       uob.a(new b("detail_global", b$c.a, DetailGlobalInfo.class));
       uob.a(new b("detail_express", b$d.a, DetailExpressInfo.class));
       uob.a(new b("detail_comment_list", b$e.a, k.class));
       uob.a(new b("detail_comment_rate", b$f.a, l.class));
       uob.a(new b("detail_shop", b$g.a, DetailResponse$ShopInfo.class));
       uob.a(new b("detail_sale_room", b$h.a, DetailSaleRoomResponse.class));
       uob.a(new b("detail_positive_message", b$i.a, DetailPositiveInfo.class));
       uob.a(new b("detail_meal_item", b$j.a, a.class));
       uob.a(new b("detail_prop", b$l.a, a.class));
       uob.a(new b("detail_images", b$m.a, a.class));
       uob.a(new b("detail_guess_title", b$n.a, a.class));
       uob.a(new b("detail_guess_commodity", b$o.a, MerchantRecommendInfoModel.class));
       uob.a(new b("detail_guess_like_commodity_2.0", b$p.a, a.class));
       uob.a(new b("detail_love_recycling", b$q.a, LoveRecyclingInfo.class));
       uob.a(new b("detail_use_rule", b$r.a, UseRuleInfo.class));
       uob.a(new b("detail_atmosphere", b$s.a, AtmosphereInfo.class));
       uob.a(new b("detail_presell_progress", b$t.a, PreSellProgressInfo.class));
       uob.a(new b("detail_common_card", b$u.a, a.class));
       uob.a(new b("detail_expand_and_collapse", b$w.a, ExpandAndCollapseInfo.class));
       uob.a(new b("detail_individual_half_head_photo", b$x.a, Object.class));
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
}
