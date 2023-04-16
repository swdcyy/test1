package com.kwai.framework.plugin.PluginManager$featureTaskIdMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.PluginManager;
import java.util.Objects;
import od6.k;
import qrd.p;
import java.util.Iterator;
import java.lang.Iterable;
import od6.j;
import java.util.List;
import com.kwai.framework.plugin.model.FeatureTaskContent;
import od6.d;
import java.util.ArrayList;
import od6.c;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Integer;
import java.util.Map;

public final class PluginManager$featureTaskIdMap$2 extends Lambda implements a	// class@000c67
{
    public static final PluginManager$featureTaskIdMap$2 INSTANCE;

    static {
       PluginManager$featureTaskIdMap$2.INSTANCE = new PluginManager$featureTaskIdMap$2();
    }
    public void PluginManager$featureTaskIdMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, this, PluginManager$featureTaskIdMap$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       PluginManager h = PluginManager.H;
       Objects.requireNonNull(h);
       j obj1 = PatchProxy.apply(objArray, h, PluginManager.class, "74");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PluginManager.E.getValue();
       }
       if (obj1 != null) {
          k tasks = obj1.tasks;
          if (tasks != null) {
             Iterator iterator = tasks.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                j taskId = obj1.taskId;
                obj1 = obj1.content;
                if (obj1 != null) {
                   List list = obj1.e();
                   if (list != null) {
                      Iterator iterator1 = list.iterator();
                      while (iterator1.hasNext()) {
                         d uod = iterator1.next();
                         String str = uod.b();
                         List list1 = uod.a();
                         if (list1 != null) {
                            ArrayList uArrayList = new ArrayList();
                            Iterator iterator2 = list1.iterator();
                            while (iterator2.hasNext()) {
                               Object obj2 = iterator2.next();
                               if (a.g(obj2.a(), "master")) {
                                  uArrayList.add(obj2);
                               }else {
                                  continue ;
                               }
                            }
                            iterator2 = uArrayList.iterator();
                            while (iterator2.hasNext()) {
                               obj.put(PluginManager.H.i(str, iterator2.next().b()), Integer.valueOf(taskId));
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       return obj;
    }
}
