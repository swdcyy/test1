package com.sina.weibo.sdk.b.b;
import android.content.Context;
import android.net.Uri;
import java.lang.String;
import android.provider.DocumentsContract;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import java.lang.Object;
import java.lang.Long;
import android.content.ContentUris;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Audio$Media;
import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.media.MediaMetadataRetriever;

public final class b	// class@000bb5
{

    public static String a(Context p0,Uri p1){
       String str = null;
       if (DocumentsContract.isDocumentUri(p0, p1)) {
          String str1 = ":";
          if (b.b(p1)) {
             String[] stringArray = (DocumentsContract.getDocumentId(p1)).split(str1);
             if (("primary").equalsIgnoreCase(stringArray[0])) {
                return Environment.getExternalStorageDirectory()+"/"+stringArray[1];
             }
          }else if(b.c(p1)){
             return b.a(p0, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(p1)).longValue()), str, str);
          }else if(b.d(p1)){
             String[] stringArray1 = (DocumentsContract.getDocumentId(p1)).split(str1);
             object oobject = stringArray1[0];
             if (("image").equals(oobject)) {
                str = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
             }else if(("video").equals(oobject)){
                str = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
             }else if(("audio").equals(oobject)){
                str = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
             }
             String[] stringArray2 = new String[]{stringArray1[1]};
             return b.a(p0, str, "_id=?", stringArray2);
          }
       }else if(("content").equalsIgnoreCase(p1.getScheme())){
          if (b.e(p1)) {
             return p1.getLastPathSegment();
          }else {
             return b.b(p0, p1);
          }
       }else if(("file").equalsIgnoreCase(p1.getScheme())){
          return p1.getPath();
       }
       return str;
    }
    public static String a(Context p0,Uri p1,String p2,String[] p3){
       String[] stringArray = new String[]{"_data"};
       Cursor uCursor = null;
       try{
          uCursor = p0.getContentResolver().query(p1, stringArray, p2, p3, null);
          if (uCursor != null && uCursor.moveToFirst()) {
             uCursor.close();
             return uCursor.getString(uCursor.getColumnIndexOrThrow("_data"));
          }else if(uCursor != null){
          }
          return b.b(p0, p1);
       }catch(java.lang.Exception e0){
          if (uCursor) {
          }else {
             goto label_0038 ;
          }
       }
       uCursor.close();
       goto label_0038 ;
    }
    public static String b(Context p0,Uri p1){
       String str = p1.toString();
       return new File(p0.getExternalFilesDir(null), str.substring(str.lastIndexOf("/"))).getAbsolutePath();
    }
    public static String b(File p0){
       String str;
       try{
          BitmapFactory$Options options = new BitmapFactory$Options();
          options.inJustDecodeBounds = true;
          BitmapFactory.decodeFile(p0.getAbsolutePath(), options);
          BitmapFactory$Options outMimeType = options.outMimeType;
          str = (!outMimeType.contains("jpg") && (!outMimeType.contains("gif") && (outMimeType.contains("png") || outMimeType.contains("jpeg"))))? "image/*": null;
       }catch(java.lang.Exception e0){
          str = "*/*";
       }
       return str;
    }
    public static boolean b(Uri p0){
       return ("com.android.externalstorage.documents").equals(p0.getAuthority());
    }
    public static boolean c(Uri p0){
       return ("com.android.providers.downloads.documents").equals(p0.getAuthority());
    }
    public static boolean c(File p0){
       if (p0.getParent() != null) {
          p0 = new File(p0.getParentFile().getCanonicalFile(), p0.getName());
       }
       if (!p0.getCanonicalFile().equals(p0.getAbsoluteFile())) {
          return true;
       }else {
          return false;
       }
    }
    public static boolean d(Uri p0){
       return ("com.android.providers.media.documents").equals(p0.getAuthority());
    }
    public static long e(String p0){
       if (TextUtils.isEmpty(p0)) {
          return 0;
       }
       if (!new File(p0).exists()) {
          return 0;
       }
       MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
       mediaMetadat.setDataSource(p0);
       return Long.parseLong(mediaMetadat.extractMetadata(9));
    }
    public static boolean e(Uri p0){
       return ("com.google.android.apps.photos.content").equals(p0.getAuthority());
    }
}
