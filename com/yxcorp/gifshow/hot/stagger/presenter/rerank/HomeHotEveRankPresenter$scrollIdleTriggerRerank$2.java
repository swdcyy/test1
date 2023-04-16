package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$scrollIdleTriggerRerank$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeHotEveRankPresenter$scrollIdleTriggerRerank$2 extends Lambda implements a	// class@0018bf
{
    public static final HomeHotEveRankPresenter$scrollIdleTriggerRerank$2 INSTANCE;

    static {
       HomeHotEveRankPresenter$scrollIdleTriggerRerank$2.INSTANCE = new HomeHotEveRankPresenter$scrollIdleTriggerRerank$2();
    }
    public void HomeHotEveRankPresenter$scrollIdleTriggerRerank$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeHotEveRankPresenter$scrollIdleTriggerRerank$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableMainHotScrollIdleRerank", false);
    }
}
