package com.sina.weibo.sdk.content.FileProvider;
import android.content.ContentProvider;
import java.lang.String;
import java.io.File;
import java.util.HashMap;
import java.lang.Object;
import java.lang.System;
import android.content.Context;
import com.sina.weibo.sdk.content.FileProvider$a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import android.net.Uri;
import com.sina.weibo.sdk.content.FileProvider$b;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.os.Environment;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.SecurityException;
import com.kuaishou.webkit.MimeTypeMap;
import android.content.ContentValues;
import java.lang.UnsupportedOperationException;
import android.os.ParcelFileDescriptor;
import android.database.Cursor;
import java.lang.Long;
import android.database.MatrixCursor;

public class FileProvider extends ContentProvider	// class@000bbd
{
    public FileProvider$a mStrategy;
    public static final String[] COLUMNS;
    public static final File DEVICE_ROOT;
    public static HashMap sCache;

    static {
       String[] stringArray = new String[]{"_display_name","_size"};
       FileProvider.COLUMNS = stringArray;
       FileProvider.DEVICE_ROOT = new File("/");
       FileProvider.sCache = new HashMap();
    }
    public void FileProvider(){
       super();
    }
    public static File buildPath(File p0,String[] p1){
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          if (oobject != null) {
             p0 = new File(p0, oobject);
          }
          i = i + 1;
       }
       return p0;
    }
    public static Object[] copyOf(Object[] p0,int p1){
       Object[] objArray = new Object[p1];
       System.arraycopy(p0, 0, objArray, 0, p1);
       return objArray;
    }
    public static String[] copyOf(String[] p0,int p1){
       String[] stringArray = new String[p1];
       System.arraycopy(p0, 0, stringArray, 0, p1);
       return stringArray;
    }
    public static File[] getExternalCacheDirs(Context p0){
       return p0.getExternalCacheDirs();
    }
    public static File[] getExternalFilesDirs(Context p0){
       return p0.getExternalFilesDirs(null);
    }
    public static FileProvider$a getPathStrategy(Context p0,String p1){
       HashMap sCache = FileProvider.sCache;
       _monitor_enter(sCache);
       FileProvider$a uoa = FileProvider.sCache.get(p1);
       if (uoa == null) {
          try{
             uoa = FileProvider.parsePathStrategy(p0, p1);
             FileProvider.sCache.put(p1, uoa);
          }catch(java.io.IOException e2){
             throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
          }catch(org.xmlpull.v1.XmlPullParserException e2){
             throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
          }
       }
       _monitor_exit(sCache);
       return uoa;
    }
    public static Uri getUriForFile(Context p0,String p1,File p2){
       return FileProvider.getPathStrategy(p0, p1).a(p2);
    }
    public static int modeToMode(String p0){
       int i;
       if (("r").equals(p0)) {
          i = 0x10000000;
       }else if(("w").equals(p0) || ("wt").equals(p0)){
          i = 0x2c000000;
       }else if(("wa").equals(p0)){
          i = 0x2a000000;
       }else if(("rw").equals(p0)){
          i = 0x38000000;
       }else if(("rwt").equals(p0)){
          i = 0x3c000000;
       }else {
          throw new IllegalArgumentException(("Invalid mode: ").concat(String.valueOf(p0)));
       }
       return i;
    }
    public static FileProvider$a parsePathStrategy(Context p0,String p1){
       File[] externalFile;
       FileProvider$b uob = new FileProvider$b(p1);
       XmlResourceParser xmlResourceP = p0.getPackageManager().resolveContentProvider(p1, 128).loadXmlMetaData(p0.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
       if (xmlResourceP == null) {
       label_00c1 :
          throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
       }
       while (true) {
          int i = xmlResourceP.next();
          int i1 = 1;
          if (i == i1) {
             return uob;
          }
          if (i == 2) {
             String name = xmlResourceP.getName();
             String str = null;
             String attributeVal = xmlResourceP.getAttributeValue(str, "name");
             String attributeVal1 = xmlResourceP.getAttributeValue(str, "path");
             if (("root-path").equals(name)) {
                str = FileProvider.DEVICE_ROOT;
             }else if(("files-path").equals(name)){
                str = p0.getFilesDir();
             }else if(("cache-path").equals(name)){
                str = p0.getCacheDir();
             }else if(("external-path").equals(name)){
                str = Environment.getExternalStorageDirectory();
             }else if(("external-files-path").equals(name)){
                externalFile = FileProvider.getExternalFilesDirs(p0);
                if (externalFile.length > 0) {
                   str = externalFile[0];
                }
             }else if(("external-cache-path").equals(name)){
                externalFile = FileProvider.getExternalCacheDirs(p0);
                if (externalFile.length > 0) {
                   str = externalFile[0];
                }
             }
             if (str != null) {
                String[] stringArray = new String[i1];
                stringArray[0] = attributeVal1;
                File uFile = FileProvider.buildPath(str, stringArray);
                if (!TextUtils.isEmpty(attributeVal)) {
                   try{
                      uob.h.put(attributeVal, uFile.getCanonicalFile());
                   }catch(java.io.IOException e8){
                      throw new IllegalArgumentException(("Failed to resolve canonical path for ").concat(String.valueOf(uFile.getCanonicalFile())), e8);
                   }
                }else {
                   break ;
                }
             }
          }
       }
       throw new IllegalArgumentException("Name must not be empty");
    }
    public void attachInfo(Context p0,ProviderInfo p1){
       super.attachInfo(p0, p1);
       if (p1.exported != null) {
          throw new SecurityException("Provider must not be exported");
       }
       if (p1.grantUriPermissions == null) {
          throw new SecurityException("Provider must grant uri permissions");
       }
       this.mStrategy = FileProvider.getPathStrategy(p0, p1.authority);
       return;
    }
    public int delete(Uri p0,String p1,String[] p2){
       if (this.mStrategy.a(p0).delete()) {
          return 1;
       }
       return 0;
    }
    public String getType(Uri p0){
       File uFile = this.mStrategy.a(p0);
       int i = (uFile.getName()).lastIndexOf(46);
       if (i >= 0) {
          String mimeTypeFrom = MimeTypeMap.getSingleton().getMimeTypeFromExtension((uFile.getName()).substring((i + 1)));
          if (mimeTypeFrom != null) {
             return mimeTypeFrom;
          }
       }
       return "application/octet-stream";
    }
    public Uri insert(Uri p0,ContentValues p1){
       throw new UnsupportedOperationException("No external inserts");
    }
    public boolean onCreate(){
       return true;
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1){
       return ParcelFileDescriptor.open(this.mStrategy.a(p0), FileProvider.modeToMode(p1));
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       int i2;
       File uFile = this.mStrategy.a(p0);
       if (p1 == null) {
          p1 = FileProvider.COLUMNS;
       }
       String[] stringArray = new String[p1.length];
       Object[] objArray = new Object[p1.length];
       int len = p1.length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          object oobject = p1[i];
          String str = "_display_name";
          if (str.equals(oobject)) {
             stringArray[i1] = str;
             i2 = i1 + 1;
             objArray[i1] = uFile.getName();
          }else {
             str = "_size";
             if (str.equals(oobject)) {
                stringArray[i1] = str;
                i2 = i1 + 1;
                objArray[i1] = Long.valueOf(uFile.length());
             }
          }
          i1 = i2;
       label_0042 :
          i = i + 1;
       }
       MatrixCursor matrixCursor = new MatrixCursor(FileProvider.copyOf(stringArray, i1), 1);
       matrixCursor.addRow(FileProvider.copyOf(objArray, i1));
       return matrixCursor;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       throw new UnsupportedOperationException("No external updates");
    }
}
