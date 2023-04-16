package com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager;
import o56.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.File;
import android.app.Application;
import java.lang.Class;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager$isHitExp$2;
import msd.a;
import qrd.p;
import qrd.s;
import wkd.b;
import com.yxcorp.gifshow.w;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedManager$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import fg6.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Exception;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import vqa.k;
import zsd.u;
import vsd.d;
import nsd.m0;
import android.content.SharedPreferences;
import pna.k;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import oe6.a;

public final class PreEmbeddedManager	// class@00147d
{
    public static final String a;
    public static String b;
    public static String c;
    public static final String d;
    public static long e;
    public static final p f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static QPhoto j;
    public static String k;
    public static final PreEmbeddedManager l;

    static {
       PreEmbeddedManager.l = new PreEmbeddedManager();
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       File filesDir = b.getFilesDir();
       a.o(filesDir, "AppEnv.APP.filesDir");
       PreEmbeddedManager.a = filesDir.getAbsolutePath();
       PreEmbeddedManager.b = "";
       PreEmbeddedManager.c = "";
       String simpleName = PreEmbeddedManager.class.getSimpleName();
       PreEmbeddedManager.d = simpleName;
       PreEmbeddedManager.f = s.c(PreEmbeddedManager$isHitExp$2.INSTANCE);
       PreEmbeddedManager.k = "";
       Object obj = b.a(-1343064608);
       a.o(obj, "Singleton.get\(LaunchTracker::class.java\)");
       PreEmbeddedManager.h = obj.P();
       Object[] objArray = new Object[0];
       w.C().w(simpleName, "init: isFirstColdLaunch = "+PreEmbeddedManager.h, objArray);
       ActivityContext.i(new PreEmbeddedManager$a());
    }
    public void PreEmbeddedManager(){
       super();
    }
    public static final String a(PreEmbeddedManager p0){
       return PreEmbeddedManager.a;
    }
    public static synchronized final QPhoto b(){
       QPhoto qPhoto1;
       _monitor_enter(PreEmbeddedManager.class);
       Object[] objArray = null;
       QPhoto obj = PatchProxy.apply(objArray, objArray, PreEmbeddedManager.class, "7");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(PreEmbeddedManager.class);
          return obj;
       }else {
          Object[] objArray1 = new Object[0];
          w.C().w(PreEmbeddedManager.d, "Call getFeed\(\) spend ms = "+(System.currentTimeMillis() - PreEmbeddedManager.e), objArray1);
          obj = PreEmbeddedManager.j;
          if (obj != null) {
             _monitor_exit(PreEmbeddedManager.class);
             return obj;
          }else if(PreEmbeddedManager.l.e()){
             _monitor_exit(PreEmbeddedManager.class);
             return objArray;
          }else {
             try{
                QPhoto qPhoto = new QPhoto(a.a.h(FilesKt__FileReadWriteKt.z(new File(PreEmbeddedManager.b), objArray, 1, objArray), BaseFeed.class));
                CDNUrl uCDNUrl = new CDNUrl();
                uCDNUrl.mUrl = PreEmbeddedManager.c;
                qPhoto.setLocalVideoUrl(uCDNUrl);
                qPhoto.setVideoUrl(PreEmbeddedManager.c);
                qPhoto1 = qPhoto;
             }catch(java.lang.Exception e1){
                Object[] objArray2 = new Object[0];
                w.C().w(PreEmbeddedManager.d, "Generate QPhoto instance failed, msg = "+e1.getMessage(), objArray2);
             }
             PreEmbeddedManager.j = qPhoto1;
             _monitor_exit(PreEmbeddedManager.class);
             return qPhoto1;
          }
       }
    }
    public final long c(){
       return PreEmbeddedManager.e;
    }
    public final String d(){
       return PreEmbeddedManager.d;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, PreEmbeddedManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty(PreEmbeddedManager.b) || TextUtils.isEmpty(PreEmbeddedManager.c))? true: false;
       return b;
    }
    public final boolean f(){
       Object[] objArray1;
       String str1;
       String str2;
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, PreEmbeddedManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = k.b;
       String str = "KEY_PRE_EMBEDDED_VIDEO_SKIP_COLD_LAUNCH";
       Boolean fALSE = Boolean.FALSE;
       if (!u.S1(str)) {
          try{
             d uod = m0.d(fALSE.getClass());
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                fALSE = Boolean.valueOf(obj.a().getBoolean(str, 0));
             }else if(a.g(uod, m0.d(String.class))){
                if (fALSE instanceof String) {
                   objArray = fALSE;
                }
                if (objArray == null) {
                   objArray = "";
                }
                str1 = obj.a().getString(str, objArray);
                w ow = (str1 == null || !str1.length())? 1: null;
                if (!ow) {
                   if (str1 != null) {
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                   }
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                if (fALSE instanceof Integer) {
                   objArray = fALSE;
                }
                str2 = Integer.MIN_VALUE;
                int i = (objArray != null)? objArray.intValue(): Integer.MIN_VALUE;
                int b = obj.a().getInt(str, i);
                if (b != str2) {
                   str1 = Integer.valueOf(b);
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                if (fALSE instanceof Long) {
                   objArray = fALSE;
                }
                String str3 = Long.MIN_VALUE;
                long l = (objArray != null)? objArray.longValue(): str3;
                long longx = obj.a().getLong(str, l);
                if (longx - str3) {
                   str1 = Long.valueOf(longx);
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                if (fALSE instanceof Float) {
                   objArray = fALSE;
                }
                str2 = 1;
                float f = (objArray != null)? objArray.floatValue(): Float.MIN_VALUE;
                float floatx = obj.a().getFloat(str, f);
                if (floatx - str2) {
                   str1 = Float.valueOf(floatx);
                }
             }
             fALSE = str1;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, PreEmbeddedManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = PreEmbeddedManager.f.getValue();
       }
       return obj.booleanValue();
    }
}
