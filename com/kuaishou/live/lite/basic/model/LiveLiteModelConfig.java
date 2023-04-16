package com.kuaishou.live.lite.basic.model.LiveLiteModelConfig;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$a;
import nsd.u;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$Companion$defaultReleaser$1;
import lp3.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import lp3.g$a;
import qrd.l1;
import java.util.LinkedHashSet;
import java.util.Set;
import c93.a;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$RecyclerImpl;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import lp3.h;
import java.util.Objects;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1;
import lp3.f;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$b;
import java.util.List;
import c93.a$b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.lite.basic.model.LiveLiteModelConfig$addConfigItem$3;
import msd.a;

public final class LiveLiteModelConfig	// class@001e8a
{
    public final Map a;
    public final g b;
    public a c;
    public final Set d;
    public static final l e;
    public static final LiveLiteModelConfig$a f;

    static {
       LiveLiteModelConfig.f = new LiveLiteModelConfig$a(null);
       LiveLiteModelConfig.e = LiveLiteModelConfig$Companion$defaultReleaser$1.INSTANCE;
    }
    public void LiveLiteModelConfig(g p0){
       a.p(p0, "initConfig");
       super();
       this.a = new LinkedHashMap();
       g og = new g();
       og.e(p0.c());
       og.g(false);
       og.f(p0.b());
       this.b = og;
       this.d = new LinkedHashSet();
    }
    public final void a(Set p0,String p1,a p2,Set p3,l p4,l p5){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       LiveLiteModelConfig liveLiteMode = LiveLiteModelConfig.class;
       int i = 1;
       if (PatchProxy.isSupport(liveLiteMode)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5};
          if (PatchProxy.applyVoid(objArray, obj, liveLiteMode, "4")) {
             return;
          }
       }
       a.p(oobject, "owner");
       a.p(oobject1, "comment");
       a.p(oobject2, "init");
       a.p(oobject3, "interfaces");
       a.p(oobject4, "factory");
       a.p(oobject5, "releaser");
       Pair pair = PatchProxy.applyTwoRefs(oobject3, oobject4, obj, liveLiteMode, "5");
       if (pair != PatchProxyResult.class) {
       }else {
          LiveLiteModelConfig$RecyclerImpl recyclerImpl = new LiveLiteModelConfig$RecyclerImpl(obj, oobject3);
          ArrayList uArrayList = new ArrayList(u.Y(oobject3, 10));
          Iterator iterator1 = p3.iterator();
          while (iterator1.hasNext()) {
             Object obj1 = iterator1.next();
             Objects.requireNonNull(obj1, "null cannot be cast to non-null type java.lang.Class<com.kuaishou.live.sm.ILiveService>");
             LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1 uobuildConfi = v4;
             LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1 uobuildConfi1 = v4;
             uobuildConfi = new LiveLiteModelConfig$buildConfigItem$$inlined$map$lambda$1(obj1, this, p4, p3, recyclerImpl);
             uArrayList.add(new h(obj1, uobuildConfi1));
             uobuildConfi1 = 1;
          }
          pair = new Pair(recyclerImpl, uArrayList);
       }
       LiveLiteModelConfig$b uob = pair.component1();
       Iterator iterator = pair.component2().iterator();
       while (iterator.hasNext()) {
          obj.b.a(iterator.next());
       }
       if (a.g(oobject2, a$b.a) ^ 1) {
          obj.d.add(CollectionsKt___CollectionsKt.k2(p3));
       }
       uob.a(new LiveLiteModelConfig$addConfigItem$3(oobject5));
       return;
    }
    public final a b(){
       LiveLiteModelConfig obj = PatchProxy.apply(null, this, LiveLiteModelConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("modelManagerProvider");
       }
       return obj;
    }
}
