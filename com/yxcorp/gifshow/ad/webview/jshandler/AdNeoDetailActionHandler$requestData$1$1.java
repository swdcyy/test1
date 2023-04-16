package com.yxcorp.gifshow.ad.webview.jshandler.AdNeoDetailActionHandler$requestData$1$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoDetailActionHandler$requestData$1;
import com.yxcorp.gifshow.commercial.api.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.commercial.api.AdSession;
import java.util.UUID;
import kotlin.jvm.internal.a;
import p59.c;
import java.util.Map;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.NeoDetailResponse;
import com.yxcorp.gifshow.commercial.api.DetailAd;
import zl9.e;
import java.lang.StringBuilder;
import yx.j0;

public final class AdNeoDetailActionHandler$requestData$1$1 extends Lambda implements p	// class@0018d6
{
    public final a $detailAdSession;
    public final AdNeoDetailActionHandler$requestData$1 this$0;

    public void AdNeoDetailActionHandler$requestData$1$1(AdNeoDetailActionHandler$requestData$1 p0,a p1){
       this.this$0 = p0;
       this.$detailAdSession = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.booleanValue(), p1.intValue());
       return l1.a;
    }
    public final void invoke(boolean p0,int p1){
       if (PatchProxy.isSupport(AdNeoDetailActionHandler$requestData$1$1.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, AdNeoDetailActionHandler$requestData$1$1.class, "1")) {
          return;
       }
       if (p0) {
          String str = this.$detailAdSession.e().getSessionId().toString();
          a.o(str, "detailAdSession.session.sessionId.toString\(\)");
          this.this$0.this$0.a.put(str, this.$detailAdSession);
          this.this$0.$function.onSuccess(new NeoDetailResponse(this.$detailAdSession.d(), str));
       }else {
          Object[] objArray = new Object[0];
          j0.c("adNeoDetailAction", "sync Data Form Server error.errorCode:"+p1, objArray);
          this.this$0.$function.onError(441, String.valueOf(p1));
       }
       return;
    }
}
