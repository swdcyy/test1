package com.kwai.plugin.dva.install.c;
import com.kwai.plugin.dva.install.b;
import android.content.Context;
import nj7.e;
import com.kwai.plugin.dva.install.e;
import lj7.g;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import sj7.c;
import java.lang.String;
import com.kwai.plugin.dva.work.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import qj7.d;
import java.util.Map;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.install.c$a;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.install.SuspendInstallWork;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.work.FutureTaskWork;
import java.util.Objects;
import fj7.d;
import java.lang.Runnable;
import java.lang.Integer;
import com.kwai.plugin.dva.install.c$c;
import com.kwai.plugin.dva.install.e$b;
import java.util.concurrent.CountDownLatch;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import com.kwai.plugin.dva.install.PluginUrlManager;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.plugin.dva.install.c$b;
import java.lang.InterruptedException;
import java.lang.Boolean;
import java.io.File;
import nj7.c;
import com.kwai.plugin.dva.util.a;
import nj7.b;
import java.io.FileFilter;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.plugin.dva.install.a;
import java.util.LinkedList;
import com.kwai.plugin.dva.work.b;
import ij7.d;
import ij7.a;
import sj7.b;
import ij7.c;
import ij7.b;
import java.lang.Exception;
import qj7.f;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Float;
import com.kwai.plugin.dva.work.a;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.lang.RuntimeException;
import java.util.HashSet;
import com.kwai.plugin.dva.install.c$d;
import fj7.b;
import com.kwai.plugin.dva.install.f;
import gj7.b;
import fj7.a;
import com.kwai.plugin.dva.install.remote.c;
import java.lang.IllegalArgumentException;

public class c implements b	// class@000e97
{
    public final Map a;
    public final Map b;
    public final e c;
    public final e d;
    public final g e;
    public final List f;
    public final List g;
    public final c h;
    public final c i;
    public boolean j;
    public Context k;

    public void c(Context p0,e p1,e p2,g p3){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       this.f = new CopyOnWriteArrayList();
       this.g = new CopyOnWriteArrayList();
       this.h = new c();
       this.i = new c();
       this.j = false;
       this.k = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final c A(String p0){
       Executor c;
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.c("\tplugin "+p0+" is going to install.");
       obj = c.j(p0);
       c ta = this.a;
       _monitor_enter(ta);
       this.a.put(p0, obj);
       _monitor_exit(ta);
       c = WorkExecutors.c;
       obj.b(c, new c$a(this, obj));
       SuspendInstallWork suspendInsta = new SuspendInstallWork(obj, p0, this.c, this.d, this.e, this.f, this.g);
       CoroutineDispatcher uCoroutineDi = WorkExecutors.b();
       if (!PatchProxy.applyVoidOneRefs(uCoroutineDi, v10, SuspendInstallWork.class, "1")) {
          a.p(uCoroutineDi, "dispatcher");
          Objects.requireNonNull(FutureTaskWork.g);
          if (!FutureTaskWork.h) {
             c.execute(new d(uCoroutineDi, v10));
          }else {
             SuspendInstallWork.f(uCoroutineDi, v10);
          }
       }
       return obj;
    }
    public final c B(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoc = c.j(p0);
       this.d.a(p0, p1, new c$c(this, uoc, p0));
       return uoc;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       List list = this.c.b();
       CountDownLatch uCountDownLa = new CountDownLatch(list.size());
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          PluginConfig pluginConfig = iterator.next();
          if (TextUtils.isEmpty(PluginUrlManager.a.b(pluginConfig))) {
             uCountDownLa.countDown();
          }else {
             this.d.a(pluginConfig.name, pluginConfig.version, new c$b(this, uCountDownLa));
          }
       }
       try{
          uCountDownLa.await();
       }catch(java.lang.InterruptedException e0){
          e0.printStackTrace();
       }
       return;
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.b();
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.c.c(p0);
       return;
    }
    public synchronized void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.c.d(p0);
       return;
    }
    public synchronized void e(PluginConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.c.e(p0);
       return;
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.c.f(p0);
       return;
    }
    public boolean g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PluginConfig pluginConfig = this.c.g(p0);
       if (pluginConfig == null) {
          return false;
       }
       if (TextUtils.isEmpty(PluginUrlManager.a.b(pluginConfig))) {
          return true;
       }
       File uFile = c.a(pluginConfig.name, pluginConfig.version);
       if (uFile.exists() && uFile.isFile()) {
          String str = a.h(uFile);
          if (str != null && str.equals(pluginConfig.md5)) {
             return true;
          }
       }
       return false;
    }
    public Map h(){
       int len;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, this, c.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       HashMap hashMap = PatchProxy.apply(objArray, objArray, c.class, "10");
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          File[] uFileArray = c.f().listFiles();
          if (uFileArray != null) {
             int len1 = uFileArray.length;
             len = 0;
             while (len < len1) {
                object oobject = uFileArray[len];
                File[] uFileArray1 = oobject.listFiles(new b());
                if (uFileArray1 != null && uFileArray1.length > 0) {
                   hashMap.put(oobject.getName(), uFileArray1);
                }
                len = len + 1;
             }
          }
       }
       Iterator iterator = hashMap.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          File[] value = uEntry.getValue();
          len = value.length;
          int[] ointArray = new int[len];
          int i = 0;
          while (i < len) {
             try{
                ointArray[i] = Integer.parseInt(value[i].getName());
             }catch(java.lang.NumberFormatException e0){
                ointArray[i] = 0;
             }
             i = i + 1;
          }
          obj.put(uEntry.getKey(), ointArray);
       }
       return obj;
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       if (!this.g.contains(p0)) {
          this.g.add(p0);
       }
       return;
    }
    public synchronized c j(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.c("start install plugin "+p0);
       if (this.w().contains(p0)) {
          d.c("\tplugin "+p0+" has already been installed.");
          return c.k(p0);
       }else {
          obj = this.n(p0);
          if (obj == null) {
             return this.A(p0);
          }
          d.c("\tplugin "+p0+" is installing.");
          return obj;
       }
    }
    public synchronized c k(List p0){
       LinkedList obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.size()) {
          return c.k(p0);
       }
       obj = new LinkedList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(this.j(iterator.next()));
       }
       return b.b(obj);
    }
    public synchronized boolean l(){
       return this.j;
    }
    public void m(Executor p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "21")) {
          return;
       }
       this.h.a(new a(p0, p1));
       return;
    }
    public c n(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return this.a.get(p0);
    }
    public void o(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "10")) {
          return;
       }
       if (!this.f.contains(p0)) {
          this.f.add(p0);
       }
       return;
    }
    public c p(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.B(p0, p1);
    }
    public void q(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "24")) {
          return;
       }
       this.i.a(new b(WorkExecutors.b, p0));
       return;
    }
    public void r(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "25")) {
          return;
       }
       this.i.c(new b(WorkExecutors.b, p0));
       return;
    }
    public c s(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginConfig obj = PatchProxy.applyOneRefs(p0, this, c.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c.g(p0);
       if (obj == null) {
          return c.i(new Exception("Delete Plugin Config not Found"));
       }
       int i = 1;
       if (obj.type == i) {
          PluginConfig pluginConfig = this.c.g(f.a(this.k, p0));
          if (pluginConfig != null) {
             d.c(pluginConfig.name+" found, will be deleted.");
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(this.B(pluginConfig.name, pluginConfig.version));
             uArrayList.add(this.B(obj.name, obj.version));
             PluginConfig name = obj.name;
             c uoc = PatchProxy.applyTwoRefs(name, uArrayList, null, b.class, "1");
             if (uoc != patchProxyRe) {
             }else {
                uoc = c.j(name);
                int[] ointArray = new int[i];
                ointArray[0] = 0;
                int i1 = uArrayList.size();
                HashMap hashMap = new HashMap(uArrayList.size());
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   hashMap.put(Long.valueOf(iterator.next().f()), Float.valueOf(0));
                }
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   Object obj1 = iterator1.next();
                   a uoa = new a(uoc, obj1, hashMap, ointArray, i1, name);
                   obj1.b(WorkExecutors.c, v13);
                }
             }
             return uoc;
          }else {
             d.c(obj.name+" no so.");
          }
       }
       return this.B(p0, obj.version);
    }
    public boolean t(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PluginConfig pluginConfig = this.c.g(p0);
       boolean b = false;
       if (pluginConfig == null) {
          return b;
       }
       File uFile = c.c(pluginConfig.name, pluginConfig.version);
       if (uFile.exists() && uFile.isFile()) {
          b = true;
       }
       return b;
    }
    public void u(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "20")) {
          return;
       }
       this.m(WorkExecutors.b, p0);
       return;
    }
    public void v(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "28")) {
          return;
       }
       if (!this.t(p0)) {
          throw new RuntimeException("the "+p0+" has not been installed before.");
       }
       this.c.j(this.e.d(p0).getPluginInfo());
       return;
    }
    public Set w(){
       Iterator obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HashSet hashSet = new HashSet();
       obj = this.c.a().iterator();
       while (obj.hasNext()) {
          hashSet.add(obj.next().name);
       }
       return hashSet;
    }
    public c x(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       _monitor_enter(obj);
       c uoc = this.a.get(p0);
       if (uoc != null) {
          d.c("predownload: exist task "+p0);
          _monitor_exit(obj);
          return uoc;
       }else {
          _monitor_exit(obj);
          if (this.g(p0)) {
             return c.k(p0);
          }
          d.c("predownload "+p0);
          PluginConfig pluginConfig = this.c.g(p0);
          if (pluginConfig != null) {
             PluginUrlManager a = PluginUrlManager.a;
             if (!TextUtils.isEmpty(a.b(pluginConfig))) {
                c uoc1 = c.j(p0);
                c td = this.d;
                PluginConfig name = pluginConfig.name;
                PluginConfig version = pluginConfig.version;
                String str = a.b(pluginConfig);
                pluginConfig = pluginConfig.md5;
                c$d uod = new c$d(this, uoc1, p0);
                e uoe = e.class;
                _monitor_enter(td);
                if (PatchProxy.isSupport(uoe)) {
                   Object[] objArray = new Object[]{name,Integer.valueOf(version),str,pluginConfig,uod};
                   if (PatchProxy.applyVoid(objArray, td, uoe, "4")) {
                      _monitor_exit(td);
                   label_00b7 :
                      return uoc1;
                   }
                }
                b uob = new b(name, version, str, pluginConfig);
                uob.b(new f(td, uod));
                td.b.e(uob);
                _monitor_exit(td);
                goto label_00b7 ;
             }
          }
          return c.i(new IllegalArgumentException("plugin config not found for "+p0));
       }
    }
    public void y(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "22")) {
          return;
       }
       this.h.c(new a(WorkExecutors.b, p0));
       return;
    }
    public void z(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       c ta = this.a;
       _monitor_enter(ta);
       this.a.remove(p0.e());
       _monitor_exit(ta);
       return;
    }
}
