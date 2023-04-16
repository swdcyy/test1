package com.yxcorp.gifshow.ad.webview.jshandler.AdNeoDetailActionHandler$requestData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import p59.c;
import zl9.e;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.api.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoDetailActionHandler$requestData$1$1;
import msd.p;
import yx.j0;

public final class AdNeoDetailActionHandler$requestData$1 extends Lambda implements l	// class@0018d7
{
    public final e $function;
    public final c this$0;

    public void AdNeoDetailActionHandler$requestData$1(c p0,e p1){
       this.this$0 = p0;
       this.$function = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoDetailActionHandler$requestData$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.l(new AdNeoDetailActionHandler$requestData$1$1(this, p0));
       }else {
          Object[] objArray = new Object[0];
          j0.c("adNeoDetailAction", "neo video plugin install fail", objArray);
          this.$function.onError(441, "plugin install fail");
       }
       return;
    }
}
