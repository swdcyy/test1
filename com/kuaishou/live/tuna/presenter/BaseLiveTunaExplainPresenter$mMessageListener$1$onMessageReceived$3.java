package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$3;
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

public final class BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$3 extends Lambda implements a	// class@000fc7
{
    public final SCLiveEcoExplainCardSignal $msg;
    public final BaseLiveTunaExplainPresenter$d this$0;

    public void BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$3(BaseLiveTunaExplainPresenter$d p0,SCLiveEcoExplainCardSignal p1){
       this.this$0 = p0;
       this.$msg = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, BaseLiveTunaExplainPresenter$mMessageListener$1$onMessageReceived$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.b.W8()+" tuna explain message:"+this.$msg;
    }
}
