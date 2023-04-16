package com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.String;
import com.facebook.react.bridge.ReactApplicationContext;
import android.database.Cursor;
import com.facebook.react.bridge.WritableMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import android.content.ContentResolver;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.ReadableArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.net.Uri;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;
import java.lang.Throwable;
import cb.a;
import android.graphics.BitmapFactory$Options;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.camera.CameraRollManager$b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.camera.CameraRollManager$a;
import android.os.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.modules.camera.CameraRollManager$c;

public class CameraRollManager extends ReactContextBaseJavaModule	// class@00127f
{
    public static final String[] PROJECTION;

    static {
       String[] stringArray = new String[]{"_id","mime_type","bucket_display_name","datetaken","width","height","longitude","latitude","_data"};
       CameraRollManager.PROJECTION = stringArray;
    }
    public void CameraRollManager(ReactApplicationContext p0){
       super(p0);
    }
    public static void putBasicNodeInfo(Cursor p0,WritableMap p1,int p2,int p3,int p4){
       CameraRollManager uCameraRollM = CameraRollManager.class;
       if (PatchProxy.isSupport(uCameraRollM)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uCameraRollM, "5")) {
             return;
          }
       }
       p1.putString("type", p0.getString(p2));
       p1.putString("group_name", p0.getString(p3));
       p1.putDouble("timestamp", ((double)p0.getLong(p4) / 0x408f400000000000));
       return;
    }
    public static void putEdges(ContentResolver p0,Cursor p1,WritableMap p2,int p3){
       WritableNativeArray writableNati6;
       Cursor uCursor = p1;
       if (PatchProxy.isSupport(CameraRollManager.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, CameraRollManager.class, "4")) {
          return;
       }
       WritableNativeArray writableNati = new WritableNativeArray();
       p1.moveToFirst();
       int columnIndex = uCursor.getColumnIndex("_id");
       int columnIndex1 = uCursor.getColumnIndex("mime_type");
       int columnIndex2 = uCursor.getColumnIndex("bucket_display_name");
       int columnIndex3 = uCursor.getColumnIndex("datetaken");
       int columnIndex4 = uCursor.getColumnIndex("width");
       int columnIndex5 = uCursor.getColumnIndex("height");
       int columnIndex6 = uCursor.getColumnIndex("longitude");
       int columnIndex7 = uCursor.getColumnIndex("latitude");
       int columnIndex8 = uCursor.getColumnIndex("_data");
       int i = p3;
       int i1 = 0;
       while (i1 < i && !p1.isAfterLast()) {
          WritableNativeMap writableNati1 = new WritableNativeMap();
          WritableNativeMap writableNati2 = writableNati1;
          WritableNativeArray writableNati3 = writableNati;
          WritableNativeMap writableNati4 = new WritableNativeMap();
          int i2 = i1;
          int i3 = columnIndex;
          columnIndex = columnIndex7;
          int i4 = columnIndex4;
          columnIndex4 = columnIndex6;
          if (CameraRollManager.putImageInfo(p0, p1, writableNati1, columnIndex, columnIndex4, columnIndex5, columnIndex8, columnIndex1)) {
             WritableNativeMap writableNati5 = writableNati2;
             CameraRollManager.putBasicNodeInfo(uCursor, writableNati5, columnIndex1, columnIndex2, columnIndex3);
             CameraRollManager.putLocationInfo(uCursor, writableNati5, columnIndex4, columnIndex);
             writableNati4.putMap("node", writableNati5);
             writableNati6 = writableNati3;
             writableNati6.pushMap(writableNati4);
             i1 = i2;
          }else {
             writableNati6 = writableNati3;
             i1 = i2 - 1;
          }
          p1.moveToNext();
          i1 = i1 + 1;
          i = p3;
          writableNati = writableNati6;
          columnIndex7 = columnIndex;
          columnIndex6 = columnIndex4;
          columnIndex = i3;
          columnIndex4 = i4;
       }
       p2.putArray("edges", writableNati);
       return;
    }
    public static boolean putImageInfo(ContentResolver p0,Cursor p1,WritableMap p2,int p3,int p4,int p5,int p6,int p7){
       WritableNativeMap obj;
       AssetFileDescriptor uAssetFileDe;
       MediaMetadataRetriever mediaMetadat;
       CameraRollManager uCameraRollM = CameraRollManager.class;
       if (PatchProxy.isSupport(uCameraRollM)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          obj = PatchProxy.apply(objArray, null, uCameraRollM, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new WritableNativeMap();
       Uri uri = Uri.parse("file://"+p1.getString(p6));
       obj.putString("uri", uri.toString());
       float f = (float)p1.getInt(p4);
       float f1 = (float)p1.getInt(p5);
       String str = p1.getString(p7);
       if (str != null && str.startsWith("video")) {
          try{
             uAssetFileDe = p0.openAssetFileDescriptor(uri, "r");
             mediaMetadat = new MediaMetadataRetriever();
             mediaMetadat.setDataSource(uAssetFileDe.getFileDescriptor());
             if (f <= 0 || f1 <= 0) {
                f = 18;
                f = (float)Integer.parseInt(mediaMetadat.extractMetadata(f));
                f1 = (float)Integer.parseInt(mediaMetadat.extractMetadata(19));
             }
             int i = Integer.parseInt(mediaMetadat.extractMetadata(9)) / 1000;
             obj.putInt("playableDuration", i);
             mediaMetadat.release();
             uAssetFileDe.close();
          }catch(java.lang.Exception e8){
             a.h("ReactNative", "Could not get video metadata for "+uri.toString(), e8);
             return 0;
          }catch(java.lang.NumberFormatException e8){
             a.h("ReactNative", "Number format exception occurred while trying to fetch video metadata for "+uri.toString(), e8);
             mediaMetadat.release();
             uAssetFileDe.close();
             return 0;
          }
       }
       if (f <= 0 || f1 <= 0) {
          AssetFileDescriptor uAssetFileDe1 = p0.openAssetFileDescriptor(uri, "r");
          BitmapFactory$Options options = new BitmapFactory$Options();
          options.inJustDecodeBounds = true;
          BitmapFactory.decodeFileDescriptor(uAssetFileDe1.getFileDescriptor(), null, options);
          f = (float)options.outWidth;
          f1 = (float)options.outHeight;
          uAssetFileDe1.close();
       }
       obj.putDouble("width", (double)f);
       obj.putDouble("height", (double)f1);
       p2.putMap("image", obj);
       return 1;
    }
    public static void putLocationInfo(Cursor p0,WritableMap p1,int p2,int p3){
       if (PatchProxy.isSupport(CameraRollManager.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, CameraRollManager.class, "7")) {
          return;
       }
       double doublex = p0.getDouble(p2);
       double doublex1 = p0.getDouble(p3);
       String str = null;
       if (doublex - str > 0 || doublex1 - str > 0) {
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.putDouble("longitude", doublex);
          writableNati.putDouble("latitude", doublex1);
          p1.putMap("location", writableNati);
       }
       return;
    }
    public static void putPageInfo(Cursor p0,WritableMap p1,int p2){
       if (PatchProxy.isSupport(CameraRollManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, CameraRollManager.class, "3")) {
          return;
       }
       WritableNativeMap writableNati = new WritableNativeMap();
       boolean b = (p2 < p0.getCount())? true: false;
       writableNati.putBoolean("has_next_page", b);
       if (p2 < p0.getCount()) {
          p0.moveToPosition((p2 - 1));
          writableNati.putString("end_cursor", p0.getString(p0.getColumnIndex("datetaken")));
       }
       p1.putMap("page_info", writableNati);
       return;
    }
    public String getName(){
       return "CameraRollManager";
    }
    public void getPhotos(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraRollManager.class, "2")) {
          return;
       }
       int intx = p0.getInt("first");
       String str = "after";
       ReactApplicationContext reactApplica = null;
       String str1 = (p0.hasKey(str))? p0.getString(str): reactApplica;
       str = "groupName";
       String str2 = (p0.hasKey(str))? p0.getString(str): reactApplica;
       str = "assetType";
       str = (p0.hasKey(str))? p0.getString(str): "Photos";
       String str3 = str;
       str = "maxSize";
       Integer integer = (p0.hasKey(str))? Integer.valueOf(p0.getInt(str)): reactApplica;
       str = "mimeTypes";
       ReadableArray readableArra = (p0.hasKey(str))? p0.getArray(str): reactApplica;
       if (!p0.hasKey("groupTypes")) {
          CameraRollManager$b uob = new CameraRollManager$b(this.getReactApplicationContext(), intx, str1, str2, readableArra, str3, integer, p1, null);
          Void[] voidArray = new Void[0];
          p0.hasKey("groupTypes").executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
          return;
       }else {
          throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
       }
    }
    public void saveToCameraRoll(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CameraRollManager.class, "1")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new CameraRollManager$c(this.getReactApplicationContext(), Uri.parse(p0), p2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
       return;
    }
}
