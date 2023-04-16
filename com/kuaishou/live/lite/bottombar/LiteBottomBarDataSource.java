package com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$a;
import nsd.u;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$Companion$builtInConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$Companion$startUpConfig$2;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig;
import java.util.Map;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$c;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import i93.g;
import ekd.j;
import ekd.q;
import java.lang.Integer;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarItemConfig;
import java.util.ArrayList;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$c;
import java.util.Comparator;

public final class LiteBottomBarDataSource	// class@001eaa
{
    public final List a;
    public final LiveConfigStartupResponse$LiteBottomBarConfig b;
    public final LiveConfigStartupResponse$LiteBottomBarConfig c;
    public final Map d;
    public static final p e;
    public static final p f;
    public static final LiteBottomBarDataSource$a g;

    static {
       LiteBottomBarDataSource.g = new LiteBottomBarDataSource$a(null);
       LiteBottomBarDataSource.e = s.c(LiteBottomBarDataSource$Companion$builtInConfig$2.INSTANCE);
       LiteBottomBarDataSource.f = s.c(LiteBottomBarDataSource$Companion$startUpConfig$2.INSTANCE);
    }
    public void LiteBottomBarDataSource(LiveConfigStartupResponse$LiteBottomBarConfig p0,LiveConfigStartupResponse$LiteBottomBarConfig p1,boolean p2,Map p3,int p4,u p5){
       if (p4 & 0x08) {
          Objects.requireNonNull(LiveLiteBottomBarService.a);
          p3 = LiveLiteBottomBarService$c.a;
       }else {
          p3 = null;
       }
       a.p(p1, "builtInConfig");
       a.p(p3, "replacePriority");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p3;
       p0 = (p2)? this.b().mShopLiveItems: this.b().mItems;
       a.o(p0, "if \(isShopLive\) { // ²»Í¬µÄ¡­arConfig.mItems\n        }");
       this.a = CollectionsKt___CollectionsKt.J5(p0);
       return;
    }
    public final boolean a(LiveLiteBottomBarService$BottomBarType p0,LiveLiteBottomBarService$BottomBarType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiteBottomBarDataSource.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "replacedBottomBarType");
       a.p(p1, "newItemType");
       return g.a.a(p0, p1, this.d);
    }
    public final LiveConfigStartupResponse$LiteBottomBarConfig b(){
       boolean b;
       LiteBottomBarDataSource tb1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiteBottomBarDataSource$a obj = PatchProxy.apply(null, this, LiteBottomBarDataSource.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiteBottomBarDataSource.g;
       LiteBottomBarDataSource tb = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(tb, obj, LiteBottomBarDataSource$a.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(tb != null && (!j.g(tb.mSlots) && (!q.f(tb.mItems) && !q.f(tb.mShopLiveItems)))){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          tb1 = this.b;
          a.m(tb1);
       }else {
          tb1 = this.c;
       }
       return tb1;
    }
    public final int c(Integer p0){
       Object obj1;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteBottomBarDataSource.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (p0 != null) {
          Iterator iterator = this.a.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj1 = iterator.next();
                Object obj2 = (obj1.mId == p0.intValue())? 1: null;
                if (!obj2) {
                   continue ;
                }
             }else {
                obj1 = null;
             }
             if (obj1 != null) {
                i = obj1.mPriority;
                break ;
             }
          }
       }
       return i;
    }
    public final List d(int p0){
       Iterator obj;
       LiteBottomBarDataSource liteBottomBa = LiteBottomBarDataSource.class;
       if (PatchProxy.isSupport(liteBottomBa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liteBottomBa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ArrayList uArrayList = new ArrayList();
       obj = this.a.iterator();
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          Object obj2 = (obj1.mSlot == p0)? 1: null;
          if (obj2) {
             uArrayList.add(obj1);
          }
       }
       return CollectionsKt___CollectionsKt.f5(uArrayList, new LiteBottomBarDataSource$c());
    }
}
