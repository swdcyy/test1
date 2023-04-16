package com.yxcorp.gifshow.util.j;
import java.io.File;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.StrictMode;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.StringBuilder;
import ekd.e0;
import android.content.Context;
import androidx.core.content.FileProvider;
import android.content.ContentResolver;
import android.provider.MediaStore$Audio$Media;
import android.database.Cursor;
import android.content.ContentValues;
import android.provider.MediaStore$Files;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;

public class j	// class@001f85
{

    public static Uri a(File p0){
       if (Build$VERSION.SDK_INT >= 24) {
          try{
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             StrictMode.class.getDeclaredMethod("disableDeathOnFileUriExposure", uClassArray).invoke(null, objArray);
          }catch(java.lang.Exception e4){
             throw new Exception(e4);
          }
       }
       return Uri.parse("file://"+p0.getAbsolutePath());
    }
    public static Uri b(File p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return FileProvider.getUriForFile(e0.b, e0.b.getPackageName()+".fileprovider", p0);
       }
       return Uri.fromFile(p0);
    }
    public static Uri c(Context p0,File p1){
       String absolutePath = p1.getAbsolutePath();
       String[] stringArray = new String[]{"_id"};
       String[] stringArray1 = new String[]{absolutePath};
       Cursor uCursor = p0.getContentResolver().query(MediaStore$Audio$Media.EXTERNAL_CONTENT_URI, stringArray, "_data=? ", stringArray1, null);
       int i = 0;
       if (uCursor != null) {
          if (uCursor.moveToFirst()) {
             i = Uri.withAppendedPath(Uri.parse("content://media/external/audio/media"), uCursor.getInt(uCursor.getColumnIndex("_id")));
          }
          uCursor.close();
       }
       if (i == null) {
          ContentValues uContentValu = new ContentValues();
          uContentValu.put("_data", absolutePath);
          i = p0.getContentResolver().insert(MediaStore$Audio$Media.EXTERNAL_CONTENT_URI, uContentValu);
       }
       return i;
    }
    public static Uri d(Context p0,File p1){
       String str = "_id";
       String[] stringArray = new String[]{str};
       String str1 = "external";
       String[] stringArray1 = new String[]{p1.getAbsolutePath()};
       Cursor uCursor = p0.getContentResolver().query(MediaStore$Files.getContentUri(str1), stringArray, "_data=? ", stringArray1, null);
       Uri uri = null;
       if (uCursor != null) {
          if (uCursor.moveToFirst()) {
             uri = MediaStore$Files.getContentUri(str1, (long)uCursor.getInt(uCursor.getColumnIndex(str)));
          }
          uCursor.close();
       }
       return uri;
    }
    public static Uri e(Context p0,String p1,File p2){
       Uri uri = null;
       if (p0 == null) {
          return uri;
       }
       if (p2 != null && p2.exists()) {
          if (Build$VERSION.SDK_INT < 24) {
             uri = Uri.fromFile(p2);
          }else if(TextUtils.x(p1)){
             p1 = "*/*";
          }
          Objects.requireNonNull(p1);
          int i = -1;
          switch (p1.hashCode()){
              case 0xcf530d38:
                if (p1.equals("vieo/*")) {
                   i = 0;
                }
                break;
              case 0xd8960431:
                if (p1.equals("audio/*")) {
                   i = 1;
                }
                break;
              case 0x30b78e68:
                if (p1.equals("text/plain")) {
                   i = 2;
                }
                break;
              case 0x71f5c476:
                if (p1.equals("image/*")) {
                   i = 3;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                uri = j.g(p0, p2);
                break;
              case 1:
                uri = j.c(p0, p2);
                break;
              case 2:
                uri = j.d(p0, p2);
                break;
              case 3:
                uri = j.f(p0, p2);
                break;
              default:
          }
          if (uri == null) {
             try{
                uri = j.a(p2);
             }catch(java.lang.Exception e0){
                uri = j.b(p2);
             }
          }
       }
    }
    public static Uri f(Context p0,File p1){
       String absolutePath = p1.getAbsolutePath();
       String[] stringArray = new String[]{"_id"};
       String[] stringArray1 = new String[]{absolutePath};
       Cursor uCursor = p0.getContentResolver().query(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, stringArray, "_data=? ", stringArray1, null);
       int i = 0;
       if (uCursor != null) {
          if (uCursor.moveToFirst()) {
             i = Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), uCursor.getInt(uCursor.getColumnIndex("_id")));
          }
          uCursor.close();
       }
       if (i == null) {
          ContentValues uContentValu = new ContentValues();
          uContentValu.put("_data", absolutePath);
          i = p0.getContentResolver().insert(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, uContentValu);
       }
       return i;
    }
    public static Uri g(Context p0,File p1){
       String absolutePath = p1.getAbsolutePath();
       String[] stringArray = new String[]{"_id"};
       String[] stringArray1 = new String[]{absolutePath};
       Cursor uCursor = p0.getContentResolver().query(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, stringArray, "_data=? ", stringArray1, null);
       int i = 0;
       if (uCursor != null) {
          if (uCursor.moveToFirst()) {
             i = Uri.withAppendedPath(Uri.parse("content://media/external/video/media"), uCursor.getInt(uCursor.getColumnIndex("_id")));
          }
          uCursor.close();
       }
       if (i == null) {
          ContentValues uContentValu = new ContentValues();
          uContentValu.put("_data", absolutePath);
          i = p0.getContentResolver().insert(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, uContentValu);
       }
       return i;
    }
}
