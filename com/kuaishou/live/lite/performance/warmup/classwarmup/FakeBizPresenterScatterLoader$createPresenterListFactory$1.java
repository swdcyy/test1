package com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader$createPresenterListFactory$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter;

public final class FakeBizPresenterScatterLoader$createPresenterListFactory$1 extends Lambda implements a	// class@000a44
{
    public static final FakeBizPresenterScatterLoader$createPresenterListFactory$1 INSTANCE;

    static {
       FakeBizPresenterScatterLoader$createPresenterListFactory$1.INSTANCE = new FakeBizPresenterScatterLoader$createPresenterListFactory$1();
    }
    public void FakeBizPresenterScatterLoader$createPresenterListFactory$1(){
       super(0);
    }
    public final d invoke(){
       Object obj = PatchProxy.apply(null, this, FakeBizPresenterScatterLoader$createPresenterListFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteLongConnectionPresenter();
    }
    public Object invoke(){
       return this.invoke();
    }
}
