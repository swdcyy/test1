package com.RNFetchBlob.RNFetchBlob;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kwai.robust.PatchProxyResult;
import qe.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.OkHttpClient;
import qe.d;
import okhttp3.OkHttpClient$Builder;
import com.facebook.react.modules.network.e;
import com.facebook.react.bridge.ReactContext;
import okhttp3.CookieJar;
import qe.a;
import okhttp3.JavaNetCookieJar;
import java.net.CookieHandler;
import com.RNFetchBlob.RNFetchBlob$d;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import android.app.Activity;
import java.lang.StringBuilder;
import android.content.ContextWrapper;
import java.io.File;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import com.RNFetchBlob.RNFetchBlob$g;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.Exception;
import com.facebook.react.bridge.ReadableMap;
import android.app.DownloadManager;
import com.RNFetchBlob.b;
import com.facebook.react.bridge.WritableMap;
import java.lang.Long;
import com.facebook.react.bridge.Callback;
import com.RNFetchBlob.RNFetchBlobReq;
import java.util.HashMap;
import java.io.OutputStream;
import com.RNFetchBlob.RNFetchBlob$h;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob$e;
import com.facebook.react.bridge.ReadableArray;
import com.RNFetchBlob.RNFetchBlob$f;
import com.RNFetchBlob.RNFetchBlob$c;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobProgressConfig$ReportType;
import java.lang.CharSequence;
import android.content.res.AssetManager;
import android.content.res.AssetFileDescriptor;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.Boolean;
import l4.h;
import l4.i;
import java.util.Map;
import android.os.Environment;
import android.content.pm.ApplicationInfo;
import l4.b;
import java.lang.Integer;
import android.os.Bundle;
import com.RNFetchBlob.RNFetchBlob$a;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import l4.c;
import android.os.AsyncTask;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import com.RNFetchBlob.RNFetchBlob$i;
import com.RNFetchBlob.RNFetchBlob$b;
import l4.e;
import com.RNFetchBlob.RNFetchBlob$l;
import java.lang.Math;
import com.RNFetchBlob.RNFetchBlob$k;
import com.RNFetchBlob.RNFetchBlob$j;
import java.util.UUID;

public class RNFetchBlob extends ReactContextBaseJavaModule	// class@000d56
{
    public final OkHttpClient mClient;
    public static boolean ActionViewVisible;
    public static LinkedBlockingQueue fsTaskQueue;
    public static ThreadPoolExecutor fsThreadPool;
    public static SparseArray promiseTable;
    public static LinkedBlockingQueue taskQueue;
    public static ThreadPoolExecutor threadPool;

    static {
       RNFetchBlob.taskQueue = new LinkedBlockingQueue();
       TimeUnit timeUnit = TimeUnit.MILLISECONDS;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(5, 10, 5000, timeUnit, RNFetchBlob.taskQueue);
       RNFetchBlob.threadPool = v0;
       RNFetchBlob.fsTaskQueue = new LinkedBlockingQueue();
       threadPoolEx = new ThreadPoolExecutor(2, 10, 5000, timeUnit, RNFetchBlob.taskQueue);
       RNFetchBlob.fsThreadPool = v0;
       RNFetchBlob.ActionViewVisible = false;
       RNFetchBlob.promiseTable = new SparseArray();
    }
    public void RNFetchBlob(ReactApplicationContext p0){
       super(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       OkHttpClient okHttpClient = PatchProxy.apply(objArray, objArray, uoe, "1");
       if (okHttpClient != patchProxyRe) {
       }else if(e.a == null){
          OkHttpClient okHttpClient1 = PatchProxy.apply(objArray, objArray, uoe, "2");
          if (okHttpClient1 != patchProxyRe) {
          }else {
             d b = e.b;
             okHttpClient1 = (b != null)? b.a(): e.b().build();
          }
          e.a = okHttpClient1;
       }
       okHttpClient = e.a;
       this.mClient = okHttpClient;
       okHttpClient.cookieJar().a(new JavaNetCookieJar(new e(p0)));
       p0.addActivityEventListener(new RNFetchBlob$d(this));
       return;
    }
    public void actionViewIntent(String p0,String p1,Promise p2){
       Intent intent;
       try{
          Uri uriForFile = FileProvider.getUriForFile(this.getCurrentActivity(), this.getReactApplicationContext().getPackageName()+".provider", new File(p0));
          if (Build$VERSION.SDK_INT >= 24) {
             intent = new Intent("android.intent.action.VIEW").setDataAndType(uriForFile, p1);
             intent.setFlags(1);
             intent.addFlags(0x10000000);
             if (intent.resolveActivity(this.getCurrentActivity().getPackageManager()) != null) {
                this.getReactApplicationContext().startActivity(intent);
             }
          }else {
             this.getReactApplicationContext().startActivity(new Intent("android.intent.action.VIEW").setDataAndType(Uri.parse("file://"+p0), p1).setFlags(0x10000000));
          }
          RNFetchBlob.ActionViewVisible = true;
          this.getReactApplicationContext().addLifecycleEventListener(new RNFetchBlob$g(this, p2));
       }catch(java.lang.Exception e7){
          p2.reject("EUNSPECIFIED", e7.getLocalizedMessage());
       }
       return;
    }
    public void addCompleteDownload(ReadableMap p0,Promise p1){
       boolean b;
       ReadableMap readableMap = p0;
       Promise promise = p1;
       String str = "showNotification";
       String str1 = "mime";
       String str2 = "description";
       String str3 = "title";
       Object obj = this.getReactApplicationContext().getSystemService("download");
       String str4 = "EINVAL";
       if (readableMap) {
          String str5 = "path";
          if (readableMap.hasKey(str5)) {
             String str6 = b.h(this.getReactApplicationContext(), readableMap.getString(str5));
             if (str6 == null) {
                promise.reject(str4, "RNFetchblob.addCompleteDownload can not resolve URI:"+readableMap.getString(str5));
                return;
             }else {
                try{
                   WritableMap writableMap = b.i(this.getReactApplicationContext(), str6);
                   String str7 = "";
                   str5 = (readableMap.hasKey(str3))? readableMap.getString(str3): str7;
                   if (readableMap.hasKey(str2)) {
                      str7 = readableMap.getString(str2);
                   }
                   String str8 = (readableMap.hasKey(str1))? readableMap.getString(str1): null;
                   long l = Long.valueOf(writableMap.getString("size")).longValue();
                   b = (readableMap.hasKey(str) && readableMap.getBoolean(str))? true: false;
                   obj.addCompletedDownload(str5, str7, true, str8, str6, l, b);
                   promise.resolve(null);
                }catch(java.lang.Exception e0){
                   promise.reject("EUNSPECIFIED", e0.getLocalizedMessage());
                }
                return;
             }
          }
       }
       promise.reject(str4, "RNFetchblob.addCompleteDownload config or path missing.");
       return;
    }
    public void cancelRequest(String p0,Callback p1){
       int i = 2;
       try{
          RNFetchBlobReq.a(this.getReactApplicationContext(), p0);
          Object[] objArray = new Object[i];
          objArray[0] = null;
          objArray[1] = p0;
          p1.invoke(objArray);
       }catch(java.lang.Exception e6){
          Object[] objArray1 = new Object[i];
          objArray1[0] = e6.getLocalizedMessage();
          objArray1[1] = null;
          p1.invoke(objArray1);
       }
       return;
    }
    public void closeStream(String p0,Callback p1){
       int i = 0;
       try{
          b.e.remove(p0);
          b.e.get(p0).d.close();
          Object[] objArray = new Object[i];
          p1.invoke(objArray);
       }catch(java.lang.Exception e4){
          Object[] objArray1 = new Object[1];
          objArray1[i] = e4.getLocalizedMessage();
          p1.invoke(objArray1);
       }
       return;
    }
    public void cp(String p0,String p1,Callback p2){
       RNFetchBlob.threadPool.execute(new RNFetchBlob$h(this, p0, p1, p2));
    }
    public void createFile(String p0,String p1,String p2,Promise p3){
       RNFetchBlob$e uoe = new RNFetchBlob$e(this, p0, p1, p2, p3);
       RNFetchBlob.threadPool.execute(v7);
    }
    public void createFileASCII(String p0,ReadableArray p1,Promise p2){
       RNFetchBlob.threadPool.execute(new RNFetchBlob$f(this, p0, p1, p2));
    }
    public void df(Callback p0){
       RNFetchBlob.fsThreadPool.execute(new RNFetchBlob$c(this, p0));
    }
    public void enableProgressReport(String p0,int p1,int p2){
       RNFetchBlobReq.x.put(p0, new RNFetchBlobProgressConfig(true, p1, p2, RNFetchBlobProgressConfig$ReportType.Download));
    }
    public void enableUploadProgressReport(String p0,int p1,int p2){
       RNFetchBlobReq.y.put(p0, new RNFetchBlobProgressConfig(true, p1, p2, RNFetchBlobProgressConfig$ReportType.Upload));
    }
    public void exists(String p0,Callback p1){
       Object[] objArray;
       Boolean fALSE;
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       if (b.f(p0)) {
          try{
             SplitAssetHelper.openFd(reactApplica.getAssets(), p0.replace("bundle-assets://", ""));
             objArray = new Object[]{Boolean.TRUE,Boolean.FALSE};
             p1.invoke(objArray);
          }catch(java.io.IOException e0){
             objArray = new Object[]{fALSE,fALSE};
             fALSE = Boolean.FALSE;
             p1.invoke(objArray);
          }
       }else {
          p0 = b.h(reactApplica, p0);
          if (p0 != null) {
             Object[] objArray1 = new Object[]{Boolean.valueOf(new File(p0).exists()),Boolean.valueOf(new File(p0).isDirectory())};
             p1.invoke(objArray1);
          }else {
             objArray = new Object[]{fALSE,fALSE};
             fALSE = Boolean.FALSE;
             p1.invoke(objArray);
          }
       }
    }
    public void fetchBlob(ReadableMap p0,String p1,String p2,String p3,ReadableMap p4,String p5,Callback p6){
       i.a().a(this.getReactApplicationContext(), p0, p1, p2, p3, p4, p5, null, this.mClient, p6).run();
    }
    public void fetchBlobForm(ReadableMap p0,String p1,String p2,String p3,ReadableMap p4,ReadableArray p5,Callback p6){
       i.a().a(this.getReactApplicationContext(), p0, p1, p2, p3, p4, null, p5, this.mClient, p6).run();
    }
    public Map getConstants(){
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       HashMap hashMap = new HashMap();
       hashMap.put("DocumentDir", reactApplica.getFilesDir().getAbsolutePath());
       hashMap.put("CacheDir", reactApplica.getCacheDir().getAbsolutePath());
       hashMap.put("DCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
       hashMap.put("PictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
       hashMap.put("MusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
       hashMap.put("DownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
       hashMap.put("MovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
       hashMap.put("RingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
       if ((Environment.getExternalStorageState()).equals("mounted")) {
          hashMap.put("SDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
          File externalFile = reactApplica.getExternalFilesDir(null);
          if (externalFile != null) {
             hashMap.put("SDCardApplicationDir", externalFile.getParentFile().getAbsolutePath());
          }else {
             hashMap.put("SDCardApplicationDir", "");
          }
       }
       hashMap.put("MainBundleDir", reactApplica.getApplicationInfo().dataDir);
       return hashMap;
    }
    public void getContentIntent(String p0,Promise p1){
       Intent intent = new Intent("android.intent.action.GET_CONTENT");
       if (p0 != null) {
          intent.setType(p0);
       }else {
          intent.setType("*/*");
       }
       Integer a = b.a;
       RNFetchBlob.promiseTable.put(a.intValue(), p1);
       int i = a.intValue();
       this.getReactApplicationContext().startActivityForResult(intent, i, null);
       return;
    }
    public String getName(){
       return "RNFetchBlob";
    }
    public void getSDCardApplicationDir(Promise p0){
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       if ((Environment.getExternalStorageState()).equals("mounted")) {
          String str = null;
          try{
             p0.resolve(reactApplica.getExternalFilesDir(str).getParentFile().getAbsolutePath());
          }catch(java.lang.Exception e0){
             p0.reject("RNFetchBlob.getSDCardApplicationDir", e0.getLocalizedMessage());
          }
       }else {
          p0.reject("RNFetchBlob.getSDCardApplicationDir", "External storage not mounted");
       }
    }
    public void getSDCardDir(Promise p0){
       if ((Environment.getExternalStorageState()).equals("mounted")) {
          p0.resolve(Environment.getExternalStorageDirectory().getAbsolutePath());
       }else {
          p0.reject("RNFetchBlob.getSDCardDir", "External storage not mounted");
       }
       return;
    }
    public void hash(String p0,String p1,Promise p2){
       RNFetchBlob.threadPool.execute(new RNFetchBlob$a(this, p0, p1, p2));
    }
    public void ls(String p0,Promise p1){
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       try{
          HashMap e = b.e;
          p0 = b.h(reactApplica, p0);
          File uFile = new File(p0);
          String str = "\'";
          if (!uFile.exists()) {
             p1.reject("ENOENT", "No such file \'"+p0+str);
          }else if(!uFile.isDirectory()){
             p1.reject("ENOTDIR", "Not a directory \'"+p0+str);
          }else {
             String[] stringArray = new File(p0).list();
             WritableArray writableArra = Arguments.createArray();
             int len = stringArray.length;
             for (int i = 0; i < len; i = i + 1) {
                writableArra.pushString(stringArray[i]);
             }
             p1.resolve(writableArra);
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          p1.reject("EUNSPECIFIED", e5.getLocalizedMessage());
       }
       return;
    }
    public void lstat(String p0,Callback p1){
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       p0 = b.h(reactApplica, p0);
       c uoc = new c(p1, reactApplica);
       String[] stringArray = new String[]{p0};
       uoc.execute(stringArray);
    }
    public void mkdir(String p0,Promise p1){
       StringBuilder str = "EUNSPECIFIED";
       File uFile = new File(p0);
       if (uFile.exists()) {
          str = "";
          String str1 = (uFile.isDirectory())? "Folder": "File";
          p1.reject("EEXIST", str+str1+" \'"+p0+"\' already exists");
       }else if(!uFile.mkdirs()){
          p1.reject(str, "mkdir failed to create some or all directories in \'"+p0+"\'");
       }else {
          p1.resolve(Boolean.TRUE);
       }
    }
    public void mv(String p0,String p1,Callback p2){
       Object[] objArray;
       Object[] objArray1;
       try{
          File uFile = new File(p0);
          if (!uFile.exists()) {
             objArray = new Object[]{"Source file at path `"+p0+"` does not exist"};
             p2.invoke(objArray);
          }else {
             FileInputStream uFileInputSt = new FileInputStream(p0);
             FileOutputStream uFileOutputS = new FileOutputStream(p1);
             byte[] uobyteArray = new byte[1024];
             int i = uFileInputSt.read(uobyteArray);
             while (i != -1) {
                uFileOutputS.write(uobyteArray, 0, i);
             }
             uFileInputSt.close();
             uFileOutputS.flush();
             uFile.delete();
             objArray1 = new Object[0];
             p2.invoke(objArray1);
          }
       }catch(java.io.FileNotFoundException e0){
          objArray1 = new Object[]{"Source file not found."};
          p2.invoke(objArray1);
       }catch(java.lang.Exception e7){
          objArray = new Object[]{e7.toString()};
          p2.invoke(objArray);
       }
       return;
    }
    public void readFile(String p0,String p1,Promise p2){
       RNFetchBlob.threadPool.execute(new RNFetchBlob$i(this, p0, p1, p2));
    }
    public void readStream(String p0,String p1,int p2,int p3,String p4){
       RNFetchBlob$b uob = new RNFetchBlob$b(this, this.getReactApplicationContext(), p0, p1, p2, p3, p4);
       RNFetchBlob.fsThreadPool.execute(v9);
    }
    public void removeSession(ReadableArray p0,Callback p1){
       ReadableArray[] readableArra = new ReadableArray[]{p0};
       new e(p1).execute(readableArra);
    }
    public void scanFile(ReadableArray p0,Callback p1){
       RNFetchBlob.threadPool.execute(new RNFetchBlob$l(this, p0, this.getReactApplicationContext(), p1));
    }
    public void slice(String p0,String p1,int p2,int p3,Promise p4){
       String str;
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       try{
          str = "EUNSPECIFIED";
          p0 = b.h(reactApplica, p0);
          File uFile = new File(p0);
          if (uFile.isDirectory()) {
             p4.reject("EISDIR", "Expecting a file but \'"+p0+"\' is a directory");
          }else if(!uFile.exists()){
             p4.reject("ENOENT", "No such file \'"+p0+"\'");
          }else {
             int i = (int)uFile.length();
             p3 = Math.min(i, p3) - p2;
             FileInputStream uFileInputSt = new FileInputStream(new File(p0));
             FileOutputStream uFileOutputS = new FileOutputStream(new File(p1));
             int i1 = (int)uFileInputSt.skip((long)p2);
             if (i1 != p2) {
                p4.reject(str, "Skipped "+i1+" instead of the specified "+p2+" bytes, size is "+i);
             }else {
                byte[] uobyteArray = new byte[0x2800];
                for (i1 = 0; i1 < p3; i1 = i1 + i2) {
                   int i2 = uFileInputSt.read(uobyteArray, 0, 0x2800);
                   int i3 = p3 - i1;
                   if (i2 <= 0) {
                      break ;
                   }
                   uFileOutputS.write(uobyteArray, 0, Math.min(i3, i2));
                }
                uFileInputSt.close();
                uFileOutputS.flush();
                uFileOutputS.close();
                p4.resolve(p1);
             }
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          p4.reject(str, e8.getLocalizedMessage());
       }
       return;
    }
    public void stat(String p0,Callback p1){
       int i;
       Object[] objArray;
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       try{
          i = 1;
          p0 = b.h(reactApplica, p0);
          WritableMap writableMap = b.i(reactApplica, p0);
          int i1 = 2;
          if (writableMap == null) {
             objArray = new Object[i1];
             objArray[0] = "failed to stat path `"+p0+"` because it does not exist or it is not a folder";
             objArray[i] = null;
             p1.invoke(objArray);
          }else {
             Object[] objArray1 = new Object[i1];
             objArray1[0] = null;
             objArray1[i] = writableMap;
             p1.invoke(objArray1);
          }
       }catch(java.lang.Exception e7){
          objArray = new Object[i];
          objArray[0] = e7.getLocalizedMessage();
          p1.invoke(objArray);
       }
       return;
    }
    public void unlink(String p0,Callback p1){
       int i;
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       try{
          i = 2;
          b.a(new File(b.h(reactApplica, p0)));
          Object[] objArray = new Object[i];
          objArray[0] = null;
          objArray[1] = Boolean.TRUE;
          p1.invoke(objArray);
       }catch(java.lang.Exception e5){
          Object[] objArray1 = new Object[i];
          objArray1[0] = e5.getLocalizedMessage();
          objArray1[1] = Boolean.FALSE;
          p1.invoke(objArray1);
       }
       return;
    }
    public void writeArrayChunk(String p0,ReadableArray p1,Callback p2){
       int i = 0;
       try{
          b d = b.e.get(p0).d;
          byte[] uobyteArray = new byte[p1.size()];
          for (int i1 = 0; i1 < p1.size(); i1 = i1 + 1) {
             uobyteArray[i1] = (byte)p1.getInt(i1);
          }
          d.write(uobyteArray);
          Object[] objArray1 = new Object[i];
          p2.invoke(objArray1);
       }catch(java.lang.Exception e5){
          Object[] objArray = new Object[1];
          objArray[i] = e5.getLocalizedMessage();
          p2.invoke(objArray);
       }
       return;
    }
    public void writeChunk(String p0,String p1,Callback p2){
       int i;
       b uob = b.e.get(p0);
       b d = uob.d;
       byte[] uobyteArray = b.j(p1, uob.c);
       try{
          i = 0;
          d.write(uobyteArray);
          Object[] objArray = new Object[i];
          p2.invoke(objArray);
       }catch(java.lang.Exception e2){
          Object[] objArray1 = new Object[1];
          objArray1[i] = e2.getLocalizedMessage();
          p2.invoke(objArray1);
       }
       return;
    }
    public void writeFile(String p0,String p1,String p2,boolean p3,Promise p4){
       RNFetchBlob$k ok = new RNFetchBlob$k(this, p0, p1, p2, p3, p4);
       RNFetchBlob.threadPool.execute(v8);
    }
    public void writeFileArray(String p0,ReadableArray p1,boolean p2,Promise p3){
       RNFetchBlob$j oj = new RNFetchBlob$j(this, p0, p1, p2, p3);
       RNFetchBlob.threadPool.execute(v7);
    }
    public void writeStream(String p0,String p1,boolean p2,Callback p3){
       int i;
       Object[] objArray;
       Object[] objArray1;
       b uob = new b(this.getReactApplicationContext());
       try{
          i = 2;
          File uFile = new File(p0);
          File parentFile = uFile.getParentFile();
          if (!uFile.exists()) {
             if (parentFile != null && (!parentFile.exists() && !parentFile.mkdirs())) {
                objArray1 = new Object[i];
                objArray1[0] = "ENOTDIR";
                objArray1[1] = "Failed to create parent directory of \'"+p0+"\'";
                p3.invoke(objArray1);
             }else if(!uFile.createNewFile()){
                objArray1 = new Object[i];
                objArray1[0] = "ENOENT";
                objArray1[1] = "File \'"+p0+"\' does not exist and could not be created";
                p3.invoke(objArray1);
             }else {
             label_009c :
                uob.c = p1;
                p1 = UUID.randomUUID().toString();
                b.e.put(p1, uob);
                uob.d = new FileOutputStream(p0, p2);
                objArray = new Object[3];
                objArray[0] = null;
                objArray[1] = null;
                objArray[i] = p1;
                p3.invoke(objArray);
             }
          }else if(uFile.isDirectory()){
             objArray1 = new Object[i];
             objArray1[0] = "EISDIR";
             objArray1[1] = "Expecting a file but \'"+p0+"\' is a directory";
             p3.invoke(objArray1);
          }else {
             goto label_009c ;
          }
       }catch(java.lang.Exception e9){
          objArray = new Object[i];
          objArray[0] = "EUNSPECIFIED";
          objArray[1] = "Failed to create write stream at path `"+p0+"`; "+e9.getLocalizedMessage();
          p3.invoke(objArray);
       }
       return;
    }
}
