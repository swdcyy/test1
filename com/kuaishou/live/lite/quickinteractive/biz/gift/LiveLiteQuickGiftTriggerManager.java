package com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager;
import hf3.a;
import td3.o;
import qa3.b;
import e93.a;
import vq5.d;
import wa3.c;
import vc3.i;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$c;
import crd.a;
import java.util.Map;
import trd.t0;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$d;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$e;
import com.kwai.framework.model.user.User;
import xp5.g;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$a;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveServiceImpl;
import vc3.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import uc3.b;
import erd.g;
import crd.b;
import krd.a;
import qa3.a;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger;
import lf3.g;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$b;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$SCLiveQuickInteractiveArea;
import com.kwai.robust.PatchProxyResult;
import kotlin.Result;
import fg6.a;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftModel;
import com.google.gson.Gson;
import java.lang.Throwable;
import qrd.j0;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.LinkedHashMap;
import vc3.k;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftModel$Trigger;
import java.lang.Integer;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem;
import java.util.List;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftModel$GiftItemInfo;
import qrd.l1;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftModel$GiftInfo;
import lnc.i3;
import java.util.ArrayList;
import vc3.c;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;
import vc3.a;
import vc3.b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1;
import msd.l;

public final class LiveLiteQuickGiftTriggerManager	// class@000ac0
{
    public final c a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public final a f;
    public boolean g;
    public Map h;
    public Map i;
    public LiveLiteQuickGiftConfig j;
    public final a k;
    public final g l;
    public final a m;
    public final o n;
    public final b o;
    public final a p;
    public final d q;
    public final c r;
    public final i s;
    public final a t;
    public final a u;
    public final a v;

    public void LiveLiteQuickGiftTriggerManager(a p0,o p1,b p2,a p3,d p4,c p5,i p6,a p7,a p8,a p9){
       a.p(p0, "liteLongConnection");
       a.p(p1, "liteUserStatusManager");
       a.p(p2, "liteDelayInfoManager");
       a.p(p3, "liteAudienceInfoManager");
       a.p(p4, "liveRouterManager");
       a.p(p5, "liteEventCenter");
       a.p(p6, "liveLiteQuickInteractiveService");
       a.p(p7, "liveLiteCommentService");
       a.p(p8, "liveGiftSendService");
       a.p(p9, "liveGiftInfoService");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.r = p5;
       this.s = p6;
       this.t = p7;
       this.u = p8;
       this.v = p9;
       this.a = LiveLiteQuickGiftTriggerManager$c.b;
       this.b = true;
       this.c = true;
       this.d = true;
       a uoa = new a();
       this.f = uoa;
       this.h = t0.z();
       this.i = t0.z();
       LiveLiteQuickGiftTriggerManager$d uod = new LiveLiteQuickGiftTriggerManager$d(this);
       this.k = uod;
       LiveLiteQuickGiftTriggerManager$e uoe = new LiveLiteQuickGiftTriggerManager$e(this);
       this.l = uoe;
       User user = p3.I();
       boolean b = (user != null)? user.isFollowingOrFollowRequesting(): false;
       this.g = b;
       p6.a(new LiveLiteQuickGiftTriggerManager$a(this));
       if (!PatchProxy.applyVoid(null, this, LiveLiteQuickGiftTriggerManager.class, "9")) {
          b uob1 = p1.W().subscribe(new b(this));
          a.o(uob1, "liteUserStatusManager.ti¡­erateAreasMap\(data\)\n    }");
          a.b(uoa, uob1);
          p2.c(uod);
       }
       if (!PatchProxy.applyVoid(null, this, LiveLiteQuickGiftTriggerManager.class, "1")) {
          p0.u0(1067, LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger.class, uoe);
       }
       b uob = p5.kk().subscribe(new LiveLiteQuickGiftTriggerManager$b(this));
       a.o(uob, "liteEventCenter.observeE¡­eAndHandleEvent\(it\)\n    }");
       a.b(uoa, uob);
       return;
    }
    public static void c(LiveLiteQuickGiftTriggerManager p0,int p1,LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger p2,int p3,Object p4){
       p0.b(p1, null);
    }
    public final void a(LiveQuickInteractiveArea$SCLiveQuickInteractiveArea p0){
       LiveLiteQuickGiftModel liveLiteQuic;
       PatchProxyResult patchProxyRe1;
       Object obj4;
       Object obj = this;
       LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLiteQuickGiftTriggerManager.class, "10")) {
          return;
       }
       LiveLiteQuickGiftModel obj2 = Result.constructor-impl(a.a.h(obj1.extraInfo, LiveLiteQuickGiftModel.class));
       Throwable throwable = Result.exceptionOrNull-impl(obj2);
       LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[] obj3 = null;
       if (throwable != null) {
          b.I(obj.a, "generateAreasMap: format failed", throwable);
          obj4 = obj3;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       obj2 = (obj2 != null)? obj2.triggers: obj3;
       if (obj2 == null) {
          b.Z(obj.a, "generateAreasMap, triggers is null!");
          return;
       }else {
          int len = obj2.length;
          int i = 0;
          while (i < len) {
             object oobject = obj2[i];
             LiveQuickInteractiveArea$SCLiveQuickInteractiveArea sCLiveQuickI = PatchProxy.applyOneRefs(obj1, obj3, k.class, "1");
             if (sCLiveQuickI != patchProxyRe) {
             }else {
                a.p(obj1, "$this$copy");
                sCLiveQuickI = new LiveQuickInteractiveArea$SCLiveQuickInteractiveArea();
                sCLiveQuickI.tabItem = obj1.tabItem;
                sCLiveQuickI.bizId = obj1.bizId;
                sCLiveQuickI.bizType = obj1.bizType;
                sCLiveQuickI.delayDisplayMs = obj1.delayDisplayMs;
                sCLiveQuickI.displayDurationMs = obj1.displayDurationMs;
                sCLiveQuickI.displayExpireTimestamp = obj1.displayExpireTimestamp;
                sCLiveQuickI.displayScope = obj1.displayScope;
                sCLiveQuickI.extraInfo = obj1.extraInfo;
                sCLiveQuickI.liteCommonGuideSubBiz = obj1.liteCommonGuideSubBiz;
                sCLiveQuickI.needCheckTriggerByClient = obj1.needCheckTriggerByClient;
                sCLiveQuickI.priority = obj1.priority;
                sCLiveQuickI.targetLiveStreamId = obj1.targetLiveStreamId;
             }
             Integer integer = Integer.valueOf(oobject.triggerType);
             LiveLiteQuickGiftModel$Trigger giftItems = oobject.giftItems;
             a.o(giftItems, "trigger.giftItems");
             LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[] liveQuickInt = PatchProxy.applyOneRefs(giftItems, obj, LiveLiteQuickGiftTriggerManager.class, "11");
             if (liveQuickInt != patchProxyRe) {
                liveLiteQuic = obj2;
                patchProxyRe1 = patchProxyRe;
             }else {
                int i1 = giftItems.size();
                obj3 = new LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[i1];
                int i2 = 0;
                while (i2 < i1) {
                   obj4 = giftItems.get(i2);
                   obj1 = new LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem();
                   obj1.actionRouter = obj4.actionRouter;
                   obj1.backgroundColor = obj4.backgroundColor;
                   obj1.displayText = obj4.displayText;
                   obj1.prefixImageUrl = obj4.prefixImageUrl;
                   obj1.suffixImageUrl = obj4.suffixImageUrl;
                   obj1.tabExtraInfo = obj4.giftInfo;
                   obj3[i2] = obj1;
                   i2 = i2 + 1;
                   patchProxyRe = patchProxyRe;
                   obj2 = obj2;
                }
                liveLiteQuic = obj2;
                patchProxyRe1 = patchProxyRe;
                liveQuickInt = obj3;
             }
             sCLiveQuickI.tabItem = liveQuickInt;
             linkedHashMa.put(integer, sCLiveQuickI);
             a.o(oobject, "trigger");
             linkedHashMa1.put(Integer.valueOf(oobject.triggerType), oobject);
             i = i + 1;
             obj1 = p0;
             patchProxyRe = patchProxyRe1;
             obj2 = liveLiteQuic;
             obj3 = null;
          }
          obj.h = linkedHashMa;
          obj.i = linkedHashMa1;
          return;
       }
    }
    public final void b(int p0,LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger p1){
       LiveLiteQuickGiftModel$GiftItemInfo obj3;
       Gson a;
       String obj5;
       ArrayList uArrayList;
       LiveLiteQuickGiftTriggerManager liveLiteQuic1;
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea displayExpir;
       ArrayList uArrayList1;
       int i3;
       LiveLiteQuickGiftModel$GiftInfo giftId;
       String str1;
       Object obj = this;
       LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger obj1 = p1;
       LiveLiteQuickGiftTriggerManager liveLiteQuic = LiveLiteQuickGiftTriggerManager.class;
       if (PatchProxy.isSupport(liveLiteQuic) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj1, obj, liveLiteQuic, "7")) {
          return;
       }
       Object obj2 = obj.h.get(Integer.valueOf(p0));
       if (obj2 != null) {
          LiveLiteQuickGiftModel$Trigger trigger = obj.i.get(Integer.valueOf(p0));
          if (trigger != null) {
             trigger = trigger.giftItems;
             a.o(trigger, "itemData.giftItems");
             Iterator iterator = trigger.iterator();
             while (true) {
                int i = 0;
                if (iterator.hasNext()) {
                   obj3 = iterator.next();
                   LiveLiteQuickGiftModel$GiftInfo giftInfo = (obj3.giftInfo != null)? 1: null;
                   if (!giftInfo) {
                      continue ;
                   }
                }else {
                   obj3 = null;
                }
                a = a.a;
                obj3 = (obj3 != null)? obj3.giftInfo: null;
                LiveLiteQuickGiftModel$GiftInfo obj4 = Result.constructor-impl(a.h(obj3, LiveLiteQuickGiftModel$GiftInfo.class));
                if (Result.exceptionOrNull-impl(obj4) != null) {
                   b.B(obj.a, "LiveLiteQuickGiftItemViewController:: json parse error!");
                   obj4 = null;
                }
                i3 oi3 = i3.f();
                obj4 = (obj4 != null)? obj4.giftToken: null;
                oi3.d("gift_token", obj4);
                String str = oi3.e();
                LiveLiteQuickGiftTriggerManager s = obj.s;
                if (PatchProxy.isSupport(liveLiteQuic)) {
                   obj5 = PatchProxy.applyTwoRefs(obj2, Integer.valueOf(p0), obj, liveLiteQuic, "8");
                   if (obj5 != PatchProxyResult.class) {
                      uArrayList = obj5;
                      liveLiteQuic1 = s;
                   label_0155 :
                      LiveQuickInteractiveArea$SCLiveQuickInteractiveArea bizId = obj2.bizId;
                      a.o(bizId, "area.bizId");
                      LiveQuickInteractiveArea$SCLiveQuickInteractiveArea liteCommonGu = obj2.liteCommonGuideSubBiz;
                      a.o(liteCommonGu, "area.liteCommonGuideSubBiz");
                      LiveQuickInteractiveArea$SCLiveQuickInteractiveArea displayDurat = obj2.displayDurationMs;
                      LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger triggerTime = (obj1 != null)? obj1.triggerTime: 0;
                      LiveQuickInteractiveGiftMessages$SCLiveQuickInteractGiftTrigger sCLiveQuickI = triggerTime;
                      obj1 = (obj1 != null)? obj1.expireTimestamp: obj2.displayExpireTimestamp;
                      liveLiteQuic1.b(uArrayList, bizId, liteCommonGu, displayDurat, sCLiveQuickI, obj1, new LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1(obj), str);
                      break ;
                   }
                }
                LiveQuickInteractiveArea$SCLiveQuickInteractiveArea tabItem = obj2.tabItem;
                if (tabItem != null) {
                   uArrayList1 = new ArrayList(tabItem.length);
                   int len = tabItem.length;
                   int i1 = 0;
                   while (i < len) {
                      object oobject = tabItem[i];
                      int i2 = i1 + 1;
                      try{
                         Gson a1 = a.a;
                         LiveLiteQuickGiftModel$Trigger trigger1 = obj.i.get(Integer.valueOf(p0));
                         if (trigger1 != null) {
                            trigger1 = trigger1.giftItems;
                            if (trigger1 != null) {
                               LiveLiteQuickGiftModel$GiftItemInfo giftItemInfo = trigger1.get(i1);
                               if (giftItemInfo != null) {
                                  giftItemInfo = giftItemInfo.giftInfo;
                               label_00f1 :
                                  obj4 = a1.h(giftItemInfo, LiveLiteQuickGiftModel$GiftInfo.class);
                               }
                            }
                         }
                         obj5 = null;
                         goto label_00f1 ;
                      }catch(com.google.gson.JsonSyntaxException e0){
                         b.I(obj.a, "convertToInteractiveItemList: format failed", e0);
                         obj4 = null;
                      }
                      a.o(oobject, "item");
                      LiveLiteQuickInteractiveAreaItemType qUICK_GIFT = LiveLiteQuickInteractiveAreaItemType.QUICK_GIFT;
                      LiveQuickInteractiveArea$SCLiveQuickInteractiveArea bizType = obj2.bizType;
                      LiveQuickInteractiveArea$SCLiveQuickInteractiveArea sCLiveQuickI1 = tabItem;
                      if (obj4 != null) {
                         i3 = len;
                         giftId = obj4.giftId;
                         liveLiteQuic1 = s;
                      }else {
                         i3 = len;
                         liveLiteQuic1 = s;
                         giftId = null;
                      }
                      b uob = new b(i2, giftId, oobject.displayText);
                      i3 oi31 = i3.f();
                      obj4 = (obj4 != null)? obj4.giftToken: null;
                      oi31.d("gift_token", obj4);
                      uArrayList1.add(new c(oobject, qUICK_GIFT, new a(bizType, uob, oi31.e())));
                      i = i + 1;
                      i1 = i2;
                      tabItem = sCLiveQuickI1;
                      len = i3;
                      s = liveLiteQuic1;
                   }
                   liveLiteQuic1 = s;
                }else {
                   liveLiteQuic1 = s;
                   uArrayList1 = CollectionsKt__CollectionsKt.E();
                }
                uArrayList = uArrayList1;
                goto label_0155 ;
             }
          }
       }
       return;
    }
}
