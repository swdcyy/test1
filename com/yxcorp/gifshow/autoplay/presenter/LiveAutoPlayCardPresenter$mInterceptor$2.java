package com.yxcorp.gifshow.autoplay.presenter.LiveAutoPlayCardPresenter$mInterceptor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import x99.s0;
import com.yxcorp.gifshow.autoplay.presenter.LiveAutoPlayCardPresenter$mInterceptor$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAutoPlayCardPresenter$mInterceptor$2 extends Lambda implements a	// class@001c1e
{
    public final s0 this$0;

    public void LiveAutoPlayCardPresenter$mInterceptor$2(s0 p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveAutoPlayCardPresenter$mInterceptor$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAutoPlayCardPresenter$mInterceptor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAutoPlayCardPresenter$mInterceptor$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
