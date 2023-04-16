package com.yxcorp.download.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import android.net.Uri;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.IllegalStateException;
import java.lang.Number;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask$DownloadRequest$CacheKeyGenStrategy;
import com.yxcorp.utility.Log;
import com.yxcorp.download.f$a;
import java.lang.Enum;
import java.security.MessageDigest;
import java.lang.Integer;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class f	// class@0011bc
{

    public void f(){
       super();
    }
    public static String a(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.format(Locale.ENGLISH, p0, p1);
    }
    public static String b(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = (TextUtils.isEmpty(p0))? String.valueOf(System.currentTimeMillis()): f.f(p0);
       if (TextUtils.isEmpty(p1)) {
          p1 = PatchProxy.applyOneRefs(p0, null, f.class, "2");
          if (p1 != patchProxyRe) {
          }else if(TextUtils.isEmpty(p0)){
             p0 = "";
          }else {
             p0 = TextUtils.s(Uri.parse(p0).getLastPathSegment());
          }
          p1 = p0;
       }
       if (!TextUtils.isEmpty(p1)) {
          return obj+"."+p1;
       }else {
          return obj;
       }
    }
    public static String c(String p0,String p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          throw new IllegalStateException("can\'t generate real path, the file name is null");
       }
       if (p0 == null) {
          throw new IllegalStateException("can\'t generate real path, the directory is null");
       }
       obj = new Object[]{p0,File.separator,p1};
       return f.a("%s%s%s", obj);
    }
    public static int d(String p0,String p1){
       DownloadTask$DownloadRequest$CacheKeyGenStrategy obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (DownloadManager.s())? DownloadTask$DownloadRequest$CacheKeyGenStrategy.WholeUrl: DownloadTask$DownloadRequest$CacheKeyGenStrategy.UrlPathWithQuery;
       return f.e(p0, p1, obj);
    }
    public static int e(String p0,String p1,DownloadTask$DownloadRequest$CacheKeyGenStrategy p2){
       Object[] objArray;
       Object[] objArray1;
       Uri obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = Uri.parse(p0);
       String path = obj.getPath();
       String query = obj.getQuery();
       if (TextUtils.isEmpty(path)) {
          Log.b("generateId", "[generateId] use whole url to generateId for urlPath empty. url:"+p0);
          objArray = new Object[]{p0,p1};
          return (f.f(f.a("%sp%s", objArray))).hashCode();
       }else {
          Log.b("generateId", "[generateId] use url path to generateId with stratege:"+p2+" url:"+p0);
          int i = f$a.a[p2.ordinal()];
          if (i != 1) {
             if (i != 2) {
                objArray = new Object[]{p0,p1};
                return (f.f(f.a("%sp%s", objArray))).hashCode();
             }else {
                objArray1 = new Object[]{path,query,p1};
                return (f.f(f.a("%s%sp%s", objArray1))).hashCode();
             }
          }else {
             objArray1 = new Object[]{path,p1};
             return (f.f(f.a("%s%s", objArray1))).hashCode();
          }
       }
    }
    public static String f(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          byte[] uobyteArray = MessageDigest.getInstance("MD5").digest(p0.getBytes("UTF-8"));
          obj = new StringBuilder((uobyteArray.length * 2));
          int len = uobyteArray.length;
          for (int i = 0; i < len; i = i + 1) {
             int i1 = uobyteArray[i] & 0x00ff;
             if (i1 < 16) {
                obj = obj+"0";
             }
             obj = obj+Integer.toHexString(i1);
          }
          return obj;
       }catch(java.security.NoSuchAlgorithmException e5){
          throw new RuntimeException("Huh, MD5 should be supported?", e5);
       }catch(java.io.UnsupportedEncodingException e5){
          throw new RuntimeException("Huh, UTF-8 should be supported?", e5);
       }
    }
}
