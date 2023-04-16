package com.kwai.plugin.dva.feature.core.FeatureManager;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.plugin.dva.feature.core.FeatureManager$mNativeLibraryInstaller$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.LinkedList;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.Dva;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.entity.Plugin;
import java.util.Collection;
import zi7.a;
import com.kwai.plugin.dva.split.NativeLibraryInstaller;
import com.kwai.plugin.dva.feature.core.repository.config.ApkData;
import java.lang.StringBuilder;
import java.lang.Boolean;
import qi7.a;

public final class FeatureManager	// class@000e5a
{
    public static final FeatureManager a;
    public static Context b;
    public static final CountDownLatch c;
    public static a d;
    public static final CopyOnWriteArrayList e;
    public static final p f;
    public static final LinkedList g;
    public static boolean h;
    public static final List i;
    public static final String j;

    static {
       FeatureManager.a = new FeatureManager();
       FeatureManager.c = new CountDownLatch(1);
       FeatureManager.e = new CopyOnWriteArrayList();
       FeatureManager.f = s.c(FeatureManager$mNativeLibraryInstaller$2.INSTANCE);
       FeatureManager.g = new LinkedList();
       FeatureManager.h = true;
       FeatureManager.i = new CopyOnWriteArrayList();
       FeatureManager.j = "Dva:Feature";
    }
    public void FeatureManager(){
       super();
    }
    public static final List b(){
       List obj = PatchProxy.apply(null, null, FeatureManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Dva.instance().getPlugins();
       a.o(obj, "instance\(\).plugins");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          Object obj2 = obj1;
          int i = 1;
          if (obj2.getPluginType() != i && obj2.getPluginType() != 2) {
             i = 0;
          }
          if (i) {
             uArrayList.add(obj1);
          }
       }
       return uArrayList;
    }
    public final a a(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, FeatureManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FeatureManager.d;
       if (obj == null) {
          a.S("mSource");
       }else {
          objArray = obj;
       }
       return objArray;
    }
    public final List c(){
       List obj = PatchProxy.apply(null, this, FeatureManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Dva.instance().getPlugins();
       a.o(obj, "instance\(\).plugins");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i = 1;
          if (obj1.getPluginType() != i) {
             i = 0;
          }
          if (i) {
             uArrayList.add(obj1);
          }
       }
       return uArrayList;
    }
    public final NativeLibraryInstaller d(){
       Object obj = PatchProxy.apply(null, this, FeatureManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeatureManager.f.getValue();
    }
    public final String e(String p0,ApkData p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FeatureManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+'_'+p1.getAbi();
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, FeatureManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (FeatureManager.c.getCount() <= 0)? true: false;
       return b;
    }
    public final void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeatureManager.class, "4")) {
          return;
       }
       a.p(p0, "interceptor");
       List i = FeatureManager.i;
       if (!i.contains(p0)) {
          i.add(p0);
       }
       return;
    }
}
