package com.kwai.feature.api.live.plugin.dva.LivePluginManager$d;
import ij7.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.android.live.log.b;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import qs5.e;
import kotlin.Pair;
import erd.g;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager$d$a;
import java.util.concurrent.Callable;
import brd.t;
import brd.z;
import lrd.b;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager$d$b;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager$d$c;
import crd.b;

public final class LivePluginManager$d implements c	// class@000ff5
{

    public void LivePluginManager$d(){
       super();
    }
    public void a(long p0,String p1,int p2,int p3,String p4){
       if (PatchProxy.isSupport(LivePluginManager$d.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, LivePluginManager$d.class, "1")) {
             return;
          }
       }
       a.p(p1, "pluginName");
       if (a.g(p1, "live_audience_plugin") && p2 == 0x27d8) {
          LivePluginManager d = LivePluginManager.d;
          if (!LivePluginManager.c) {
             b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginManager"), "live audience plugin loaded: ", "mInitOpListenersList", LivePluginManager.a(d));
             Dva uDva = Dva.instance();
             a.o(uDva, "Dva.instance\(\)");
             uDva.getPluginInstallManager().r(this);
             ArrayList uArrayList = new ArrayList();
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator = LivePluginManager.a(d).iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (obj.b != null) {
                   uArrayList.add(obj);
                }else {
                   uArrayList1.add(obj);
                }
             }
             Pair pair = new Pair(uArrayList, uArrayList1);
             List list = pair.component1();
             iterator = pair.component2().iterator();
             while (iterator.hasNext()) {
                iterator.next().accept(new Object());
             }
             t.fromCallable(new LivePluginManager$d$a(list)).subscribeOn(b.c()).subscribe(new LivePluginManager$d$b(list), LivePluginManager$d$c.b);
             LivePluginManager.a(LivePluginManager.d).clear();
             LivePluginManager.c = true;
          }
       }
       return;
    }
}
