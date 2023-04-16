package com.kwai.yoda.hybrid.AppConfigHandler$j;
import erd.g;
import com.kwai.yoda.hybrid.AppConfigHandler;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import iy7.f;

public final class AppConfigHandler$j implements g	// class@001272
{
    public final AppConfigHandler b;

    public void AppConfigHandler$j(AppConfigHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppConfigHandler$j.class, "1")) {
       }else {
          a.h(p0, "list");
          p0 = p0.iterator();
          while (p0.hasNext()) {
             this.b.g(p0.next());
          }
       }
       return;
    }
}
