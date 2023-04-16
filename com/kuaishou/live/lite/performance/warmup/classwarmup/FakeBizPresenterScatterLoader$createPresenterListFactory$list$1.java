package com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$createPresenterListFactory$list$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter;

public final class FakeBizPresenterScatterLoader$createPresenterListFactory$list$1 extends Lambda implements a	// class@000a45
{
    public static final FakeBizPresenterScatterLoader$createPresenterListFactory$list$1 INSTANCE;

    static {
       FakeBizPresenterScatterLoader$createPresenterListFactory$list$1.INSTANCE = new FakeBizPresenterScatterLoader$createPresenterListFactory$list$1();
    }
    public void FakeBizPresenterScatterLoader$createPresenterListFactory$list$1(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, FakeBizPresenterScatterLoader$createPresenterListFactory$list$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteBizPlayerPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
