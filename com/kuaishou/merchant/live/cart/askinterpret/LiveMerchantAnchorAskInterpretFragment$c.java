package com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment$c;
import qvb.f;
import com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.kuaishou.merchant.live.cart.askinterpret.model.LiveAnchorAskInterpretResponse;
import d34.c;
import d34.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import cjd.e;
import erd.o;
import java.util.List;
import la6.b;
import java.util.Collection;
import ekd.q;
import x24.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchCommodityDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommodityDetailPackage;
import com.kuaishou.merchant.live.cart.askinterpret.model.LiveAnchorAskInterpretResponse$AskInterpretInfo;
import k2b.u1;

public class LiveMerchantAnchorAskInterpretFragment$c extends f	// class@0018f8
{
    public final LiveMerchantAnchorAskInterpretFragment p;

    public void LiveMerchantAnchorAskInterpretFragment$c(LiveMerchantAnchorAskInterpretFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       String obj = PatchProxy.apply(null, this, LiveMerchantAnchorAskInterpretFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!this.K() && this.L0() != null)? this.L0().getCursor(): "0";
       return b.a().d1(this.p.z.getLiveStreamId(), obj, 20).map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(LiveAnchorAskInterpretResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantAnchorAskInterpretFragment$c.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (!q.f(p1)) {
          String liveStreamId = this.p.z.getLiveStreamId();
          String liveAuthorId = this.p.z.getLiveAuthorId();
          if (!PatchProxy.applyVoidThreeRefs(liveStreamId, liveAuthorId, p1, null, a.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "EXPLAIN_GOOD_LIST";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = new ClientContent$LiveStreamPackage();
             if (!TextUtils.isEmpty(liveStreamId)) {
                uContentPack.liveStreamPackage.liveStreamId = liveStreamId;
             }
             if (!TextUtils.isEmpty(liveAuthorId)) {
                liveStreamId.anchorUserId = liveAuthorId;
             }
             ClientContent$BatchCommodityDetailPackage uBatchCommod = new ClientContent$BatchCommodityDetailPackage();
             ClientContent$CommodityDetailPackage[] uCommodityDe = new ClientContent$CommodityDetailPackage[p1.size()];
             uBatchCommod.commodityDetailPackage = uCommodityDe;
             for (int i = 0; i < p1.size(); i = i + 1) {
                ClientContent$CommodityDetailPackage uCommodityDe1 = new ClientContent$CommodityDetailPackage();
                uCommodityDe1.id = p1.get(i).itemId;
                uBatchCommod.commodityDetailPackage[i] = uCommodityDe1;
             }
             uContentPack.batchCommodityDetailPackage = uBatchCommod;
             u1.u0(3, uElementPack, uContentPack);
          }
       }
       return;
    }
}
