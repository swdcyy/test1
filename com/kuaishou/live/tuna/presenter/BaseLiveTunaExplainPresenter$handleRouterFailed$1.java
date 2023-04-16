package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$handleRouterFailed$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class BaseLiveTunaExplainPresenter$handleRouterFailed$1 extends Lambda implements a	// class@000fc4
{
    public final String $scheme;

    public void BaseLiveTunaExplainPresenter$handleRouterFailed$1(String p0){
       this.$scheme = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, BaseLiveTunaExplainPresenter$handleRouterFailed$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "krouter route failed! url:"+this.$scheme;
    }
}
