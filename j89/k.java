package j89.k;
import com.yxcorp.gifshow.OnlineSystraceManager;
import java.lang.Object;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepPushPerformanceModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import ekd.e0;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.yxcorp.gifshow.OnlineSystraceManager$OnlineSystraceConfigModel;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Throwable;
import android.util.Log;
import j89.l;
import java.util.Objects;
import com.yxcorp.gifshow.apm.SampleState;
import j89.r;
import java.lang.Thread;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Locale;
import java.lang.System;
import java.lang.Math;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.yxcorp.gifshow.apm.OnlineSystraceInterceptor;
import com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1;
import msd.l;
import msd.p;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.NullPointerException;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepFlameGraphStateCustomEvent;
import k2b.u1;
import com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$offlineBeginTrace$traceResult$1;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import usd.k;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import trd.l0;
import ssd.e;
import java.lang.CharSequence;
import kotlin.text.StringsKt___StringsKt;
import java.lang.Character;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;

public class k implements OnlineSystraceManager	// class@0027b1
{
    public OnlineSystraceManager$KeepPushPerformanceModel a;
    public OnlineSystraceManager$OnlineSystraceConfigModel b;

    public void k(){
       super();
    }
    public OnlineSystraceManager$KeepPushPerformanceModel a(){
       File obj = PatchProxy.apply(null, this, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context b = e0.b;
       a.o(b, "GlobalConfig.CONTEXT");
       obj = new File(b.getFilesDir(), "keepos.config");
       if (!obj.exists()) {
          return null;
       }
       k ta = this.a;
       if (ta != null) {
          return ta;
       }
       Properties properties = new Properties();
       properties.load(new FileInputStream(obj));
       StringBuilder str = "read string:"+properties;
       OnlineSystraceManager$KeepPushPerformanceModel keepPushPerf = new OnlineSystraceManager$KeepPushPerformanceModel();
       String property = properties.getProperty("subType");
       a.o(property, "config.getProperty\(\"subType\"\)");
       keepPushPerf.mSubType = Integer.parseInt(property);
       keepPushPerf.mTaskID = properties.getProperty("taskID");
       OnlineSystraceManager$OnlineSystraceConfigModel onlineSystra = new OnlineSystraceManager$OnlineSystraceConfigModel();
       keepPushPerf.mFlameGraphMessage = onlineSystra;
       onlineSystra.mScene = properties.getProperty("scene");
       String property1 = properties.getProperty("type");
       a.o(property1, "config.getProperty\(\"type\"\)");
       keepPushPerf.mFlameGraphMessage.mType = Long.valueOf(Long.parseLong(property1));
       keepPushPerf.mFlameGraphMessage.mVersion = properties.getProperty("version");
       property1 = properties.getProperty("samplingRate");
       a.o(property1, "config.getProperty\(\"samplingRate\"\)");
       keepPushPerf.mFlameGraphMessage.samplingRate = Long.valueOf(Long.parseLong(property1));
       property1 = properties.getProperty("frequency");
       a.o(property1, "config.getProperty\(\"frequency\"\)");
       keepPushPerf.mFlameGraphMessage.mFreqency = Long.valueOf(Long.parseLong(property1));
       property1 = properties.getProperty("timeLimit");
       a.o(property1, "config.getProperty\(\"timeLimit\"\)");
       keepPushPerf.mFlameGraphMessage.mTimeLimit = Long.valueOf(Long.parseLong(property1));
       property1 = properties.getProperty("samplingCountLimit");
       a.o(property1, "config.getProperty\(\"samplingCountLimit\"\)");
       keepPushPerf.mFlameGraphMessage.mSamplingCountLimit = Long.valueOf(Long.parseLong(property1));
       property1 = properties.getProperty("beginTime");
       a.o(property1, "config.getProperty\(\"beginTime\"\)");
       keepPushPerf.mFlameGraphMessage.mBeginTime = Long.valueOf(Long.parseLong(property1));
       property1 = properties.getProperty("endTime");
       a.o(property1, "config.getProperty\(\"endTime\"\)");
       keepPushPerf.mFlameGraphMessage.mEndTime = Long.valueOf(Long.parseLong(property1));
       property1 = properties.getProperty("samplingThreadPolicy");
       a.o(property1, "config.getProperty\(\"samplingThreadPolicy\"\)");
       keepPushPerf.mFlameGraphMessage.mSamplingThreadPolicy = Long.valueOf(Long.parseLong(property1));
       keepPushPerf.mFlameGraphMessage.mParams = properties.getProperty("params");
       keepPushPerf.mFlameGraphMessage.mIsAutoUpload = Boolean.valueOf(Boolean.parseBoolean(properties.getProperty("isAutoUpload")));
       OnlineSystraceManager$KeepPushPerformanceModel mFlameGraphM = keepPushPerf.mFlameGraphMessage;
       mFlameGraphM.mSource = 2;
       mFlameGraphM.mUseFastUnwind = Boolean.valueOf(Boolean.parseBoolean(properties.getProperty("useFastUnwind")));
       this.a = keepPushPerf;
       return keepPushPerf;
    }
    public String b(){
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e0.b;
       a.o(obj, "GlobalConfig.CONTEXT");
       OnlineSystraceManager$OnlineSystraceConfigModel onlineSystra = this.o(obj);
       if (onlineSystra != null) {
          objArray = onlineSystra.mParams;
       }
       return objArray;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "15")) {
          return;
       }
       l c = l.C;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(objArray, c, l.class, "9") && l.j == SampleState.AFTER_BEGIN_TRACE) {
          Thread thread = Thread.currentThread();
          a.o(thread, "Thread.currentThread\(\)");
          r or = new r(((long)0x989680 + thread.getId()), "dummy", SystemClock.elapsedRealtime(), false);
          l.m.add(c);
       }
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "14")) {
          return;
       }
       a.p(p0, "sectionName");
       l c = l.C;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(p0, c, l.class, "8")) {
          a.p(p0, "tagName");
          if (l.j == SampleState.AFTER_BEGIN_TRACE) {
             Thread thread = Thread.currentThread();
             a.o(thread, "Thread.currentThread\(\)");
             r or = new r(((long)0x989680 + thread.getId()), p0, SystemClock.elapsedRealtime(), true);
             l.m.add(c);
          }
       }
       return;
    }
    public Boolean e(Context p0,long p1){
       boolean b;
       int i2;
       File uFile;
       Properties properties;
       String str;
       String property;
       int i3;
       Properties properties1;
       String str1;
       l c;
       String str2;
       OnlineSystraceInterceptor onlineSystra;
       int i4;
       OnlineSystraceManagerImpl$beginTrace$traceResult$1 uobeginTrace;
       Properties properties2;
       String this;
       boolean b1;
       Object obj = this;
       String obj1 = p0;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          OnlineSystraceManager$OnlineSystraceConfigModel obj2 = PatchProxy.applyTwoRefs(obj1, Long.valueOf(p1), obj, ok, "12");
          if (obj2 != PatchProxyResult.class) {
             b = obj2.booleanValue();
          }else {
          label_0024 :
             a.p(obj1, "context");
             Objects.toString(p0);
             obj2 = this.o(p0);
             if (obj2 != null) {
                OnlineSystraceManager$OnlineSystraceConfigModel mType = obj2.mType;
                OnlineSystraceManager$OnlineSystraceConfigModel mScene = obj2.mScene;
                OnlineSystraceManager$OnlineSystraceConfigModel mVersion = obj2.mVersion;
                OnlineSystraceManager$OnlineSystraceConfigModel samplingRate = obj2.samplingRate;
                OnlineSystraceManager$OnlineSystraceConfigModel mSamplingCou = obj2.mSamplingCountLimit;
                OnlineSystraceManager$OnlineSystraceConfigModel mBeginTime = obj2.mBeginTime;
                OnlineSystraceManager$OnlineSystraceConfigModel mEndTime = obj2.mEndTime;
                int i = (int)obj2.mTimeLimit.longValue();
                int i1 = (int)obj2.mFreqency.longValue();
                OnlineSystraceManager$OnlineSystraceConfigModel mSamplingThr = obj2.mSamplingThreadPolicy;
                b = (mSamplingThr != null && !mSamplingThr.longValue() - 2)? true: false;
                OnlineSystraceManager$OnlineSystraceConfigModel mSource = obj2.mSource;
                obj2 = obj2.mUseFastUnwind;
                if (mType != null && !p1 - mType.longValue()) {
                   a.o(mVersion, "version");
                   Locale rOOT = Locale.ROOT;
                   a.o(rOOT, "Locale.ROOT");
                   if (mVersion != null) {
                      obj1 = mVersion.toLowerCase(rOOT);
                      a.o(obj1, "\(this as java.lang.String\).toLowerCase\(locale\)");
                      if (!(a.g(obj1, "v4") ^ 0x01)) {
                         mVersion = obj2;
                         long l = System.currentTimeMillis() / (long)1000;
                         Boolean uBoolean = null;
                         if (mBeginTime != null && (mBeginTime.longValue() - uBoolean || (mEndTime == null || mEndTime.longValue() - uBoolean))) {
                            if (mBeginTime == null || (mBeginTime.longValue() - uBoolean && (mEndTime == null || mEndTime.longValue() - uBoolean))) {
                               a.o(mBeginTime, "beginTime");
                               if (l - mBeginTime.longValue() > 0) {
                                  a.o(mEndTime, "endTime");
                                  if (l - mEndTime.longValue() < 0) {
                                  }
                               }
                            }
                         }else if(samplingRate == null || samplingRate.longValue() - uBoolean){
                            i2 = i;
                            a.o(samplingRate, "samplingRate");
                            if ((Math.random() * (double)100) - (double)samplingRate.longValue() < 0) {
                            }
                         }else {
                            i2 = i;
                         }
                      }
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                   }
                }
             }
          label_023e :
             b = false;
          }
       }else {
          goto label_0024 ;
       }
       return Boolean.valueOf(b);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, k.class, "8")) {
          return;
       }
       Context b = e0.b;
       a.o(b, "GlobalConfig.CONTEXT");
       new File(b.getFilesDir(), "os.config").delete();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       Context b = e0.b;
       a.o(b, "GlobalConfig.CONTEXT");
       new File(b.getFilesDir(), "keepos.config").delete();
       return;
    }
    public String getConfig(){
       Object obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context b = e0.b;
       a.o(b, "GlobalConfig.CONTEXT");
       return a.b.q(this.o(b));
    }
    public Boolean h(long p0){
       boolean b;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ok, "13");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          label_0023 :
             return Boolean.valueOf(b);
          }
       }
       b = l.C.c(p0);
       goto label_0023 ;
    }
    public void i(OnlineSystraceManager$KeepPushPerformanceModel p0){
       String str = "samplingCount";
       String str1 = "scene";
       String str2 = "createTime";
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "5")) {
          return;
       }
       a.p(p0, "model");
       Context b = e0.b;
       a.o(b, "GlobalConfig.CONTEXT");
       File uFile = new File(b.getFilesDir(), "keepos.config");
       if (!uFile.exists()) {
          uFile.createNewFile();
       }
       Properties properties = new Properties();
       properties.load(new FileInputStream(uFile));
       String property = properties.getProperty(str2, "0");
       a.o(property, "config.getProperty\(\"createTime\", \"0\"\)");
       if (p0.mFlameGraphMessage.mCreateTime.longValue() - Long.parseLong(property) < 0) {
          this.g();
          return;
       }else {
          properties.setProperty("subType", String.valueOf(p0.mSubType));
          properties.setProperty("taskID", p0.mTaskID);
          p0 = p0.mFlameGraphMessage;
          properties.setProperty(str1, p0.mScene);
          properties.setProperty("type", String.valueOf(p0.mType.longValue()));
          properties.setProperty("version", p0.mVersion);
          properties.setProperty("samplingRate", String.valueOf(p0.samplingRate.longValue()));
          properties.setProperty("frequency", String.valueOf(p0.mFreqency.longValue()));
          properties.setProperty("timeLimit", String.valueOf(p0.mTimeLimit.longValue()));
          properties.setProperty("samplingCountLimit", String.valueOf(p0.mSamplingCountLimit.longValue()));
          properties.setProperty("beginTime", String.valueOf(p0.mBeginTime.longValue()));
          properties.setProperty("endTime", String.valueOf(p0.mEndTime.longValue()));
          properties.setProperty("samplingThreadPolicy", String.valueOf(p0.mSamplingThreadPolicy.longValue()));
          properties.setProperty("params", p0.mParams);
          properties.setProperty("isAutoUpload", String.valueOf(p0.mIsAutoUpload.booleanValue()));
          properties.setProperty(str2, String.valueOf(p0.mCreateTime.longValue()));
          properties.setProperty("source", "keep");
          properties.setProperty("useFastUnwind", String.valueOf(p0.mUseFastUnwind.booleanValue()));
          if (properties.getProperty(str) == null || (a.g(p0.mScene, properties.getProperty(str1)) ^ 0x01)) {
             properties.setProperty(str, "0");
          }
          StringBuilder str3 = "write string:"+properties;
          properties.store(new FileWriter(uFile), "");
          return;
       }
    }
    public Boolean init(){
       Object obj = PatchProxy.apply(null, this, k.class, "11");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): l.C.f();
       return Boolean.valueOf(b);
    }
    public void j(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, k.class, "7")) {
          return;
       }
       a.p(p0, "taskid");
       OnlineSystraceManager$KeepFlameGraphStateCustomEvent keepFlameGra = new OnlineSystraceManager$KeepFlameGraphStateCustomEvent();
       keepFlameGra.pull_log_task_id = p0;
       p0 = "";
       if (p1 == null) {
          p1 = p0;
       }
       keepFlameGra.pull_sub_task_id = p1;
       keepFlameGra.pull_state = p2;
       keepFlameGra.pull_subtype = 6;
       if (p3 == null) {
          p3 = p0;
       }
       keepFlameGra.error_msg = p3;
       keepFlameGra.timestamp = System.currentTimeMillis();
       a.a.q(keepFlameGra);
       u1.R("performance_long_link", a.b.q(keepFlameGra), 19);
       return;
    }
    public Boolean k(Context p0,Boolean p1,Boolean p2){
       boolean b2;
       String this;
       boolean b = p1.booleanValue();
       int b1 = p2.booleanValue();
       String str = "v4";
       if (PatchProxy.isSupport(k.class)) {
          Properties obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(b), Boolean.valueOf(b1), this, k.class, "17");
          if (obj != PatchProxyResult.class) {
             b2 = obj.booleanValue();
          }else {
          label_0032 :
             a.p(p0, "context");
             Objects.toString(p0);
             this = "offline";
             int i = 60;
             int i1 = 100;
             Boolean uBoolean = (!b1)? 1: null;
             int i2 = 3;
             Locale rOOT = Locale.ROOT;
             a.o(rOOT, "Locale.ROOT");
             String str1 = str.toLowerCase(rOOT);
             a.o(str1, "\(this as java.lang.String\).toLowerCase\(locale\)");
             if (!(a.g(str1, str) ^ 1)) {
                boolean i3 = 1000;
                File uFile = new File(p0.getFilesDir(), "trace.config");
                if (!uFile.exists()) {
                   uFile.createNewFile();
                }
                Properties properties = new Properties();
                properties.load(new FileInputStream(uFile));
                String str2 = "101_offline_samplingCount";
                String property = properties.getProperty(str2, "0");
                a.o(property, "config.getProperty\(samplingCountKey, \"0\"\)");
                int i4 = Integer.parseInt(property);
                if (i4 <= i3) {
                   l c = l.C;
                   if (c.f()) {
                      b1 = i4;
                      String str3 = str2;
                      Properties properties1 = properties;
                      i3 = c.b(101, this, Integer.valueOf(i), Integer.valueOf(i1), Boolean.valueOf(uBoolean), null, 3, new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss", Locale.US).format(new Date())+'-'+this+'-'+i4+'-'+i1+'-'+uBoolean+'-'+this.p(8), b, new OnlineSystraceManagerImpl$offlineBeginTrace$traceResult$1(1, i2));
                      if (i3) {
                         obj = properties1;
                         obj.setProperty(str3, String.valueOf((b1 + 1)));
                         obj.store(new FileWriter(uFile), "");
                      }
                      b2 = i3;
                   }
                }
             }
          label_0136 :
             b2 = false;
          }
       }else {
          goto label_0032 ;
       }
       return Boolean.valueOf(b2);
    }
    public void l(OnlineSystraceManager$OnlineSystraceConfigModel p0){
       String str = "samplingCount";
       String str1 = "scene";
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "9")) {
          return;
       }
       a.p(p0, "model");
       Context b = e0.b;
       a.o(b, "GlobalConfig.CONTEXT");
       File uFile = new File(b.getFilesDir(), "os.config");
       if (!uFile.exists()) {
          uFile.createNewFile();
       }
       Properties properties = new Properties();
       properties.load(new FileInputStream(uFile));
       properties.setProperty(str1, p0.mScene);
       properties.setProperty("type", String.valueOf(p0.mType.longValue()));
       properties.setProperty("version", p0.mVersion);
       properties.setProperty("samplingRate", String.valueOf(p0.samplingRate.longValue()));
       properties.setProperty("frequency", String.valueOf(p0.mFreqency.longValue()));
       properties.setProperty("timeLimit", String.valueOf(p0.mTimeLimit.longValue()));
       properties.setProperty("samplingCountLimit", String.valueOf(p0.mSamplingCountLimit.longValue()));
       properties.setProperty("beginTime", String.valueOf(p0.mBeginTime.longValue()));
       properties.setProperty("endTime", String.valueOf(p0.mEndTime.longValue()));
       properties.setProperty("samplingThreadPolicy", String.valueOf(p0.mSamplingThreadPolicy.longValue()));
       properties.setProperty("params", p0.mParams);
       properties.setProperty("isAutoUpload", String.valueOf(p0.mIsAutoUpload.booleanValue()));
       properties.setProperty("source", "kswitch");
       properties.setProperty("useFastUnwind", String.valueOf(p0.mUseFastUnwind.booleanValue()));
       if (properties.getProperty(str) == null || (a.g(p0.mScene, properties.getProperty(str1)) ^ 0x01)) {
          properties.setProperty(str, "0");
       }
       StringBuilder str2 = "write string:"+properties;
       properties.store(new FileWriter(uFile), "");
       return;
    }
    public Boolean m(){
       Object obj = PatchProxy.apply(null, this, k.class, "18");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): l.C.c(101);
       return Boolean.valueOf(b);
    }
    public OnlineSystraceManager$OnlineSystraceConfigModel n(){
       Context obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          obj = e0.b;
          a.o(obj, "GlobalConfig.CONTEXT");
          this.b = this.o(obj);
       }
       return this.b;
    }
    public final OnlineSystraceManager$OnlineSystraceConfigModel o(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       OnlineSystraceManager$KeepPushPerformanceModel keepPushPerf = this.a();
       if (keepPushPerf != null) {
          return keepPushPerf.mFlameGraphMessage;
       }
       OnlineSystraceManager$OnlineSystraceConfigModel value = a.t().getValue("LaunchCfgOnlineSystrace", OnlineSystraceManager$OnlineSystraceConfigModel.class, null);
       if (value != null) {
          a.b.q(value);
          return value;
       }else {
          File uFile = new File(p0.getFilesDir(), "os.config");
          if (!uFile.exists()) {
             return null;
          }
          Properties properties = new Properties();
          properties.load(new FileInputStream(uFile));
          StringBuilder str = "read string:"+properties;
          value = new OnlineSystraceManager$OnlineSystraceConfigModel();
          value.mScene = properties.getProperty("scene");
          String property = properties.getProperty("type");
          a.o(property, "config.getProperty\(\"type\"\)");
          value.mType = Long.valueOf(Long.parseLong(property));
          value.mVersion = properties.getProperty("version");
          property = properties.getProperty("samplingRate");
          a.o(property, "config.getProperty\(\"samplingRate\"\)");
          value.samplingRate = Long.valueOf(Long.parseLong(property));
          property = properties.getProperty("frequency");
          a.o(property, "config.getProperty\(\"frequency\"\)");
          value.mFreqency = Long.valueOf(Long.parseLong(property));
          property = properties.getProperty("timeLimit");
          a.o(property, "config.getProperty\(\"timeLimit\"\)");
          value.mTimeLimit = Long.valueOf(Long.parseLong(property));
          property = properties.getProperty("samplingCountLimit");
          a.o(property, "config.getProperty\(\"samplingCountLimit\"\)");
          value.mSamplingCountLimit = Long.valueOf(Long.parseLong(property));
          property = properties.getProperty("beginTime");
          a.o(property, "config.getProperty\(\"beginTime\"\)");
          value.mBeginTime = Long.valueOf(Long.parseLong(property));
          property = properties.getProperty("endTime");
          a.o(property, "config.getProperty\(\"endTime\"\)");
          value.mEndTime = Long.valueOf(Long.parseLong(property));
          property = properties.getProperty("samplingThreadPolicy");
          a.o(property, "config.getProperty\(\"samplingThreadPolicy\"\)");
          value.mSamplingThreadPolicy = Long.valueOf(Long.parseLong(property));
          value.mParams = properties.getProperty("params");
          value.mIsAutoUpload = Boolean.valueOf(Boolean.parseBoolean(properties.getProperty("isAutoUpload")));
          value.mSource = 1;
          value.mUseFastUnwind = Boolean.valueOf(Boolean.parseBoolean(properties.getProperty("useFastUnwind")));
          a.b.q(value);
          return value;
       }
    }
    public final String p(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       k ok1 = new k(1, p0);
       ArrayList uArrayList = new ArrayList(u.Y(ok1, 10));
       Iterator iterator = ok1.iterator();
       while (iterator.hasNext()) {
          iterator.b();
          uArrayList.add(Character.valueOf(StringsKt___StringsKt.Q7("ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789", e.b)));
       }
       return CollectionsKt___CollectionsKt.V2(uArrayList, "", null, null, 0, null, null, 62, null);
    }
}
