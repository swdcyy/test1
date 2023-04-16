package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import com.kwai.sdk.eve.internal.featurecenter.IEveFeatureCenter;
import an7.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$Companion;
import nsd.u;
import vm7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$soSuccess$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.LinkedHashMap;
import com.google.common.collect.ArrayListMultimap;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$userFeatureProvider$2;
import com.kwai.sdk.eve.internal.featurecenter.FeaturesProvider;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.FeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Long;
import java.lang.Double;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;
import java.util.List;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$configTableWithFlag$1;
import java.lang.Runnable;
import ml5.a;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.lang.RuntimeException;
import mrd.a;
import com.kuaishou.eve.kit.api.user.UserFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.FeatureCenterSwitchConfig;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenterConfig;
import java.io.File;
import en7.f;
import en7.f$a;
import qn7.d;
import com.kwai.sdk.eve.internal.common.utils.a;
import com.kwai.sdk.eve.internal.featurecenter.FeatureCenterLoggerConfig;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$init$1;
import ekd.k1;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.sdk.eve.internal.featurecenter.FeatureCenterBaseEventConfig;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initAppFeaturesProvider$1;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBackgroundMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveNetworkMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qrd.l1;
import fn7.b;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initAppFeaturesProvider$4;
import msd.l;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initAppFeaturesProvider$5;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initFeaturesProvider$1;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initFeaturesProvider$2;
import com.kwai.sdk.eve.internal.featurecenter.FeaturesProvider$Companion;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initUserProfileFeaturesProvider$1;
import d50.a;
import com.kuaishou.eve.kit.api.user.UserFeatureProvider$init$1;
import com.kuaishou.eve.kit.api.user.UserFeatureProvider$init$2;
import com.kwai.sdk.eve.InitConfig;
import h97.g;
import d50.b;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initUserProfileFeaturesProvider$2;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initUserProfileFeaturesProvider$3;
import java.lang.CharSequence;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.sdk.eve.internal.featurecenter.CachedFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$mergePrefixFeatures$prefixProvider$1$1$1;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$onStop$1;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$onUserChange$1;
import com.kuaishou.eve.kit.api.user.UserFeatureProvider$onUserChange$1;
import com.kuaishou.eve.kit.api.user.UserFeatureProvider$onUserChange$2;
import com.kuaishou.eve.kit.api.user.UserFeatureProvider$d;
import ukd.a;
import java.util.ArrayList;
import bn7.c;
import com.kwai.sdk.eve.internal.featurecenter.Column;
import java.lang.IllegalArgumentException;
import kotlin.Pair;
import java.lang.Throwable;
import zn7.a;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenterKt;
import trd.u;
import com.kwai.sdk.eve.internal.featurecenter.Relation;
import qrd.r0;
import com.kwai.sdk.eve.internal.featurecenter.Join;
import java.util.Collection;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveEvent$1;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveFeatureAccessory$1;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1;
import brd.y;
import brd.t;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$2;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import cn7.b;
import cn7.b$a;
import java.lang.Number;
import com.kwai.sdk.eve.internal.featurecenter.TableControl;
import com.kwai.sdk.eve.internal.statistics.EveLogger;
import com.kwai.sdk.eve.internal.common.EvePreference;
import zsd.u;
import vsd.d;
import nsd.m0;
import android.content.SharedPreferences;
import en7.q;
import java.lang.System;
import com.kwai.eve.typevalue.Type;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$WhenMappings;
import java.lang.Enum;
import cn.vimfung.luascriptcore.LuaValue;

public final class EveFeatureCenter implements IEveFeatureCenter, a, DefaultLifecycleObserver	// class@0014e1
{
    public EveFeatureCenterConfig config;
    public final a context;
    public final Map eventPrefixAndTableName;
    public final Map featuresProviders;
    public EveGlobalFeatureCalculator globalFeatureCalculator;
    public final p soSuccess$delegate;
    public boolean spaceLogUploaded;
    public FeatureCenterSwitchConfig switchConfig;
    public final Map tableConfigFlags;
    public final ArrayListMultimap tempCacheWaiting;
    public final p userFeatureProvider$delegate;
    public static final EveFeatureCenter$Companion Companion;

    static {
       EveFeatureCenter.Companion = new EveFeatureCenter$Companion(null);
    }
    public void EveFeatureCenter(a p0){
       a.p(p0, "context");
       super();
       this.context = p0;
       this.soSuccess$delegate = s.c(EveFeatureCenter$soSuccess$2.INSTANCE);
       this.eventPrefixAndTableName = new LinkedHashMap();
       this.tableConfigFlags = new LinkedHashMap();
       this.tempCacheWaiting = ArrayListMultimap.create();
       this.featuresProviders = new LinkedHashMap();
       this.userFeatureProvider$delegate = s.c(new EveFeatureCenter$userFeatureProvider$2(this));
    }
    public final void addAppFeatureProviderIfNeed(FeaturesProvider p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EveFeatureCenter.class, "6")) {
          return;
       }
       if (!p0.containsProvider$eve_core_release(p1)) {
          p0.addFeatureProvider(new FeatureProvider("APP", p1, p2));
       }
       return;
    }
    public final Context checkContext(){
       Context obj = PatchProxy.apply(null, this, EveFeatureCenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.context.c().get();
       Objects.requireNonNull(obj, "EveFeatureCenter init with null context");
       a.o(obj, "context.contextRef.get\(\)бн init with null context\"\)");
       return obj;
    }
    public final String columnDataType(Object p0){
       if (p0 instanceof Boolean) {
          p0 = "LuaValueTypeBoolean";
       }else if(p0 instanceof Integer){
          p0 = "LuaValueTypeInteger";
       }else if(p0 instanceof Float){
          p0 = "LuaValueTypeFloat";
       }else if(p0 instanceof Long || p0 instanceof Double){
          p0 = "LuaValueTypeNumber";
       }else if(p0 instanceof String){
          p0 = "LuaValueTypeString";
       }else if(p0 instanceof GeneratedMessageLite){
          p0 = "LuaValueTypePb";
       }else if(p0 instanceof Map){
          p0 = "LuaValueTypeMap";
       }else if(p0 instanceof List){
          p0 = "LuaValueTypeArray";
       }else {
          p0 = "";
       }
       return p0;
    }
    public native final void configTable(String p0,List p1,List p2,int p3,long p4);
    public final void configTableWithFlag(String p0,List p1,List p2,int p3,long p4){
       EveFeatureCenter uEveFeatureC = EveFeatureCenter.class;
       if (PatchProxy.isSupport(uEveFeatureC)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uEveFeatureC, "26")) {
             return;
          }
       }
       EveFeatureCenter$configTableWithFlag$1 uoconfigTabl = new EveFeatureCenter$configTableWithFlag$1(this, p0, p1, p2, p3, p4);
       this.scatter(uEveFeatureC);
       return;
    }
    public native final void doRowLimitCheck();
    public native final void doVacuum();
    public final a getContext(){
       return this.context;
    }
    public native final String getDbInfos();
    public final a getFeature(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EveFeatureCenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "featureCategory");
       a.p(p1, "featureKey");
       FeaturesProvider uFeaturesPro = this.featuresProviders.get(p0);
       a feature$eve_ = (uFeaturesPro != null)? uFeaturesPro.getFeature$eve_core_release(p1): null;
       return feature$eve_;
    }
    public final a getFeatures(String p0,List p1){
       FeaturesProvider obj = PatchProxy.applyTwoRefs(p0, p1, this, EveFeatureCenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "featureCategory");
       a.p(p1, "featureKeys");
       EveLog.d$default("Kt getFeatures =>  "+p0+", "+p1, false, 2, null);
       obj = this.featuresProviders.get(p0);
       if (obj != null) {
          a features$eve = obj.getFeatures$eve_core_release(p1);
          if (features$eve != null) {
             return features$eve;
          }
       }
       throw new RuntimeException("getFeature with error category:"+p0);
    }
    public final a getOrCreateFlag(String p0){
       EveFeatureCenter obj = PatchProxy.applyOneRefs(p0, this, EveFeatureCenter.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.tableConfigFlags;
       _monitor_enter(obj);
       EveFeatureCenter ttableConfig = this.tableConfigFlags;
       a uoa = ttableConfig.get(p0);
       if (uoa == null) {
          uoa = a.g();
          a.o(uoa, "BehaviorSubject.create\(\)");
          ttableConfig.put(p0, uoa);
       }
       _monitor_exit(obj);
       return uoa;
    }
    public final boolean getSoSuccess(){
       Object obj = PatchProxy.apply(null, this, EveFeatureCenter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.soSuccess$delegate.getValue();
       }
       return obj.booleanValue();
    }
    public final UserFeatureProvider getUserFeatureProvider(){
       Object obj = PatchProxy.apply(null, this, EveFeatureCenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.userFeatureProvider$delegate.getValue();
    }
    public native final void init(String p0,int p1,boolean p2,int p3,float p4,float p5,boolean p6);
    public final void init$eve_core_release(FeatureCenterSwitchConfig p0,EveFeatureCenterConfig p1,boolean p2){
       String this;
       if (PatchProxy.isSupport(EveFeatureCenter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, EveFeatureCenter.class, "3")) {
          return;
       }
       a.p(p0, "switchConfig");
       a.p(p1, "config");
       if (!this.getSoSuccess()) {
          return;
       }
       this.switchConfig = p0;
       this.config = p1;
       File uFile = new File(f.a.a(this.checkContext()), "eve_feature_center");
       if (!d.b(uFile) || !uFile.isDirectory()) {
          d.a(uFile);
          Object obj = PatchProxy.applyOneRefs(uFile, null, a.class, "11");
          if (obj != PatchProxyResult.class) {
             obj.booleanValue();
          }else if(!uFile.exists()){
             boolean b = uFile.mkdirs();
          }
       }
       this = uFile.getAbsolutePath();
       EveLog.i$default("EveFeatureCenter#init db init with dbPath:"+this+", successLogRatio:"+p0.getLoggerConfig().getSuccessRatio()+", errorLogRatio:"+p0.getLoggerConfig().getFailRatio()+" config:"+p0, false, 2, null);
       a.o(this, "dbPath");
       this.init(this, p0.getQueryConcurrency(), p0.getUseWal(), p0.getMmapSize(), p0.getLoggerConfig().getSuccessRatio(), p0.getLoggerConfig().getFailRatio(), p0.getEnable());
       if (!p0.getEnable()) {
          EveLog.i$default("EveFeatureCenter#init config disable, not init EveGlobalFeatureCalculator and configEventTables", false, 2, null);
          return;
       }else {
          k1.o(new EveFeatureCenter$init$1(this));
          EveGlobalFeatureCalculator uEveGlobalFe = new EveGlobalFeatureCalculator(this.context, p2);
          this.globalFeatureCalculator = uEveGlobalFe;
          uEveGlobalFe.init();
          Iterator iterator = p1.getBaseEventConfigs().iterator();
          while (iterator.hasNext()) {
             this.registerBaseEvent(iterator.next());
          }
          this.initFeaturesProvider();
          return;
       }
    }
    public final void initAppFeaturesProvider(){
       if (PatchProxy.applyVoid(null, this, EveFeatureCenter.class, "5")) {
          return;
       }
       HandlerThread handlerThrea = new HandlerThread("eve-app-feature-provider");
       handlerThrea.start();
       Handler handler = new Handler(handlerThrea.getLooper());
       FeaturesProvider uFeaturesPro = new FeaturesProvider();
       EveFeatureCenter tconfig = this.config;
       if (tconfig == null) {
          a.S("config");
       }
       uFeaturesPro.merge$eve_core_release(tconfig.getAppFeaturesProvider());
       this.addAppFeatureProviderIfNeed(uFeaturesPro, "current_timestamp", EveFeatureCenter$initAppFeaturesProvider$1.INSTANCE);
       FeatureMonitor[] uFeatureMoni = new FeatureMonitor[]{new EveBackgroundMonitor(this.checkContext()),new EveBatteryMonitor(this.checkContext()),new EveHeadSetMonitor(this.checkContext()),new EveNetworkMonitor(this.checkContext()),new EveSystemSettingMonitor(this.checkContext()),new EveThermalMonitor(this.checkContext())};
       Iterator iterator = CollectionsKt__CollectionsKt.P(uFeatureMoni).iterator();
       while (iterator.hasNext()) {
          iterator.next().checkNeedInit(handler, uFeaturesPro);
       }
       this.mergePrefixFeatures(uFeaturesPro, "c_");
       this.featuresProviders.put("APP", uFeaturesPro);
       this.context.d().a("getCommonFeature", new EveFeatureCenter$initAppFeaturesProvider$4(this));
       this.context.d().a("getCommonFeatures", new EveFeatureCenter$initAppFeaturesProvider$5(this));
       return;
    }
    public final void initFeaturesProvider(){
       if (PatchProxy.applyVoid(null, this, EveFeatureCenter.class, "4")) {
          return;
       }
       this.initAppFeaturesProvider();
       this.initUserProfileFeaturesProvider();
       this.context.d().a("getFeature", new EveFeatureCenter$initFeaturesProvider$1(this));
       this.context.d().a("getFeatures", new EveFeatureCenter$initFeaturesProvider$2(this));
       return;
    }
    public final void initUserProfileFeaturesProvider(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveFeatureCenter.class, "7")) {
          return;
       }
       this.featuresProviders.put("USER_PROFILE", FeaturesProvider.Companion.getDEFAULT$eve_core_release());
       UserFeatureProvider userFeatureP = this.getUserFeatureProvider();
       EveFeatureCenter$initUserProfileFeaturesProvider$1 oinitUserPro = new EveFeatureCenter$initUserProfileFeaturesProvider$1(this);
       Objects.requireNonNull(userFeatureP);
       if (!PatchProxy.applyVoidOneRefs(oinitUserPro, userFeatureP, UserFeatureProvider.class, "4")) {
          a.p(oinitUserPro, "featuresProviderUpdater");
          if (!userFeatureP.c().a()) {
             EveLog.INSTANCE.i(UserFeatureProvider$init$1.INSTANCE);
          }else {
             EveLog.INSTANCE.i(UserFeatureProvider$init$2.INSTANCE);
             userFeatureP.e = oinitUserPro;
             g og = userFeatureP.f.b().b();
             if (og != null) {
                objArray = og.getUserId();
             }
             userFeatureP.e(new b(userFeatureP, objArray));
          }
       }
       this.context.d().a("getUserFeature", new EveFeatureCenter$initUserProfileFeaturesProvider$2(this));
       this.context.d().a("getUserFeatures", new EveFeatureCenter$initUserProfileFeaturesProvider$3(this));
       return;
    }
    public final void mergePrefixFeatures(FeaturesProvider p0,String p1){
       Object value1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveFeatureCenter.class, "8")) {
          return;
       }
       FeaturesProvider uFeaturesPro = (!p1.length())? 1: null;
       if (uFeaturesPro) {
          return;
       }else {
          uFeaturesPro = new FeaturesProvider();
          Iterator iterator = p0.getProviders$eve_core_release().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String str = p1+uEntry.getKey();
             IFeatureProvider value = uEntry.getValue();
             if (value instanceof CachedFeatureProvider) {
                value1 = uEntry.getValue();
                Objects.requireNonNull(value1, "null cannot be cast to non-null type com.kwai.sdk.eve.internal.featurecenter.CachedFeatureProvider");
                uFeaturesPro.addFeatureProvider(new CachedFeatureProvider(str, value1));
             }else if(value instanceof FeatureProvider){
                value1 = uEntry.getValue();
                Objects.requireNonNull(value1, "null cannot be cast to non-null type com.kwai.sdk.eve.internal.featurecenter.FeatureProvider");
                uFeaturesPro.addFeatureProvider(new FeatureProvider(str, value1));
             }else {
                uFeaturesPro.addFeatureProvider(new EveFeatureCenter$mergePrefixFeatures$prefixProvider$1$1$1(uEntry, str, uEntry.getValue().getCategory(), str));
             }
          }
          p0.merge$eve_core_release(uFeaturesPro);
          return;
       }
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveFeatureCenter.class, "29")) {
          return;
       }
       a.p(p0, "owner");
       EveLog.i$default("EveFeatureCenter#onForeground", false, 2, null);
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveFeatureCenter.class, "30")) {
          return;
       }
       a.p(p0, "owner");
       EveLog.i$default("EveFeatureCenter#onBackground", false, 2, null);
       this.scatter(new EveFeatureCenter$onStop$1(this));
       return;
    }
    public void onUserChange(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveFeatureCenter.class, "11")) {
          return;
       }
       String str = "fromUid";
       a.p(p0, str);
       String str1 = "toUid";
       a.p(p1, str1);
       EveFeatureCenter tswitchConfi = this.switchConfig;
       if (tswitchConfi == null) {
          a.S("switchConfig");
       }
       if (!tswitchConfi.getEnable()) {
          EveLog.INSTANCE.i(EveFeatureCenter$onUserChange$1.INSTANCE);
          return;
       }else {
          UserFeatureProvider userFeatureP = this.getUserFeatureProvider();
          Objects.requireNonNull(userFeatureP);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, userFeatureP, UserFeatureProvider.class, "5")) {
             a.p(p0, str);
             a.p(p1, str1);
             if (!userFeatureP.c().a()) {
                EveLog.INSTANCE.i(UserFeatureProvider$onUserChange$1.INSTANCE);
             }else {
                EveLog.INSTANCE.i(new UserFeatureProvider$onUserChange$2(p0, p1));
                userFeatureP.e(new UserFeatureProvider$d(userFeatureP, p1));
             }
          }
          EveFeatureCenter tglobalFeatu = this.globalFeatureCalculator;
          if (tglobalFeatu == null) {
             a.S("globalFeatureCalculator");
          }
          tglobalFeatu.onUserChange(p0, p1);
          return;
       }
    }
    public final void registerBaseEvent(FeatureCenterBaseEventConfig p0){
       StringBuilder str1;
       String str2;
       EveFeatureCenter tswitchConfi1;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, EveFeatureCenter.class, "20")) {
          return;
       }
       Object obj = null;
       if (!this.getSoSuccess()) {
          EveLog.i$default("EveFeatureCenter#registerBaseEvent error, so not load success, event:"+p0.getEventClass().getSimpleName(), false, 2, obj);
          return;
       }else {
          EveFeatureCenter tswitchConfi = this.switchConfig;
          String str = "switchConfig";
          if (tswitchConfi == null) {
             a.S(str);
          }
          if (!tswitchConfi.getEnable()) {
             EveLog.i$default("EveFeatureCenter#registerBaseEvent cancel, config disable, event:"+p0.getEventClass().getSimpleName(), false, 2, obj);
             return;
          }else if(!p0.getColumnPrefix().length()){
             str1 = 1;
          }else {
             str1 = null;
          }
          if (!str1) {
             str1 = (!p0.getTableName().length())? 1: null;
             if (!str1) {
                GeneratedMessageLite generatedMes = a.j(p0.getEventClass());
                ArrayList uArrayList = new ArrayList();
                a.o(generatedMes, "event");
                Iterator iterator = this.context.e().a(generatedMes).entrySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      str2 = this.columnDataType(uEntry.getValue());
                      Column uColumn = (!str2.length())? 1: null;
                      if (!uColumn) {
                         uArrayList.add(new Column(p0.getColumnPrefix()+uEntry.getKey(), str2, p0.getIndexColumns().contains(uEntry.getKey()), a.g(p0.getPrimaryKey(), uEntry.getKey())));
                      }else {
                         throw new IllegalArgumentException("not support value type for key:"+uEntry.getKey());
                      }
                   }else if(uArrayList.isEmpty()){
                      EveLog.i$default("EveFeatureCenter#registerBaseEvent error, no columns, event:"+p0.getEventClass().getSimpleName(), false, 2, obj);
                      return;
                   }else {
                      this.eventPrefixAndTableName.put(p0.getEventClass(), new Pair(p0.getColumnPrefix(), p0.getTableName()));
                      str1 = p0.getTableName();
                      tswitchConfi1 = this.switchConfig;
                      if (tswitchConfi1 == null) {
                         a.S(str);
                      }
                      i = this.tableMaxRows(str1, tswitchConfi1.getBaseMaxRows());
                      str1 = p0.getTableName();
                      tswitchConfi1 = this.switchConfig;
                      if (tswitchConfi1 == null) {
                         a.S(str);
                         break ;
                      }
                      break ;
                   }
                }
                long l = this.tableTimeIntervalS(str1, tswitchConfi1.getBaseTimeIntervalS());
                EveLog.i$default("EveFeatureCenter#registerBaseEvent, event:"+p0.getEventClass().getSimpleName()+", tableName:"+p0.getTableName()+", columns:"+uArrayList+", maxRows:"+i+", timeIntervalS:"+l, false, 2, obj);
                str2 = p0.getEventClass().getSimpleName();
                a.o(str2, "baseEvent.eventClass.simpleName");
                this.configTableWithFlag(str2, uArrayList, CollectionsKt__CollectionsKt.E(), i, l);
                return;
             }
          }
          EveLog.i$default("EveFeatureCenter#registerBaseEvent error, event:"+p0.getEventClass().getSimpleName()+" columnPrefix:"+p0.getColumnPrefix()+" or tableName:"+p0.getTableName()+" is empty", false, 2, obj);
          return;
       }
    }
    public final void registerFeatureAccessory(a p0,List p1,List p2,l p3){
       int this;
       Relation relation;
       String str4;
       String str5;
       EveFeatureCenter uEveFeatureC = this;
       Object obj = p0;
       Object obj1 = p1;
       Pair obj2 = p2;
       EveFeatureCenter obj3 = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, EveFeatureCenter.class, "21")) {
          return;
       }
       a.p(obj, "task");
       a.p(obj1, "accessoryColumns");
       a.p(obj2, "relations");
       a.p(obj3, "provider");
       String str = ", relations:";
       String str1 = ", columns:";
       Object obj4 = null;
       this = 2;
       boolean b = false;
       if (!this.getSoSuccess()) {
          EveLog.i$default("EveFeatureCenter#registerFeatureAccessory error, so not load success, taskId:"+p0.n()+str1+obj1+str+obj2, b, this, obj4);
          return;
       }else {
          EveFeatureCenter switchConfig = uEveFeatureC.switchConfig;
          String str2 = "switchConfig";
          if (switchConfig == null) {
             a.S(str2);
          }
          if (!switchConfig.getEnable()) {
             EveLog.i$default("EveFeatureCenter#registerFeatureAccessory cancel, config disable, taskId:"+p0.n()+str1+obj1+str+obj2, b, this, obj4);
             return;
          }else {
             EveFeatureCenterKt.setFeatureAccessoryProvider(obj, obj3);
             String str3 = p0.n();
             obj3 = uEveFeatureC.switchConfig;
             if (obj3 == null) {
                a.S(str2);
             }
             int i = uEveFeatureC.tableMaxRows(str3, obj3.getFeatureMaxRows());
             str3 = p0.n();
             EveFeatureCenter switchConfig1 = uEveFeatureC.switchConfig;
             if (switchConfig1 == null) {
                a.S(str2);
             }
             long l = uEveFeatureC.tableTimeIntervalS(str3, switchConfig1.getFeatureTimeIntervalS());
             EveLog.i$default("EveFeatureCenter#registerFeatureAccessory, taskId:"+p0.n()+str1+obj1+str+obj2+", maxRows:"+i+", timeIntervalS:"+l, b, this, obj4);
             str = p0.n();
             ArrayList uArrayList = new ArrayList(u.Y(obj2, 10));
             Iterator iterator = p2.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   relation = iterator.next();
                   obj2 = uEveFeatureC.eventPrefixAndTableName.get(relation.getEventClass());
                   if (obj2 == null) {
                      obj2 = r0.a("", "");
                   }
                   str4 = obj2.component1();
                   str5 = obj2.component2();
                   int i1 = 1;
                   int i2 = (!str4.length())? 1: 0;
                   if (!i2) {
                      if (str5.length()) {
                         i1 = 0;
                      }
                      if (!i1) {
                         uArrayList.add(new Join(p0.n(), relation.getAccessoryColumnName(), str5, str4+relation.getEventField()));
                         long l1 = 0;
                      }
                   }
                   break ;
                }else {
                   this.configTableWithFlag(str, p1, uArrayList, i, l);
                   return;
                }
             }
             EveLog.i$default("EveFeatureCenter#registerFeatureAccessory error, event:"+relation.getEventClass().getSimpleName()+" columnPrefix:"+str4+" or tableName:"+str5+" is empty, maybe not register", false, 2, null);
             return;
          }
       }
    }
    public final void saveEvent(GeneratedMessageLite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveFeatureCenter.class, "13")) {
          return;
       }
       a.p(p0, "event");
       if (!this.getSoSuccess()) {
          EveLog.i$default("EveFeatureCenter#saveRawEvent error, so not load success, event:"+p0.getClass(), false, 2, null);
          return;
       }else {
          EveFeatureCenter tswitchConfi = this.switchConfig;
          if (tswitchConfi == null) {
             a.S("switchConfig");
          }
          if (!tswitchConfi.getEnable()) {
             EveLog.i$default("EveFeatureCenter#saveRawEvent cancel, config disable, event:"+p0.getClass(), false, 2, null);
             return;
          }else {
             this.scatter(new EveFeatureCenter$saveEvent$1(this, p0));
             return;
          }
       }
    }
    public void saveFeatureAccessory(a p0,GeneratedMessageLite p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveFeatureCenter.class, "14")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "event");
       if (!this.getSoSuccess()) {
          EveLog.i$default("EveFeatureCenter#saveFeatureAccessory error, so not load success, event:"+p1.getClass(), false, 2, null);
          return;
       }else {
          EveFeatureCenter tswitchConfi = this.switchConfig;
          if (tswitchConfi == null) {
             a.S("switchConfig");
          }
          if (!tswitchConfi.getEnable()) {
             EveLog.i$default("EveFeatureCenter#saveFeatureAccessory cancel, config disable, event:"+p1.getClass(), false, 2, null);
             return;
          }else {
             this.scatter(new EveFeatureCenter$saveFeatureAccessory$1(this, p0, p1));
             return;
          }
       }
    }
    public native final void saveTableData(String p0,Map p1);
    public final void saveTableDataWaitConfig(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveFeatureCenter.class, "27")) {
          return;
       }
       Object obj = null;
       int i = 2;
       if (this.getOrCreateFlag(p0).j()) {
          this.saveTableData(p0, p1);
          EveLog.i$default("EveFeatureCenter#saveTableDataWaitConfig success, tableName:"+p0, false, i, obj);
          return;
       }else {
          EveLog.i$default("EveFeatureCenter#saveTableDataWaitConfig wait, tableName:"+p0, false, i, obj);
          EveFeatureCenter ttempCacheWa = this.tempCacheWaiting;
          a.o(ttempCacheWa, "tempCacheWaiting");
          _monitor_enter(ttempCacheWa);
          if (!this.tempCacheWaiting.containsKey(p0)) {
             this.getOrCreateFlag(p0).subscribe(new EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$1(this, p0, p1));
          }
          this.tempCacheWaiting.put(p0, new EveFeatureCenter$saveTableDataWaitConfig$$inlined$synchronized$lambda$2(this, p0, p1));
          _monitor_exit(ttempCacheWa);
          return;
       }
    }
    public final void scatter(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveFeatureCenter.class, "15")) {
          return;
       }
       LabeledRunnable labeledRunna = new LabeledRunnable("", null, "dataStream", p0, 2, null);
       b$a.a(this.context.h(), v0, false, 2, null);
       return;
    }
    public final int tableMaxRows(String p0,int p1){
       EveFeatureCenter uEveFeatureC = EveFeatureCenter.class;
       if (PatchProxy.isSupport(uEveFeatureC)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uEveFeatureC, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uEveFeatureC = this.switchConfig;
       if (uEveFeatureC == null) {
          a.S("switchConfig");
       }
       TableControl tableControl = uEveFeatureC.getCustomTableControlMap().get(p0);
       if (tableControl != null) {
          p1 = tableControl.getMaxRows();
       }
       return p1;
    }
    public final long tableTimeIntervalS(String p0,long p1){
       EveFeatureCenter uEveFeatureC = EveFeatureCenter.class;
       if (PatchProxy.isSupport(uEveFeatureC)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uEveFeatureC, "19");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       uEveFeatureC = this.switchConfig;
       if (uEveFeatureC == null) {
          a.S("switchConfig");
       }
       TableControl tableControl = uEveFeatureC.getCustomTableControlMap().get(p0);
       if (tableControl != null) {
          p1 = tableControl.getTimeIntervalS();
       }
       return p1;
    }
    public final void unregisterFeatureAccessory(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveFeatureCenter.class, "22")) {
          return;
       }
       a.p(p0, "task");
       EveLog.i$default("EveFeatureCenter#unregisterFeatureAccessoryProvider, taskId:"+p0.n(), false, 2, null);
       EveFeatureCenterKt.setFeatureAccessoryProvider(p0, null);
       return;
    }
    public final void uploadExecuteLog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveFeatureCenter.class, "24")) {
          return;
       }
       a.p(p0, "data");
       EveLogger.INSTANCE.logCustomEvent("EVE_FEATURE_CENTER_MONITOR", p0);
       EveLog.i$default("EveFeatureCenter#uploadExecuteLog data:"+p0, false, 2, null);
       return;
    }
    public final void uploadSpaceLog(){
       if (PatchProxy.applyVoid(null, this, EveFeatureCenter.class, "23")) {
          return;
       }
       int i = 2;
       if (this.spaceLogUploaded != null) {
          EveLog.i$default("EveFeatureCenter#uploadSpaceLog, space log already uploaded", false, i, null);
          return;
       }else {
          EveFeatureCenter tswitchConfi = this.switchConfig;
          if (tswitchConfi == null) {
             a.S("switchConfig");
          }
          float fileSpaceRat = tswitchConfi.getLoggerConfig().getFileSpaceRatio();
          if (!k1.l(fileSpaceRat)) {
             EveLog.i$default("EveFeatureCenter#uploadSpaceLog, not select by ratio, ratio:"+fileSpaceRat, false, i, null);
             return;
          }else {
             this.spaceLogUploaded = true;
             String dbInfos = this.getDbInfos();
             EveLog.i$default("EveFeatureCenter#uploadSpaceLog, ratio:"+fileSpaceRat+", data:"+dbInfos, false, i, null);
             EveLogger.INSTANCE.logCustomEvent("EVE_FEATURE_CENTER_DB_LIST", dbInfos);
             return;
          }
       }
    }
    public final void vacuum(){
       Object[] objArray1;
       int b;
       long l;
       String str;
       Long longx1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveFeatureCenter.class, "25")) {
          return;
       }
       EveFeatureCenter tswitchConfi = this.switchConfig;
       if (tswitchConfi == null) {
          a.S("switchConfig");
       }
       if (!tswitchConfi.getEnableVacuum()) {
          EveLog.i$default("EveFeatureCenter#vacuum, vacuum not enable", false, 2, objArray);
          return;
       }else {
          EvePreference uEvePreferen = this.context.g();
          Long longx = Long.valueOf(-1);
          if (!u.S1("LAST_VACUUM_TIME")) {
             d uod = m0.d(longx.getClass());
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                objArray1 = (!longx instanceof Boolean)? objArray: longx;
                b = (objArray1 != null)? objArray1.booleanValue(): false;
                if (uEvePreferen.a().getBoolean("LAST_VACUUM_TIME", b)) {
                   longx = Boolean.TRUE;
                }
             }else if(a.g(uod, m0.d(String.class))){
                objArray1 = (!longx instanceof String)? objArray: longx;
                if (objArray1 == null) {
                   String str1 = "";
                }
                str = uEvePreferen.a().getString("LAST_VACUUM_TIME", objArray1);
                l = (str == null || !str.length())? 1: 0;
                if (!l) {
                   Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.Long");
                   longx = str;
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                objArray1 = (!longx instanceof Integer)? objArray: longx;
                b = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                int intx = uEvePreferen.a().getInt("LAST_VACUUM_TIME", b);
                if (intx != Integer.MIN_VALUE) {
                   longx = Integer.valueOf(intx);
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                l = uEvePreferen.a().getLong("LAST_VACUUM_TIME", longx.longValue());
                if (l - Long.MIN_VALUE) {
                   longx = Long.valueOf(l);
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                objArray1 = (!longx instanceof Float)? objArray: longx;
                float f = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                float floatx = uEvePreferen.a().getFloat("LAST_VACUUM_TIME", f);
                if (floatx - 1) {
                   longx = Float.valueOf(floatx);
                }
             }
             l = longx.longValue();
             long l1 = System.currentTimeMillis() - l;
             tswitchConfi = this.switchConfig;
             if (tswitchConfi == null) {
                a.S("switchConfig");
             }
             if (l1 - (tswitchConfi.getVacuumIntervalS() * 1000) < 0) {
                str = "EveFeatureCenter#vacuum, since lastVacuumTime:"+l+" not over vacuumIntervalS:";
                EveFeatureCenter tswitchConfi1 = this.switchConfig;
                if (tswitchConfi1 == null) {
                   a.S("switchConfig");
                }
                EveLog.i$default(str+tswitchConfi1.getVacuumIntervalS(), false, 2, objArray);
                return;
             }else {
                this.context.g().b("LAST_VACUUM_TIME", Long.valueOf(System.currentTimeMillis()));
                this.doVacuum();
                return;
             }
          }else {
             throw new IllegalArgumentException("pref key is empty");
          }
       }
    }
    public final Object wrapValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveFeatureCenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Long) {
          p0 = Double.valueOf((double)p0.longValue());
       }
       return p0;
    }
    public final a wrapValue(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveFeatureCenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (EveFeatureCenter$WhenMappings.$EnumSwitchMapping$0[p0.i().ordinal()] == 1) {
          Object obj1 = PatchProxy.apply(null, p0, a.class, "6");
          long l = (obj1 != PatchProxyResult.class)? obj1.longValue(): p0.a.toInteger();
          p0 = new a((double)l);
       }
       return p0;
    }
}
