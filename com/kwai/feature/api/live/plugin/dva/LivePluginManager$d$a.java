package com.kwai.feature.api.live.plugin.dva.LivePluginManager$d$a;
import java.util.concurrent.Callable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import qs5.e;
import erd.g;
import qrd.l1;

public final class LivePluginManager$d$a implements Callable	// class@000ff2
{
    public final List b;

    public void LivePluginManager$d$a(List p0){
       this.b = p0;
       super();
    }
    public Object call(){
       if (PatchProxy.applyVoid(null, this, LivePluginManager$d$a.class, "1")) {
       }else {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().accept(new Object());
          }
       }
       return l1.a;
    }
}
