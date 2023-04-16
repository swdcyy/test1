package com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.ImageEditingManager$b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.camera.ImageEditingManager$a;
import android.os.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import cb.a;
import android.media.ExifInterface;
import com.kwai.robust.PatchProxyResult;
import java.io.IOException;
import android.graphics.Bitmap$CompressFormat;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.util.Iterator;
import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageEditingManager$c;
import java.lang.Integer;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.util.Map;
import java.util.Collections;

public class ImageEditingManager extends ReactContextBaseJavaModule	// class@001284
{
    public static final String[] EXIF_ATTRIBUTES;
    public static final List LOCAL_URI_PREFIXES;

    static {
       String[] stringArray = new String[]{"file://","content://"};
       ImageEditingManager.LOCAL_URI_PREFIXES = Arrays.asList(stringArray);
       stringArray = new String[]{"FNumber","DateTime","DateTimeDigitized","ExposureTime","Flash","FocalLength","GPSAltitude","GPSAltitudeRef","GPSDateStamp","GPSLatitude","GPSLatitudeRef","GPSLongitude","GPSLongitudeRef","GPSProcessingMethod","GPSTimeStamp","ImageLength","ImageWidth","ISOSpeedRatings","Make","Model","Orientation","SubSecTime","SubSecTimeDigitized","SubSecTimeOriginal","WhiteBalance"};
       ImageEditingManager.EXIF_ATTRIBUTES = stringArray;
    }
    public void ImageEditingManager(ReactApplicationContext p0){
       super(p0);
       Void[] voidArray = new Void[0];
       new ImageEditingManager$b(this.getReactApplicationContext(), null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
    }
    public static void copyExif(Context p0,Uri p1,File p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ImageEditingManager.class, "4")) {
          return;
       }
       File fileFromUri = ImageEditingManager.getFileFromUri(p0, p1);
       if (fileFromUri == null) {
          a.x("ReactNative", "Couldn\'t get real path for uri: "+p1);
          return;
       }else {
          ExifInterface uExifInterfa = new ExifInterface(fileFromUri.getAbsolutePath());
          ExifInterface uExifInterfa1 = new ExifInterface(p2.getAbsolutePath());
          String[] eXIF_ATTRIBU = ImageEditingManager.EXIF_ATTRIBUTES;
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
       File obj = PatchProxy.applyTwoRefs(p0, p1, null, ImageEditingManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getExternalCacheDir();
       File cacheDir = p0.getCacheDir();
       if (obj == null && cacheDir == null) {
          throw new IOException("No cache directory available");
       }
       if (obj == null || (cacheDir != null && obj.getFreeSpace() - cacheDir.getFreeSpace() <= 0)) {
          obj = cacheDir;
       }
       return File.createTempFile("ReactNative_cropped_image_", ImageEditingManager.getFileExtensionForType(p1), obj);
    }
    public static Bitmap$CompressFormat getCompressFormatForType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageEditingManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("image/png").equals(p0)) {
          return Bitmap$CompressFormat.PNG;
       }
       if (("image/webp").equals(p0)) {
          return Bitmap$CompressFormat.WEBP;
       }
       return Bitmap$CompressFormat.JPEG;
    }
    public static int getDecodeSampleSize(int p0,int p1,int p2,int p3){
       int i = 1;
       if (p1 > p2 || p0 > p3) {
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
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageEditingManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("image/png").equals(p0)) {
          return ".png";
       }
       if (("image/webp").equals(p0)) {
          return ".webp";
       }
       return ".jpg";
    }
    public static File getFileFromUri(Context p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ImageEditingManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
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
       Iterator obj = PatchProxy.applyOneRefs(p0, null, ImageEditingManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ImageEditingManager.LOCAL_URI_PREFIXES.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (p0.startsWith(obj.next())) {
             break ;
          }
       }
       return true;
    }
    public static void writeCompressedBitmapToFile(Bitmap p0,String p1,File p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ImageEditingManager.class, "9")) {
          return;
       }
       FileOutputStream uFileOutputS = new FileOutputStream(p2);
       p0.compress(ImageEditingManager.getCompressFormatForType(p1), 90, uFileOutputS);
       uFileOutputS.close();
       return;
    }
    public void cropImage(String p0,ReadableMap p1,Callback p2,Callback p3){
       ReadableMap readableMap = p1;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ImageEditingManager.class, "3")) {
          return;
       }
       String str = "offset";
       ReadableMap readableMap1 = null;
       ReadableMap map = (readableMap.hasKey(str))? readableMap.getMap(str): readableMap1;
       String str1 = "size";
       if (readableMap.hasKey(str1)) {
          readableMap1 = readableMap.getMap(str1);
       }
       if (map != null && readableMap1 != null) {
          str1 = "x";
          if (map.hasKey(str1)) {
             String str2 = "y";
             if (map.hasKey(str2)) {
                Object[] String str3 = "width";
                if (readableMap1.hasKey(str3)) {
                   String str4 = "height";
                   if (readableMap1.hasKey(str4)) {
                      if (p0 != null && !p0.isEmpty()) {
                         ImageEditingManager$c uoc = new ImageEditingManager$c(this.getReactApplicationContext(), p0, (int)map.getDouble(str1), (int)map.getDouble(str2), (int)readableMap1.getDouble(str3), (int)readableMap1.getDouble(str4), p2, p3, null);
                         str = "displaySize";
                         if (readableMap.hasKey(str)) {
                            map = readableMap.getMap(str);
                            int i = (int)map.getDouble(str3);
                            int i1 = (int)map.getDouble(str4);
                            if (!PatchProxy.isSupport(ImageEditingManager$c.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), v6, ImageEditingManager$c.class, "1")) {
                               if (i > 0 && i1 > 0) {
                                  v6.g = i;
                                  v6.h = i1;
                               }else {
                                  str3 = new Object[]{Integer.valueOf(i),Integer.valueOf(i1)};
                                  throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", str3));
                               }
                            }
                         }
                         Void[] voidArray = new Void[0];
                         v6.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
                         return;
                      }else {
                         throw new JSApplicationIllegalArgumentException("Please specify a URI");
                      }
                   }
                }
             }
          }
       }
       throw new JSApplicationIllegalArgumentException("Please specify offset and size");
    }
    public Map getConstants(){
       Object obj = PatchProxy.apply(null, this, ImageEditingManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.emptyMap();
    }
    public String getName(){
       return "ImageEditingManager";
    }
    public void onCatalystInstanceDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ImageEditingManager.class, "2")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new ImageEditingManager$b(this.getReactApplicationContext(), objArray).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
       return;
    }
}
