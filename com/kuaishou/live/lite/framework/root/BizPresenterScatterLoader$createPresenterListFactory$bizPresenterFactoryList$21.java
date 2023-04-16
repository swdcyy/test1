package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21 extends Lambda implements a	// class@000960
{
    public static final BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21 INSTANCE;

    static {
       BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21.INSTANCE = new BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21();
    }
    public void BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$21.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteWebViewPopupPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
