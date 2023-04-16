package com.kuaishou.live.core.show.exchangegoldcoin.a;
import java.lang.Object;
import t02.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo;
import e82.f;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo$LiveCreditExchangeInfoData;
import java.lang.Boolean;
import yx2.r;
import com.kuaishou.android.live.model.QLivePlayConfig;
import e82.a;
import java.lang.reflect.Type;
import java.util.List;
import pm8.a;
import java.lang.Long;
import android.app.Activity;
import d61.y;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.util.CommonUtil;
import java.lang.CharSequence;
import z12.x;

public class a	// class@000b23
{

    public void a(){
       super();
    }
    public static long a(a0 p0){
       a0 obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = p0.R;
       if (obj == null) {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [exchangeGoldCoinEqual]: livePlayCallerContext.mLiveCreditExchangeService is null");
          return 0;
       }else if(obj.b() == null){
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [exchangeGoldCoinEqual]: livePlayCallerContext.mLiveCreditExchangeService.getExchangeInfo\(\) is null");
          return 0;
       }else if(p0.R.b().getLiveCreditExchangeInfoData() == null){
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [exchangeGoldCoinEqual]: livePlayCallerContext.mLiveCreditExchangeService.getExchangeInfo\(\).getLiveCreditExchangeInfoData\(\) == null is null");
          return 0;
       }else {
          return p0.R.b().getLiveCreditExchangeInfoData().getEqualKsCoin();
       }
    }
    public static boolean b(a0 p0,String p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableExchangeFunc] livePlayCallerContext is null ");
          return b;
       }else {
          a0 r = p0.R;
          if (r == null) {
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableExchangeFunc] livePlayCallerContext.mLiveCreditExchangeService is null ");
             return b;
          }else if(!r.f(p1)){
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableExchangeFunc]isExchangeEntryEnable is null ");
             return b;
          }else if(r.c(p0)){
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableExchangeFunc] isInVoicePartyScene ");
             return b;
          }else {
             p0 = p0.e;
             if (p0 == null) {
                b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableExchangeFunc] mLivePlayConfig is null");
                return b;
             }else if(p0.isGamePatternType()){
                b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableShowExchangeEntry] isGamePatternType ");
                return b;
             }else {
                a uoa = a.class;
                p1 = PatchProxy.apply(null, null, uoa, "2");
                if (p1 != patchProxyRe) {
                   b1 = p1.booleanValue();
                }else {
                   List list = a.y(a.b);
                   if (list != null && list.size() > 1) {
                      if ((a.a() - list.get(1).longValue()) - 0x19bfcc00 > 0) {
                         if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, null, uoa, "3")) {
                            a.i1(null);
                         }
                      }else {
                         b1 = false;
                      }
                   }
                   b1 = true;
                }
                if (b1 || a.b()) {
                   b = true;
                }
                return b;
             }
          }
       }
    }
    public static boolean c(Activity p0,a0 p1,String p2,boolean p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == null) {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableShowExchangeEntry] activity is null ");
          return false;
       }else {
          a0 r = p1.R;
          if (r == null) {
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableShowExchangeEntry] mLiveCreditExchangeService is null ");
             return false;
          }else if(!r.g(p2)){
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableShowExchangeEntry] isExchangeEntryEnable is false ");
             return false;
          }else if(p3 && y.d(p0)){
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableShowExchangeEntry] isLandscape ");
             return false;
          }else {
             a0 e = p1.e;
             if (e == null) {
                b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableShowExchangeEntry] livePlayCallerContext.mLivePlayConfig is null ");
                return false;
             }else if(e.isGamePatternType()){
                b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableShowExchangeEntry] isGamePatternType ");
                return false;
             }else if(r.c(p1)){
                b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isEnableShowExchangeEntry] isInVoicePartyScene ");
                return false;
             }else {
                return true;
             }
          }
       }
    }
    public static boolean d(LiveCreditExchangeInfo p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isShouldUseExchangeFunc] info is null ");
          return b;
       }else if(p0.getLiveCreditExchangeInfoData() == null){
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [isShouldUseExchangeFunc] info.mLiveCreditExchangeInfoData is null ");
          return b;
       }else if(p0.getLiveCreditExchangeInfoData().getEqualKsCoin() - p1 >= 0){
          b = true;
       }
       return b;
    }
    public static String e(a0 p0){
       Object obj = null;
       a0 obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.R;
       if (obj1 == null) {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [rechargeExchangeInfo]: livePlayCallerContext.mLiveCreditExchangeService is null");
          return obj;
       }else if(obj1.b() == null){
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [rechargeExchangeInfo]: livePlayCallerContext.mLiveCreditExchangeService.getExchangeInfo\(\) is null");
          return obj;
       }else if(p0.R.b().getLiveCreditExchangeInfoData() == null){
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [rechargeExchangeInfo]: livePlayCallerContext.mLiveCreditExchangeService.getExchangeInfo\(\).getLiveCreditExchangeInfoData\(\) == null is null");
          return obj;
       }else {
          long equalKsCoin = p0.R.b().getLiveCreditExchangeInfoData().getEqualKsCoin();
          int i = 0x7f101c07;
          String str = (equalKsCoin - null > 0)? CommonUtil.string(0x7f10092c)+equalKsCoin+CommonUtil.string(i): CommonUtil.string(0x7f10092c)+CommonUtil.string(i);
          return str;
       }
    }
    public static void f(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "8")) {
          return;
       }
       if (!a.b() && !p0) {
          x.H(CommonUtil.string(R.string.arg_RES_7f100d9a));
       }else {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [tryShowExchangeSuccessfulToast] don\'t need show exchange successful toast ");
       }
       return;
    }
}
