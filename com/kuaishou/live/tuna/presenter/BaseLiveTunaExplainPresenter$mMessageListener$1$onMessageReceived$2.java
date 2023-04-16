package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$d;
import com.kuaishou.livestream.message.nano.SCLiveEcoExplainCardSignal;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;

public final class BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$2 extends Lambda implements a	// class@000fc6
{
    public final SCLiveEcoExplainCardSignal $msg;
    public final BaseLiveTunaExplainPresenter$d this$0;

    public void BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$2(BaseLiveTunaExplainPresenter$d p0,SCLiveEcoExplainCardSignal p1){
       this.this$0 = p0;
       this.$msg = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.b.W8()+" has closed, ignore tuna explain message:"+this.$msg;
    }
}
