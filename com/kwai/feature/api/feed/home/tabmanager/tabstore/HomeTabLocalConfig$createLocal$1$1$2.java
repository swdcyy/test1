package com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createLocal$1$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class HomeTabLocalConfig$createLocal$1$1$2 extends Lambda implements l	// class@000f1c
{
    public static final HomeTabLocalConfig$createLocal$1$1$2 INSTANCE;

    static {
       HomeTabLocalConfig$createLocal$1$1$2.INSTANCE = new HomeTabLocalConfig$createLocal$1$1$2();
    }
    public void HomeTabLocalConfig$createLocal$1$1$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeTabLocalConfig$createLocal$1$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "msg";
       p0.mType = "ato_msg";
       p0.mTabName = "消息";
       p0.mTabNameEn = "Message";
       p0.mTabNameTc = "消息";
       return;
    }
}
