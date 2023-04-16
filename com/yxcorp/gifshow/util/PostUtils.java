package com.yxcorp.gifshow.util.PostUtils;
import java.lang.String;
import o56.c;
import o56.a;
import ekd.k1;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.io.File;
import lnc.p3;
import java.lang.StringBuilder;
import java.lang.Object;
import w46.b;
import java.lang.System;
import lnc.l7;
import java.lang.Runnable;
import t45.c;
import q87.c;
import qkd.b;
import java.lang.reflect.Type;
import java.io.FileReader;
import fg6.a;
import java.io.Reader;
import com.google.gson.Gson;
import b16.a;
import com.yxcorp.gifshow.util.n0;
import com.yxcorp.gifshow.util.PostUtils$PostReportException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.FileWriter;
import java.lang.Appendable;
import java.lang.Boolean;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import erd.g;
import com.yxcorp.gifshow.util.PostUtils$a;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import java.io.InputStream;
import java.io.FileInputStream;
import ekd.p;
import com.kuaishou.android.model.music.Music;
import kotlin.Pair;
import com.kuaishou.android.model.music.Music$MusicAnalysisResult;
import com.kuaishou.android.model.music.Music$MusicBeats;
import com.yxcorp.gifshow.model.CDNUrl;
import wkd.b;
import j80.c;
import android.os.Build$VERSION;
import android.os.Environment;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.net.Uri;
import android.provider.MediaStore$Files;
import oh7.d;
import oh7.c;
import java.io.FileNotFoundException;
import android.os.StatFs;
import com.yxcorp.download.f;
import com.kuaishou.android.model.music.Music$MusicBeatsInfo;
import qkd.c;
import org.json.JSONObject;
import k2b.u1;
import java.lang.IllegalArgumentException;
import com.kwai.framework.model.user.QCurrentUser;
import java.io.IOException;
import com.kwai.middleware.resourcemanager.download.exception.DownloadTaskException;
import java.util.concurrent.TimeoutException;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import lnc.s6;
import com.yxcorp.retrofit.model.RetrofitException;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.middleware.azeroth.network.AzerothApiException;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.lang.Class;
import lnc.x6;
import lnc.y6;

public final class PostUtils	// class@001f23
{
    public static int a;

    public static void A(String p0){
       if (a.a().c() && !k1.g()) {
          PostUtils.D("PostUtils", "mustRunOnUIThread\(\) ", new IllegalStateException(p0));
       }
       return;
    }
    public static void B(File p0){
       Object[] objArray;
       int i = 0;
       if (!p0.isDirectory()) {
          objArray = new Object[i];
          p3.D().t("PostUtils", "quickDeleteDir\(\) wrong arg dir="+p0, objArray);
          return;
       }else {
          File uFile = new File(p0.getParent(), p0.getName()+"_"+System.currentTimeMillis());
          if (p0.renameTo(uFile)) {
             c.a(new l7(uFile, p0));
          }else {
             p3 op3 = p3.D();
             String str = "quickDeleteDir\(\) rename failed directly delete "+p0;
             objArray = new Object[i];
             try{
                op3.w("PostUtils", str, objArray);
                b.p(uFile);
             }catch(java.io.IOException e0){
                p3.D().e("PostUtils", "quickDeleteDir "+p0, e0);
             }
          }
       }
    }
    public static Object C(File p0,Type p1){
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("PostUtils", "readObjFromJsonFile\(\)"+p0, objArray);
       if (!p0.isFile()) {
          Object[] objArray1 = new Object[i];
          p3.D().w("PostUtils", "readObjFromJsonFile\(\) is not exist "+p0, objArray1);
          return null;
       }else {
          try{
             FileReader uFileReader = new FileReader(p0);
             uFileReader.close();
             return a.a.g(uFileReader, p1);
          }catch(java.io.FileNotFoundException e6){
             p3.D().z(v4, "readObjFromJsonFile\(\) not found "+p0, e6);
          }catch(com.google.gson.JsonParseException e6){
             p3.D().z(v4, "readObjFromJsonFile\(\) parse json failed "+p0, e6);
          }catch(java.io.IOException e6){
             p3.D().z(v4, "readObjFromJsonFile\(\) open failed "+p0, e6);
          }
          return v1;
       }
    }
    public static void D(String p0,String p1,Throwable p2){
       PostUtils.E(p0, p1, p2, false);
    }
    public static void E(String p0,String p1,Throwable p2,boolean p3){
       Object[] objArray;
       Object[] objArray1;
       p3.D().e(p0, "PostUtils:"+p1, p2);
       String str = "ignore exception ";
       if (PostUtils.t(p2)) {
          objArray = new Object[0];
          p3.D().w(p0, str+p2, objArray);
          return;
       }else {
          Throwable cause = p2.getCause();
          if (cause != null && PostUtils.t(cause)) {
             objArray = new Object[0];
             p3.D().w(p0, str+cause, objArray);
             return;
          }else if(a.a == null && a.d()){
             k1.o(new n0(p0, p1, p2));
             objArray1 = new Object[0];
             p3.D().w(p0, "report exception to keep", objArray1);
             ExceptionHandler.handleCaughtException(new PostUtils$PostReportException(p1, p2));
             return;
          }else {
             boolean b = a.t().d("post_report_exception_proportion", 0);
             Object[] objArray2 = new Object[0];
             p3.D().w("PostUtils", "isSwitchReportOn = "+b, objArray2);
             if (!b && (p3 || SystemUtil.J())) {
                objArray1 = new Object[0];
                p3.D().w(p0, "report exception to keep", objArray1);
                ExceptionHandler.handleCaughtException(new PostUtils$PostReportException(p1, p2));
             }
             return;
          }
       }
    }
    public static void F(String p0,String p1){
       PostUtils.D(p0, p1, new IllegalStateException(p1));
    }
    public static String G(String p0){
       Object[] objArray;
       if (TextUtils.x(p0)) {
          return null;
       }
       int i = p0.lastIndexOf(47);
       int i1 = 0;
       if (i < 0) {
          objArray = new Object[i1];
          p3.D().t("PostUtils", "invalid url: "+p0, objArray);
          return null;
       }else {
          i = i + 1;
          if (i < p0.length()) {
             return p0.substring(i);
          }
          objArray = new Object[i1];
          p3.D().t("PostUtils", "url has no resource: "+p0, objArray);
          return null;
       }
    }
    public static boolean H(File p0,Object p1){
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("PostUtils", "writeObjWithJson\(\)"+p0, objArray);
       String parent = p0.getParent();
       String str = String.valueOf(System.currentTimeMillis());
       try{
          File uFile = new File(parent, str);
          FileWriter uFileWriter = new FileWriter(uFile.getAbsolutePath());
          a.a.u(p1, uFileWriter);
          uFileWriter.close();
          if (p0.isFile() && !p0.delete()) {
             Object[] objArray1 = new Object[i];
             p3.D().t("PostUtils", "writeObjWithJson\(\) failed to delete "+p0, objArray1);
          }
          return uFile.renameTo(p0);
       }catch(java.io.IOException e8){
       }catch(com.google.gson.JsonParseException e8){
       }
       p3.D().e("PostUtils", "writeObjWithJson\(\) failed "+p0, e8);
       return i;
    }
    public static boolean I(File p0,String p1){
       String parent;
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("PostUtils", "writeStringToFile\(\)"+p0, objArray);
       File parentFile = p0.getParentFile();
       if (!p0.exists() && (parentFile != null && !parentFile.exists())) {
          objArray = new Object[i];
          p3.D().t("PostUtils", "writeStringToFile\(\) failed create parent ok="+p0.getParentFile().mkdirs(), objArray);
       }
    label_0051 :
       parent = p0.getParent();
       String str = String.valueOf(System.currentTimeMillis());
       try{
          parentFile = new File(parent, str);
          FileWriter uFileWriter = new FileWriter(parentFile.getAbsolutePath());
          uFileWriter.write(p1);
          uFileWriter.close();
          if (p0.isFile() && !p0.delete()) {
             Object[] objArray1 = new Object[i];
             p3.D().t("PostUtils", "writeStringToFile\(\) failed to delete "+p0, objArray1);
          }
          return parentFile.renameTo(p0);
       }catch(java.io.IOException e8){
       }catch(com.google.gson.JsonParseException e8){
       }
       p3.D().e("PostUtils", "writeStringToFile\(\) failed "+p0, e8);
       return i;
    }
    public static Boolean a(String p0,String p1){
       Object[] objArray1;
       long l = System.currentTimeMillis();
       Object[] objArray = new Object[0];
       p3.D().w("PostUtils", "checkImageFileValid msgTag:"+p1+",imageFilePath:"+p0, objArray);
       Boolean uBoolean = null;
       if (TextUtils.x(p0)) {
          return uBoolean;
       }
       if (!p0.endsWith(".jpg") && (!p0.endsWith(".png") && (!p0.endsWith(".webp") && !p0.endsWith(".gif")))) {
          return uBoolean;
       }
       File uFile = new File(p0);
       if (!uFile.exists()) {
          objArray1 = new Object[0];
          p3.D().w("PostUtils", "checkImageFileValid file not exist. msgTag:"+p1+",cost:"+k1.t(l), objArray1);
          return Boolean.FALSE;
       }else if(uFile.length() <= 0){
          objArray1 = new Object[0];
          p3.D().w("PostUtils", "checkImageFileValid file length is 0. msgTag:"+p1+",cost:"+k1.t(l), objArray1);
          return Boolean.FALSE;
       }else {
          try{
             b0 uob0 = BitmapUtil.E(p0);
             boolean b = (uob0.a > null && uob0.b > null)? true: false;
             Object[] objArray2 = new Object[0];
             p3.D().w("PostUtils", "checkImageFileValid msgTag:"+p1+",dimension:"+uob0+",result:"+b+",cost:"+k1.t(l), objArray2);
             return Boolean.valueOf(b);
          }catch(java.lang.Exception e0){
             return uBoolean;
          }
       }
    }
    public static void b(File p0,g p1){
       Void[] voidArray = new Void[0];
       new PostUtils$a(p0, p1).c(voidArray);
    }
    public static void c(File p0,File p1){
       Object[] objArray;
       boolean b = false;
       if (a.t().d("copyFileUseFileUtils", b)) {
          p3 op3 = p3.D();
          objArray = new Object[b];
          try{
             op3.w("PostUtils", "copyFileUseFileUtils switch is open", objArray);
             b.g(p0, p1);
          }catch(java.io.IOException e0){
             p3.D().e("PostUtils", "copyFile error, will use copyWithIOApi "+"save src: "+p0+" tmpDst: "+p1+"space left: "+PostUtils.j(p1.getParent())+" MB", e0);
             PostUtils.d(p0, p1);
          }
       }else {
          objArray = new Object[b];
          p3.D().w("PostUtils", "copyFileUseFileUtils switch is close", objArray);
          PostUtils.d(p0, p1);
       }
    }
    public static void d(File p0,File p1){
       Object[] objArray = new Object[0];
       p3.D().w("PostUtils", "use IO API copyInputStreamToFile", objArray);
       InputStream inputStream = PostUtils.i(p0);
       if (inputStream == null) {
          inputStream = new FileInputStream(p0);
       }
       b.k(inputStream, p1);
       p.c(inputStream);
       return;
    }
    public static Pair e(Music p0){
       Object[] objArray1;
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("PostUtils", "getBeatsUrl, id="+p0.getId(), objArray);
       if (!TextUtils.x(p0.mMusicBeatsUrl) && !TextUtils.x(p0.mMusicDownbeatsUrl)) {
          return new Pair(p0.mMusicBeatsUrl, p0.mMusicDownbeatsUrl);
       }
       p0 = p0.mAnalysisResult;
       Pair pair = null;
       if (p0 != null) {
          Music$MusicAnalysisResult mMusicBeats = p0.mMusicBeats;
          if (mMusicBeats != null) {
             if (mMusicBeats.length <= 0) {
                objArray1 = new Object[i];
                p3.D().A("PostUtils", "getBeatsUrl, musicBeats is empty", objArray1);
                return pair;
             }else {
                int len = mMusicBeats.length;
                Pair pair1 = pair;
                Pair pair2 = pair1;
                int i1 = 0;
                while (i1 < len) {
                   object oobject = mMusicBeats[i1];
                   if (("main").equals(oobject.mAlgorithm)) {
                      pair1 = oobject;
                   }else if(("downbeats").equals(oobject.mAlgorithm)){
                      pair2 = oobject;
                   }
                   i1 = i1 + 1;
                }
                if (pair1 == null || pair2 == null) {
                   Object[] objArray2 = new Object[i];
                   p3.D().A("PostUtils", "getBeatsUrl, beats:"+pair1+", downbeats:"+pair2, objArray2);
                   return pair;
                }else {
                   Music$MusicBeats mBeatsUrls = pair1.mBeatsUrls;
                   Music$MusicBeats mBeatsUrls1 = pair2.mBeatsUrls;
                   if (mBeatsUrls == null || mBeatsUrls.length <= 0) {
                      objArray1 = new Object[i];
                      p3.D().A("PostUtils", "getBeatsUrl, beatsUrls is null or empty", objArray1);
                      return pair;
                   }else if(mBeatsUrls1 == null || mBeatsUrls1.length <= 0){
                      objArray1 = new Object[i];
                      p3.D().A("PostUtils", "getMusicBeatsCacheFile, downbeatsUrls is null or empty", objArray1);
                      return pair;
                   }else {
                      return new Pair(mBeatsUrls[i].mUrl, mBeatsUrls1[i].mUrl);
                   }
                }
             }
          }
       }
       objArray1 = new Object[i];
       p3.D().A("PostUtils", "getBeatsUrl, analysisResult or musicBeats is null", objArray1);
       return pair;
    }
    public static File f(){
       return b.a(-1504323719).i(".post_cache_dir", true);
    }
    public static File g(String p0){
       PostUtils.z(p0);
       return b.a(-1504323719).i(".post_cache_dir", true);
    }
    public static File h(){
       return PostUtils.g("[>|8|>]");
    }
    public static InputStream i(File p0){
       InputStream inputStream = null;
       try{
          if (Build$VERSION.SDK_INT >= 30 && ((p0.getAbsolutePath()).startsWith(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath()) && !PermissionUtils.a(a.b(), "android.permission.READ_EXTERNAL_STORAGE"))) {
             Uri uri = d.e(MediaStore$Files.getContentUri("external"), p0.getName());
             if (uri != null) {
                inputStream = c.b(uri);
             }
          }else {
             inputStream = new FileInputStream(p0);
          }
       }catch(java.io.FileNotFoundException e4){
          Object[] objArray = new Object[0];
          p3.D().A("PostUtils", "getFileInputStream file not found "+e4.getMessage(), objArray);
       }
       return inputStream;
    }
    public static long j(String p0){
       if (p0 == null) {
          return -1;
       }
       try{
          return ((new StatFs(p0).getAvailableBytes() / 1024) / 1024);
       }catch(java.lang.Exception e6){
          Object[] objArray = new Object[0];
          p3.D().u("PostUtils", e6, objArray);
          return v0;
       }
    }
    public static Pair k(Music p0){
       Object[] objArray = new Object[0];
       p3.D().w("PostUtils", "getMusicBeatsCacheFile, id="+p0.getId(), objArray);
       Pair pair = PostUtils.e(p0);
       Pair pair1 = null;
       if (pair == null) {
          return pair1;
       }
       File uFile = PostUtils.p("music_beats");
       String str = PostUtils.G(pair.getFirst());
       String str1 = PostUtils.G(pair.getSecond());
       if (str == null || str1 == null) {
          return pair1;
       }
       return new Pair(new File(uFile, f.b(str, "")), new File(uFile, f.b(str1, "")));
    }
    public static Music$MusicBeatsInfo l(Music p0){
       Object[] objArray;
       String str = "beats";
       Pair pair = PostUtils.k(p0);
       Music$MusicBeatsInfo musicBeatsIn = null;
       int i = 0;
       if (pair == null) {
          objArray = new Object[i];
          p3.D().t("PostUtils", "getMusicBeatsInfo, file pairs is null", objArray);
          return musicBeatsIn;
       }else {
          File first = pair.getFirst();
          File second = pair.getSecond();
          if (!b.S(first) || !b.S(second)) {
             objArray = new Object[i];
             p3.D().A("PostUtils", "getMusicBeatsInfo, beat files not valid", objArray);
             return musicBeatsIn;
          }else {
             try{
                musicBeatsIn = new Music$MusicBeatsInfo();
                musicBeatsIn.mBeats = new JSONObject(c.j(first)).optString(str);
                musicBeatsIn.mDownbeats = new JSONObject(c.j(second)).optString(str);
             label_005d :
                return musicBeatsIn;
             }catch(java.io.IOException e6){
             }catch(org.json.JSONException e6){
             }
             PostUtils.D("PostUtils", "", e6);
             goto label_005d ;
          }
       }
    }
    public static File m(){
       return b.a(-1504323719).g(".post_cache_dir");
    }
    public static File n(){
       return b.a(-1504323719).i(".record_cache_dir", true);
    }
    public static long o(){
       return (SystemUtil.y() >> 20);
    }
    public static void onEvent(String p0,String p1,Object[] p2){
       p1 = "";
       if (p2 != null) {
          int len = p2.length;
          for (int i = 0; i < len; i = i + 1) {
             p1 = p1+p2[i];
          }
       }
       u1.Y(p0, p1, 2);
       return;
    }
    public static File p(String p0){
       if (TextUtils.x(p0)) {
          throw new IllegalArgumentException("empty arg="+p0);
       }
       File uFile = new File(PostUtils.f(), p0);
       if (!uFile.exists()) {
          boolean b = uFile.mkdirs();
          Object[] objArray = new Object[0];
          p3.D().w("PostUtils", "getSubCacheDir\(\) create sub cache ok="+b+" dir="+uFile, objArray);
          if (!b && !uFile.exists()) {
             PostUtils.D("PostUtils", "getSubCacheDir\(\) create failed dir="+uFile, new IllegalStateException("create dir failed="+p0));
          }
       }
       return uFile;
    }
    public static File q(String p0,String p1){
       PostUtils.z(p0);
       return PostUtils.p(p1);
    }
    public static File r(String p0){
       if (TextUtils.x(p0)) {
          throw new IllegalArgumentException("empty arg="+p0);
       }
       File uFile = new File(PostUtils.m(), p0);
       if (!uFile.exists()) {
          boolean b = uFile.mkdirs();
          Object[] objArray = new Object[0];
          p3.D().w("PostUtils", "getSubPrivateCacheDir\(\) create sub cache ok="+b+" dir="+uFile, objArray);
          if (!b) {
             PostUtils.D("PostUtils", "getSubPrivateCacheDir\(\) create failed dir="+uFile, new IllegalStateException("create dir failed="+p0));
          }
       }
       return uFile;
    }
    public static String s(String p0){
       StringBuilder str = p0+"_";
       p0 = (!QCurrentUser.me().isLogined())? "": QCurrentUser.me().getId();
       return str+p0;
    }
    public static boolean t(Throwable p0){
       boolean b = true;
       if (p0 instanceof IOException) {
          String message = p0.getMessage();
          if (message != null && message.contains("ENOSPC")) {
             return b;
          }
       }
       if (!PostUtils.u(p0) && (!p0 instanceof DownloadTaskException && (!p0 instanceof TimeoutException && !p0 instanceof PluginInstallException))) {
          int i = (s6.B() && (p0 != null && (p0.getMessage() != null && (p0.getMessage()).contains("errorCode=50052"))))? 1: 0;
          if (!i) {
             b = false;
          }
       }
    label_0048 :
       return b;
    }
    public static boolean u(Throwable p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0 instanceof RetrofitException && (p0 instanceof KwaiException || p0 instanceof AzerothApiException)) {
          return true;
       }
       String message = p0.getMessage();
       Object[] objArray = new Object[b];
       p3.D().w("PostUtils", " errMsg="+message, objArray);
       if (!TextUtils.x(message) && (message.contains("NetworkException") || message.contains("Network disconnected"))) {
          b = true;
       }
       return b;
    }
    public static boolean v(){
       String absolutePath = b.a(-1504323719).n().getAbsolutePath();
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("PostUtils", "rootPath : "+absolutePath, objArray);
       long l = PostUtils.j(absolutePath);
       Object[] objArray1 = new Object[i];
       p3.D().w("PostUtils", "left space: "+l, objArray1);
       if (!l - -1) {
          return i;
       }
       if (l - 5 < 0) {
          i = true;
       }
       return i;
    }
    public static boolean w(){
       RecordPostPlugin recordPostPl = y6.r(RecordPostPlugin.class);
       boolean b = (recordPostPl != null && recordPostPl.y7())? true: false;
       return b;
    }
    public static void x(String p0,String p1){
       u1.R(p0, p1, 2);
    }
    public static void y(String p0,String p1){
       u1.Y(p0, p1, 2);
    }
    public static void z(String p0){
       Object[] objArray = new Object[0];
       p3.D().w("PostUtils", "markCodeCover\(\) testTag="+p0, objArray);
    }
}
