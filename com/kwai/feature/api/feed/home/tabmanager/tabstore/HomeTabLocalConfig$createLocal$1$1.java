package com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createLocal$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mo5.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createHomeTabConfig$1;
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createLocal$1$1$1;
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createLocal$1$1$2;
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createLocal$1$1$3;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class HomeTabLocalConfig$createLocal$1$1 extends Lambda implements l	// class@000f1e
{
    public static final HomeTabLocalConfig$createLocal$1$1 INSTANCE;

    static {
       HomeTabLocalConfig$createLocal$1$1.INSTANCE = new HomeTabLocalConfig$createLocal$1$1();
    }
    public void HomeTabLocalConfig$createLocal$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabLocalConfig$createLocal$1$1.class, "1")) {
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
       TabConfig tabConfig = PatchProxy.apply(null, a, a.class, "2");
       if (tabConfig != PatchProxyResult.class) {
       }else {
          tabConfig = a.a(HomeTabLocalConfig$createHomeTabConfig$1.INSTANCE);
       }
       tabConfigArr[i] = tabConfig;
       tabConfigArr[1] = a.a(HomeTabLocalConfig$createLocal$1$1$1.INSTANCE);
       tabConfigArr[2] = a.a(HomeTabLocalConfig$createLocal$1$1$2.INSTANCE);
       tabConfigArr[3] = a.a(HomeTabLocalConfig$createLocal$1$1$3.INSTANCE);
       p0.mSubTabList = CollectionsKt__CollectionsKt.r(tabConfigArr);
       return;
    }
}
