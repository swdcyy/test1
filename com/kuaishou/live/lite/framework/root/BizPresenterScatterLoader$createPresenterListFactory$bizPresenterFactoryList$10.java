package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackPresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10 extends Lambda implements a	// class@000954
{
    public static final BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10 INSTANCE;

    static {
       BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10.INSTANCE = new BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10();
    }
    public void BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$10.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteFeedbackPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
