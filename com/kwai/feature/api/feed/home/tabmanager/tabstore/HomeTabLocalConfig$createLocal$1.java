package com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createLocal$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabModel;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mo5.a;
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createLocal$1$1;
import com.kwai.component.kcube.model.model.TabConfig;

public final class HomeTabLocalConfig$createLocal$1 extends Lambda implements l	// class@000f1f
{
    public static final HomeTabLocalConfig$createLocal$1 INSTANCE;

    static {
       HomeTabLocalConfig$createLocal$1.INSTANCE = new HomeTabLocalConfig$createLocal$1();
    }
    public void HomeTabLocalConfig$createLocal$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabLocalConfig$createLocal$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mTabConfig = a.a.a(HomeTabLocalConfig$createLocal$1$1.INSTANCE);
       return;
    }
}
