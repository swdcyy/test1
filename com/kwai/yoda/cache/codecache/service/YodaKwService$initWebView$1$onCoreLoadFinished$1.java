package com.kwai.yoda.cache.codecache.service.YodaKwService$initWebView$1$onCoreLoadFinished$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.cache.codecache.service.YodaKwService$initWebView$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.cache.codecache.service.YodaKwService$Companion$CoreInitState;
import com.kwai.yoda.cache.codecache.service.YodaKwService;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.concurrent.CopyOnWriteArraySet;

public final class YodaKwService$initWebView$1$onCoreLoadFinished$1 extends Lambda implements a	// class@0011af
{
    public final YodaKwService$initWebView$1 this$0;

    public void YodaKwService$initWebView$1$onCoreLoadFinished$1(YodaKwService$initWebView$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, YodaKwService$initWebView$1$onCoreLoadFinished$1.class, "1")) {
          return;
       }
       YodaKwService.e = YodaKwService$Companion$CoreInitState.INITED;
       this.this$0.a.d.clear();
       this.this$0.a.a(CollectionsKt___CollectionsKt.G5(this.this$0.a.d));
       return;
    }
}
