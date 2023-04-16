package c24.n;
import cb4.e;
import fq5.b;
import sr5.a;
import as3.a;
import java.lang.Object;
import i24.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Boolean;
import android.net.Uri;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import ekd.x0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommodityDetailPackage;
import ot3.l0;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.framework.model.feed.BaseFeed;
import r14.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.merchant.live.d;
import java.lang.Integer;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.CommonParams;
import r74.e;

public class n implements e	// class@00048d
{
    public final b a;
    public final a b;
    public final a c;
    public LiveMerchantBaseContext d;

    public void n(b p0){
       super(p0, null, null);
    }
    public void n(b p0,a p1,a p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       LiveMerchantBaseContext liveMerchant = PatchProxy.applyThreeRefs(p1, p2, p0, null, d.class, "3");
       if (liveMerchant != PatchProxyResult.class) {
       }else if(p1 != null){
          liveMerchant = d.c(p1, p2);
       }else {
          liveMerchant = d.b(p0, 2);
       }
       this.d = liveMerchant;
       return;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       n b1;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       boolean i1;
       Object obj = this;
       RouterConfig obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, on, "1");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       boolean b = false;
       if (obj1 == null) {
          return b;
       }
       Uri uri = p0.d();
       obj1 = p0.c();
       if (obj1 == null) {
          return b;
       }
       Map map = obj1.c();
       String str = "name";
       String str1 = x0.a(uri, str);
       String obj3 = PatchProxy.applyOneRefs(map, obj, on, "6");
       ClientContent$LiveStreamPackage liveStreamPa = 3;
       if (obj3 != patchProxyRe) {
       }else if(map == null){
          obj3 = null;
       }else {
          obj3 = new ClientContent$CommodityDetailPackage();
          obj3.id = l0.i("itemId", map);
          obj3.name = l0.i("title", map);
          i1 = l0.e("saleType", map);
          obj3.itemActivityType = i1;
          obj3.itemType = l0.e("source", map);
          i1 = (i1 == liveStreamPa)? true: false;
          obj3.isSeckill = i1;
       }
       Object obj4 = obj3;
       String str2 = l0.i("extraParams", map);
       a.t(MerchantCommonLogBiz.ROUTER, "LiveHotExplainLoggerHandler", "handle hot explain dy router", str, str1);
       Objects.requireNonNull(str1);
       int i = -1;
       obj3 = 2;
       switch (str1.hashCode()){
           case 0xb635c094:
             if (str1.equals("explainShow")) {
                i = 0;
             }
             break;
           case 0xed22e93b:
             if (str1.equals("hotClick")) {
                i = 1;
             }
             break;
           case 0xfa292d1:
             if (str1.equals("explainClick")) {
                i = 2;
             }
             break;
           case 0x417bf4ea:
             if (str1.equals("hotShow")) {
                i = 3;
             }
             break;
           default:
       }
    label_00b6 :
       String str3 = "CARD_INTERPRET_PENDANT";
       switch (i){
           case 0:
             liveStreamPa = obj.d.getLiveStreamPackage();
             if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj4, str2, this, n.class, "2")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = str3;
                uElementPack.params = str2;
                uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                uContentPack.commodityDetailPackage = obj4;
                u1.D0("", obj.a.b(), 3, uElementPack, uContentPack, null);
             }
             b1 = obj.b;
             if (b1 != null) {
                d.e(b1.j0());
             }
             break;
           case 1:
             str = "bubbleType";
             i1 = l0.e(str, map);
             ClientContent$LiveStreamPackage liveStreamPa1 = obj.d.getLiveStreamPackage();
             FeedLogCtx feedLogCtx = obj.d.getFeedLogCtx();
             if (PatchProxy.isSupport(on)) {
                Object[] objArray = new Object[]{liveStreamPa1,obj4,feedLogCtx,str2,Integer.valueOf(i1)};
                if (PatchProxy.applyVoid(objArray, obj, on, "5")) {
                label_01e5 :
                   i.c(obj.d.getLiveFeed(), l0.i("itemId", map));
                }
             }
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "MERCHANT_WEAK_STYLE_BUBBLE_CLICK";
             uElementPack1.params = str2;
             ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
             uContentPack1.liveStreamPackage = liveStreamPa1;
             uContentPack1.commodityDetailPackage = obj4;
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0(str, Integer.valueOf(i1));
             u1.B(new ClickMetaData().setType(true).setElementPackage(uElementPack1).setLogPage(obj.a.b()).setContentPackage(uContentPack1).setCommonParams(e.a("LIVE_WATCH", "MERCHANT_WEAK_STYLE_BUBBLE_CLICK", uContentPack1, jsonObject)).setFeedLogCtx(feedLogCtx));
             goto label_01e5 ;
             break;
           case 2:
             ClientContent$LiveStreamPackage liveStreamPa2 = obj.d.getLiveStreamPackage();
             FeedLogCtx feedLogCtx1 = obj.d.getFeedLogCtx();
             if (!PatchProxy.applyVoidFourRefs(liveStreamPa2, obj4, feedLogCtx1, str2, this, n.class, "3")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = str3;
                uElementPack.params = str2;
                uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa2;
                uContentPack.commodityDetailPackage = obj4;
                u1.B(new ClickMetaData().setType(true).setLogPage(obj.a.b()).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(feedLogCtx1));
             }
             b1 = obj.b;
             if (b1 != null) {
                d.c(b1.j0(), l0.i("itemId", map));
             }
             break;
           case 3:
             liveStreamPa = obj.d.getLiveStreamPackage();
             if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj4, str2, this, n.class, "4")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MERCHANT_WEAK_STYLE_BUBBLE_SHOW";
                uElementPack.params = str2;
                uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                uContentPack.commodityDetailPackage = obj4;
                u1.D0("", obj.a.b(), 7, uElementPack, uContentPack, null);
             }
             i.g(obj.d.getLiveFeed());
             break;
           default:
       }
    label_0239 :
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
