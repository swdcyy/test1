package com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$createPresenterListFactory$list$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.livestop.LiveLiteEndPresenter;

public final class FakeBizPresenterScatterLoader$createPresenterListFactory$list$2 extends Lambda implements a	// class@000a46
{
    public static final FakeBizPresenterScatterLoader$createPresenterListFactory$list$2 INSTANCE;

    static {
       FakeBizPresenterScatterLoader$createPresenterListFactory$list$2.INSTANCE = new FakeBizPresenterScatterLoader$createPresenterListFactory$list$2();
    }
    public void FakeBizPresenterScatterLoader$createPresenterListFactory$list$2(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, FakeBizPresenterScatterLoader$createPresenterListFactory$list$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteEndPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
