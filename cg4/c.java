package cg4.c;
import eg4.a;
import java.lang.Object;
import java.util.ArrayList;
import gd4.b;
import java.lang.StringBuilder;
import java.lang.String;
import cg4.c$k;
import su.a;
import java.lang.Class;
import cg4.c$s;
import cg4.c$t;
import cg4.c$u;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailCouponInfo;
import cg4.c$v;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemStockInfo;
import cg4.c$w;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.BannerInfo;
import cg4.c$x;
import com.kuaishou.merchant.transaction.base.model.live.CertificatePropInfo;
import cg4.c$y;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceWrapper;
import cg4.c$z;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.global.DetailGlobalInfo;
import cg4.c$a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailExpressInfo;
import cg4.c$b;
import vg4.k;
import cg4.c$c;
import vg4.l;
import cg4.c$d;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse$ShopInfo;
import cg4.c$e;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailSaleRoomResponse;
import cg4.c$f;
import hg4.a;
import cg4.c$g;
import vh4.a;
import cg4.c$h;
import oh4.e;
import cg4.c$i;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.LoveRecyclingInfo;
import cg4.c$j;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.UseRuleInfo;
import cg4.c$l;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.AtmosphereInfo;
import cg4.c$m;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.PreSellProgressInfo;
import cg4.c$n;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse;
import cg4.c$o;
import nsd.u;
import cg4.c$p;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse$HeadInfo;
import cg4.c$q;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commoditysku.b;
import cg4.c$r;
import com.kwai.robust.PatchProxy;
import java.util.List;

public final class c	// class@000547
{
    public final List a;
    public final String b;

    public void c(){
       super();
       this.a = new ArrayList();
       this.b = "_2.0";
       this.a(new b("detail_half_delete"+"_2.0", c$k.a, a.class));
       this.a(new b("detail_full_delete"+"_2.0", c$s.a, a.class));
       this.a(new b("detail_installment"+"_2.0", c$t.a, a.class));
       this.a(new b("detail_coupon"+"_2.0", c$u.a, DetailCouponInfo.class));
       this.a(new b("detail_progress_bar"+"_2.0", c$v.a, ItemStockInfo.class));
       this.a(new b("detail_price_banner"+"_2.0", c$w.a, BannerInfo.class));
       this.a(new b("detail_certificate"+"_2.0", c$x.a, CertificatePropInfo.class));
       this.a(new b("detail_service"+"_2.0", c$y.a, DetailServiceWrapper.class));
       this.a(new b("detail_global"+"_2.0", c$z.a, DetailGlobalInfo.class));
       this.a(new b("detail_express"+"_2.0", c$a.a, DetailExpressInfo.class));
       this.a(new b("detail_comment_list"+"_2.0", c$b.a, k.class));
       this.a(new b("detail_comment_rate"+"_2.0", c$c.a, l.class));
       this.a(new b("detail_shop"+"_2.0", c$d.a, DetailResponse$ShopInfo.class));
       this.a(new b("detail_sale_room"+"_2.0", c$e.a, DetailSaleRoomResponse.class));
       this.a(new b("detail_meal_item"+"_2.0", c$f.a, a.class));
       this.a(new b("detail_prop"+"_2.0", c$g.a, a.class));
       this.a(new b("detail_official_fidelity_with_service"+"_2.0", c$h.a, e.class));
       this.a(new b("detail_love_recycling"+"_2.0", c$i.a, LoveRecyclingInfo.class));
       this.a(new b("detail_use_rule"+"_2.0", c$j.a, UseRuleInfo.class));
       this.a(new b("detail_atmosphere"+"_2.0", c$l.a, AtmosphereInfo.class));
       this.a(new b("detail_presell_progress"+"_2.0", c$m.a, PreSellProgressInfo.class));
       this.a(new b("merchant_detail_title_bar"+"_2.0", c$n.a, DetailResponse.class));
       b uob = new b("detail_full_head_photo"+"_2.0", c$o.a, null, 4, null);
       this.a(v0);
       this.a(new b("detail_half_head_photo"+"_2.0", c$p.a, DetailResponse$HeadInfo.class));
       this.a(new b("detail_sku_list"+"_2.0", c$q.a, b.class));
       this.a(new b("detail_individual_half_head_photo"+"_2.0", c$r.a, Object.class));
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
}
