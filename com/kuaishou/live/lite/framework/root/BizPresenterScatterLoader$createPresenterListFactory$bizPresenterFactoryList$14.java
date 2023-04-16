package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.square.notice.LiveNewSquareNoticePresenter;

public final class BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14 extends Lambda implements a	// class@000958
{
    public static final BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14 INSTANCE;

    static {
       BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14.INSTANCE = new BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14();
    }
    public void BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$createPresenterListFactory$bizPresenterFactoryList$14.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveNewSquareNoticePresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
