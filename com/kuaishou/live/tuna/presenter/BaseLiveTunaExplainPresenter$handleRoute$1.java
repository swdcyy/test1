package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$handleRoute$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class BaseLiveTunaExplainPresenter$handleRoute$1 extends Lambda implements a	// class@000fc3
{
    public final String $scheme;
    public final BaseLiveTunaExplainPresenter this$0;

    public void BaseLiveTunaExplainPresenter$handleRoute$1(BaseLiveTunaExplainPresenter p0,String p1){
       this.this$0 = p0;
       this.$scheme = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, BaseLiveTunaExplainPresenter$handleRoute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.W8()+" tuna explain handle router url: "+this.$scheme;
    }
}
