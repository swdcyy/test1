package com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.liteend.baseinfo.LiveLiteEndBaseInfoPresenter;

public final class LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2 extends Lambda implements a	// class@000bc7
{
    public static final LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2 INSTANCE;

    static {
       LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2.INSTANCE = new LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2();
    }
    public void LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteEndBaseInfoPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
