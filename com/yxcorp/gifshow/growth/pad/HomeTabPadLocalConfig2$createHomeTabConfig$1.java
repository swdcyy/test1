package com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createHomeTabConfig$1;
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
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createNearbyTabConfig$1;
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createFollowTabConfig$1;
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createDiscoverTabConfig$1;
import com.yxcorp.gifshow.growth.pad.HomeTabPadLocalConfig2$createFeaturedTabConfig$1;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class HomeTabPadLocalConfig2$createHomeTabConfig$1 extends Lambda implements l	// class@001460
{
    public static final HomeTabPadLocalConfig2$createHomeTabConfig$1 INSTANCE;

    static {
       HomeTabPadLocalConfig2$createHomeTabConfig$1.INSTANCE = new HomeTabPadLocalConfig2$createHomeTabConfig$1();
    }
    public void HomeTabPadLocalConfig2$createHomeTabConfig$1(){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabPadLocalConfig2$createHomeTabConfig$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "topHome";
       p0.mType = "con_topHome";
       p0.mTabName = "Ê×Ò³";
       p0.mTabNameEn = "Home";
       p0.mTabNameTc = "Ê×í“";
       p0.mDefaultSelectSubTab = "feature";
       TabConfig[] tabConfigArr = new TabConfig[4];
       int i = 0;
       a = a.a;
       Objects.requireNonNull(a);
       TabConfig tabConfig = PatchProxy.apply(null, a, uoa, "3");
       if (tabConfig != patchProxyRe) {
       }else {
          tabConfig = a.a(HomeTabPadLocalConfig2$createNearbyTabConfig$1.INSTANCE);
       }
       tabConfigArr[i] = tabConfig;
       i = 1;
       Objects.requireNonNull(a);
       tabConfig = PatchProxy.apply(null, a, uoa, "4");
       if (tabConfig != patchProxyRe) {
       }else {
          tabConfig = a.a(HomeTabPadLocalConfig2$createFollowTabConfig$1.INSTANCE);
       }
       tabConfigArr[i] = tabConfig;
       i = 2;
       Objects.requireNonNull(a);
       tabConfig = PatchProxy.apply(null, a, uoa, "8");
       if (tabConfig != patchProxyRe) {
       }else {
          tabConfig = a.a(HomeTabPadLocalConfig2$createDiscoverTabConfig$1.INSTANCE);
       }
       tabConfigArr[i] = tabConfig;
       Objects.requireNonNull(a);
       TabConfig tabConfig1 = PatchProxy.apply(null, a, uoa, "5");
       if (tabConfig1 != patchProxyRe) {
       }else {
          tabConfig1 = a.a(HomeTabPadLocalConfig2$createFeaturedTabConfig$1.INSTANCE);
       }
       tabConfigArr[3] = tabConfig1;
       p0.mSubTabList = CollectionsKt__CollectionsKt.r(tabConfigArr);
       return;
    }
}
