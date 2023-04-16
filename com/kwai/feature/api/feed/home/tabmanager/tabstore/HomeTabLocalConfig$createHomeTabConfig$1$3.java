package com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createHomeTabConfig$1$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class HomeTabLocalConfig$createHomeTabConfig$1$3 extends Lambda implements l	// class@000f19
{
    public static final HomeTabLocalConfig$createHomeTabConfig$1$3 INSTANCE;

    static {
       HomeTabLocalConfig$createHomeTabConfig$1$3.INSTANCE = new HomeTabLocalConfig$createHomeTabConfig$1$3();
    }
    public void HomeTabLocalConfig$createHomeTabConfig$1$3(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabLocalConfig$createHomeTabConfig$1$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "nearby";
       p0.mType = "ato_nearby";
       p0.mTabName = "同城";
       p0.mTabNameEn = "Nearby";
       p0.mTabNameTc = "同城";
       return;
    }
}
