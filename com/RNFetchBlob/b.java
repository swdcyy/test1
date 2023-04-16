package com.RNFetchBlob.b;
import java.util.HashMap;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.IOException;
import android.content.Context;
import java.io.InputStream;
import android.content.res.AssetManager;
import java.lang.CharSequence;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.FileInputStream;
import android.net.Uri;
import android.provider.DocumentsContract;
import n4.a;
import android.os.Environment;
import java.lang.Long;
import android.content.ContentUris;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Audio$Media;
import android.content.ContentResolver;
import java.io.FileOutputStream;
import java.lang.Exception;
import com.RNFetchBlob.c;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import android.content.res.AssetFileDescriptor;
import java.nio.charset.Charset;
import android.util.Base64;

public class b	// class@000d65
{
    public ReactApplicationContext a;
    public DeviceEventManagerModule$RCTDeviceEventEmitter b;
    public String c;
    public OutputStream d;
    public static HashMap e;

    static {
       b.e = new HashMap();
    }
    public void b(ReactApplicationContext p0){
       super();
       this.c = "base64";
       this.d = null;
       this.a = p0;
       this.b = p0.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class);
    }
    public static void a(File p0){
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                b.a(uFileArray[i]);
             }
          }else {
             throw new NullPointerException("Received null trying to list files of directory \'"+p0+"\'");
          }
       }
       if (p0.delete()) {
          return;
       }else {
          throw new IOException("Failed to delete \'"+p0+"\'");
       }
    }
    public static String d(Context p0,String p1){
       return p0.getFilesDir()+"/RNFetchBlobTmp_"+p1;
    }
    public static InputStream e(Context p0,String p1){
       if (p0 == null) {
          return null;
       }
       String str = "bundle-assets://";
       if (p1.startsWith(str)) {
          return SplitAssetHelper.open(p0.getAssets(), p1.replace(str, ""));
       }
       return new FileInputStream(new File(p1));
    }
    public static boolean f(String p0){
       boolean b = (p0 != null && p0.startsWith("bundle-assets://"))? true: false;
       return b;
    }
    public static boolean g(Context p0,String p1){
       if (p0 == null) {
          return false;
       }
       if (!p1.startsWith("bundle-assets://")) {
          return new File(p1).exists();
       }
       try{
          SplitAssetHelper.open(p0.getAssets(), p1.replace("bundle-assets://", ""));
          return true;
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public static String h(Context p0,String p1){
       String str = null;
       if (p1 == null) {
          return str;
       }
       if (!p1.matches("\\w+\\:.*")) {
          return p1;
       }
       String str1 = "file://";
       if (p1.startsWith(str1)) {
          return p1.replace(str1, "");
       }
       Uri uri = Uri.parse(p1);
       if (p1.startsWith("bundle-assets://")) {
          return p1;
       }
       if (p0 == null) {
          return str;
       }
       String str2 = "content";
       if (DocumentsContract.isDocumentUri(p0, uri)) {
          String str3 = ":";
          int i = 1;
          if (a.d(uri)) {
             String[] stringArray = (DocumentsContract.getDocumentId(uri)).split(str3);
             if (("primary").equalsIgnoreCase(stringArray[0])) {
                str = Environment.getExternalStorageDirectory()+"/"+stringArray[i];
             }
          }else if(a.c(uri)){
             try{
                p1 = DocumentsContract.getDocumentId(uri);
                if (p1 != null && p1.startsWith("raw:/")) {
                   str = Uri.parse(p1).getPath();
                }else {
                   str = a.b(p0, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(p1).longValue()), str, str);
                }
             }catch(java.lang.Exception e0){
             }
          }else if(a.f(uri)){
             String[] stringArray1 = (DocumentsContract.getDocumentId(uri)).split(str3);
             object oobject = stringArray1[0];
             if (("image").equals(oobject)) {
                str = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
             }else if(("video").equals(oobject)){
                str = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
             }else if(("audio").equals(oobject)){
                str = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
             }
             String[] stringArray2 = new String[i];
             stringArray2[0] = stringArray1[i];
             str = a.b(p0, str, "_id=?", stringArray2);
          }else if(str2.equalsIgnoreCase(uri.getScheme())){
             str = (a.e(uri))? uri.getLastPathSegment(): a.b(p0, uri, str, str);
          }else {
             try{
                InputStream inputStream = p0.getContentResolver().openInputStream(uri);
                if (inputStream != null) {
                   str1 = a.a(p0.getContentResolver(), uri);
                   if (str1 != null) {
                      File uFile = new File(p0.getCacheDir(), str1);
                      FileOutputStream uFileOutputS = new FileOutputStream(uFile);
                      byte[] uobyteArray = new byte[1024];
                      while (inputStream.read(uobyteArray) > 0) {
                         uFileOutputS.write(uobyteArray);
                      }
                      uFileOutputS.close();
                      inputStream.close();
                      str = uFile.getAbsolutePath();
                   }
                }
             }catch(java.lang.Exception e7){
                if (p0 instanceof ReactContext) {
                   c.a(p0, e7.toString());
                }
             }
          }
       }else if(str2.equalsIgnoreCase(uri.getScheme())){
          str = (a.e(uri))? uri.getLastPathSegment(): a.b(p0, uri, str, str);
       }else if(("file").equalsIgnoreCase(uri.getScheme())){
          str = uri.getPath();
       }
    }
    public static WritableMap i(Context p0,String p1){
       WritableMap writableMap = null;
       try{
          p1 = b.h(p0, p1);
          WritableMap writableMap1 = Arguments.createMap();
          String str = "type";
          if (b.f(p1)) {
             String str1 = p1.replace("bundle-assets://", "");
             writableMap1.putString("filename", str1);
             writableMap1.putString("path", p1);
             writableMap1.putString(str, "asset");
             writableMap1.putString("size", String.valueOf(SplitAssetHelper.openFd(p0.getAssets(), str1).getLength()));
             writableMap1.putInt("lastModified", 0);
          }else {
             File uFile = new File(p1);
             if (!uFile.exists()) {
                return writableMap;
             }else {
                writableMap1.putString("filename", uFile.getName());
                writableMap1.putString("path", uFile.getPath());
                p1 = (uFile.isDirectory())? "directory": "file";
                writableMap1.putString(str, p1);
                writableMap1.putString("size", String.valueOf(uFile.length()));
                writableMap1.putString("lastModified", String.valueOf(uFile.lastModified()));
             }
          }
          return writableMap1;
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static byte[] j(String p0,String p1){
       if (p1.equalsIgnoreCase("ascii")) {
          return p0.getBytes(Charset.forName("US-ASCII"));
       }
       if ((p1.toLowerCase()).contains("base64")) {
          return Base64.decode(p0, 2);
       }
       if (p1.equalsIgnoreCase("utf8")) {
          return p0.getBytes(Charset.forName("UTF-8"));
       }
       return p0.getBytes(Charset.forName("US-ASCII"));
    }
    public final void b(String p0,String p1,String p2){
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("event", p1);
       writableMap.putString("detail", p2);
       this.b.emit(p0, writableMap);
    }
    public final void c(String p0,String p1,String p2,String p3){
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("event", p1);
       writableMap.putString("code", p2);
       writableMap.putString("detail", p3);
       this.b.emit(p0, writableMap);
    }
}
