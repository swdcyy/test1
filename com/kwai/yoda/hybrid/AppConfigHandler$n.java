package com.kwai.yoda.hybrid.AppConfigHandler$n;
import java.util.concurrent.Callable;
import com.kwai.yoda.hybrid.AppConfigHandler;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import iy7.b;
import qrd.l1;

public final class AppConfigHandler$n implements Callable	// class@001276
{
    public final AppConfigHandler b;
    public final Set c;

    public void AppConfigHandler$n(AppConfigHandler p0,Set p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       if (PatchProxy.applyVoid(null, this, AppConfigHandler$n.class, "1")) {
       }else {
          this.b.e.c(CollectionsKt___CollectionsKt.G5(this.c));
       }
       return l1.a;
    }
}
