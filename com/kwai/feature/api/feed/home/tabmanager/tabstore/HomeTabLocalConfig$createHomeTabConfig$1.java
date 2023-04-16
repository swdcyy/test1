package com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createHomeTabConfig$1;
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
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createHomeTabConfig$1$1;
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createHomeTabConfig$1$2;
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createHomeTabConfig$1$3;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class HomeTabLocalConfig$createHomeTabConfig$1 extends Lambda implements l	// class@000f1a
{
    public static final HomeTabLocalConfig$createHomeTabConfig$1 INSTANCE;

    static {
       HomeTabLocalConfig$createHomeTabConfig$1.INSTANCE = new HomeTabLocalConfig$createHomeTabConfig$1();
    }
    public void HomeTabLocalConfig$createHomeTabConfig$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabLocalConfig$createHomeTabConfig$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "topHome";
       p0.mType = "con_topHome";
       p0.mTabName = "Ê×Ò³";
       p0.mTabNameEn = "Home";
       p0.mTabNameTc = "Ê×í“";
       p0.mDefaultSelectSubTab = "hot";
       TabConfig[] tabConfigArr = new TabConfig[]{a.a(HomeTabLocalConfig$createHomeTabConfig$1$1.INSTANCE),a.a(HomeTabLocalConfig$createHomeTabConfig$1$2.INSTANCE),a.a(HomeTabLocalConfig$createHomeTabConfig$1$3.INSTANCE)};
       a = a.a;
       p0.mSubTabList = CollectionsKt__CollectionsKt.r(tabConfigArr);
       return;
    }
}
