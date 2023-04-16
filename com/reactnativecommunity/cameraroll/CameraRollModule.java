package com.reactnativecommunity.cameraroll.CameraRollModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.String;
import com.facebook.react.bridge.ReactApplicationContext;
import android.database.Cursor;
import com.facebook.react.bridge.WritableMap;
import android.content.ContentResolver;
import java.util.Set;
import com.facebook.react.bridge.WritableNativeArray;
import java.lang.Object;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.ReadableArray;
import java.lang.StringBuilder;
import android.net.Uri;
import java.io.File;
import android.content.res.AssetFileDescriptor;
import java.lang.Throwable;
import cb.a;
import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;
import java.lang.Integer;
import android.graphics.BitmapFactory$Options;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import com.facebook.react.bridge.Promise;
import com.reactnativecommunity.cameraroll.CameraRollModule$b;
import com.facebook.react.bridge.ReactContext;
import android.os.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import com.yxcorp.gifshow.albumcontrol.a;
import android.content.ContextWrapper;
import android.provider.MediaStore$Files;
import v79.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import com.reactnativecommunity.cameraroll.CameraRollModule$c;
import com.reactnativecommunity.cameraroll.CameraRollModule$a;
import com.reactnativecommunity.cameraroll.CameraRollModule$d;

public class CameraRollModule extends ReactContextBaseJavaModule	// class@000b5b
{
    public static final String[] PROJECTION;

    static {
       String[] stringArray = new String[]{"_id","mime_type","bucket_display_name","datetaken","width","height","_size","_data"};
       CameraRollModule.PROJECTION = stringArray;
    }
    public void CameraRollModule(ReactApplicationContext p0){
       super(p0);
    }
    public static void putBasicNodeInfo(Cursor p0,WritableMap p1,int p2,int p3,int p4){
       p1.putString("type", p0.getString(p2));
       p1.putString("group_name", p0.getString(p3));
       p1.putDouble("timestamp", ((double)p0.getLong(p4) / 0x408f400000000000));
    }
    public static void putEdges(ContentResolver p0,Cursor p1,WritableMap p2,int p3,Set p4){
       Cursor uCursor1;
       int i4;
       boolean b7;
       int i5;
       WritableNativeArray writableNati6;
       Cursor uCursor = p1;
       Set set = p4;
       WritableNativeArray writableNati = new WritableNativeArray();
       p1.moveToFirst();
       int columnIndex = uCursor.getColumnIndex("mime_type");
       int columnIndex1 = uCursor.getColumnIndex("bucket_display_name");
       int columnIndex2 = uCursor.getColumnIndex("datetaken");
       int columnIndex3 = uCursor.getColumnIndex("width");
       int columnIndex4 = uCursor.getColumnIndex("height");
       int columnIndex5 = uCursor.getColumnIndex("_size");
       int columnIndex6 = uCursor.getColumnIndex("_data");
       boolean b = set.contains("location");
       boolean b1 = set.contains("filename");
       boolean b2 = set.contains("fileSize");
       boolean b3 = set.contains("imageSize");
       boolean b4 = set.contains("playableDuration");
       int i = p3;
       int b5 = false;
       while (b5 < i && !p1.isAfterLast()) {
          WritableNativeMap writableNati1 = new WritableNativeMap();
          WritableNativeMap writableNati2 = writableNati1;
          WritableNativeArray writableNati3 = writableNati;
          WritableNativeMap writableNati4 = writableNati1;
          WritableNativeMap writableNati5 = new WritableNativeMap();
          int i1 = b5;
          boolean b6 = b;
          int i2 = columnIndex6;
          int i3 = columnIndex2;
          if (CameraRollModule.putImageInfo(p0, p1, writableNati2, columnIndex3, columnIndex4, columnIndex5, columnIndex6, columnIndex, b1, b2, b3, b4)) {
             uCursor1 = p1;
             i4 = i3;
             CameraRollModule.putBasicNodeInfo(uCursor1, writableNati4, columnIndex, columnIndex1, i4);
             b7 = b6;
             i5 = i2;
             CameraRollModule.putLocationInfo(uCursor1, writableNati4, i5, b7);
             writableNati1 = writableNati5;
             writableNati1.putMap("node", writableNati4);
             writableNati6 = writableNati3;
             writableNati6.pushMap(writableNati1);
             b5 = i1;
          }else {
             uCursor1 = p1;
             i4 = i3;
             writableNati6 = writableNati3;
             b7 = b6;
             i5 = i2;
             b5 = i1 - 1;
          }
          p1.moveToNext();
          b5 = b5 + 1;
          i = p3;
          columnIndex2 = i4;
          columnIndex6 = i5;
          b = b7;
          writableNati = writableNati6;
       }
       p2.putArray("edges", writableNati);
       return;
    }
    public static boolean putImageInfo(ContentResolver p0,Cursor p1,WritableMap p2,int p3,int p4,int p5,int p6,int p7,boolean p8,boolean p9,boolean p10,boolean p11){
       Cursor uCursor = p1;
       int i = p6;
       WritableNativeMap writableNati = new WritableNativeMap();
       Uri uri = Uri.parse("file://"+uCursor.getString(i));
       writableNati.putString("uri", uri.toString());
       String str = uCursor.getString(p7);
       boolean b = true;
       boolean b1 = (str != null && str.startsWith("video"))? true: false;
       boolean b2 = CameraRollModule.putImageSize(p0, p1, writableNati, p3, p4, uri, b1, p10);
       boolean b3 = CameraRollModule.putPlayableDuration(p0, writableNati, uri, b1, p11);
       String str1 = "filename";
       if (p8) {
          writableNati.putString(str1, new File(uCursor.getString(i)).getName());
       }else {
          writableNati.putNull(str1);
       }
       str1 = "fileSize";
       if (p9) {
          writableNati.putDouble(str1, (double)uCursor.getLong(p5));
       }else {
          writableNati.putNull(str1);
       }
       p2.putMap("image", writableNati);
       if (!b2 || !b3) {
          b = false;
       }
       return b;
    }
    public static boolean putImageSize(ContentResolver p0,Cursor p1,WritableMap p2,int p3,int p4,Uri p5,boolean p6,boolean p7){
       AssetFileDescriptor uAssetFileDe;
       int i;
       p2.putNull("width");
       p2.putNull("height");
       boolean b = true;
       if (!p7) {
          return b;
       }
       try{
          p3 = p1.getInt(p3);
          int intx = p1.getInt(p4);
          if (p3 <= 0 || intx <= 0) {
             FileDescriptor uFileDescrip = null;
             try{
                uAssetFileDe = p0.openAssetFileDescriptor(p5, "r");
                i = 1;
             }catch(java.io.FileNotFoundException e6){
                a.h("ReactNative", "Could not open asset file "+p5.toString(), e6);
                uAssetFileDe = uFileDescrip;
                i = 0;
             }
             if (uAssetFileDe != null) {
                if (p6) {
                   MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
                   mediaMetadat.setDataSource(uAssetFileDe.getFileDescriptor());
                   try{
                      uFileDescrip = 18;
                      p3 = Integer.parseInt(mediaMetadat.extractMetadata(uFileDescrip));
                      intx = Integer.parseInt(mediaMetadat.extractMetadata(19));
                      p4 = i;
                   }catch(java.lang.NumberFormatException e13){
                      a.h("ReactNative", "Number format exception occurred while trying to fetch video metadata for "+p5.toString(), e13);
                   }
                   mediaMetadat.release();
                   b = p4;
                label_0098 :
                   uAssetFileDe.close();
                }else {
                   BitmapFactory$Options options = new BitmapFactory$Options();
                   options.inJustDecodeBounds = b;
                   BitmapFactory.decodeFileDescriptor(uAssetFileDe.getFileDescriptor(), uFileDescrip, options);
                   BitmapFactory$Options outWidth = options.outWidth;
                   options = options.outHeight;
                }
             }
             b = i;
             goto label_0098 ;
          }
          p2.putInt("width", p3);
          p2.putInt("height", intx);
          return b;
       }catch(java.io.IOException e0){
       }
    }
    public static void putLocationInfo(Cursor p0,WritableMap p1,int p2,boolean p3){
       p1.putNull("location");
       if (!p3) {
          return;
       }
       try{
          float[] uofloatArray = new float[2];
          if (new ExifInterface(p0.getString(p2)).getLatLong(uofloatArray)) {
             WritableNativeMap writableNati = new WritableNativeMap();
             writableNati.putDouble("longitude", (double)uofloatArray[1]);
             writableNati.putDouble("latitude", (double)uofloatArray[0]);
             p1.putMap("location", writableNati);
          }
       }catch(java.io.IOException e4){
          a.h("ReactNative", "Could not read the metadata", e4);
       }
       return;
    }
    public static void putPageInfo(Cursor p0,WritableMap p1,int p2,int p3){
       WritableNativeMap writableNati = new WritableNativeMap();
       boolean b = (p2 < p0.getCount())? true: false;
       writableNati.putBoolean("has_next_page", b);
       if (p2 < p0.getCount()) {
          writableNati.putString("end_cursor", Integer.toString((p3 + p2)));
       }
       p1.putMap("page_info", writableNati);
       return;
    }
    public static boolean putPlayableDuration(ContentResolver p0,WritableMap p1,Uri p2,boolean p3,boolean p4){
       AssetFileDescriptor uAssetFileDe;
       int i;
       p1.putNull("playableDuration");
       boolean b = true;
       if (p4 && p3) {
          Integer integer = null;
          try{
             uAssetFileDe = p0.openAssetFileDescriptor(p2, "r");
          }catch(java.io.FileNotFoundException e6){
             a.h("ReactNative", "Could not open asset file "+p2.toString(), e6);
             uAssetFileDe = integer;
             b = false;
          }
          if (uAssetFileDe != null) {
             MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
             mediaMetadat.setDataSource(uAssetFileDe.getFileDescriptor());
             try{
                i = 9;
                integer = Integer.valueOf((Integer.parseInt(mediaMetadat.extractMetadata(i)) / 1000));
                p3 = b;
             }catch(java.lang.NumberFormatException e2){
                a.h("ReactNative", "Number format exception occurred while trying to fetch video metadata for "+Integer.valueOf((Integer.parseInt(mediaMetadat.extractMetadata(i)) / 1000)).toString(), e2);
             }
             mediaMetadat.release();
             b = p3;
          }
          if (uAssetFileDe != null) {
             try{
                uAssetFileDe.close();
             }catch(java.io.IOException e0){
             }
          }
       }
    label_0080 :
       return b;
    }
    public void deletePhotos(ReadableArray p0,Promise p1){
       this.deletePhotosWithParam(p0, null, p1);
    }
    public void deletePhotosWithParam(ReadableArray p0,ReadableMap p1,Promise p2){
       String str1;
       if (p1 != null) {
          String str = "bizType";
          if (p1.hasKey(str)) {
             str1 = p1.getString(str);
          label_0010 :
             if (!p0.size()) {
                p2.reject("E_UNABLE_TO_DELETE", "Need at least one URI to delete");
             }else {
                Void[] voidArray = new Void[0];
                new CameraRollModule$b(this.getReactApplicationContext(), str1, p0, p2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
             }
             return;
          }
       }
       str1 = null;
       goto label_0010 ;
    }
    public void getAlbums(ReadableMap p0,Promise p1){
       String str = "Could not get media";
       String str1 = "assetType";
       String str2 = "All";
       str1 = (p0.hasKey(str1))? p0.getString(str1): str2;
       String str3 = "bizType";
       StringBuilder str4 = (p0.hasKey(str3))? p0.getString(str3): null;
       String str5 = str4;
       str4 = "1";
       ArrayList uArrayList = new ArrayList();
       String str6 = "Photos";
       if (str1.equals(str6)) {
          str4 = str4+" AND media_type = 1";
       }else {
          String str7 = "Videos";
          if (str1.equals(str7)) {
             str4 = str4+" AND media_type = 3";
          }else if(str1.equals(str2)){
             str4 = str4+" AND media_type IN \(3,1\)";
          }else {
             p1.reject("E_UNABLE_TO_FILTER", "Invalid filter option: \'"+str1+"\'. Expected one of \'"+str6+"\', \'"+str7+"\' or \'"+str2+"\'.");
             return;
          }
       }
       str1 = "bucket_display_name";
       String[] stringArray = new String[]{str1};
       try{
          String[] stringArray1 = new String[uArrayList.size()];
          a uoa = a.b.j(str5, this.getReactApplicationContext().getContentResolver(), MediaStore$Files.getContentUri("external"), stringArray, str4, uArrayList.toArray(stringArray1), null);
          if (uoa == null || uoa.a() == null) {
             p1.reject("E_UNABLE_TO_LOAD", str);
          }else {
             Cursor uCursor = uoa.a();
             WritableNativeArray writableNati = new WritableNativeArray();
             if (uCursor.moveToFirst()) {
                HashMap hashMap = new HashMap();
                do {
                   str6 = uCursor.getString(uCursor.getColumnIndex(str1));
                   if (str6 != null) {
                      Integer integer = hashMap.get(str6);
                      int i = 1;
                      if (integer == null) {
                         hashMap.put(str6, Integer.valueOf(i));
                      }else {
                         int i1 = integer.intValue() + i;
                         hashMap.put(str6, Integer.valueOf(i1));
                      }
                   }
                } while (!uCursor.moveToNext());
                Iterator iterator = hashMap.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   WritableNativeMap writableNati1 = new WritableNativeMap();
                   writableNati1.putString("title", uEntry.getKey());
                   writableNati1.putInt("count", uEntry.getValue().intValue());
                   writableNati.pushMap(writableNati1);
                }
             }
             uCursor.close();
             p1.resolve(writableNati);
          }
       }catch(java.lang.Exception e14){
          p1.reject("E_UNABLE_TO_LOAD", str, e14);
       }
       return;
    }
    public String getName(){
       return "RNCCameraRoll";
    }
    public void getPhotos(ReadableMap p0,Promise p1){
       ReadableMap readableMap = p0;
       int intx = readableMap.getInt("first");
       String str = "after";
       ReactApplicationContext reactApplica = null;
       String str1 = (readableMap.hasKey(str))? readableMap.getString(str): reactApplica;
       str = "groupName";
       String str2 = (readableMap.hasKey(str))? readableMap.getString(str): reactApplica;
       str = "assetType";
       str = (readableMap.hasKey(str))? readableMap.getString(str): "Photos";
       String str3 = str;
       str = "bizType";
       String str4 = (readableMap.hasKey(str))? readableMap.getString(str): reactApplica;
       str = "fromTime";
       int i = 0;
       long l = (readableMap.hasKey(str))? (long)readableMap.getDouble(str): i;
       str = "toTime";
       long l1 = (readableMap.hasKey(str))? (long)readableMap.getDouble(str): i;
       str = "mimeTypes";
       ReadableArray readableArra = (readableMap.hasKey(str))? readableMap.getArray(str): reactApplica;
       str = "include";
       ReadableArray array = (readableMap.hasKey(str))? readableMap.getArray(str): reactApplica;
       CameraRollModule$c uoc = new CameraRollModule$c(this.getReactApplicationContext(), str4, intx, str1, str2, readableArra, str3, l, l1, array, p1, null);
       Void[] voidArray = new Void[0];
       str.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
       return;
    }
    public void saveToCameraRoll(String p0,ReadableMap p1,Promise p2){
       Void[] voidArray = new Void[0];
       new CameraRollModule$d(this.getReactApplicationContext(), Uri.parse(p0), p1, p2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
    }
}
