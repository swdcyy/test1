package com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createLocal$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import xpa.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createHomeTabConfig$1;
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createExploreTabConfig$1;
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createLocal$1$1$1;
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createLocal$1$1$2;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class HomeTabPadLocalConfig2$createLocal$1$1 extends Lambda implements l	// class@001463
{
    public static final HomeTabPadLocalConfig2$createLocal$1$1 INSTANCE;

    static {
       HomeTabPadLocalConfig2$createLocal$1$1.INSTANCE = new HomeTabPadLocalConfig2$createLocal$1$1();
    }
    public void HomeTabPadLocalConfig2$createLocal$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabPadLocalConfig2$createLocal$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "bottomNav";
       p0.mType = "con_bottomNav";
       p0.mTabName = "µ×µ¼";
       p0.mTabNameEn = "BottomNavigation";
       p0.mTabNameTc = "µ×Œ§";
       p0.mDefaultSelectSubTab = "topHome";
       TabConfig[] tabConfigArr = new TabConfig[4];
       int i = 0;
       a = a.a;
       Objects.requireNonNull(a);
       TabConfig tabConfig = PatchProxy.apply(null, a, uoa, "2");
       if (tabConfig != patchProxyRe) {
       }else {
          tabConfig = a.a(HomeTabPadLocalConfig2$createHomeTabConfig$1.INSTANCE);
       }
       tabConfigArr[i] = tabConfig;
       Objects.requireNonNull(a);
       TabConfig tabConfig1 = PatchProxy.apply(null, a, uoa, "6");
       if (tabConfig1 != patchProxyRe) {
       }else {
          tabConfig1 = a.a(HomeTabPadLocalConfig2$createExploreTabConfig$1.INSTANCE);
       }
       tabConfigArr[1] = tabConfig1;
       tabConfigArr[2] = a.a(HomeTabPadLocalConfig2$createLocal$1$1$1.INSTANCE);
       tabConfigArr[3] = a.a(HomeTabPadLocalConfig2$createLocal$1$1$2.INSTANCE);
       p0.mSubTabList = CollectionsKt__CollectionsKt.r(tabConfigArr);
       return;
    }
}
