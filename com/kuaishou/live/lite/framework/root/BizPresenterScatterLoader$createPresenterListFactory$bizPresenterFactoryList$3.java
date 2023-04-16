package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.entrydetail.LiveLiteEntryDetailPresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3 extends Lambda implements a	// class@000964
{
    public static final BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3 INSTANCE;

    static {
       BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3.INSTANCE = new BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3();
    }
    public void BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteEntryDetailPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
