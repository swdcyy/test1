package ad6.g;
import java.lang.Runnable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.PluginManager;
import java.util.concurrent.CountDownLatch;
import com.kwai.plugin.dva.Dva;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import kotlin.Pair;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ed6.c;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.u;
import od6.p;
import kd6.c;
import com.kwai.plugin.dva.work.c;

public final class g implements Runnable	// class@00007b
{
    public final List b;

    public void g(List p0){
       this.b = p0;
       super();
    }
    public final void run(){
       PluginConfig obj;
       PluginConfig obj1;
       PluginConfig name;
       Object[] objArray1;
       Object obj2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "1")) {
          return;
       }
       PluginManager.b(PluginManager.H).await();
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       b pluginInstal = uDva.getPluginInstallManager();
       a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
       List list = pluginInstal.b();
       a.o(list, "Dva.instance\(\).pluginInstallManager.pluginConfigs");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list.iterator();
       p op = 1;
       boolean b = false;
       while (iterator.hasNext()) {
          obj = iterator.next();
          obj1 = obj;
          name = obj1.name;
          g og = (name == null || !name.length())? 1: null;
          if (!og) {
             Iterator iterator1 = this.b.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   objArray1 = iterator1.next();
                   PluginConfig name1 = obj1.name;
                   a.o(name1, "plugin.name");
                   if (!StringsKt__StringsKt.O2(name1, objArray1, b, 2, objArray)) {
                      continue ;
                   }
                }else {
                   objArray1 = objArray;
                }
                if (objArray1 == null) {
                label_007f :
                   if (op) {
                      uArrayList.add(obj);
                   }else {
                      continue ;
                   }
                }
             }
          }
          op = null;
          goto label_007f ;
       }
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       Iterator iterator2 = uArrayList.iterator();
       while (iterator2.hasNext()) {
          obj = iterator2.next();
          obj1 = (obj.type == null)? 1: null;
          if (obj1) {
             uArrayList1.add(obj);
          }else {
             uArrayList2.add(obj);
          }
       }
       Pair pair = new Pair(uArrayList1, uArrayList2);
       list = pair.component1();
       List list1 = pair.component2();
       PluginDownloadExtension k = PluginDownloadExtension.k;
       Objects.requireNonNull(k);
       List list2 = PatchProxy.applyOneRefs(list, k, PluginDownloadExtension.class, "4");
       if (list2 != PatchProxyResult.class) {
       }else {
          a.p(list, "originList");
          list2 = CollectionsKt___CollectionsKt.f5(list, c.b);
       }
       list = CollectionsKt___CollectionsKt.m4(list1, list2);
       uArrayList2 = new ArrayList();
       iterator2 = list.iterator();
       while (iterator2.hasNext()) {
          obj = iterator2.next();
          obj1 = obj;
          name = obj1.name;
          name = (name == null || !name.length())? 1: null;
          if (!name) {
             obj1 = obj1.md5;
             obj1 = (obj1 == null || !obj1.length())? 1: 0;
             if (!obj1) {
                obj2 = null;
             label_011f :
                if (!obj2) {
                   uArrayList2.add(obj);
                }
             }
          }
          obj2 = 1;
          goto label_011f ;
       }
       uArrayList = new ArrayList(u.Y(uArrayList2, 10));
       Iterator iterator3 = uArrayList2.iterator();
       while (iterator3.hasNext()) {
          obj = iterator3.next();
          PluginConfig name2 = obj.name;
          a.o(name2, "it.name");
          obj1 = obj.md5;
          a.o(obj1, "it.md5");
          uArrayList.add(new p(name2, obj1, obj.type));
       }
       PluginManager.H.s().c(uArrayList);
       iterator = list.iterator();
       while (iterator.hasNext()) {
          Dva uDva1 = Dva.instance();
          a.o(uDva1, "Dva.instance\(\)");
          uDva1.getPluginInstallManager().x(iterator.next().name);
       }
       return;
    }
}
