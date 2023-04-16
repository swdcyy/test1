package com.kuaishou.live.lite.framework.root.BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.livestop.LiveLiteEndPresenter;

public final class BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2 extends Lambda implements a	// class@00094c
{
    public static final BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2 INSTANCE;

    static {
       BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2.INSTANCE = new BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2();
    }
    public void BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, BasicPresenterLoader$createPresenterListFactory$bizPresenterFactoryList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteEndPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
