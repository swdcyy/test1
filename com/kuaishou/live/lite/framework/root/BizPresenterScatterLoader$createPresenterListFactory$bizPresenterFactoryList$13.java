package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.square.LiveNewSquarePresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13 extends Lambda implements a	// class@000957
{
    public static final BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13 INSTANCE;

    static {
       BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13.INSTANCE = new BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13();
    }
    public void BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$13.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveNewSquarePresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
