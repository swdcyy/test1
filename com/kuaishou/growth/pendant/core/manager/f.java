package com.kuaishou.growth.pendant.core.manager.f;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ce0.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.growth.pendant.core.manager.a;
import com.kuaishou.growth.pendant.core.manager.b;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.System;
import brd.t;
import com.kuaishou.growth.pendant.core.manager.c;
import com.kuaishou.growth.pendant.core.manager.f$b;
import com.kuaishou.growth.pendant.core.manager.f$c;
import erd.o;
import t45.d;
import brd.z;
import ee0.b;
import ee0.c;
import erd.g;
import crd.b;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import ee0.e;
import java.io.FileFilter;
import com.kuaishou.growth.pendant.core.manager.e;
import java.util.Comparator;
import java.util.Arrays;
import java.lang.Integer;
import com.yxcorp.download.DownloadManager;
import java.util.Objects;
import com.kuaishou.growth.pendant.core.manager.f$a;
import com.google.gson.JsonArray;
import wkd.b;
import j80.c;
import java.util.List;
import java.util.Collections;
import ekd.q;
import java.util.ArrayList;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.yxcorp.gifshow.util.v;
import te6.b;

public final class f	// class@00064e
{
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
       f.a = new ConcurrentHashMap();
       f.b = new ConcurrentHashMap();
       f.c = new ConcurrentHashMap();
    }
    public void f(){
       super();
    }
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "AnimationResourceManager";
       b.C().w(str, "fetchResourceV2", objArray);
       if (TextUtils.x(p0)) {
          Object[] objArray1 = new Object[i];
          b.C().w(str, "fetchResourceV2, resourceUrl is empty", objArray1);
          return;
       }else {
          a a = a.a;
          b a1 = b.a;
          if (!PatchProxy.applyVoidFourRefs(p0, a, p1, a1, null, f.class, "2")) {
             if (!TextUtils.x(p0)) {
                Map a2 = f.a;
                if (a2.get(p0) == null) {
                   Object[] objArray3 = new Object[i];
                   b.C().w(str, "fetchResource call with : "+p0, objArray3);
                   a2.put(p0, Boolean.TRUE);
                   long l = System.currentTimeMillis();
                   t.just(p0).flatMap(new c(a, a1)).subscribeOn(d.c).observeOn(d.a).subscribe(new b(p0, p1, l), new c(p0, p1, l));
                }
             }
             Object[] objArray2 = new Object[i];
             b.C().w(str, "fetchResourceInternal,resourceUrl is empty:"+TextUtils.x(p0)+", result = "+f.a.get(p0), objArray2);
          }
          return;
       }
    }
    public static File[] b(File p0,String p1,String p2){
       Object[] objArray;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.exists() || !p0.isDirectory()) {
          if (!PatchProxy.applyVoidOneRefs(p2, null, f.class, "3")) {
             Integer integer = f.b.get(p2);
             if (f.a.get(p2) != null && integer != null) {
                integer.intValue();
                Objects.requireNonNull(DownloadManager.n());
                DownloadManager.n().F(integer.intValue());
             }
          }
          objArray = new Object[0];
          b.C().w("AnimationResourceManager", "FloatWidget1 prepared loadAnimBitmaps process by dstFile not exists or request not complete", objArray);
          return null;
       }else {
          File[] uFileArray = p0.listFiles(new e(p1));
          if (uFileArray == null) {
             objArray = new Object[0];
             b.C().w("AnimationResourceManager", "filterFilesFromDstFile, files is null", objArray);
             return null;
          }else {
             Arrays.sort(uFileArray, e.b);
             return uFileArray;
          }
       }
    }
    public static f$a c(String p0,String p1){
       File uFile;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, f.class, "8");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       String str = "none";
       if (TextUtils.x(p0)) {
          return new f$a(new JsonArray(), str);
       }
       obj1 = f.e(p0);
       if (!TextUtils.x(p0)) {
          uFile = f.f(p0);
          str1 = "warmUp";
       }else {
          str1 = str;
          uFile = obj;
       }
       if (uFile == null || !uFile.exists()) {
          uFile = new File(b.a(-1504323719).j("pendant_resource"), obj1);
          str1 = "mine";
       }
       Object obj2 = PatchProxy.applyThreeRefs(uFile, p1, p0, null, f.class, "12");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else {
          File[] uFileArray = f.b(uFile, p1, p0);
          int i = 0;
          if (uFileArray == null) {
             Object[] objArray = new Object[i];
             b.C().w("AnimationResourceManager", "findBitmapPathsFromFile, files is null", objArray);
          }else {
             obj = new JsonArray();
             int len = uFileArray.length;
             for (; i < len; i++) {
                obj.a0("file://"+uFileArray[i].getAbsolutePath());
             }
          }
       }
       if (obj == null) {
          obj = new JsonArray();
       }
       return new f$a(obj, str1);
    }
    public static f$a d(String p0,String p1,int p2,int p3){
       String obj;
       Object[] objArray1;
       File uFile;
       String str3;
       Object[] objArray3;
       String str = p0;
       String str1 = p1;
       int i = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, f.class, "10");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i1 = 0;
       Object[] objArray = new Object[i1];
       b.C().w("AnimationResourceManager", "findBitmapsV2, url = "+str+", key = "+str1, objArray);
       String str2 = "none";
       if (TextUtils.x(p0)) {
          objArray1 = new Object[i1];
          b.C().w("AnimationResourceManager", "findBitmapsV2, resourceUrl is empty", objArray1);
          return new f$a(Collections.emptyList(), str2);
       }else {
          obj = f.e(p0);
          Map c = f.c;
          if (c.containsKey(obj+str1)) {
             objArray1 = new Object[i1];
             b.C().w("AnimationResourceManager", "findBitmapsV2, FloatWidget1 prepared loadAnimBitmaps process by memory cache", objArray1);
             return new f$a(q.i(c.get(obj+str1)), "cache");
          }else {
             Object obj1 = null;
             if (!TextUtils.x(p0)) {
                uFile = f.f(p0);
                str3 = "warmUp";
             }else {
                str3 = str2;
                uFile = obj1;
             }
             if (uFile == null || !uFile.exists()) {
                objArray = new Object[i1];
                b.C().w("AnimationResourceManager", "findBitmapsV2, warm file is not valid", objArray);
                str3 = "mine";
                uFile = new File(b.a(-1504323719).j("pendant_resource"), obj);
             }
             if (PatchProxy.isSupport(uof)) {
                Object[] objArray2 = new Object[]{uFile,str1,Integer.valueOf(p2),Integer.valueOf(p3),obj,str};
                Object obj2 = PatchProxy.apply(objArray2, obj1, uof, "13");
                if (obj2 != patchProxyRe) {
                   obj1 = obj2;
                }else {
                label_0120 :
                   File[] uFileArray = f.b(uFile, str1, str);
                   if (uFileArray == null) {
                      objArray3 = new Object[i1];
                      b.C().w("AnimationResourceManager", "findBitmapsFromFile, files is null", objArray3);
                   }else {
                      ArrayList uArrayList = new ArrayList();
                      BitmapFactory$Options options = new BitmapFactory$Options();
                      if (i > 0) {
                         options.outWidth = i;
                      }
                      if (i > 0) {
                         options.outHeight = p3;
                      }
                      i = uFileArray.length;
                      int i2 = 0;
                      while (i2 < i) {
                         Bitmap uBitmap = BitmapFactory.decodeFile(uFileArray[i2].getPath(), options);
                         if (uBitmap != null) {
                            uArrayList.add(uBitmap);
                         }
                         i2 = i2 + 1;
                      }
                      if (uArrayList.size() == uFileArray.length && uArrayList.size() > 0) {
                         f.c.put(obj+str1, uArrayList);
                         objArray3 = new Object[i1];
                         b.C().w("AnimationResourceManager", "FloatWidget1 prepared loadAnimBitmaps process by load bitmap", objArray3);
                         obj1 = uArrayList;
                      }else {
                         objArray3 = new Object[i1];
                         b.C().w("AnimationResourceManager", "FloatWidget1 prepared loadAnimBitmaps process return last null", objArray3);
                      }
                   }
                }
             }else {
                goto label_0120 ;
             }
             return new f$a(q.i(obj1), str3);
          }
       }
    }
    public static String e(String p0){
       Uri obj = PatchProxy.applyOneRefs(p0, null, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Uri.parse(p0);
       if (!TextUtils.x(obj.getPath())) {
          return v.h(obj.getPath());
       }
       return v.h(p0);
    }
    public static File f(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, f.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = b.a(-1427269270).B(p0);
       if (!TextUtils.x(p0)) {
          obj = new File(p0);
          if (obj.exists()) {
             return obj;
          }
       }
       return null;
    }
}
