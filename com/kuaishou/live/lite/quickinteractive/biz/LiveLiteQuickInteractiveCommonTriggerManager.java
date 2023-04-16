package com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$d;
import nsd.u;
import java.lang.String;
import hf3.a;
import td3.o;
import qa3.b;
import vc3.i;
import vq5.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import wa1.h;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$e;
import crd.a;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$a;
import vc3.j;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$SCLiveQuickInteractiveArea;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$b;
import java.lang.Class;
import lf3.g;
import qa3.a;
import brd.t;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$c;
import erd.g;
import crd.b;
import krd.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$f;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import vc3.c;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;
import vc3.a;
import vc3.b;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.lite.quickinteractive.biz.LiveLiteQuickInteractiveCommonTriggerManager$tryShowQuickInteractive$1;
import msd.l;

public final class LiveLiteQuickInteractiveCommonTriggerManager	// class@000ab3
{
    public final LinkedHashMap a;
    public final h b;
    public final a c;
    public final a d;
    public final String e;
    public final a f;
    public final o g;
    public final b h;
    public final i i;
    public final d j;
    public static final LiveLiteQuickInteractiveCommonTriggerManager$d k;

    static {
       LiveLiteQuickInteractiveCommonTriggerManager.k = new LiveLiteQuickInteractiveCommonTriggerManager$d(null);
    }
    public void LiveLiteQuickInteractiveCommonTriggerManager(String p0,a p1,o p2,b p3,i p4,d p5){
       a.p(p0, "livestreamId");
       a.p(p1, "longConnection");
       a.p(p2, "userStatusManager");
       a.p(p3, "liteDelayInfoManager");
       a.p(p4, "liveLiteQuickInteractiveService");
       a.p(p5, "liveRouterManager");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.j = p5;
       this.a = new LinkedHashMap();
       h oh = new h(p1);
       this.b = oh;
       LiveLiteQuickInteractiveCommonTriggerManager$e uoe = new LiveLiteQuickInteractiveCommonTriggerManager$e(this);
       this.c = uoe;
       a uoa = new a();
       this.d = uoa;
       p4.a(new LiveLiteQuickInteractiveCommonTriggerManager$a(this));
       oh.a(1068, LiveQuickInteractiveArea$SCLiveQuickInteractiveArea.class, new LiveLiteQuickInteractiveCommonTriggerManager$b(this));
       p3.c(uoe);
       b uob = p2.W().subscribe(new LiveLiteQuickInteractiveCommonTriggerManager$c(this));
       a.o(uob, "userStatusManager.timeCo¡­rea, false\)\n      }\n    }");
       a.b(uoa, uob);
    }
    public final void a(LiveQuickInteractiveArea$SCLiveQuickInteractiveArea p0,boolean p1){
       b uob;
       LiveLiteQuickInteractiveCommonTriggerManager liveLiteQuic = LiveLiteQuickInteractiveCommonTriggerManager.class;
       if (PatchProxy.isSupport(liveLiteQuic) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveLiteQuic, "3")) {
          return;
       }
       if (!p0.delayDisplayMs) {
          this.b(p0);
          return;
       }else if(p1 && this.a.containsKey(Integer.valueOf(p0.bizType))){
          uob = this.a.get(Integer.valueOf(p0.bizType));
          if (uob != null) {
             uob.dispose();
          }
          this.a.remove(Integer.valueOf(p0.bizType));
       }
       uob = t.timer(p0.delayDisplayMs, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new LiveLiteQuickInteractiveCommonTriggerManager$f(this, p0));
       a.o(uob, "this");
       a.b(this.d, uob);
       this.a.put(Integer.valueOf(p0.bizType), uob);
       return;
    }
    public final void b(LiveQuickInteractiveArea$SCLiveQuickInteractiveArea p0){
       ArrayList uArrayList;
       ArrayList uArrayList1;
       Object obj = this;
       Object obj1 = p0;
       LiveLiteQuickInteractiveCommonTriggerManager liveLiteQuic = LiveLiteQuickInteractiveCommonTriggerManager.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, liveLiteQuic, "1")) {
          return;
       }
       if (obj1.needCheckTriggerByClient != null) {
          return;
       }
       if (obj1.displayScope == null) {
          return;
       }
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea displayDurat = obj1.displayDurationMs;
       if (!displayDurat - null) {
          displayDurat = 0x2710;
       }
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea sCLiveQuickI = displayDurat;
       LiveLiteQuickInteractiveCommonTriggerManager i = obj.i;
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea obj2 = PatchProxy.applyOneRefs(obj1, obj, liveLiteQuic, "2");
       if (obj2 != PatchProxyResult.class) {
          uArrayList = obj2;
       }else {
          obj2 = obj1.tabItem;
          if (obj2 != null) {
             uArrayList1 = new ArrayList(obj2.length);
             int len = obj2.length;
             int i2 = 0;
             for (int i1 = 0; i1 < len; len = len) {
                object oobject = obj2[i1];
                i2 = i2 + 1;
                a.o(oobject, "originItem");
                uArrayList1.add(new c(oobject, LiveLiteQuickInteractiveAreaItemType.COMMON_TRIGGER, new a(obj1.bizType, new b(i2, null, oobject.displayText), oobject.tabExtraInfo)));
                i1 = i1 + 1;
             }
          }else {
             uArrayList1 = CollectionsKt__CollectionsKt.E();
          }
          uArrayList = uArrayList1;
       }
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea bizId = obj1.bizId;
       a.o(bizId, "it.bizId");
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea liteCommonGu = obj1.liteCommonGuideSubBiz;
       a.o(liteCommonGu, "it.liteCommonGuideSubBiz");
       i.b(uArrayList, bizId, liteCommonGu, sCLiveQuickI, 0, obj1.displayExpireTimestamp, new LiveLiteQuickInteractiveCommonTriggerManager$tryShowQuickInteractive$1(obj), null);
       return;
    }
}
