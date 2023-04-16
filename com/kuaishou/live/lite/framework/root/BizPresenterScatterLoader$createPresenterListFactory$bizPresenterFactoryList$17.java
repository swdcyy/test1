package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.luckystar.LiveLiteLuckyStarPresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17 extends Lambda implements a	// class@00095b
{
    public static final BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17 INSTANCE;

    static {
       BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17.INSTANCE = new BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17();
    }
    public void BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$17.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteLuckyStarPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
