package pwb.b;
import lg7.l;
import pwb.b$a;
import nsd.u;
import pwb.h;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import lg7.g;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.System;
import f66.f;
import java.lang.Long;
import t87.f;
import u87.d;
import java.lang.Exception;
import java.util.Collection;
import ekd.q;
import java.io.IOException;
import java.io.FileOutputStream;
import zsd.d;
import java.nio.charset.Charset;
import com.google.protobuf.nano.MessageNano;
import java.util.Iterator;
import qk.p;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import java.lang.NullPointerException;
import mwb.a;
import java.lang.StringBuilder;
import qkd.b;
import q87.c;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import s66.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.performance.stability.crash.monitor.util.e;
import f3b.t;
import com.yxcorp.utility.TextUtils;
import o56.d;
import pkd.a;
import java.lang.Boolean;
import oe6.a;
import com.yxcorp.utility.SystemUtil;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import com.kwai.framework.plugin.PluginManager;
import java.util.Objects;
import od6.u;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.log.n;
import k2b.o0;
import java.lang.CharSequence;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import k2b.k2;
import k2b.u1;
import java.util.regex.Pattern;
import n66.g;
import java.util.regex.Matcher;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.util.HashMap;
import java.util.Map;
import com.kwai.framework.exceptionhandler.ExceptionClues;
import java.util.List;
import java.lang.OutOfMemoryError;
import s66.b;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.StackTraceElement;
import vg7.d;
import com.kwai.framework.exceptionhandler.exception.RejectedExecutionWrapperException;
import com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler;
import com.yxcorp.gifshow.log.h;
import k2b.b;
import k2b.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.log.b;

public final class b implements l	// class@002207
{
    public h a;
    public static final b$a b;

    static {
       b.b = new b$a(null);
    }
    public void b(){
       super(null);
    }
    public void b(h p0){
       super();
       this.a = p0;
    }
    public File a(ExceptionMessage p0,g p1){
       g b;
       File uFile;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "message");
       a.p(p1, "config");
       try{
          obj = 0;
          ExceptionMessage mCurrentTime = p0.mCurrentTimeStamp;
          long l = 0;
          if (mCurrentTime - l > 0) {
          label_0027 :
             ExceptionMessage mLaunchTimeS = p0.mLaunchTimeStamp;
             if (mLaunchTimeS - l <= 0) {
                mLaunchTimeS = mCurrentTime - p1.b;
             }
             b = p1.b;
             if ((mCurrentTime - mLaunchTimeS) - b > 0) {
                mLaunchTimeS = mCurrentTime - b;
             }
             f uof = f.class;
             if (PatchProxy.isSupport(uof)) {
                uFile = PatchProxy.applyTwoRefs(Long.valueOf(mLaunchTimeS), Long.valueOf(mCurrentTime), obj, uof, "3");
                if (uFile != PatchProxyResult.class) {
                label_0056 :
                   obj = uFile;
                }
             }
             uFile = d.c(mLaunchTimeS, mCurrentTime);
             if (uFile == null || (uFile.exists() && uFile.isDirectory())) {
                f.a = uFile;
                uFile = f.b(uFile);
                goto label_0056 ;
             }
          }else {
             mCurrentTime = System.currentTimeMillis();
             goto label_0027 ;
          }
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
       }
       return obj;
    }
    public void b(File p0){
       h a;
       h b;
       FileOutputStream uFileOutputS;
       Charset a1;
       byte[] bytes;
       String str1;
       String str2;
       byte[] bytes1;
       int i;
       byte[] bytes2;
       Iterator iterator;
       String str3;
       Charset a2;
       Object[] objArray;
       String str = "\(this as java.lang.String\).getBytes\(charset\)";
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "outputFile");
       b ta = this.a;
       if (ta != null) {
          a = ta.a;
          if (a != null && ta != null) {
             b = ta.b;
             if (b != null) {
                if (q.f(a)) {
                   return;
                }else if(p0.exists()){
                   p0.delete();
                }
                p0.createNewFile();
             }
          }
       }
    }
    public void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "log");
       Object[] objArray = new Object[0];
       a.C().s(p0, p1, objArray);
       return;
    }
    public ExceptionMessage d(Throwable p0,ExceptionMessage p1){
       k2 obj1;
       Matcher matcher;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p1, "message");
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "7")) {
          try{
             e.y(p0, p1, a.b());
             e.z(p1, a.b(), TextUtils.k(t.a(a.b())));
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "8")) {
                long l = p1.mCurrentTimeStamp - d.h;
                if (l - null <= 0) {
                   l = -1;
                }
                p1.mUsageTimeMills = l;
                Boolean tRUE = (a.f)? Boolean.TRUE: Boolean.FALSE;
                p1.mBuglyEnabled = tRUE.toString();
                tRUE = (d.a)? Boolean.TRUE: Boolean.FALSE;
                p1.mLaunched = tRUE.toString();
                p1.mAppVersionBeforeLastUpload = a.b();
                p1.mLastAppUploadTime = a.r();
                if (SystemUtil.L(a.b())) {
                   p1.mPlayerCount = KsMediaPlayerInitConfig.getPlayerAliveCnt();
                }
                PluginManager h = PluginManager.H;
                Objects.requireNonNull(h);
                String str = PatchProxy.apply(null, h, PluginManager.class, "37");
                String str1 = "";
                if (str != patchProxyRe) {
                }else {
                   str = a.a.q(h.A());
                   a.o(str, "Gsons.KWAI_GSON.toJson\(pluginInfo\)");
                }
                p1.mPluginInfo = str;
                o0 l1 = n.L;
                if (l1 != null) {
                   p1.mRobustInfo = l1.o1();
                }
                String str2 = (("UNKNOWN").equals(a.n))? a.s(): a.n;
                str2 = (!TextUtils.n(a.m, str2))? Boolean.TRUE.toString(): Boolean.FALSE.toString();
                p1.mFirstLaunch = str2;
                p1.mLaunchSessionId = b.a(-1343064608).I();
                HashMap hashMap = 1;
                if (!PatchProxy.applyVoidOneRefs(p1, null, a.class, "11")) {
                   Activity uActivity = ActivityContext.g().e();
                   if (uActivity != null) {
                      p1.mCurrentActivity = uActivity.getLocalClassName();
                      obj1 = u1.j();
                      if (obj1 != null) {
                         p1.mPage = obj1.d;
                         p1.mScene = obj1.e;
                         if (!PatchProxy.applyVoidTwoRefs(p1, obj1, null, a.class, "12")) {
                            obj1 = obj1.c;
                            if (obj1 != 0x75d8 && (obj1 == 0x75d9 || obj1 == 7)) {
                               ClientEvent$UrlPackage urlPackage = u1.k();
                               if (urlPackage != null) {
                                  matcher = g.a("&photo_id=\(.*\)&photo_type").matcher(urlPackage.params);
                                  if (matcher.find()) {
                                     p1.mPhotoId = matcher.group(hashMap);
                                  }
                               }
                            }else if(13 == obj1){
                               matcher = g.a("author_id=\(.*\)&live_streamid=\(.*\)&exptag").matcher(u1.j().l());
                               if (matcher.lookingAt()) {
                                  p1.mLiveAuthorId = matcher.group(hashMap);
                                  p1.mLiveStreamId = matcher.group(2);
                               }
                            }
                         }
                      }
                   }
                   if (ActivityContext.g().h()) {
                      p1.mIsAppOnForeground = "Foreground";
                   }else {
                      p1.mIsAppOnForeground = "Background";
                      if (uActivity == null) {
                         p1.mCurrentActivity = "App in background";
                      }
                   }
                }
                str2 = "oom_adj";
                if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "9")) {
                   obj1 = e.p().get("web_url");
                   if (obj1 != null) {
                      str1 = obj1.toString();
                   }
                   p1.mWebUrl = str1;
                   p1.mExceptionClues = a.a.q(ExceptionClues.c.a());
                   int i = 0;
                   if (p0 instanceof OutOfMemoryError) {
                      b.g();
                   }else if(p0 instanceof ArrayIndexOutOfBoundsException && (p0.getStackTrace()[i].toString()).startsWith("android.util.ArrayMap.valueAt")){
                      try{
                         e.v(str2, b.f0(new File("/proc/self/oom_adj")));
                      }catch(java.lang.Exception e4){
                         e.v(str2, e4.toString());
                      }
                   }else {
                      hashMap = null;
                   }
                }
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             p1.mErrorMessage = p1.mErrorMessage+e0;
          }
       label_0222 :
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "10") && p0 instanceof RejectedExecutionWrapperException) {
             p1.mThreadPoolQueueInfo = p0.dumpBlockingQueueInfo();
          }
       }
    label_0237 :
       return p1;
    }
    public void e(File p0){
       Iterator iterator;
       Charset a;
       Throwable throwable;
       String str = "\(this as java.lang.String\).getBytes\(charset\)";
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "outputFile");
       List list = LifecycleCallbacksHandler.b();
       try{
          if (p0.exists()) {
             p0.delete();
          }
          p0.createNewFile();
       }catch(java.io.IOException e2){
          e2.printStackTrace();
       }
       FileOutputStream uFileOutputS = new FileOutputStream(p0);
       byte[] bytes = ("RecentLifeCycleLogs: \n").getBytes(d.a);
       a.o(bytes, str);
       uFileOutputS.write(bytes);
       int i = 10;
       if (!q.f(list)) {
          iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                String str1 = iterator.next();
                a = d.a;
                if (str1 != null) {
                   bytes = str1.getBytes(a);
                   a.o(bytes, str);
                   uFileOutputS.write(bytes);
                }else {
                   break ;
                }
             }else {
                uFileOutputS.write(i);
                uFileOutputS.write(i);
             }
          }
          throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
       }
       byte[] bytes1 = ("ActivityRecord: \n").getBytes(d.a);
       a.o(bytes1, str);
       uFileOutputS.write(bytes1);
       b obj = b.a(0x4b316083);
       a.o(obj, "Singleton.get<ILogManage¡­\(ILogManager::class.java\)");
       obj = obj.l0();
       list = (obj != null)? obj.e(): null;
       if (list == null) {
          list = CollectionsKt__CollectionsKt.E();
       }
       iterator = list.iterator();
       while (iterator.hasNext()) {
          byte[] bytes2 = (String.valueOf(iterator.next())).getBytes(d.a);
          a.o(bytes2, str);
          uFileOutputS.write(bytes2);
          uFileOutputS.write(i);
       }
       Object[] objArray = new Object[0];
       a.C().t("ActivityEvent", "------  Life Cycle Begin ------\n"+b.f0(p0), objArray);
       b.a(uFileOutputS, null);
       return;
    }
}
