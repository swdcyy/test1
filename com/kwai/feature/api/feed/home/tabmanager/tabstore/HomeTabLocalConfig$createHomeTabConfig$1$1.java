package com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createHomeTabConfig$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class HomeTabLocalConfig$createHomeTabConfig$1$1 extends Lambda implements l	// class@000f17
{
    public static final HomeTabLocalConfig$createHomeTabConfig$1$1 INSTANCE;

    static {
       HomeTabLocalConfig$createHomeTabConfig$1$1.INSTANCE = new HomeTabLocalConfig$createHomeTabConfig$1$1();
    }
    public void HomeTabLocalConfig$createHomeTabConfig$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabLocalConfig$createHomeTabConfig$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "follow";
       p0.mType = "ato_follow";
       p0.mTabName = "¹Ø×¢";
       p0.mTabNameEn = "Follow";
       p0.mTabNameTc = "×·Û™";
       return;
    }
}
