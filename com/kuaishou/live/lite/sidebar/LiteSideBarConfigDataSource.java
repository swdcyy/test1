package com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource$a;
import nsd.u;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource$Companion$builtInConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.show.startup.LiveLiteSideBarConfig;
import wg3.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.lang.Object;
import km8.b;
import java.util.Map;
import com.kuaishou.live.lite.sidebar.e;
import kotlin.jvm.internal.a;
import d61.b;
import java.lang.AssertionError;
import java.util.LinkedHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import i93.g;
import java.util.List;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.Number;
import java.util.Collection;
import com.kuaishou.live.lite.sidebar.e$a;
import com.google.gson.JsonObject;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource$getItemsByType$2;
import asd.c;
import msd.p;
import wsd.m;
import wsd.q;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class LiteSideBarConfigDataSource	// class@000b20
{
    public final LiveLiteSideBarConfig a;
    public final List b;
    public final Map c;
    public final Map d;
    public static final p e;
    public static final LiveLiteSideBarConfig f;
    public static final LiteSideBarConfigDataSource$a g;

    static {
       u ou = null;
       LiteSideBarConfigDataSource.g = new LiteSideBarConfigDataSource$a(ou);
       LiteSideBarConfigDataSource.e = s.c(LiteSideBarConfigDataSource$Companion$builtInConfig$2.INSTANCE);
       LiveLiteSideBarConfig liveLiteSide = LiveLiteSideBarConfig.class;
       String str = a.a.getString("liteSidebarConfig", "");
       if (str != null && str != "") {
          ou = b.a(str, liveLiteSide);
       }
       LiteSideBarConfigDataSource.f = ou;
    }
    public void LiteSideBarConfigDataSource(boolean p0,LiveLiteSideBarConfig p1,LiveLiteSideBarConfig p2,Map p3,int p4,u p5){
       LiveLiteSideBarConfig mShopLiveOrd;
       String str;
       if (p4 & 0x08) {
          p3 = e.a;
          a.o(p3, "LiveLiteSideBarService.REPLACE_PRIORITY");
       }else {
          p3 = null;
       }
       a.p(p2, "builtinConfig");
       a.p(p3, "replacePriority");
       super();
       this.d = p3;
       LiteSideBarConfigDataSource$a g = LiteSideBarConfigDataSource.g;
       if (g.b(p1)) {
          a.m(p1);
       }else if(!b.b.a() || g.b(p2)){
          p1 = p2;
       }else {
          throw new AssertionError("invariant check failed");
       }
       this.a = p1;
       if (p0) {
          mShopLiveOrd = p1.mShopLiveOrderList;
          str = "config.mShopLiveOrderList";
       }else {
          mShopLiveOrd = p1.mOrderList;
          str = "config.mOrderList";
       }
       a.o(mShopLiveOrd, str);
       this.b = mShopLiveOrd;
       this.c = new LinkedHashMap();
       return;
    }
    public final boolean a(int p0,int p1){
       LiteSideBarConfigDataSource liteSideBarC = LiteSideBarConfigDataSource.class;
       if (PatchProxy.isSupport(liteSideBarC)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, liteSideBarC, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return g.a.a(Integer.valueOf(p0), Integer.valueOf(p1), this.d);
    }
    public final void b(int p0,List p1){
       LiteSideBarConfigDataSource liteSideBarC = LiteSideBarConfigDataSource.class;
       if (PatchProxy.isSupport(liteSideBarC) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liteSideBarC, "9")) {
          return;
       }
       if (b.b.a()) {
          Ordering ordering = Ordering.natural().reverse();
          ArrayList uArrayList = new ArrayList(u.Y(p1, 10));
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(Integer.valueOf(this.e(p0, iterator.next().intValue())));
          }
          if (!ordering.isOrdered(uArrayList)) {
             throw new AssertionError("invariant check failed");
          }
       }
       return;
    }
    public final JsonObject c(Map p0,e$a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiteSideBarConfigDataSource.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0 == null || p0.isEmpty())? 1: 0;
       JsonObject jsonObject = (obj)? null: p0.get(Integer.valueOf(p1.j()));
       return jsonObject;
    }
    public final List d(int p0){
       List obj;
       LiteSideBarConfigDataSource liteSideBarC = LiteSideBarConfigDataSource.class;
       if (PatchProxy.isSupport(liteSideBarC)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liteSideBarC, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!b.b.a() || this.b.contains(Integer.valueOf(p0))) {
          obj = SequencesKt___SequencesKt.V2(q.e(new LiteSideBarConfigDataSource$getItemsByType$2(this, p0, null)));
          this.b(p0, obj);
          return obj;
       }else {
          throw new AssertionError("precondition check failed");
       }
    }
    public final int e(int p0,int p1){
       LiteSideBarConfigDataSource liteSideBarC = LiteSideBarConfigDataSource.class;
       if (PatchProxy.isSupport(liteSideBarC)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, liteSideBarC, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return g.a.b(Integer.valueOf(p0), Integer.valueOf(p1), this.d);
    }
    public final int f(int p0){
       List obj;
       LiteSideBarConfigDataSource liteSideBarC = LiteSideBarConfigDataSource.class;
       if (PatchProxy.isSupport(liteSideBarC)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liteSideBarC, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!b.b.a() || this.b.contains(Integer.valueOf(p0))) {
          obj = this.c.get(Integer.valueOf(p0));
          int i = (obj == null || obj.isEmpty())? 1: 0;
          if (!i) {
             p0 = CollectionsKt___CollectionsKt.m2(obj).intValue();
          }
          return p0;
       }else {
          throw new AssertionError("precondition check failed");
       }
    }
    public final boolean g(e$a p0){
       List obj = PatchProxy.applyOneRefs(p0, this, LiteSideBarConfigDataSource.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       obj = this.d(CollectionsKt___CollectionsKt.Y2(this.b).intValue());
       boolean b = true;
       if (!obj instanceof Collection || !obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          do {
             if (iterator.hasNext()) {
                boolean b1 = (iterator.next().intValue() == p0.j())? true: false;
             }
          } while (b1);
          return b;
       }
       b = false;
       goto label_0055 ;
    }
}
