package com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.liteend.autoremove.LiveLiteEndAutoRemoveFeedPresenter;

public final class LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1 extends Lambda implements a	// class@000bc6
{
    public static final LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1 INSTANCE;

    static {
       LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1.INSTANCE = new LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1();
    }
    public void LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndRootViewController$EndPresenterLoader$createPresenterListFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteEndAutoRemoveFeedPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
