package com.tencent.open.utils.k;
import android.content.Context;
import android.net.Uri;
import android.content.ContentResolver;
import java.lang.String;
import android.database.Cursor;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import android.graphics.drawable.Drawable;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.io.IOException;
import android.app.Activity;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.tauth.Tencent;
import java.io.File;
import androidx.core.content.FileProvider;
import android.os.Bundle;
import java.net.URLDecoder;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import com.tencent.tauth.IUiListener;
import com.tencent.open.utils.f;
import com.tencent.connect.common.Constants;
import java.util.Map;
import java.lang.Object;
import java.lang.Integer;
import org.json.JSONObject;
import org.json.JSONException;
import android.content.Intent;
import android.content.ComponentName;
import android.os.Environment;
import com.tencent.open.utils.i;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.lang.Boolean;
import java.net.URL;
import android.provider.DocumentsContract;
import java.lang.Long;
import android.content.ContentUris;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Audio$Media;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import android.content.pm.Signature;

public class k	// class@000f84
{
    public static String a = "";
    public static String b = "";
    public static String c = "";
    public static String d = "";
    public static int e = 255;
    public static String f = "0123456789ABCDEF";

    public static char a(int p0){
       p0 = p0 & 0x0f;
       p0 = (p0 < 10)? p0 + 48: (p0 - 10) + 97;
       return (char)p0;
    }
    public static long a(Context p0,Uri p1){
       String str = "_size";
       String[] stringArray = new String[]{str};
       Cursor uCursor = p0.getContentResolver().query(p1, stringArray, null, null, null);
       long l = 0;
       if (uCursor == null || !uCursor.getCount()) {
          return l;
       }
       try{
          int columnIndexO = uCursor.getColumnIndexOrThrow(str);
          if (uCursor.moveToFirst()) {
             l = uCursor.getLong(columnIndexO);
          label_002f :
             uCursor.close();
          }else {
             goto label_002f ;
          }
       }catch(java.lang.Exception e8){
          SLog.e("openSDK_LOG.Util", "cursor exception", e8);
          uCursor.close();
       }catch(java.lang.Exception e8){
          SLog.e("openSDK_LOG.Util", "cursor exception", e8);
       }
       return l;
    }
    public static Drawable a(String p0,Context p1){
       InputStream inputStream;
       StringBuilder str;
       Drawable uDrawable = null;
       if (p1 == null) {
          SLog.e("openSDK_LOG.Util", "context null!");
          return uDrawable;
       }else {
          AssetManager assets = p1.getAssets();
          try{
             inputStream = SplitAssetHelper.open(assets, p0);
             try{
                uDrawable = Drawable.createFromStream(inputStream, p0);
                try{
                   inputStream.close();
                label_0061 :
                   return uDrawable;
                }catch(java.lang.Exception e5){
                   str = "";
                }
                SLog.e("openSDK_LOG.Util", str+"inputStream close exception: "+e5.getMessage());
                goto label_0061 ;
             }catch(java.io.IOException e5){
             }
             try{
                p0 = "getDrawable exception: "+e5.getMessage();
                SLog.e("openSDK_LOG.Util", p0);
                inputStream.close();
                goto label_0061 ;
             }catch(java.lang.Exception e5){
                str = "";
                goto label_0023 ;
             }
          }catch(java.io.IOException e5){
             inputStream = uDrawable;
             goto label_003e ;
          }
       }
    }
    public static Uri a(Activity p0,String p1,String p2){
       if (TextUtils.isEmpty(p2)) {
          SLog.e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion -- stringForFileUri is empty");
          return null;
       }else {
          try{
             p1 = Tencent.getAuthorities(p1);
             if (TextUtils.isEmpty(p1)) {
                return null;
             }
             Uri uriForFile = FileProvider.getUriForFile(p0, p1, new File(p2));
             p0.grantUriPermission("com.tencent.mobileqq", uriForFile, 3);
             p0.grantUriPermission("com.tencent.tim", uriForFile, 3);
             p0.grantUriPermission("com.tencent.minihd.qq", uriForFile, 3);
             p0.grantUriPermission("com.tencent.qqlite", uriForFile, 3);
             return uriForFile;
          }catch(java.lang.Exception e3){
             SLog.e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion exception:", e3);
             return null;
          }
       }
    }
    public static Bundle a(String p0){
       Bundle uBundle = new Bundle();
       if (p0 != null) {
          try{
             String[] stringArray = p0.split("&");
             int len = stringArray.length;
             int i = 0;
             while (i < len) {
                String[] stringArray1 = k.a(stringArray[i], "=");
                if (stringArray1.length == 2) {
                   uBundle.putString(URLDecoder.decode(stringArray1[0]), URLDecoder.decode(stringArray1[1]));
                }
                i = i + 1;
             }
          }catch(java.lang.Exception e0){
             uBundle = null;
          }
       }
    }
    public static Bundle a(String p0,String p1,String p2,String p3,String p4,String p5){
       return k.a(p0, p2, p3, p1, p4, p5, "", "", "", "", "", "");
    }
    public static Bundle a(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9,String p10,String p11){
       Bundle uBundle = new Bundle();
       uBundle.putString("openid", p0);
       uBundle.putString("report_type", p1);
       uBundle.putString("act_type", p2);
       uBundle.putString("via", p3);
       uBundle.putString("app_id", p4);
       uBundle.putString("result", p5);
       uBundle.putString("type", p6);
       uBundle.putString("login_status", p7);
       uBundle.putString("need_user_auth", p8);
       uBundle.putString("to_uin", p9);
       uBundle.putString("call_source", p10);
       uBundle.putString("to_type", p11);
       uBundle.putString("platform", "1");
       return uBundle;
    }
    public static final String a(Context p0){
       if (p0 != null) {
          CharSequence applicationL = p0.getPackageManager().getApplicationLabel(p0.getApplicationInfo());
          if (applicationL != null) {
             return applicationL.toString();
          }
       }
       return null;
    }
    public static String a(String p0,int p1){
       if (!TextUtils.isEmpty(p0)) {
          try{
             p0 = Base64.encodeToString(p0.getBytes("UTF-8"), p1);
          label_002e :
             return p0;
          }catch(java.io.UnsupportedEncodingException e1){
             SLog.e("openSDK_LOG.Util", "convert2Base64String exception: "+e1.getMessage());
          }
          p0 = "";
          goto label_002e ;
       }else {
          goto label_002c ;
       }
    }
    public static final String a(String p0,int p1,String p2,String p3){
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       if (TextUtils.isEmpty(p2)) {
          p2 = "UTF-8";
       }
       try{
          if (p0.getBytes(p2).length <= p1) {
             return p0;
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i >= p0.length()) {
                   return p0;
                }
                int i2 = i + 1;
                i1 = i1 + (p0.substring(i, i2)).getBytes(p2).length;
                if (i1 > p1) {
                   p0 = p0.substring(0, i);
                   if (!TextUtils.isEmpty(p3)) {
                      p0 = p0+p3;
                      break ;
                   }
                   break ;
                }else {
                   i = i2;
                }
             }
             return p0;
          }
       }catch(java.lang.Exception e6){
          SLog.e("openSDK_LOG.Util", "Util.subString has exception: "+e6.getMessage());
          return p0;
       }
    }
    public static String a(String p0,Activity p1,String p2,IUiListener p3){
       String str1;
       String str = null;
       try{
          boolean b = k.n(p2);
          SLog.i("openSDK_LOG.Util", "doPublishMood\(\) check file: isAppSpecificDir="+b+",hasSDPermission="+k.c());
          if (!b) {
             File uFile = f.a("Images");
             if (uFile != null) {
                str1 = uFile.getAbsolutePath()+File.separator+Constants.QQ_SHARE_TEMP_DIR;
             }else {
                uFile = f.a().getCacheDir();
                if (uFile == null) {
                   SLog.e("openSDK_LOG.Util", "getMediaFileUri error, cacheDir is null");
                   return str;
                }else {
                   str1 = uFile.getAbsolutePath()+File.separator+Constants.QQ_SHARE_TEMP_DIR;
                }
             }
             File uFile1 = new File(p2);
             p2 = uFile1.getAbsolutePath();
             str1 = str1+File.separator+uFile1.getName();
             if (k.b(p2, str1)) {
                p2 = str1;
             }else {
                p2 = str;
             }
          }
          Uri uri = k.a(p1, p0, p2);
          if (uri != null) {
             str = uri.toString();
          }
          return str;
       }catch(java.lang.Exception e5){
          SLog.e("openSDK_LOG.Util", "getMediaFileUri error", e5);
          return str;
       }
    }
    public static String a(Map p0,String p1,String p2){
       if (p0 == null) {
          SLog.e("openSDK_LOG.Util", "getString error, params==null");
          return p2;
       }else if(!p0.containsKey(p1)){
          SLog.e("openSDK_LOG.Util", "getString error, not comtain : "+p1);
          return p2;
       }else {
          p0 = p0.get(p1);
          if (p0 instanceof String) {
             p2 = p0;
          }
          return p2;
       }
    }
    public static String a(byte[] p0){
       if (p0 == null) {
          return null;
       }
       StringBuilder str = new StringBuilder((p0.length * 2));
       for (int i = 0; i < p0.length; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          String str1 = Integer.toString(i1, 16);
          if (str1.length() == 1) {
             str1 = "0"+str1;
          }
          str = str+str1;
       }
       return str;
    }
    public static JSONObject a(JSONObject p0,String p1){
       if (p0 == null) {
          p0 = new JSONObject();
       }
       if (p1 != null) {
          String[] stringArray = p1.split("&");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             String[] stringArray1 = (stringArray[i]).split("=");
             if (stringArray1.length == 2) {
                int i1 = 1;
                try{
                   stringArray1[0] = URLDecoder.decode(stringArray1[0]);
                   stringArray1[i1] = URLDecoder.decode(stringArray1[i1]);
                   try{
                      p0.put(stringArray1[0], stringArray1[i1]);
                   }catch(org.json.JSONException e3){
                      SLog.e("openSDK_LOG.Util", "decodeUrlToJson has exception: "+e3.getMessage());
                   }
                }catch(java.lang.Exception e0){
                }
             }
             i = i + 1;
          }
       }
       return p0;
    }
    public static void a(Context p0,String p1,String p2,String p3){
       Intent intent = new Intent();
       intent.setComponent(new ComponentName(p1, p2));
       intent.setAction("android.intent.action.VIEW");
       intent.addFlags(0x40000000);
       intent.addFlags(0x10000000);
       intent.setData(Uri.parse(p3));
       p0.startActivity(intent);
    }
    public static boolean a(){
       File externalStor = ((Environment.getExternalStorageState()).equals("mounted"))? Environment.getExternalStorageDirectory(): null;
       if (externalStor != null) {
          return true;
       }else {
          return false;
       }
    }
    public static boolean a(Context p0,String p1){
       int i = 0;
       try{
          if (k.g(p0)) {
             k.a(p0, "com.tencent.mtt", "com.tencent.mtt.MainActivity", p1);
          }else {
             k.a(p0, "com.android.browser", "com.android.browser.BrowserActivity", p1);
          }
       label_0036 :
          return true;
       }catch(java.lang.Exception e0){
          int i1 = 0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean a(Context p0,String p1,String p2){
       boolean b = k.b(p1, p2);
       SLog.i("openSDK_LOG.Util", "copyFileByCheckPermission\(\) copy success:"+b);
       return b;
    }
    public static boolean a(Context p0,boolean p1){
       boolean b = true;
       if (k.c(p0) && i.a(p0, "com.tencent.minihd.qq") != null) {
          return b;
       }
       if (i.c(p0, "4.1") >= 0 || (i.a(p0, "com.tencent.tim") == null && i.a(p0, "com.tencent.qqlite") == null)) {
          b = false;
       }
    label_002a :
       return b;
    }
    public static boolean a(File p0,File p1){
       BufferedInputStream uBufferedInp;
       boolean i = 0;
       int i1 = 0;
       try{
          if (p1.exists()) {
             p1.delete();
          }
          if (p1.getParentFile() != null && !p1.getParentFile().exists()) {
             p1.getParentFile().mkdirs();
          }
          try{
             FileOutputStream uFileOutputS = new FileOutputStream(p1);
             uBufferedInp = new BufferedInputStream(new FileInputStream(p0));
             try{
                int i2 = 0x19000;
                byte[] uobyteArray = new byte[i2];
                i1 = uBufferedInp.read(uobyteArray);
                while (i1 != -1) {
                   uFileOutputS.write(uobyteArray, i, i1);
                   uFileOutputS.flush();
                }
                i = true;
                try{
                   uFileOutputS.close();
                }catch(java.io.IOException e6){
                   SLog.e("openSDK_LOG.Util", "copyFile error, ", e6);
                }
                try{
                   uBufferedInp.close();
                }catch(java.io.IOException e6){
                   SLog.e("openSDK_LOG.Util", "copyFile error, ", e6);
                }
             }catch(java.io.IOException e6){
             }catch(java.lang.OutOfMemoryError e6){
             }
             FileOutputStream uFileOutputS1 = uFileOutputS;
          }catch(java.io.IOException e6){
             uBufferedInp = i1;
          }catch(java.lang.OutOfMemoryError e6){
             uBufferedInp = i1;
             goto label_0066 ;
          }
       }catch(java.io.IOException e6){
          uBufferedInp = i1;
       }catch(java.lang.OutOfMemoryError e6){
          uBufferedInp = i1;
       }catch(java.io.IOException e6){
       }
    label_0098 :
       return i;
    }
    public static boolean a(Map p0,String p1,boolean p2){
       if (p0 == null) {
          SLog.e("openSDK_LOG.Util", "getBoolean error, params==null");
          return p2;
       }else if(!p0.containsKey(p1)){
          SLog.e("openSDK_LOG.Util", "getBoolean error, not comtain : "+p1);
          return p2;
       }else {
          p0 = p0.get(p1);
          if (p0 instanceof Boolean) {
             p2 = p0.booleanValue();
          }
          return p2;
       }
    }
    public static byte[] a(byte[] p0,String p1){
       if (p0 == null) {
          return p0;
       }
       char[] uocharArray = p1.toCharArray();
       int len = p0.length;
       byte[] uobyteArray = new byte[len];
       for (int i = 0; i < len; i = i + 1) {
          int i1 = i % uocharArray.length;
          int i2 = p0[i] ^ uocharArray[i1];
          uobyteArray[i] = (byte)i2;
       }
       return uobyteArray;
    }
    public static String[] a(String p0,String p1){
       int i = p0.indexOf(p1);
       if (i == -1) {
          String[] stringArray = new String[]{p0};
          return stringArray;
       }else {
          String[] stringArray1 = new String[]{p0.substring(0, i),p0.substring((i + p1.length()))};
          return stringArray1;
       }
    }
    public static Bundle b(String p0){
       p0 = p0.replace("auth://", "http://");
       try{
          URL uRL = new URL(p0);
          Bundle uBundle = k.a(uRL.getQuery());
          uBundle.putAll(k.a(uRL.getRef()));
          return uBundle;
       }catch(java.net.MalformedURLException e0){
          return new Bundle();
       }
    }
    public static String b(){
       String str;
       File uFile = f.e();
       if (uFile != null) {
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          str = uFile.toString();
       }else {
          str = null;
       }
       return str;
    }
    public static String b(Context p0,Uri p1){
       String authority;
       Uri eXTERNAL_CON;
       String str = null;
       if (p1 == null) {
          return str;
       }
       if (DocumentsContract.isDocumentUri(p0, p1)) {
          authority = p1.getAuthority();
          if (("com.android.externalstorage.documents").equals(authority)) {
             String[] stringArray = (DocumentsContract.getDocumentId(p1)).split(":");
             object oobject = stringArray[0];
             if (("primary").equals(oobject)) {
                return ((Environment.getExternalStorageDirectory().getAbsolutePath()).concat("/")).concat(stringArray[1]);
             }else {
                return ((("/storage/").concat(oobject)).concat("/")).concat(stringArray[1]);
             }
          }else if(("com.android.providers.downloads.documents").equals(authority)){
             String documentId = DocumentsContract.getDocumentId(p1);
             str = "raw:";
             if (documentId.startsWith(str)) {
                return documentId.replaceFirst(str, "");
             }else {
                return k.c(p0, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)));
             }
          }else if(("com.android.providers.media.documents").equals(authority)){
             String[] stringArray1 = (DocumentsContract.getDocumentId(p1)).split(":");
             object oobject1 = stringArray1[0];
             if (("image").equals(oobject1)) {
                eXTERNAL_CON = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
             }else if(("video").equals(oobject1)){
                eXTERNAL_CON = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
             }else if(("audio").equals(oobject1)){
                eXTERNAL_CON = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
             }
             return k.c(p0, ContentUris.withAppendedId(eXTERNAL_CON, Long.parseLong(stringArray1[1])));
          }
          return str;
       }else {
          authority = p1.getScheme();
          if (("content").equals(authority)) {
             str = k.c(p0, p1);
          }else if(("file").equals(authority)){
             str = p1.getPath();
          }
          return str;
       }
    }
    public static void b(Context p0,String p1){
       if (p0 == null) {
          return;
       }
       try{
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p1, 0);
          PackageInfo versionName = packageInfo.versionName;
          k.b = versionName;
          k.a = versionName.substring(0, versionName.lastIndexOf(46));
          versionName = k.b;
          k.d = versionName.substring((versionName.lastIndexOf(46) + 1), (k.b).length());
          k.e = packageInfo.versionCode;
       }catch(android.content.pm.PackageManager$NameNotFoundException e5){
          SLog.e("openSDK_LOG.Util", "getPackageInfo has exception: "+e5.getMessage());
       }catch(java.lang.Exception e5){
          SLog.e("openSDK_LOG.Util", "getPackageInfo has exception: "+e5.getMessage());
       }
       return;
    }
    public static boolean b(Context p0){
       if (p0 == null) {
          return true;
       }
       if (Build$VERSION.SDK_INT >= 23 && p0.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE")) {
          return true;
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (systemServic == null) {
          return true;
       }
       NetworkInfo[] allNetworkIn = systemServic.getAllNetworkInfo();
       if (!allNetworkIn.length) {
          return true;
       }
       int len = allNetworkIn.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (allNetworkIn[i].isConnectedOrConnecting()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean b(String p0,String p1){
       boolean b;
       File uFile = new File(p0);
       if (uFile.exists()) {
          try{
             b = k.a(uFile, k.m(p1));
          label_0039 :
             return b;
          }catch(java.io.IOException e0){
             SLog.d("openSDK_LOG.Util", "copy fail from "+b+" to "+p1+" ", e0);
          }
          b = false;
          goto label_0039 ;
       }else {
          goto label_0038 ;
       }
    }
    public static String c(Context p0,Uri p1){
       Cursor uCursor;
       ParcelFileDescriptor parcelFileDe;
       FileOutputStream uFileOutputS;
       FileInputStream uFileInputSt;
       String str = "_data";
       String[] stringArray = new String[]{str};
       String str1 = null;
       try{
          uCursor = p0.getContentResolver().query(p1, stringArray, null, null, null);
          if (uCursor != null && uCursor.moveToFirst()) {
             return uCursor.getString(uCursor.getColumnIndexOrThrow(str));
          }
       }catch(java.lang.Exception e3){
          uCursor = str1;
       }catch(java.lang.Exception e3){
       }
       SLog.e("openSDK_LOG.Util", "queryAbsolutePath error : "+e3.getMessage());
       if (uCursor) {
          uCursor.close();
       }
       try{
          parcelFileDe = p0.getContentResolver().openFileDescriptor(p1, "r");
          try{
             FileDescriptor fileDescript = parcelFileDe.getFileDescriptor();
             try{
                uFileInputSt = new FileInputStream(fileDescript);
                File uFile = k.h(p0, "Images");
                if (uFile == null) {
                   try{
                      SLog.e("openSDK_LOG.Util", "getExternalFilesDir return null");
                      uFileInputSt.close();
                   }catch(java.io.IOException e12){
                      SLog.e("openSDK_LOG.Util", "close fileIuputStream error"+e12.getMessage());
                   }
                   try{
                      parcelFileDe.close();
                   }catch(java.io.IOException e12){
                      SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error"+e12.getMessage());
                   }
                   return str1;
                }else if(!uFile.exists()){
                   uFile.mkdirs();
                }
                File uFile1 = new File(uFile, p1.getLastPathSegment());
                if (!uFile1.exists()) {
                   uFile1.createNewFile();
                }
                FileOutputStream uFileOutputS1 = new FileOutputStream(uFile1);
                try{
                   uFileOutputS = 2048;
                   byte[] uobyteArray = new byte[uFileOutputS];
                label_00c8 :
                   int i = uFileInputSt.read(uobyteArray);
                   if (i != -1) {
                      uFileOutputS1.write(uobyteArray, 0, i);
                      goto label_00c8 ;
                   }else {
                      uFileOutputS1.flush();
                      String absolutePath = uFile1.getAbsolutePath();
                      try{
                         uFileInputSt.close();
                      }catch(java.io.IOException e4){
                         SLog.e("openSDK_LOG.Util", "close fileIuputStream error"+e4.getMessage());
                      }
                      try{
                         uFileOutputS1.close();
                      }catch(java.io.IOException e12){
                         SLog.e("openSDK_LOG.Util", "close fileOutputStream error"+e12.getMessage());
                      }
                      try{
                         parcelFileDe.close();
                      }catch(java.io.IOException e12){
                         SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error"+e12.getMessage());
                      }
                      return absolutePath;
                   }
                }catch(java.lang.Exception e13){
                   uFileOutputS = uFileOutputS1;
                   Exception uException = e13;
                }
             label_0151 :
                SLog.e("openSDK_LOG.Util", "copy file from uri error : "+e12.getMessage());
                if (uFileInputSt) {
                   try{
                      uFileInputSt.close();
                   }catch(java.io.IOException e12){
                      SLog.e("openSDK_LOG.Util", "close fileIuputStream error"+e12.getMessage());
                   }
                }
             }catch(java.lang.Exception e12){
                uFileOutputS = str1;
                goto label_0151 ;
             }
          }catch(java.lang.Exception e12){
             uFileOutputS = str1;
             uFileInputSt = uFileOutputS;
             goto label_0151 ;
          }
       }catch(java.lang.Exception e12){
          uFileOutputS = str1;
          parcelFileDe = uFileOutputS;
          uFileInputSt = parcelFileDe;
          goto label_0151 ;
       }
    }
    public static String c(Context p0,String p1){
       if (p0 == null) {
          return "";
       }
       k.b(p0, p1);
       return k.b;
    }
    public static JSONObject c(String p0){
       p0 = p0.replace("auth://", "http://");
       try{
          URL uRL = new URL(p0);
          JSONObject jSONObject = k.a(null, uRL.getQuery());
          k.a(jSONObject, uRL.getRef());
          return jSONObject;
       }catch(java.net.MalformedURLException e0){
          return new JSONObject();
       }
    }
    public static boolean c(){
       Context uContext = f.a();
       boolean b = false;
       if (uContext != null && !uContext.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", uContext.getPackageName())) {
          b = true;
       }
       return b;
    }
    public static boolean c(Context p0){
       DisplayMetrics uDisplayMetr = c.c(p0.getResources());
       double d = Math.sqrt((Math.pow((double)((float)uDisplayMetr.widthPixels / uDisplayMetr.xdpi), 2.00f) + Math.pow((double)((float)uDisplayMetr.heightPixels / uDisplayMetr.ydpi), 2.00f)));
       if (d - 0x401a000000000000 > 0) {
          return true;
       }
       return false;
    }
    public static String d(Context p0,String p1){
       if (p0 == null) {
          return "";
       }
       k.b(p0, p1);
       return k.a;
    }
    public static JSONObject d(String p0){
       if (p0.equals("false")) {
          p0 = "{value : false}";
       }
       if (p0.equals("true")) {
          p0 = "{value : true}";
       }
       if (p0.contains("allback\(")) {
          p0 = (p0.replaceFirst("[\\s\\S]*allback\\\(\([\\s\\S]*\)\\\);[^\\\)]*\\z", "$1")).trim();
       }
       if (p0.contains("online[0]=")) {
          p0 = "{online:"+p0.charAt((p0.length() - 2))+"}";
       }
       return new JSONObject(p0);
    }
    public static boolean d(Context p0){
       boolean b = (i.c(p0, "8.1.5") >= 0)? true: false;
       return b;
    }
    public static String e(Context p0,String p1){
       if (p0 == null) {
          return "";
       }
       String str = k.d(p0, p1);
       k.c = str;
       return str;
    }
    public static boolean e(Context p0){
       boolean b = (i.c(p0, "8.1.8") >= 0)? true: false;
       return b;
    }
    public static boolean e(String p0){
       boolean b = (p0 == null || !p0.length())? true: false;
       return b;
    }
    public static String f(String p0){
       try{
          return URLEncoder.encode(p0, "UTF-8");
       }catch(java.io.UnsupportedEncodingException e2){
          SLog.e("openSDK_LOG.Util", "urlEncode: UnsupportedEncodingException", e2);
          return "";
       }
    }
    public static boolean f(Context p0){
       boolean b = (i.c(p0, "5.9.5") >= 0 || i.a(p0, "com.tencent.qqlite") != null)? true: false;
       return b;
    }
    public static boolean f(Context p0,String p1){
       int i = 1;
       boolean b = (k.c(p0) && i.a(p0, "com.tencent.minihd.qq") != null)? false: true;
       if (b && i.a(p0, "com.tencent.tim") != null) {
          b = false;
       }
       if (b && i.a(p0, "com.tencent.qqlite") != null) {
          b = false;
       }
       if (b) {
          if (i.c(p0, p1) >= 0) {
             i = 0;
          }
          b = i;
       }
       return b;
    }
    public static String g(String p0){
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(k.j(p0));
          byte[] uobyteArray = instance.digest();
          if (uobyteArray != null) {
             StringBuilder str = "";
             int len = uobyteArray.length;
             for (int i = 0; i < len; i = i + 1) {
                byte b = uobyteArray[i];
                int i1 = b >> 4;
                str = str+k.a(i1)+k.a(b);
             }
             p0 = str;
          }
       }catch(java.security.NoSuchAlgorithmException e0){
          SLog.e("openSDK_LOG.Util", "encrypt has exception: "+e0.getMessage());
       }
       return p0;
    }
    public static boolean g(Context p0){
       boolean b = false;
       try{
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
          PackageInfo versionName = packageInfo.versionName;
          if (i.a(versionName, "4.3") >= 0 && !versionName.startsWith("4.4")) {
             packageInfo = packageInfo.signatures;
             if (packageInfo != null) {
                try{
                   MessageDigest instance = MessageDigest.getInstance("MD5");
                   instance.update(packageInfo[b].toByteArray());
                   instance.reset();
                   if ((k.a(instance.digest())).equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                      return true;
                   }
                }catch(java.security.NoSuchAlgorithmException e4){
                   SLog.e("openSDK_LOG.Util", "isQQBrowerAvailable has exception: "+e4.getMessage());
                }
             }
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public static boolean g(Context p0,String p1){
       int i = 1;
       boolean b = (k.c(p0) && i.a(p0, "com.tencent.minihd.qq") != null)? false: true;
       if (b && i.a(p0, "com.tencent.qqlite") != null) {
          b = false;
       }
       if (b) {
          if (i.c(p0, p1) >= 0) {
             i = 0;
          }
          b = i;
       }
       return b;
    }
    public static File h(Context p0,String p1){
       File uFile = null;
       if (p0 == null) {
          return uFile;
       }
       File[] externalFile = p0.getExternalFilesDirs(p1);
       if (externalFile != null && externalFile.length > 0) {
          uFile = externalFile[0];
       }
       return uFile;
    }
    public static final boolean h(String p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.startsWith("http://") || p0.startsWith("https://")) {
          b = true;
       }
       return b;
    }
    public static boolean i(String p0){
       if (p0 == null) {
          return false;
       }
       if (new File(p0).exists()) {
          return true;
       }
       return false;
    }
    public static byte[] j(String p0){
       try{
          return p0.getBytes("UTF-8");
       }catch(java.io.UnsupportedEncodingException e2){
          SLog.e("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e2);
          byte[] uobyteArray = new byte[0];
          return uobyteArray;
       }
    }
    public static String k(String p0){
       if (p0 == null) {
          return null;
       }
       return Base64.encodeToString(k.a(p0.getBytes(), "JCPTZXEZ"), 3);
    }
    public static String l(String p0){
       return k.a(p0, 2);
    }
    public static File m(String p0){
       File uFile = new File(p0);
       if (!uFile.exists()) {
          if (uFile.getParentFile() != null && !uFile.getParentFile().exists()) {
             if (uFile.getParentFile().mkdirs()) {
                uFile.createNewFile();
             }else {
                SLog.d("openSDK_LOG.Util", "createFile failed"+p0);
             }
          }else {
             uFile.createNewFile();
          }
       }
       return uFile;
    }
    public static boolean n(String p0){
       String str = k.b();
       boolean b = (!TextUtils.isEmpty(p0) && (!TextUtils.isEmpty(str) && p0.contains(str)))? true: false;
       return b;
    }
}
