package com.kwai.framework.plugin.PluginManager;
import com.kwai.framework.plugin.PluginManager$mApiProvider$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.plugin.PluginManager$mPluginSource$2;
import com.kwai.framework.plugin.PluginManager$mDeviceSource$2;
import com.kwai.framework.plugin.PluginManager$mLogger$2;
import com.kwai.framework.plugin.PluginManager$mCacheManager$2;
import com.kwai.framework.plugin.PluginManager$mIncrementStore$2;
import com.kwai.framework.plugin.PluginManager$mPluginIncrementDownloader$2;
import com.kwai.framework.plugin.PluginManager$g;
import com.kwai.framework.plugin.PluginManager$mUrlSource$2;
import com.kwai.framework.plugin.PluginManager$mPluginWarmUpManager$2;
import com.kwai.framework.plugin.PluginManager$h;
import com.kwai.framework.plugin.PluginManager$mRecallLogger$2;
import com.kwai.framework.plugin.PluginManager$mInstallReporter$2;
import com.kwai.framework.plugin.PluginManager$mLoadReporter$2;
import com.kwai.framework.plugin.PluginManager$mSPProvider$2;
import com.kwai.framework.plugin.PluginManager$mPluginDatabase$2;
import com.kwai.framework.plugin.PluginManager$f;
import com.kwai.framework.plugin.PluginManager$mSplitSource$2;
import com.kwai.framework.plugin.PluginManager$mConfigValidator$2;
import com.kwai.framework.plugin.PluginManager$mCleanListener$2;
import com.kwai.framework.plugin.PluginManager$mCleaner$2;
import java.util.concurrent.CountDownLatch;
import com.kwai.framework.plugin.util.DisposableSuspendLatch;
import com.kwai.framework.plugin.PluginManager$mIsMainProcess$2;
import com.kwai.framework.plugin.PluginManager$currentFeatureWrap$2;
import com.kwai.framework.plugin.PluginManager$featureTaskIdMap$2;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import android.content.res.Resources;
import android.content.Context;
import java.lang.String;
import kotlin.jvm.internal.a;
import od6.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import java.util.Collection;
import com.kwai.framework.plugin.model.DvaUploadInfo;
import rd6.d;
import od6.x;
import od6.t;
import com.kwai.plugin.dva.install.PluginUrlManager;
import com.kwai.framework.plugin.model.FeatureUploadInfo;
import od6.g;
import java.lang.Integer;
import com.kwai.framework.plugin.model.AssetUploadInfo;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.feature.core.loader.a;
import trd.u;
import java.io.File;
import od6.a;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Build;
import java.util.Objects;
import kotlin.collections.ArraysKt___ArraysKt;
import android.app.Application;
import com.kwai.dva.design.PluginInstallerUIHandler;
import com.kwai.framework.plugin.ui.dialog.PluginInstallerDialog;
import com.kwai.framework.plugin.ui.page.PluginInstallerPage;
import nd6.e;
import vi5.c;
import yi5.a;
import com.kwai.dva.design.PluginInstallerUIHandler$b;
import qd6.a;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.a;
import com.kwai.plugin.dva.a$b;
import com.kwai.framework.plugin.downloader.PluginDownloader;
import com.kwai.framework.plugin.incremental.IncrementStoreImpl;
import com.kwai.framework.plugin.log.PluginLogger;
import fd6.c;
import gd6.b;
import fd6.b;
import hd6.b;
import fd6.a;
import fd6.d;
import kd6.f;
import ae6.f;
import com.kwai.plugin.dva.install.remote.download.c;
import nd6.p;
import qj7.c;
import nd6.i;
import mj7.a;
import nd6.j;
import mj7.c;
import com.kwai.framework.plugin.PluginManager$mSPProvider$2$a;
import oj7.d;
import com.yxcorp.utility.SystemUtil;
import qj7.h;
import am8.a;
import am8.d;
import com.kwai.framework.plugin.PluginManager$LazyInitSuspendInterceptor;
import com.kwai.plugin.dva.install.a;
import java.util.concurrent.ExecutorService;
import com.kwai.framework.plugin.PluginManager$b;
import java.util.concurrent.Executor;
import ij7.d;
import zd6.c;
import com.kwai.framework.plugin.PluginManager$c;
import ij7.c;
import com.kwai.framework.plugin.usecase.PluginConfigReadyInterceptor;
import o56.c;
import o56.a;
import vd6.b;
import jd6.g;
import jd6.g$a;
import org.json.JSONObject;
import org.json.JSONArray;
import od6.n;
import java.util.HashMap;
import java.util.Map;
import pd6.f;
import android.util.SparseArray;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import okio.n;
import okio.l;
import okio.d;
import cud.k;
import java.lang.CharSequence;
import java.io.IOException;
import vi7.a;
import java.util.HashSet;
import bj7.a;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.framework.plugin.ui.PluginLinkInterceptActivity;
import nd6.q;
import com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager;
import com.kwai.plugin.dva.feature.core.repository.FeatureSourceImpl;
import aj7.a;
import com.kwai.plugin.dva.feature.core.repository.b;
import ri7.a;
import zi7.a;
import zi7.b;
import java.util.Arrays;
import java.lang.ClassLoader;
import com.kwai.plugin.dva.feature.core.repository.a;
import android.text.TextUtils;
import com.kwai.plugin.dva.util.b;
import java.util.LinkedList;
import com.kwai.plugin.dva.feature.core.loader.classloader.FeatureClassLoader;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import ji7.a;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.plugin.dva.feature.core.loader.FeaturePluginLoader;
import yi7.a;
import lj7.d;
import com.kwai.plugin.dva.feature.core.a;
import com.kwai.dva.dex2oat.Dex2OatManager;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook$a;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.kwai.framework.plugin.PluginManager$e;
import qi7.a;
import jd6.i;
import android.os.Looper;
import jd6.k;
import java.lang.Runnable;
import com.kwai.plugin.dva.split.SplitManager;
import java.util.concurrent.FutureTask;
import dd6.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import java.lang.System;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import ii7.b;
import qj7.d;
import kotlin.Result;
import qrd.j0;
import zsd.u;
import java.util.concurrent.Future;
import com.kwai.framework.plugin.PluginManager$i;
import t45.c;
import vd6.a;
import vd6.d;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Exception;
import kotlin.collections.CollectionsKt___CollectionsKt;
import be6.e;
import com.yxcorp.utility.AbiUtil;
import com.kwai.plugin.dva.util.CpuAbiUtils;
import com.kwai.framework.plugin.PluginManager$d;
import com.kwai.framework.plugin.repository.remote.RemoteProvider;
import cd6.b;
import ad6.a;
import rd6.b;
import kd6.c;
import rd6.e;

public final class PluginManager	// class@000c7f
{
    public static final DisposableSuspendLatch A;
    public static final CountDownLatch B;
    public static final p C;
    public static boolean D;
    public static final p E;
    public static final p F;
    public static final ConcurrentHashMap G;
    public static final PluginManager H;
    public static long a;
    public static Context b;
    public static Context c;
    public static boolean d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    public static final PluginManager$g l;
    public static final p m;
    public static final p n;
    public static final PluginManager$h o;
    public static final p p;
    public static final p q;
    public static final p r;
    public static final p s;
    public static final p t;
    public static final PluginManager$f u;
    public static final p v;
    public static final p w;
    public static final p x;
    public static final p y;
    public static final CountDownLatch z;

    static {
       PluginManager.H = new PluginManager();
       PluginManager.e = s.c(PluginManager$mApiProvider$2.INSTANCE);
       PluginManager.f = s.c(PluginManager$mPluginSource$2.INSTANCE);
       PluginManager.g = s.c(PluginManager$mDeviceSource$2.INSTANCE);
       PluginManager.h = s.c(PluginManager$mLogger$2.INSTANCE);
       PluginManager.i = s.c(PluginManager$mCacheManager$2.INSTANCE);
       PluginManager.j = s.c(PluginManager$mIncrementStore$2.INSTANCE);
       PluginManager.k = s.c(PluginManager$mPluginIncrementDownloader$2.INSTANCE);
       PluginManager.l = new PluginManager$g();
       PluginManager.m = s.c(PluginManager$mUrlSource$2.INSTANCE);
       PluginManager.n = s.c(PluginManager$mPluginWarmUpManager$2.INSTANCE);
       PluginManager.o = new PluginManager$h();
       PluginManager.p = s.c(PluginManager$mRecallLogger$2.INSTANCE);
       PluginManager.q = s.c(PluginManager$mInstallReporter$2.INSTANCE);
       PluginManager.r = s.c(PluginManager$mLoadReporter$2.INSTANCE);
       PluginManager.s = s.c(PluginManager$mSPProvider$2.INSTANCE);
       PluginManager.t = s.c(PluginManager$mPluginDatabase$2.INSTANCE);
       PluginManager.u = new PluginManager$f();
       PluginManager.v = s.c(PluginManager$mSplitSource$2.INSTANCE);
       PluginManager.w = s.c(PluginManager$mConfigValidator$2.INSTANCE);
       PluginManager.x = s.c(PluginManager$mCleanListener$2.INSTANCE);
       PluginManager.y = s.c(PluginManager$mCleaner$2.INSTANCE);
       PluginManager.z = new CountDownLatch(1);
       PluginManager.A = new DisposableSuspendLatch();
       PluginManager.B = new CountDownLatch(1);
       PluginManager.C = s.c(PluginManager$mIsMainProcess$2.INSTANCE);
       PluginManager.E = s.c(PluginManager$currentFeatureWrap$2.INSTANCE);
       PluginManager.F = s.c(PluginManager$featureTaskIdMap$2.INSTANCE);
       PluginManager.G = new ConcurrentHashMap();
    }
    public void PluginManager(){
       super();
    }
    public static void K(PluginManager p0,Resources p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.J(p1, p2);
       return;
    }
    public static final Context a(PluginManager p0){
       Context b = PluginManager.b;
       if (b == null) {
          a.S("mContext");
       }
       return b;
    }
    public static final CountDownLatch b(PluginManager p0){
       return PluginManager.z;
    }
    public static final PluginManager$f c(PluginManager p0){
       return PluginManager.u;
    }
    public static final DisposableSuspendLatch d(PluginManager p0){
       return PluginManager.A;
    }
    public final u A(){
       boolean b;
       PluginConfig obj2;
       String obj3;
       String str2;
       Object obj4;
       PluginConfig pluginConfig2;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginManager pluginManage = PluginManager.class;
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, obj, pluginManage, "38");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = PatchProxy.apply(objArray, obj, pluginManage, "42");
       u ou = 1;
       String str = null;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!PluginManager.z.getCount() - null){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          b pluginInstal = uDva.getPluginInstallManager();
          a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
          List list = pluginInstal.b();
          a.o(list, "Dva.instance\(\).pluginInstallManager.pluginConfigs");
          Dva uDva1 = Dva.instance();
          a.o(uDva1, "Dva.instance\(\)");
          b pluginInstal1 = uDva1.getPluginInstallManager();
          a.o(pluginInstal1, "Dva.instance\(\).pluginInstallManager");
          Set set = pluginInstal1.w();
          a.o(set, "Dva.instance\(\).pluginIns¡­lManager.installedModules");
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             obj2 = iterator.next();
             obj3 = obj2;
             obj3 = (obj3.type == null && set.contains(obj3.name))? 1: null;
             if (obj3) {
                uArrayList.add(obj2);
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator1 = list.iterator();
          while (iterator1.hasNext()) {
             obj2 = iterator1.next();
             obj3 = obj2;
             PluginConfig type = obj3.type;
             obj3 = (type == ou || (type == 2 && set.contains(obj3.name)))? 1: null;
             if (obj3) {
                uArrayList1.add(obj2);
             }
          }
          DvaUploadInfo uDvaUploadIn = PatchProxy.applyOneRefs(uArrayList, obj, pluginManage, "39");
          if (uDvaUploadIn != patchProxyRe) {
          }else {
             ArrayList uArrayList4 = new ArrayList();
             x ox = this.t().i();
             List list2 = (ox != null)? ox.a(): objArray;
             Iterator iterator3 = uArrayList.iterator();
             Object[] objArray1 = objArray;
             while (iterator3.hasNext()) {
                PluginConfig pluginConfig1 = iterator3.next();
                if (list2 != null && objArray1 == null) {
                   Iterator iterator4 = list2.iterator();
                   while (true) {
                      if (iterator4.hasNext()) {
                         obj4 = iterator4.next();
                         if (a.g(obj4.name, pluginConfig1.name)) {
                         label_0115 :
                            if (obj4 != null) {
                               objArray1 = ox.source;
                            }
                         }else {
                            pluginConfig2 = null;
                         }
                      }else {
                         obj4 = null;
                         goto label_0115 ;
                      }
                   }
                }
                uArrayList4.add(new t(pluginConfig1.name, pluginConfig1.version, PluginUrlManager.a.b(pluginConfig1)));
                pluginConfig2 = null;
             }
             uDvaUploadIn = new DvaUploadInfo(uArrayList4, objArray1);
          }
          FeatureUploadInfo uFeatureUplo = PatchProxy.applyOneRefs(uArrayList1, obj, pluginManage, "40");
          if (uFeatureUplo != patchProxyRe) {
          }else {
             ArrayList uArrayList3 = new ArrayList();
             iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                PluginConfig pluginConfig = iterator1.next();
                PluginConfig name = pluginConfig.name;
                obj2 = pluginConfig.version;
                obj3 = PluginUrlManager.a.b(pluginConfig);
                PluginConfig name1 = pluginConfig.name;
                a.o(name1, "pluginConfig.name");
                Integer integer = PluginManager.H.h(name1, pluginConfig.md5);
                if (integer != null) {
                   str2 = String.valueOf(integer.intValue());
                   if (str2 != null) {
                   label_017d :
                      uArrayList3.add(new g(name, obj2, obj3, str2));
                   }
                }
                str2 = "";
                goto label_017d ;
             }
             uFeatureUplo = new FeatureUploadInfo(uArrayList3);
          }
          AssetUploadInfo uAssetUpload = PatchProxy.apply(null, obj, pluginManage, "41");
          if (uAssetUpload != patchProxyRe) {
          }else {
             Context c = PluginManager.c;
             if (c == null) {
                uAssetUpload = new AssetUploadInfo(CollectionsKt__CollectionsKt.E());
             }else {
                Resources resources = c.getResources();
                a.o(resources, "ctx.resources");
                List list1 = a.e(resources.getAssets());
                a.o(list1, "SplitCompatResourcesLoad¡­irs\(ctx.resources.assets\)");
                ArrayList uArrayList2 = new ArrayList(u.Y(list1, 10));
                Iterator iterator2 = list1.iterator();
                while (iterator2.hasNext()) {
                   String str1 = iterator2.next();
                   File uFile = new File(str1);
                   a uoa = (uFile.exists())? new a(str1, uFile.lastModified()): new a(str1, -2);
                label_01f9 :
                   uArrayList2.add(uoa);
                }
                uAssetUpload = new AssetUploadInfo(uArrayList2);
             }
          }
          ou = new u(b, uDvaUploadIn, uFeatureUplo, uAssetUpload);
       }else {
          ou = new u(str, null, null, null);
       }
       return ou;
    }
    public final int B(String p0){
       Object obj1;
       PluginConfig type;
       Dva obj = PatchProxy.applyOneRefs(p0, this, PluginManager.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "pluginName");
       obj = Dva.instance();
       a.o(obj, "Dva.instance\(\)");
       b pluginInstal = obj.getPluginInstallManager();
       a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
       List list = pluginInstal.b();
       a.o(list, "Dva.instance\(\).pluginInstallManager.pluginConfigs");
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj1 = iterator.next();
             if (!a.g(obj1.name, p0)) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          type = (obj1 != null)? obj1.type: 0;
          break ;
       }
       return type;
    }
    public final boolean C(){
       String obj = PatchProxy.apply(null, this, PluginManager.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = Build.MANUFACTURER+'('+Build.MODEL+')';
       Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
       obj = obj.toUpperCase();
       a.o(obj, "\(this as java.lang.String\).toUpperCase\(\)");
       String[] stringArray = new String[]{"OPPO\(PDNM00\)","OPPO\(PDHM00\)","OPPO\(PDPM00\)","OPPO\(PDNT00\)","OPPO\(PDPT00\)","OPPO\(PDVM00\)","OPPO\(CPH2089\)","OPPO\(CPH2091\)"};
       return ArraysKt___ArraysKt.P7(stringArray, obj);
    }
    public synchronized final void D(Context p0){
       Context uContext;
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginManager.class, "22")) {
          return;
       }
       a.p(p0, "context");
       if (p0 instanceof Application) {
          uContext = p0;
       }else {
          uContext = p0.getApplicationContext();
          a.o(uContext, "context.applicationContext");
       }
       PluginManager.b = uContext;
       if (PluginManager.c == null) {
          if (uContext == null) {
             a.S("mContext");
          }
          PluginManager.c = uContext;
       }
       this.E();
       PluginInstallerUIHandler.s.a(p0, new PluginInstallerDialog(), new PluginInstallerPage(), new e());
       a.a.a(p0);
       return;
    }
    public final void E(){
       a uoa;
       Context b;
       b pluginInstal;
       Context b1;
       FeatureManager uFeatureMana1;
       PatchProxyResult patchProxyRe1;
       String str5;
       FeatureManager a;
       String name;
       Set g;
       int i5;
       FeatureManager uFeatureMana2;
       a d;
       Context uContext;
       String str6;
       object oobject;
       Context uContext1;
       PatchProxyResult patchProxyRe2;
       a uoa1;
       Context uContext2;
       a b5;
       int b6;
       String[] f;
       int i6;
       String str7;
       object obj3;
       String str8;
       ArrayList uArrayList;
       Iterator iterator1;
       n on;
       String str9;
       n on1;
       String str10;
       InputStream inputStream;
       d uod2;
       a$b uob;
       Context obj = this;
       FeatureManager uFeatureMana = FeatureManager.class;
       WorkExecutors workExecutor = WorkExecutors.class;
       PluginManager pluginManage = PluginManager.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, pluginManage, "24")) {
          return;
       }
       String str = "DvaConfiguration.newBuil¡­tMode\(\)\)\n        .build\(\)";
       int i = 3;
       int i1 = 1;
       q oq = null;
       if (this.p()) {
          uoa = PatchProxy.apply(objArray, obj, pluginManage, "26");
          if (uoa != patchProxyRe) {
          }else {
             uob = a.a();
             b[] uobArray = new b[i];
             uobArray[oq] = new b(this.y());
             uobArray[i1] = new a(this.y());
             uobArray[2] = new d();
             PluginDownloader pluginDownlo = new PluginDownloader(this.n(), PluginManager.l, PluginManager.o, this.r(), PluginManager.B, new c(CollectionsKt__CollectionsKt.L(uobArray)));
             uob.e(v6);
             uob.h(this.v());
             uob.f(this.o());
             uob.g(this.q());
             uob.i(this.w());
             uob.c(this.t().f());
             uob.b(this.t().j());
             uob.d(this.t().h());
             uoa = uob.a();
             a.o(uoa, str);
          }
       }else {
          uoa = PatchProxy.apply(null, obj, pluginManage, "27");
          if (uoa != patchProxyRe) {
          }else {
             uob = a.a();
             uob.h(this.v());
             uob.f(this.o());
             uob.g(this.q());
             uob.i(this.w());
             uob.c(this.t().f());
             uob.b(this.t().j());
             uob.d(this.t().h());
             uoa = uob.a();
             a.o(uoa, str);
          }
       }
       b = PluginManager.b;
       String str1 = "mContext";
       if (b == null) {
          a.S(str1);
       }
       h.a = SystemUtil.r(b);
       b = PluginManager.b;
       if (b == null) {
          a.S(str1);
       }
       Dva.init(b, uoa);
       uoa = d.b("dva_io", 3);
       a.o(uoa, "ElasticExecutorService.g¡­TASK_PRIORITY_BACKGROUND\)");
       String str2 = "3";
       str = "executor";
       if (!PatchProxy.applyVoidOneRefs(uoa, null, workExecutor, str2)) {
          a.p(uoa, str);
          WorkExecutors.f = uoa;
       }
       uoa = d.b("dva_cpu", i1);
       a.o(uoa, "ElasticExecutorService.g¡­utor\(\"dva_cpu\", priority\)");
       if (!PatchProxy.applyVoidOneRefs(uoa, null, workExecutor, "4")) {
          a.p(uoa, str);
          WorkExecutors.g = uoa;
       }
       Dva uDva = Dva.instance();
       String str3 = "Dva.instance\(\)";
       a.o(uDva, str3);
       uDva.getPluginInstallManager().o(new PluginManager$LazyInitSuspendInterceptor());
       uDva = Dva.instance();
       a.o(uDva, str3);
       uDva.getPluginInstallManager().m(WorkExecutors.c(), new PluginManager$b());
       uDva = Dva.instance();
       a.o(uDva, str3);
       uDva.getPluginInstallManager().o(new c());
       uDva = Dva.instance();
       a.o(uDva, str3);
       uDva.getPluginInstallManager().q(new PluginManager$c());
       if (!this.p()) {
          uDva = Dva.instance();
          a.o(uDva, str3);
          pluginInstal = uDva.getPluginInstallManager();
          b1 = PluginManager.b;
          if (b1 == null) {
             a.S(str1);
          }
          pluginInstal.o(new PluginConfigReadyInterceptor(b1));
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (uoc.c() && a.q == 0x1869f) {
          uDva = Dva.instance();
          a.o(uDva, str3);
          uDva.getPluginInstallManager().o(new b());
       }
       Dva.instance().onApplicationCreated();
       g i2 = g.i;
       Context b2 = PluginManager.b;
       if (b2 == null) {
          a.S(str1);
       }
       d uod = this.t();
       PluginLogger pluginLogger = this.r();
       Objects.requireNonNull(i2);
       g og = g.class;
       String str4 = "context";
       if (PatchProxy.applyVoidThreeRefs(b2, uod, pluginLogger, i2, g.class, "7")) {
          uFeatureMana1 = uFeatureMana;
          patchProxyRe1 = patchProxyRe;
          str5 = str4;
       }else {
          a.p(b2, str4);
          a.p(uod, "pluginSource");
          a.p(pluginLogger, "logger");
          g.c = uod;
          g.d = pluginLogger;
          str = g.a;
          g$a uoa2 = PatchProxy.applyOneRefs(str, i2, og, "13");
          if (uoa2 != patchProxyRe) {
             uFeatureMana1 = uFeatureMana;
             patchProxyRe1 = patchProxyRe;
             str5 = str4;
          }else {
             ArrayList uArrayList1 = new ArrayList();
             JSONArray jSONArray = new JSONObject(str).optJSONArray("module_config_list");
             if (jSONArray != null) {
                i5 = jSONArray.length();
                int i11 = 0;
                while (i11 < i5) {
                   JSONObject jSONObject = jSONArray.getJSONObject(i11);
                   str10 = jSONObject.optString("name");
                   str7 = jSONObject.optString("build_type");
                   str6 = jSONObject.optString("pkg_id");
                   str9 = jSONObject.optString("runplugin_type");
                   boolean b9 = jSONObject.optBoolean("inject_so_path", false);
                   boolean b10 = jSONObject.optBoolean("link_namespace", false);
                   boolean b11 = jSONObject.optBoolean("use_sys_class_loader", false);
                   a.o(str10, "name");
                   a.o(str7, "buildType");
                   a.o(str6, "pkgId");
                   a.o(str9, "runPluginType");
                   on1 = new n(str10, str7, str6, str9, b9, b10, b11);
                   uArrayList1.add(uFeatureMana);
                   i11 = i11 + 1;
                   i5 = i5;
                   patchProxyRe = patchProxyRe;
                   str4 = str4;
                   uFeatureMana = uFeatureMana;
                   oq = null;
                }
             }
             uFeatureMana1 = uFeatureMana;
             patchProxyRe1 = patchProxyRe;
             str5 = str4;
             uoa2 = new g$a(uArrayList1);
          }
          uoa2 = uoa2.moduleConfigList;
          if (!PatchProxy.applyVoidOneRefs(uoa2, null, og, "2")) {
             g.f.clear();
             if (uoa2 != null) {
                iterator1 = uoa2.iterator();
                while (iterator1.hasNext()) {
                   on = iterator1.next();
                   g.f.put(on.a(), on);
                }
             }
             g.b = uoa2;
          }
          if (PluginManager.D && !PatchProxy.applyVoidOneRefs(b2, null, f.class, "1")) {
             AssetManager assets = b2.getAssets();
             uArrayList = new ArrayList(g.a());
             on1 = new n("kwai-android", "plugin", "7f", "plugin", false, false, false);
             uArrayList.add(uFeatureMana);
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                n on2 = iterator2.next();
                str3 = on2.a();
                int i9 = 16;
                int i10 = Integer.valueOf(on2.pkgId, i9).intValue();
                HashMap hashMap = new HashMap();
                SparseArray sparseArray = new SparseArray();
                f.a.put(Integer.valueOf(i10), hashMap);
                f.b.put(Integer.valueOf(i10), sparseArray);
                str10 = str3;
                str10 = str10+"_ids.txt";
                try{
                   inputStream = SplitAssetHelper.open(assets, str10);
                   try{
                      d uod1 = l.d(l.k(inputStream));
                      try{
                         uod2 = uod1;
                         str10 = uod2.readUtf8Line();
                         while (str10 != null) {
                            String[] stringArray2 = (str10.trim()).split(" ");
                            str8 = (stringArray2[2]).trim();
                            i10 = Integer.valueOf(((stringArray2[3]).trim()).replace("0x", ""), i9).intValue() & 0xffffff;
                            hashMap.put(str8, Integer.valueOf(i10));
                            sparseArray.put(i10, str8);
                         }
                         try{
                            inputStream.close();
                         }catch(java.io.IOException e0){
                            e0.printStackTrace();
                         }
                      }catch(java.io.IOException e0){
                      }
                      e0.printStackTrace();
                      if (inputStream) {
                         try{
                            inputStream.close();
                         }catch(java.io.IOException e0){
                            e0.printStackTrace();
                         }
                      }
                   }catch(java.io.IOException e0){
                   }
                   k ok = null;
                   goto label_0402 ;
                }catch(java.io.IOException e0){
                   inputStream = null;
                   goto label_0401 ;
                }
                uod2.close();
             }
          }
          uArrayList = new ArrayList();
          List list = g.a();
          if (list != null) {
             iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                on = iterator1.next();
                if (on.injectSoPath != null) {
                   uArrayList.add(on.a());
                }
                if (on.linkNamespace != null) {
                   uoa = a.a;
                   str9 = on.a();
                   Objects.requireNonNull(uoa);
                   if (!PatchProxy.applyVoidOneRefs(str9, uoa, a.class, "2")) {
                      a.p(str9, "feature");
                      a.f.add(str9);
                   }
                }
                if (on.useSysClassLoader != null) {
                   g.g.add(on.a());
                }
             }
          }
          b5 = a.a;
          Objects.requireNonNull(b5);
          if (!PatchProxy.applyVoidOneRefs(uArrayList, b5, a.class, str2)) {
             a.p(uArrayList, "features");
             a.b.addAll(uArrayList);
          }
       }
       a = FeatureManager.a;
       obj = PluginManager.b;
       if (obj == null) {
          a.S(str1);
       }
       name = PluginLinkInterceptActivity.class.getName();
       g i3 = g.i;
       Objects.requireNonNull(i3);
       KwaiFeatureUpdateManager e = g.e;
       oq = new q();
       Objects.requireNonNull(i3);
       g = g.g;
       Objects.requireNonNull(a);
       SplitLoaderManager splitLoaderM = SplitLoaderManager.class;
       int i4 = 5;
       i5 = 4;
       if (PatchProxy.isSupport(uFeatureMana1)) {
          objArray = new Object[]{obj,null,null,name,Boolean.FALSE,e,oq,g};
          uFeatureMana2 = uFeatureMana1;
          if (PatchProxy.applyVoid(objArray, a, uFeatureMana2, "2")) {
             uFeatureMana = uFeatureMana2;
             str2 = 1;
          label_0795 :
             a = FeatureManager.a;
             a.g(PluginManager$e.a);
             i1 = (!this.C() && this.t().b())? true: false;
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(uFeatureMana) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i1), a, uFeatureMana, "21")) {
                d = FeatureManager.d;
                if (d == null) {
                   a.S("mSource");
                   d = null;
                }
                d.c(i1);
             }
             i b3 = i.b;
             Objects.requireNonNull(b3);
             if (!PatchProxy.applyVoid(null, b3, i.class, "2")) {
                if (a.g(Looper.getMainLooper(), Looper.myLooper())) {
                   b3.c();
                }else {
                   WorkExecutors.b.execute(k.b);
                }
             }
             return;
          }
       }else {
          uFeatureMana2 = uFeatureMana1;
       }
       str2 = str5;
       a.p(obj, str2);
       a.p(g, "useSysClassLoaderFeatures");
       FeatureManager.b = obj;
       FeatureManager.h = false;
       if (obj == null) {
          a.S(str1);
          uContext = null;
       }else {
          uContext = obj;
       }
       FeatureManager.d = new FeatureSourceImpl(uContext, e);
       SplitLoaderManager a1 = SplitLoaderManager.a;
       a d1 = FeatureManager.d;
       if (d1 == null) {
          a.S("mSource");
          d1 = null;
       }
       Objects.requireNonNull(a1);
       str6 = "app";
       if (PatchProxy.isSupport(splitLoaderM)) {
          Object[] objArray1 = new Object[i4];
          objArray1[0] = obj;
          objArray1[1] = d1;
          uFeatureMana1 = uFeatureMana2;
          oobject = null;
          objArray1[2] = oobject;
          objArray1[3] = oobject;
          objArray1[4] = name;
          if (!PatchProxy.applyVoid(objArray1, a1, splitLoaderM, "2")) {
          label_0557 :
             a.p(obj, str2);
             a.p(d1, "featureSource");
             SplitLoaderManager.i = obj;
             SplitLoaderManager.e = oobject;
             SplitLoaderManager.b = d1;
             SplitLoaderManager.f = oobject;
             SplitLoaderManager.g = name;
             b.e = obj.getPackageName();
             a b7 = a.class;
             if (!PatchProxy.applyVoid(oobject, a1, splitLoaderM, "19")) {
                a b8 = SplitLoaderManager.b;
                if (b8 == null) {
                   a.S("mFeatureSource");
                   b8 = null;
                }
                if (b8.e() == 200) {
                   Context i7 = SplitLoaderManager.i;
                   if (i7 == null) {
                      a.S(str1);
                      i7 = null;
                   }
                   pluginInstal = new b(i7);
                   Set set = PatchProxy.apply(null, pluginInstal, b.class, "1");
                   patchProxyRe2 = patchProxyRe1;
                   if (set != patchProxyRe2) {
                   }else {
                      set = pluginInstal.b();
                      String[] stringArray = pluginInstal.c();
                      if (stringArray != null) {
                         str8 = Arrays.toString(stringArray);
                         if (str8.length()) {
                            uContext1 = obj;
                            ("Split names are: ").concat(str8);
                         }else {
                            uContext1 = obj;
                         }
                         int len = stringArray.length;
                         i1 = 0;
                         while (i1 < len) {
                            int i8 = len;
                            obj3 = stringArray[i1];
                            String[] stringArray1 = stringArray;
                            if (!obj3.startsWith("config.")) {
                               set.add(pluginInstal.a(obj3));
                            }
                            i1 = i1 + 1;
                            len = i8;
                            stringArray = stringArray1;
                         }
                         a.o(set, "aabLoadedSplits");
                         Iterator iterator = set.iterator();
                         while (iterator.hasNext()) {
                            str7 = iterator.next();
                            d1 = a.a;
                            ClassLoader classLoader = splitLoaderM.getClassLoader();
                            a.o(classLoader, "SplitLoaderManager::class.java.classLoader");
                            Objects.requireNonNull(d1);
                            Object[] obj2 = PatchProxy.applyTwoRefs(classLoader, str7, d1, b7, "1");
                            if (obj2 != patchProxyRe2) {
                               obj3 = obj2;
                            }else {
                               a.p(classLoader, "classLoader");
                               str7 = a.c(str7);
                               if (str7 != null && !TextUtils.isEmpty(str7)) {
                                  obj3 = classLoader.loadClass(str7).newInstance();
                                  Objects.requireNonNull(obj3, "null cannot be cast to non-null type android.app.Application");
                               }else {
                                  obj3 = null;
                               }
                            }
                            if (obj3 != null) {
                               uContext = SplitLoaderManager.i;
                               if (uContext == null) {
                                  a.S(str1);
                                  uContext = null;
                               }
                               if (PatchProxy.applyVoidTwoRefs(obj3, uContext, d1, b7, "2")) {
                                  d1 = null;
                               }else {
                                  a.p(obj3, str6);
                                  a.p(uContext, str2);
                                  obj2 = new Object[]{uContext};
                                  b.a(obj3, "attach", obj2);
                               }
                               SplitLoaderManager.j.add(obj3);
                            }
                         }
                         d1 = 0;
                         a1 = SplitLoaderManager.a;
                         Objects.requireNonNull(a1);
                         if (!PatchProxy.applyVoid(null, a1, splitLoaderM, "17")) {
                            b5 = SplitLoaderManager.b;
                            if (b5 == null) {
                               a.S("mFeatureSource");
                               b5 = null;
                            }
                            if (b5.e() == 100) {
                               ClassLoader obj1 = PatchProxy.apply(null, a1, splitLoaderM, "15");
                               if (obj1 != patchProxyRe2) {
                                  b6 = obj1.booleanValue();
                               }else if(SplitLoaderManager.e == null && SplitLoaderManager.f == null){
                                  obj = SplitLoaderManager.i;
                                  if (obj == null) {
                                     a.S(str1);
                                     obj = null;
                                  }
                                  if (!(obj.getPackageName()).equals(a1.d())) {
                                     f = SplitLoaderManager.f;
                                     if (f != null) {
                                        a.m(f);
                                        b6 = f.length;
                                        i6 = 0;
                                        while (true) {
                                           if (i6 < b6) {
                                              i6 = i6 + 1;
                                              if (a.g(a1.b(f[i6]), a1.d())) {
                                                 b6 = false;
                                                 break ;
                                              }
                                           }
                                        }
                                     }
                                     f = SplitLoaderManager.e;
                                     if (f != null) {
                                        a.m(f);
                                        b6 = f.length;
                                        i6 = 0;
                                        while (i6 < b6) {
                                           i6 = i6 + 1;
                                           if (!a.g(a1.b(f[i6]), a1.d())) {
                                           }
                                        }
                                     }
                                  }
                               }
                            label_06f2 :
                               b6 = true;
                               if (b6) {
                                  obj = SplitLoaderManager.i;
                                  if (obj == null) {
                                     a.S(str1);
                                     obj = null;
                                  }
                                  obj1 = obj.getClassLoader();
                                  b7 = SplitLoaderManager.b;
                                  if (b7 == null) {
                                     a.S("mFeatureSource");
                                     b7 = null;
                                  }
                                  FeatureClassLoader uFeatureClas = new FeatureClassLoader(obj1, b7.g(), SplitLoaderManager.g);
                                  SplitLoaderManager.k = uFeatureClas;
                                  if (!PatchProxy.applyVoidOneRefs(uFeatureClas, null, a.class, "1")) {
                                     a.c.add(uFeatureClas);
                                  }
                                  SerializableHook.sClassLoader = a.b;
                               }
                            }
                         }
                      label_072b :
                         uDva = Dva.instance();
                         Context b4 = FeatureManager.b;
                         if (b4 == null) {
                            a.S(str1);
                            b4 = null;
                         }
                         uoa = FeatureManager.d;
                         if (uoa == null) {
                            a.S("mSource");
                            uoa1 = null;
                         }else {
                            uoa1 = uoa;
                         }
                         str3 = str6;
                         uFeatureMana = uFeatureMana1;
                         FeaturePluginLoader uFeaturePlug = new FeaturePluginLoader(b4, uoa1, FeatureManager.i, oq, g);
                         uDva.registerPluginLoader(1, obj);
                         Dva.instance().getPluginInstallManager().o(a.a);
                         Dex2OatManager a2 = Dex2OatManager.a;
                         Objects.requireNonNull(a2);
                         b1 = uContext1;
                         if (!PatchProxy.applyVoidOneRefs(b1, a2, Dex2OatManager.class, "5")) {
                            a.p(b1, str3);
                            if (b1 instanceof Application) {
                               obj = b1;
                            }else {
                               obj = b1.getApplicationContext();
                               a.o(obj, "app.applicationContext");
                            }
                            Dex2OatManager.b = obj;
                         }
                         obj = FeatureManager.b;
                         if (obj == null) {
                            a.S(str1);
                            uContext2 = null;
                         }else {
                            uContext2 = obj;
                         }
                         AssetManagerHook.a = new AssetManagerHook$a(uContext2);
                         goto label_0795 ;
                      }
                   }
                   uContext1 = obj;
                   goto label_05ed ;
                }
             }
          }
       }else {
          uFeatureMana1 = uFeatureMana2;
          oobject = null;
          goto label_0557 ;
       }
       uContext1 = obj;
       patchProxyRe2 = patchProxyRe1;
       goto label_057d ;
    }
    public final boolean F(String p0){
       Object obj1;
       boolean b;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, PluginManager.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "name");
       obj = SplitManager.a.b().get();
       a.o(obj, "SplitManager.getSplitPlugins\(\).get\(\)");
       obj = obj.iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!a.g(obj1.name, p0)) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          b = false;
          if (obj1 != null) {
             obj1 = ((PluginUrlManager.a.b(obj1)).length() > 0)? 1: 0;
             if (obj1) {
                b = true;
                break ;
             }
          }
          break ;
       }
       return b;
    }
    public final boolean G(int p0){
       int i = 1;
       if (p0 != i && p0 != 2) {
          i = false;
       }
       return i;
    }
    public final x H(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PluginManager.class, "51");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "1");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.a("/rest/zt/appsupport/plugin/checkupdate", RequestTiming.COLD_START);
       if (!b) {
          PluginManager.a = System.currentTimeMillis();
          objArray = this.t().q().e();
       }
       return objArray;
    }
    public final void I(Resources p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginManager.class, "71")) {
          return;
       }
       PluginManager.K(this, p0, false, 2, null);
       return;
    }
    public final void J(Resources p0,boolean p1){
       Context b;
       PluginManager pluginManage = PluginManager.class;
       if (PatchProxy.isSupport(pluginManage) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, pluginManage, "70")) {
          return;
       }
       if (!p1 && b.a()) {
          d.c("onGetResources: hookDynamicFeatures=true, direct return.");
          return;
       }else if(PluginManager.b == null){
          return;
       }else {
          FeatureManager a = FeatureManager.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(p0, a, FeatureManager.class, "14") && a.f()) {
             b = FeatureManager.b;
             if (b == null) {
                a.S("mContext");
                b = null;
             }
             a.h(b, p0);
          }
          return;
       }
    }
    public final void L(boolean p0){
       object oobject;
       PluginManager pluginManage = PluginManager.class;
       if (PatchProxy.isSupport(pluginManage) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, pluginManage, "30")) {
          return;
       }
       if (!this.p()) {
          return;
       }
       Object[] objArray = null;
       Boolean obj = PatchProxy.apply(objArray, objArray, a.class, "7");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a("/rest/zt/appsupport/plugin/dispatch", RequestTiming.COLD_START);
       obj = Result.constructor-impl(Boolean.valueOf(b));
       Boolean fALSE = Boolean.FALSE;
       if (Result.isFailure-impl(obj)) {
          obj = fALSE;
       }
       b = obj.booleanValue();
       if (p0 && b) {
          Log.g("PluginManager", "refreshCDNUrls degraded");
          return;
       }else {
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          b pluginInstal = uDva.getPluginInstallManager();
          a.o(pluginInstal, "Dva.instance\(\)\n        .pluginInstallManager");
          List list = pluginInstal.b();
          a.o(list, "Dva.instance\(\)\n        .¡­er\n        .pluginConfigs");
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             PluginConfig pluginConfig = iterator.next();
             a.o(pluginConfig, "it");
             String[] urls = pluginConfig.getUrls();
             a.o(urls, "it.urls");
             int len = urls.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   oobject = urls[i];
                   a.o(oobject, "url");
                   if (u.q2(oobject, "http", false, 2, objArray)) {
                   label_00c1 :
                      if (oobject != null) {
                         uArrayList.add(oobject);
                      }else {
                         continue ;
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   oobject = objArray;
                   goto label_00c1 ;
                }
             }
          }
          this.y().d(uArrayList);
          return;
       }
    }
    public final void M(){
       if (PatchProxy.applyVoid(null, this, PluginManager.class, "32")) {
          return;
       }
       if (!this.p()) {
          return;
       }
       c.a(PluginManager$i.b);
       return;
    }
    public final void N(PluginConfig p0){
       Dva uDva;
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginManager.class, "58")) {
          return;
       }
       String str = "config";
       a.p(p0, str);
       a b = a.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, a.class, "1")) {
          try{
             a.p(p0, str);
             d uod = d.a();
             Objects.requireNonNull(uod);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             d uod1 = d.class;
             List obj = PatchProxy.applyOneRefs(p0, uod, uod1, "5");
             if (obj != patchProxyRe) {
                obj.booleanValue();
             }else {
                obj = uod.b();
                int i = obj.size();
                int i1 = 0;
                int i2 = 0;
                while (i2 < i) {
                   if ((obj.get(i2).name).equals(p0.name)) {
                      obj.set(i2, p0);
                      i1 = 1;
                      break ;
                   }
                   i2 = i2 + 1;
                }
                if (!i1) {
                   obj.add(p0);
                }
                Object obj1 = PatchProxy.applyOneRefs(obj, uod, uod1, "4");
                if (obj1 != patchProxyRe) {
                   obj1.booleanValue();
                }else {
                   try{
                      g.b(uod.a.edit().putString("addition_plugin_configs", uod.b.q(obj)));
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                }
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public final void O(List p0,List p1){
       List list1;
       Iterator obj;
       Iterator obj1;
       Object[] objArray;
       Object obj2;
       Object[] objArray1;
       PluginConfig name;
       Object obj5;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PluginManager.class, "57")) {
          return;
       }
       a b = a.b;
       Objects.requireNonNull(b);
       List list = PatchProxy.apply(null, b, a.class, "3");
       if (list != PatchProxyResult.class) {
       }else if(a.a){
          d uod = d.a();
          a.o(uod, "SPHelper.getInstance\(\)");
          list = uod.b();
          a.o(list, "SPHelper.getInstance\(\).pluginConfigs");
       }else {
          list = CollectionsKt__CollectionsKt.E();
       }
       try{
          list1 = this.z().e();
       }catch(java.lang.Exception e0){
          list1 = CollectionsKt__CollectionsKt.E();
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          obj = iterator.next();
          obj1 = obj;
          Iterator iterator1 = e0.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                objArray = iterator1.next();
                if (!a.g(objArray.name, obj1.name)) {
                   continue ;
                }
             }else {
                objArray = null;
             }
             if (objArray == null) {
                i = 1;
             }
             if (i) {
                uArrayList.add(obj);
             }else {
                continue ;
             }
          }
       }
       iterator = CollectionsKt___CollectionsKt.m4(uArrayList, e0);
       a.o(list1, "otherSourcePlugins");
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator2 = list1.iterator();
       while (iterator2.hasNext()) {
          obj2 = iterator2.next();
          obj = obj2;
          obj1 = iterator.iterator();
          while (true) {
             if (obj1.hasNext()) {
                objArray1 = obj1.next();
                if (!a.g(objArray1.name, obj.name)) {
                   continue ;
                }
             }else {
                objArray1 = null;
             }
             obj = (objArray1 == null)? 1: null;
             if (obj) {
                uArrayList1.add(obj2);
             }else {
                continue ;
             }
          }
       }
       iterator = CollectionsKt___CollectionsKt.m4(iterator, uArrayList1);
       Dva uDva = Dva.instance();
       String str = "Dva.instance\(\)";
       a.o(uDva, str);
       b pluginInstal = uDva.getPluginInstallManager();
       uArrayList = new ArrayList();
       obj = iterator.iterator();
       while (obj.hasNext()) {
          Object obj3 = obj.next();
          name = obj3.name;
          int i1 = (name == null || !name.length())? 1: 0;
          i1 = i1 ^ 1;
          if (i1) {
             uArrayList.add(obj3);
          }
       }
       pluginInstal.f(uArrayList);
       uDva = Dva.instance();
       a.o(uDva, str);
       pluginInstal = uDva.getPluginInstallManager();
       ArrayList uArrayList2 = new ArrayList();
       Iterator iterator3 = p1.iterator();
       while (iterator3.hasNext()) {
          obj2 = iterator3.next();
          PluginConfig obj4 = obj2;
          obj1 = iterator.iterator();
          while (true) {
             if (obj1.hasNext()) {
                objArray1 = obj1.next();
                if (!a.g(obj4.name, objArray1.name)) {
                   continue ;
                }
             }else {
                objArray1 = null;
             }
             if (objArray1 == null) {
                obj4 = obj4.name;
                a.o(obj4, "c.name");
                if (!g.e(obj4)) {
                   obj5 = 1;
                label_015e :
                   if (obj5) {
                      uArrayList2.add(obj2);
                   }else {
                      continue ;
                   }
                }
             }
             obj5 = null;
             goto label_015e ;
          }
       }
       ArrayList uArrayList3 = new ArrayList(u.Y(uArrayList2, 10));
       iterator3 = uArrayList2.iterator();
       while (iterator3.hasNext()) {
          uArrayList3.add(iterator3.next().name);
       }
       pluginInstal.c(uArrayList3);
       return;
    }
    public final void P(String p0,int p1){
       PluginManager pluginManage = PluginManager.class;
       if (PatchProxy.isSupport(pluginManage) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, pluginManage, "78")) {
          return;
       }
       a.p(p0, "plugin");
       PluginManager.G.put(p0, Integer.valueOf(p1));
       return;
    }
    public final void Q(Context p0,Resources p1){
       FeatureManager a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PluginManager.class, "36")) {
          return;
       }
       String str = "context";
       a.p(p0, str);
       a.p(p1, "resources");
       a = FeatureManager.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, a, FeatureManager.class, "15")) {
          a.p(p0, str);
          if (a.f()) {
             a.h(p0, p1);
          }
       }
       return;
    }
    public final void R(boolean p0,boolean p1){
       PluginManager pluginManage = PluginManager.class;
       if (PatchProxy.isSupport(pluginManage) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, pluginManage, "29")) {
          return;
       }
       if (!this.p()) {
          return;
       }
       this.u().e(p0, true, p1);
       return;
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PluginManager.class, "20")) {
          return;
       }
       if (PluginManager.D) {
          FeatureManager a = FeatureManager.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, FeatureManager.class, "3")) {
             SplitLoaderManager a1 = SplitLoaderManager.a;
             Objects.requireNonNull(a1);
             if (!PatchProxy.applyVoid(objArray, a1, SplitLoaderManager.class, "3")) {
                Iterator iterator = SplitLoaderManager.j.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onCreate();
                }
             }
          }
       }
       return;
    }
    public synchronized final CountDownLatch f(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PluginManager.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PluginManager.d) {
          return PluginManager.z;
       }
       boolean b = AbiUtil.b();
       CpuAbiUtils uCpuAbiUtils = CpuAbiUtils.class;
       if (!PatchProxy.isSupport(uCpuAbiUtils) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), objArray, uCpuAbiUtils, "8")) {
          CpuAbiUtils.d = Boolean.valueOf(b);
       }
       PluginManager.d = true;
       WorkExecutors.a().execute(new PluginManager$d(System.currentTimeMillis()));
       this.M();
       return PluginManager.z;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, PluginManager.class, "31")) {
          return;
       }
       this.y().c();
       return;
    }
    public final Integer h(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginManager pluginManage = PluginManager.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, pluginManage, "76");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "featureName");
       if (p1 == null) {
          return null;
       }
       Object obj1 = PatchProxy.apply(null, this, pluginManage, "75");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PluginManager.F.getValue();
       }
       return obj1.get(this.i(p0, p1));
    }
    public final String i(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PluginManager.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+'_'+p1;
    }
    public final RemoteProvider j(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.e.getValue();
    }
    public final b k(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.y.getValue();
    }
    public final a l(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.w.getValue();
    }
    public final b m(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.g.getValue();
    }
    public final IncrementStoreImpl n(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.j.getValue();
    }
    public final i o(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.q.getValue();
    }
    public final boolean p(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "19");
       if (obj == PatchProxyResult.class) {
          obj = PluginManager.C.getValue();
       }
       return obj.booleanValue();
    }
    public final j q(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.r.getValue();
    }
    public final PluginLogger r(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.h.getValue();
    }
    public final c s(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.k.getValue();
    }
    public final d t(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.f.getValue();
    }
    public final e u(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.n.getValue();
    }
    public final p v(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.p.getValue();
    }
    public final PluginManager$mSPProvider$2$a w(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.s.getValue();
    }
    public final e x(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.v.getValue();
    }
    public final b y(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.m.getValue();
    }
    public final a0 z(){
       Object obj = PatchProxy.apply(null, this, PluginManager.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x().b();
    }
}
