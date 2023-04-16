package com.reactnativecommunity.imageeditor.ImageEditorModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import com.facebook.react.bridge.ReactApplicationContext;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.lang.StringBuilder;
import cb.a;
import android.media.ExifInterface;
import java.io.IOException;
import android.graphics.Bitmap$CompressFormat;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.reactnativecommunity.imageeditor.ImageEditorModule$b;
import com.facebook.react.bridge.ReactContext;
import com.reactnativecommunity.imageeditor.ImageEditorModule$a;
import java.lang.Integer;
import android.os.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import java.lang.Throwable;
import java.util.Map;
import java.util.Collections;

public class ImageEditorModule extends ReactContextBaseJavaModule	// class@000b5f
{
    public static final String[] EXIF_ATTRIBUTES;
    public static final List LOCAL_URI_PREFIXES;

    static {
       String[] stringArray = new String[]{"file","content","android.resource"};
       ImageEditorModule.LOCAL_URI_PREFIXES = Arrays.asList(stringArray);
       stringArray = new String[]{"FNumber","DateTime","DateTimeDigitized","ExposureTime","Flash","FocalLength","GPSAltitude","GPSAltitudeRef","GPSDateStamp","GPSLatitude","GPSLatitudeRef","GPSLongitude","GPSLongitudeRef","GPSProcessingMethod","GPSTimeStamp","ImageLength","ImageWidth","ISOSpeedRatings","Make","Model","Orientation","SubSecTime","SubSecTimeDigitized","SubSecTimeOriginal","WhiteBalance"};
       ImageEditorModule.EXIF_ATTRIBUTES = stringArray;
    }
    public void ImageEditorModule(ReactApplicationContext p0){
       super(p0);
    }
    public static void copyExif(Context p0,Uri p1,File p2){
       File fileFromUri = ImageEditorModule.getFileFromUri(p0, p1);
       if (fileFromUri == null) {
          a.x("ReactNative", "Couldn\'t get real path for uri: "+p1);
          return;
       }else {
          ExifInterface uExifInterfa = new ExifInterface(fileFromUri.getAbsolutePath());
          ExifInterface uExifInterfa1 = new ExifInterface(p2.getAbsolutePath());
          String[] eXIF_ATTRIBU = ImageEditorModule.EXIF_ATTRIBUTES;
          int len = eXIF_ATTRIBU.length;
          int i = 0;
          while (i < len) {
             object oobject = eXIF_ATTRIBU[i];
             String attribute = uExifInterfa.getAttribute(oobject);
             if (attribute != null) {
                uExifInterfa1.setAttribute(oobject, attribute);
             }
             i = i + 1;
          }
          uExifInterfa1.saveAttributes();
          return;
       }
    }
    public static File createTempFile(Context p0,String p1){
       File externalCach = p0.getExternalCacheDir();
       File cacheDir = p0.getCacheDir();
       if (externalCach == null && cacheDir == null) {
          throw new IOException("No cache directory available");
       }
       if (externalCach == null || (cacheDir != null && externalCach.getFreeSpace() - cacheDir.getFreeSpace() <= 0)) {
          externalCach = cacheDir;
       }
       return File.createTempFile("ReactNative_cropped_image_", p1, externalCach);
    }
    public static Bitmap$CompressFormat getCompressFormatForType(String p0){
       if ((".png").equals(p0)) {
          return Bitmap$CompressFormat.PNG;
       }
       if ((".webp").equals(p0)) {
          return Bitmap$CompressFormat.WEBP;
       }
       return Bitmap$CompressFormat.JPEG;
    }
    public static int getDecodeSampleSize(int p0,int p1,int p2,int p3){
       int i = 1;
       if (p1 > p3 || p0 > p2) {
          p1 = p1 / 2;
          p0 = p0 / 2;
          int i1 = p0 / i;
          while (i1 >= p2) {
             i1 = p1 / i;
             if (i1 >= p3) {
                i = i * 2;
             }
          }
       }
       return i;
    }
    public static String getFileExtensionForType(String p0){
       if (("image/png").equals(p0)) {
          return ".png";
       }
       if (("image/webp").equals(p0)) {
          return ".webp";
       }
       return ".jpg";
    }
    public static File getFileFromUri(Context p0,Uri p1){
       if ((p1.getScheme()).equals("file")) {
          return new File(p1.getPath());
       }
       if ((p1.getScheme()).equals("content")) {
          String[] stringArray = new String[]{"_data"};
          Cursor uCursor = p0.getContentResolver().query(p1, stringArray, null, null, null);
          if (uCursor != null) {
             if (uCursor.moveToFirst()) {
                String str = uCursor.getString(0);
                if (!TextUtils.isEmpty(str)) {
                   uCursor.close();
                   return new File(str);
                }
             }
             uCursor.close();
          }
       }
       return null;
    }
    public static boolean isLocalUri(String p0){
       Iterator iterator = ImageEditorModule.LOCAL_URI_PREFIXES.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (p0.startsWith(iterator.next())) {
             break ;
          }
       }
       return true;
    }
    public static void writeCompressedBitmapToFile(Bitmap p0,String p1,File p2){
       FileOutputStream uFileOutputS = new FileOutputStream(p2);
       p0.compress(ImageEditorModule.getCompressFormatForType(p1), 90, uFileOutputS);
       uFileOutputS.close();
    }
    public void cropImage(String p0,ReadableMap p1,Promise p2){
       ReadableMap readableMap = p1;
       String str = "offset";
       String str1 = null;
       ReadableMap map = (readableMap.hasKey(str))? readableMap.getMap(str): str1;
       String str2 = "size";
       ReadableMap map1 = (readableMap.hasKey(str2))? readableMap.getMap(str2): str1;
       if (map != null && map1 != null) {
          String str3 = "x";
          if (map.hasKey(str3) && (map.hasKey("y") && (map1.hasKey("width") && map1.hasKey("height")))) {
             if (p0 != null && !p0.isEmpty()) {
                String str4 = "cropImageFormat";
                if (readableMap.hasKey(str4)) {
                   str1 = readableMap.getString(str4);
                }
                if (str1 != null && (!("jpg").equals(str1) && (("png").equals(str1) || ("webp").equals(str1)))) {
                   ImageEditorModule$b uob = new ImageEditorModule$b(this.getReactApplicationContext(), p0, (int)map.getDouble(str3), (int)map.getDouble("y"), (int)map1.getDouble("width"), (int)map1.getDouble("height"), str1, p2, null);
                   str = "displaySize";
                   if (readableMap.hasKey(str)) {
                      readableMap = readableMap.getMap(str);
                      int i = (int)readableMap.getDouble("width");
                      int i1 = (int)readableMap.getDouble("height");
                      if (i > 0 && i1 > 0) {
                         str4.h = i;
                         str4.i = i1;
                      }else {
                         Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(i1)};
                         throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", objArray));
                      }
                   }
                   Void[] voidArray = new Void[0];
                   str4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
                   return;
                }else {
                   throw new JSApplicationIllegalArgumentException("Only support jpg, png and webp");
                }
             }else {
                throw new JSApplicationIllegalArgumentException("Please specify a URI");
             }
          }
       }
       throw new JSApplicationIllegalArgumentException("Please specify offset and size");
    }
    public void deleteCacheImage(String p0,Promise p1){
       if (TextUtils.isEmpty(p0)) {
          p1.reject("cachePath is invalid, please input valid path");
          return;
       }else {
          String str = "file:///";
          if (p0.startsWith(str)) {
             p0 = p0.replace(str, "");
          }
          try{
             File uFile = new File(p0);
             if (!uFile.exists()) {
                p1.reject("cachePath is not exist");
             }
             p1.resolve(String.valueOf(uFile.delete()));
          }catch(java.lang.Exception e3){
             p1.reject(e3);
          }
          return;
       }
    }
    public Map getConstants(){
       return Collections.emptyMap();
    }
    public String getName(){
       return "RNCImageEditor";
    }
}
