package com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createExploreTabConfig$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xpa.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createCoronaTabConfig$1;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class HomeTabPadLocalConfig2$createExploreTabConfig$1 extends Lambda implements l	// class@00145d
{
    public static final HomeTabPadLocalConfig2$createExploreTabConfig$1 INSTANCE;

    static {
       HomeTabPadLocalConfig2$createExploreTabConfig$1.INSTANCE = new HomeTabPadLocalConfig2$createExploreTabConfig$1();
    }
    public void HomeTabPadLocalConfig2$createExploreTabConfig$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabPadLocalConfig2$createExploreTabConfig$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "padExplore";
       p0.mType = "con_padExplore";
       p0.mTabName = "∑≈”≥Ã¸";
       p0.mTabNameEn = "Theater";
       p0.mTabNameTc = "∑≈”≥èd";
       p0.mDefaultSelectSubTab = "theater";
       TabConfig[] tabConfigArr = new TabConfig[1];
       a = a.a;
       Objects.requireNonNull(a);
       TabConfig tabConfig = PatchProxy.apply(null, a, a.class, "7");
       if (tabConfig != PatchProxyResult.class) {
       }else {
          tabConfig = a.a(HomeTabPadLocalConfig2$createCoronaTabConfig$1.INSTANCE);
       }
       tabConfigArr[0] = tabConfig;
       p0.mSubTabList = CollectionsKt__CollectionsKt.r(tabConfigArr);
       return;
    }
}
