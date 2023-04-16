package add.f;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import add.e;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import nfd.z0;
import com.yxcorp.plugin.search.entity.template.aggregate.BigCardExternalFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.BigCardExternalPhotoModel;
import ddd.i;
import nfd.p1;
import tkd.b;
import tkd.d;
import nl9.v;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import com.yxcorp.plugin.search.response.SearchCommodityItem;
import com.yxcorp.plugin.search.entity.CommodityLiveStatus;

public class f	// class@0000e4
{

    public void f(){
       super();
    }
    public static int a(SearchItem p0){
       int i;
       SearchItem obj1;
       boolean b1;
       Object obj4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       KBoxItem obj = PatchProxy.applyOneRefs(p0, null, uof, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       boolean b = true;
       if (p0.mItemType == SearchItem$SearchItemType.KBOX) {
          obj = PatchProxy.applyOneRefs(p0, null, uof, "7");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else {
             obj = p0.mKBoxItem.mType;
             if (obj == b) {
                i = e.Y;
             }else if(obj == 4){
                i = e.Z;
             }else if(obj == 2){
                i = e.a0;
             }else if(obj == 5){
                if (p0.weakStyleKbox()) {
                   i = e.c0;
                }else {
                   i = e.b0;
                }
             }else if(obj == 6){
                obj1 = PatchProxy.applyOneRefs(p0, null, uof, "8");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else {
                   KBoxItem mKBoxFeeds = p0.mKBoxItem.mKBoxFeeds;
                   if (q.f(mKBoxFeeds)) {
                      i = e.b;
                   }else {
                      TemplateBaseFeed templateBase = mKBoxFeeds.get(0);
                      if (z0.f(templateBase)) {
                         i = e.d0;
                      }else if(z0.g(templateBase)){
                         i = e.e0;
                      }else if(z0.e(templateBase)){
                         i = e.f0;
                      }else if(templateBase instanceof BigCardExternalFeed && templateBase.mAcfunModel.mMediaManifest != null){
                         b = 0;
                      }
                      if (b) {
                         i = e.g0;
                      }else {
                         i = e.b;
                      }
                   }
                }
             }else if(obj == 3){
                i = e.h0;
             }else if(obj == 7){
                i = e.C;
             }else if(obj == 10){
                i = e.B;
             }else if(obj == 12){
                i = e.i0;
             }else if(obj == 13){
                i = (p0.weakStyleKbox())? e.N0: e.j0;
             }else if(obj == 14){
                i = e.l0;
             }else if(obj == 15){
                i = e.m0;
             }else if(obj == 18){
                i = e.n0;
             }else if(obj == 19){
                i = e.o0;
             }else if(obj == 20){
                i = e.p0;
             }else if(obj == 22){
                i = e.q0;
             }else if(obj == 23){
                i = e.r0;
             }else if(obj == 24){
                i = e.E0;
             }else if(obj == 26){
                i = e.G0;
             }else if(obj == 99){
                i = e.Q0;
             }else if(obj == 98){
                if (p0.weakStyleKbox()) {
                   i = e.T0;
                }else if(p0.mAtmosphereResource != null){
                   i = e.S0;
                }else {
                   i = e.R0;
                }
             }else if(obj == 27){
                i = e.H0;
             }else if(obj == 28){
                i = e.I0;
             }else if(obj == 32){
                i = e.K0;
             }else if(obj == 33){
                i = e.L0;
             }else if(obj == 34){
                i = e.O0;
             }else if(obj == 35){
                i = e.P0;
             }else if(obj == 0x2711){
                i = e.C0;
             }else if(obj == 0x2712){
                i = e.D0;
             }else if(obj == 36){
                i = e.V0;
             }else {
                i = e.b;
             }
          }
          return i;
       }else {
          i oi = i.class;
          SearchItem obj2 = PatchProxy.applyOneRefs(p0, null, uof, "2");
          if (obj2 != patchProxyRe) {
             i = obj2.intValue();
          }else {
             obj2 = p0.mItemType;
             if (obj2 == SearchItem$SearchItemType.USER) {
                i = e.c;
             }else if(obj2 == SearchItem$SearchItemType.MUSIC_TAG){
                i = e.i;
             }else if(obj2 == SearchItem$SearchItemType.TEXT_TAG){
                i = e.j;
             }else if(obj2 == SearchItem$SearchItemType.GROUP){
                i = e.k;
             }else if(obj2 == SearchItem$SearchItemType.LIVE_STREAM){
                i = e.l;
             }else if(obj2 == SearchItem$SearchItemType.TYPE_GOODS_LIVE_SLICE){
                i = e.U0;
             }else if(obj2 == SearchItem$SearchItemType.PHOTO){
                if (p1.a(p0)) {
                   i = e.h;
                }else {
                   i = e.e;
                }
             }else if(obj2 == SearchItem$SearchItemType.LIVE_RECORD_CARD){
                i = e.o;
             }else if(obj2 == SearchItem$SearchItemType.RELATION_SEARCH){
                i = e.p;
             }else if(obj2 == SearchItem$SearchItemType.TYPO){
                i = e.r;
             }else if(obj2 == SearchItem$SearchItemType.EMPTY_FEED){
                i = e.s;
             }else if(obj2 == SearchItem$SearchItemType.LESS_FEEDS){
                i = e.t;
             }else if(obj2 == SearchItem$SearchItemType.TOTAL_FEED_HEADER){
                i = e.u;
             }else if(obj2 == SearchItem$SearchItemType.MUSIC_STATION){
                i = e.v;
             }else if(obj2 == SearchItem$SearchItemType.LABEL){
                i = e.w;
             }else if(obj2 == SearchItem$SearchItemType.USER_RECOMMEND_PYMK){
                i = e.d;
             }else if(obj2 == SearchItem$SearchItemType.USER_EXPAND_VIEW){
                i = e.K;
             }else if(obj2 == SearchItem$SearchItemType.APPLET_CARD){
                i = e.L;
             }else if(obj2 == SearchItem$SearchItemType.COMMODITY || obj2 == SearchItem$SearchItemType.TYPE_AD_COMMODITY){
                obj1 = PatchProxy.applyOneRefs(p0, null, uof, "6");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else {
                   SearchItem mGoods = p0.mGoods;
                   if (mGoods == null || mGoods.mGoodsInfo == null) {
                      i = e.b;
                   }else if(mGoods.isHuojiaStyle()){
                      i = e.E;
                   }else {
                      SearchCommodityItem mStatus = p0.mGoods.mStatus;
                      if (mStatus == CommodityLiveStatus.VIDEO.mStatus) {
                         i = e.H;
                      }else if(mStatus == CommodityLiveStatus.VIDEO_COMMODITY.mStatus){
                         i = e.I;
                      }else {
                         i = e.E;
                      }
                   }
                }
             }else if(obj2 == SearchItem$SearchItemType.LOCATION){
                i = e.i0;
             }else if(obj2 == SearchItem$SearchItemType.RECOMMEND_AFTER_CLICK){
                i = e.M;
             }else if(obj2 == SearchItem$SearchItemType.KBOX_COMMON_EXPAND_VIEW){
                i = e.k0;
             }else if(obj2 == SearchItem$SearchItemType.INTEREST_EXPLORATION){
                i = e.N;
             }else if(obj2 == SearchItem$SearchItemType.AD_PHOTO){
                obj1 = PatchProxy.applyOneRefs(p0, null, uof, "3");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else {
                   p0 = p0.mPhoto;
                   obj1 = PatchProxy.applyOneRefs(p0, null, oi, "37");
                   i = (obj1 != patchProxyRe)? obj1.intValue(): d.a(0x53db42e7).N5(p0);
                   if (i != b) {
                      i = e.O;
                   }else {
                      i = e.J;
                   }
                }
             }else if(obj2 == SearchItem$SearchItemType.TYPE_COLLECTION){
                i = e.R;
             }else if(obj2 == SearchItem$SearchItemType.TYPE_COLLECTION_PUZZLE){
                i = e.S;
             }else if(obj2 == SearchItem$SearchItemType.ATMOSPHERE_VIEW){
                i = e.x;
             }else if(obj2 == SearchItem$SearchItemType.SEARCH_CORRECT){
                i = e.y;
             }else if(obj2 == SearchItem$SearchItemType.HEAD_SELECT_CLEAR_FILTER){
                i = e.z;
             }else if(obj2 == SearchItem$SearchItemType.TYPE_AD_BRAND){
                obj1 = PatchProxy.applyOneRefs(p0, null, uof, "4");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else if(p0.mIsBrandSuperAppendedContent != null){
                   i = e.z0;
                }else if(i.i(p0.mPhoto)){
                   i = e.s0;
                }else if(i.l(p0.mPhoto)){
                   i = e.t0;
                }else if(i.j(p0.mPhoto)){
                   i = e.u0;
                }else if(i.m(p0.mPhoto)){
                   i = e.v0;
                }else {
                   obj1 = p0.mPhoto;
                   Object obj3 = PatchProxy.applyOneRefs(obj1, null, oi, "21");
                   if (obj3 != patchProxyRe) {
                      b1 = obj3.booleanValue();
                   }else if(d.a(0x53db42e7).aK(obj1) == 7){
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                   if (b1) {
                      i = e.w0;
                   }else {
                      p0 = p0.mPhoto;
                      obj4 = PatchProxy.applyOneRefs(p0, null, oi, "22");
                      if (obj4 != patchProxyRe) {
                         i = obj4.booleanValue();
                      }else if(d.a(0x53db42e7).aK(p0) == 8){
                         b = 0;
                      }
                      i = b;
                      if (i) {
                         i = e.x0;
                      }else {
                         i = e.b;
                      }
                   }
                }
             }else if(obj2 == SearchItem$SearchItemType.KBOX_SPACE || obj2 == SearchItem$SearchItemType.TOP_SPACE){
                i = e.A;
             }else if(obj2 == SearchItem$SearchItemType.TOPPING_FILTER){
                i = e.T;
             }else if(obj2 == SearchItem$SearchItemType.TYPE_AD_BRAND_LIVE){
                obj4 = PatchProxy.applyOneRefs(p0, null, uof, "5");
                if (obj4 != patchProxyRe) {
                   i = obj4.intValue();
                }else if(p0.mIsBrandSuperAppendedContent != null){
                   i = e.z0;
                }else {
                   p0 = p0.mPhoto;
                   obj4 = PatchProxy.applyOneRefs(p0, null, oi, "23");
                   if (obj4 != patchProxyRe) {
                      b = obj4.booleanValue();
                   }else {
                      i = d.a(0x53db42e7).aK(p0);
                      if (i != 7 && i != 8) {
                         b = false;
                      }
                   }
                   if (b) {
                      i = e.y0;
                   }else {
                      i = e.A0;
                   }
                }
             }else if(obj2 == SearchItem$SearchItemType.TYPE_AD_USER_CARD){
                i = e.B0;
             }else if(obj2 == SearchItem$SearchItemType.GUESS){
                i = e.U;
             }else if(obj2 == SearchItem$SearchItemType.MUSIC_PLAY_ALL_LOCAL){
                i = e.V;
             }else if(obj2 == SearchItem$SearchItemType.COMMODITY_RECEIVE_COUPON){
                i = e.W;
             }else if(obj2 == SearchItem$SearchItemType.FILTER_EXPOSED_TIPS){
                i = e.X;
             }else {
                i = e.b;
             }
          }
          return i;
       }
    }
}
