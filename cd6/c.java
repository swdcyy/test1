package cd6.c;
import cd6.b;
import cd6.c$a;
import nsd.u;
import rd6.d;
import rd6.e;
import kd6.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import java.io.File;
import kotlin.io.FilesKt__UtilsKt;
import cd6.a;
import com.kwai.sdk.switchconfig.a;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import od6.x;
import java.util.List;
import brd.a0;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import zi7.a;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import java.lang.Iterable;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import android.content.Context;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import com.kwai.plugin.dva.feature.core.repository.config.ApkData;
import java.util.Collection;
import java.lang.StringBuilder;
import trd.u;
import sd6.f;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.d1;
import java.lang.Number;
import com.kwai.plugin.dva.work.c;
import cd6.c$b;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.framework.plugin.incremental.IncrementPatcher;
import java.util.Objects;
import kd6.d;
import java.io.FilenameFilter;
import java.util.LinkedHashSet;
import com.kwai.plugin.dva.repository.model.PluginConfig;

public final class c implements b	// class@0006a2
{
    public final d a;
    public final e b;
    public final f c;
    public static final c$a d;

    static {
       c.d = new c$a(null);
    }
    public void c(d p0,e p1,f p2){
       a.p(p0, "mPluginSource");
       a.p(p1, "mSplitSource");
       a.p(p2, "mIncrementer");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       File dir = a.b().getDir("qigsaw", 0);
       a.o(dir, "AppEnv.getAppContext\(\).g¡­w\", Context.MODE_PRIVATE\)");
       if (dir.exists()) {
          FilesKt__UtilsKt.V(dir);
       }
       return;
    }
    public synchronized void b(a p0){
       Iterator iterator1;
       Integer obj1;
       Set obj2;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, c.class, "1")) {
          return;
       }
       boolean b = a.t().d("dva_clean_old_plugins", false);
       if (!b) {
          return;
       }
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       b pluginInstal = uDva.getPluginInstallManager();
       a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
       Map map = pluginInstal.h();
       a.o(map, "Dva.instance\(\).pluginIns¡­lDownloadedPluginVersions");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = map.entrySet().iterator();
       int i = 1;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          CharSequence key = uEntry.getKey();
          int i1 = (key == null || !key.length())? 1: 0;
          i1 = i1 ^ i;
          if (i1) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       if (linkedHashMa.isEmpty()) {
          return;
       }
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       x ox = obj.a.i();
       List list = null;
       List list1 = (ox != null)? ox.a(): list;
       obj.e(linkedHashMa1, list1);
       ox = obj.a.o();
       if (ox != null) {
          list = ox.a();
       }
       obj.e(linkedHashMa1, list);
       obj.e(linkedHashMa1, obj.b.b().e());
       Dva uDva1 = Dva.instance();
       a.o(uDva1, "Dva.instance\(\)");
       b pluginInstal1 = uDva1.getPluginInstallManager();
       a.o(pluginInstal1, "Dva.instance\(\).pluginInstallManager");
       obj.e(linkedHashMa1, pluginInstal1.b());
       FeatureDetails uFeatureDeta = FeatureManager.a.a().h();
       if (uFeatureDeta != null) {
          list1 = uFeatureDeta.getSplits();
          if (list1 != null) {
             iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                FeatureInfo uFeatureInfo = iterator1.next();
                Application uApplication = a.b();
                a.o(uApplication, "AppEnv.getAppContext\(\)");
                List apkDataList = uFeatureInfo.getApkDataList(uApplication);
                if (apkDataList == null) {
                   apkDataList = CollectionsKt__CollectionsKt.E();
                }
                ArrayList uArrayList = new ArrayList();
                Iterator iterator2 = apkDataList.iterator();
                while (iterator2.hasNext()) {
                   obj1 = iterator2.next();
                   obj2 = obj1;
                   obj2 = (obj2 != null && a.g(obj2.getAbi(), "master"))? 1: null;
                   if (obj2) {
                      uArrayList.add(obj1);
                   }
                }
                Iterator iterator3 = uArrayList.iterator();
                while (iterator3.hasNext()) {
                   obj.d(linkedHashMa1, uFeatureInfo.getSplitName(), (iterator3.next().getMd5()).hashCode());
                }
                uArrayList = new ArrayList();
                Iterator iterator4 = apkDataList.iterator();
                while (iterator4.hasNext()) {
                   Object obj3 = iterator4.next();
                   obj1 = obj3;
                   if (obj1 != null) {
                      int i2 = a.g(obj1.getAbi(), "master") ^ i;
                      if (i2) {
                         obj1 = 1;
                      label_0177 :
                         if (obj1) {
                            uArrayList.add(obj3);
                         }
                      }
                   }
                   obj1 = null;
                   goto label_0177 ;
                }
                iterator4 = uArrayList.iterator();
                while (iterator4.hasNext()) {
                   ApkData uApkData = iterator4.next();
                   obj.d(linkedHashMa1, uFeatureInfo.getSplitName()+'_'+uApkData.getAbi(), (uApkData.getMd5()).hashCode());
                }
             }
          }
       }
       if (linkedHashMa1.isEmpty()) {
          return;
       }else {
          list1 = obj.c.getAllCache();
          ArrayList uArrayList1 = new ArrayList(u.Y(list1, 10));
          iterator1 = list1.iterator();
          while (iterator1.hasNext()) {
             uArrayList1.add(Integer.valueOf(iterator1.next().f()));
          }
          obj2 = CollectionsKt___CollectionsKt.L5(uArrayList1);
          Iterator iterator5 = linkedHashMa.entrySet().iterator();
          while (iterator5.hasNext()) {
             Map$Entry uEntry1 = iterator5.next();
             Object obj4 = uEntry1.getKey();
             int[] value = uEntry1.getValue();
             Set set = linkedHashMa1.get(obj4);
             if (set == null) {
                set = d1.k();
             }
             a.o(value, "pluginVersionArray");
             uArrayList1 = new ArrayList();
             int len = value.length;
             int i3 = 0;
             while (i3 < len) {
                int i4 = value[i3];
                obj1 = (!set.contains(Integer.valueOf(i4)) && !obj2.contains(Integer.valueOf(i4)))? 1: null;
                if (obj1) {
                   uArrayList1.add(Integer.valueOf(i4));
                }
                i3 = i3 + 1;
             }
             if (b) {
                Iterator iterator6 = uArrayList1.iterator();
                while (iterator6.hasNext()) {
                   int i5 = iterator6.next().intValue();
                   Dva uDva2 = Dva.instance();
                   a.o(uDva2, "Dva.instance\(\)");
                   c$b uob = v8;
                   c$b uob1 = v8;
                   uob = new c$b(i5, obj4, linkedHashMa1, obj2, b, p0);
                   uDva2.getPluginInstallManager().p(obj4, i5).a(uob1);
                   i = 1;
                }
             }
             c uoc = 1;
          }
          return;
       }
    }
    public void c(){
       IncrementPatcher c;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, c.class, str)) {
          return;
       }
       c = IncrementPatcher.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(objArray, c, IncrementPatcher.class, str)) {
          File[] uFileArray = c.b().listFiles(d.b);
          if (uFileArray != null) {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                a.o(oobject, "file");
                FilesKt__UtilsKt.V(oobject);
                oobject.getName();
                i = i + 1;
             }
          }
       }
       return;
    }
    public final void d(Map p0,String p1,int p2){
       LinkedHashSet linkedHashSe;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "5")) {
          return;
       }
       if (p0.get(p1) == null) {
          linkedHashSe = new LinkedHashSet();
          p0.put(p1, linkedHashSe);
       }else {
          linkedHashSe = p0.get(p1);
       }
       if (linkedHashSe != null) {
          linkedHashSe.add(Integer.valueOf(p2));
       }
       return;
    }
    public final void e(Map p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       if (p1 != null) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             PluginConfig pluginConfig = iterator.next();
             PluginConfig name = pluginConfig.name;
             a.o(name, "it.name");
             this.d(p0, name, pluginConfig.version);
          }
       }
       return;
    }
}
