package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.swipe.LiveLiteHorizontalSwipePresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18 extends Lambda implements a	// class@00095c
{
    public static final BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18 INSTANCE;

    static {
       BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18.INSTANCE = new BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18();
    }
    public void BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$18.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteHorizontalSwipePresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
