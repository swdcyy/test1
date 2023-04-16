package com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$c$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$c;
import ob6.h;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import xf6.d;
import xf6.l;
import tra.b;
import q87.c;
import java.util.Objects;
import java.util.List;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Strategy;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Tab;
import qrd.l1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ActivityTabConfig;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import java.util.Iterator;
import java.lang.Iterable;
import xn5.b;
import xn5.b$a;
import java.util.Map;

public final class KCubeDynamicTabManagerImpl$c$a implements Runnable	// class@001728
{
    public final KCubeDynamicTabManagerImpl$c b;
    public final h c;

    public void KCubeDynamicTabManagerImpl$c$a(KCubeDynamicTabManagerImpl$c p0,h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       KCubeDynamicTabManagerImpl$c a;
       DynamicTabConfig obj;
       KCubeDynamicTabManagerImpl$c a1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KCubeDynamicTabManagerImpl$c$a.class, "1")) {
          return;
       }
       this.b.a.h.set(true);
       boolean b = false;
       String str = "KCubeDynamicTabManagerImpl";
       if (l.c("key_home_activity_local_custom_config", b)) {
          Object[] objArray1 = new Object[b];
          b.C().w(str, "local mock config", objArray1);
          a = this.b.a;
          Objects.requireNonNull(a);
          obj = PatchProxy.apply(objArray, a, KCubeDynamicTabManagerImpl.class, "2");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else {
             String str1 = "";
             str = l.g("key_home_activity_custom_config", str1);
             if (str != null) {
                DynamicTabConfig uDynamicTabC = new DynamicTabConfig();
                uDynamicTabC.mId = "operate";
                uDynamicTabC.mType = "ato_operate";
                uDynamicTabC.mTabName = "»î¶¯";
                DynamicTabConfig$Strategy strategy = new DynamicTabConfig$Strategy();
                strategy.mStrategy = 1;
                strategy.mIndex = b;
                DynamicTabConfig$Tab tab = new DynamicTabConfig$Tab();
                tab.mId = "topHome";
                tab.mType = "con_topHome";
                strategy.mContainer = tab;
                DynamicTabConfig$Strategy[] strategyArra = new DynamicTabConfig$Strategy[true];
                strategyArra[b] = strategy;
                uDynamicTabC.mStrategies = CollectionsKt__CollectionsKt.P(strategyArra);
                DynamicTabConfig$ActivityTabConfig uActivityTab = new DynamicTabConfig$ActivityTabConfig();
                if (l.c("KEY_ACTIVITY_TAB_KRN", b)) {
                   uActivityTab.mTabType = 2;
                }
                uActivityTab.mTabUrl = str;
                uActivityTab.mActivityId = l.g("KEY_HOME_ACTIVITY_CUSTOM_ACTIVITY_ID", str1);
                uDynamicTabC.mActivityTabConfig = uActivityTab;
                DynamicTabConfig[] uDynamicTabC1 = new DynamicTabConfig[true];
                uDynamicTabC1[b] = uDynamicTabC;
                objArray = CollectionsKt__CollectionsKt.P(uDynamicTabC1);
             }
          }
          a.b = objArray;
          a1 = this.b.a;
          a1.n(true, a1.b, "onKeyConfigUpdated");
          return;
       }else {
          Object[] objArray2 = new Object[b];
          b.C().w(str, "version "+this.c.mVersion, objArray2);
          a = this.b.a;
          h mFeatureConf = this.c.mFeatureConfig;
          FeatureConfig mDynamicTabs = (mFeatureConf != null)? mFeatureConf.mDynamicTabs: objArray;
          a.b = a.a(mDynamicTabs, "onKeyConfigUpdated");
          KCubeDynamicTabManagerImpl b1 = this.b.a.b;
          if (b1 != null) {
             Iterator iterator = b1.iterator();
             while (iterator.hasNext()) {
                DynamicTabConfig uDynamicTabC2 = iterator.next();
                obj = uDynamicTabC2.mType;
                Object obj1 = PatchProxy.applyOneRefs(obj, objArray, b.class, "3");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = b.a.get(obj);
                }
                if (obj1 != null) {
                   obj1.c(uDynamicTabC2);
                }
             }
          }
          a1 = this.b.a;
          a1.n(true, a1.b, "onKeyConfigUpdated");
          return;
       }
    }
}
