package com.reactnativecommunity.cameraroll.CameraRollModule$d;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import android.net.Uri;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Void;
import java.io.File;
import java.lang.String;
import android.os.Environment;
import java.lang.StringBuilder;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.nio.channels.ReadableByteChannel;
import com.reactnativecommunity.cameraroll.a;
import android.content.Context;
import android.media.MediaScannerConnection$OnScanCompletedListener;
import android.media.MediaScannerConnection;
import java.lang.Throwable;
import cb.a;

public class CameraRollModule$d extends GuardedAsyncTask	// class@000b5a
{
    public final Context a;
    public final Uri b;
    public final Promise c;
    public final ReadableMap d;

    public void CameraRollModule$d(ReactContext p0,Uri p1,ReadableMap p2,Promise p3){
       super(p0);
       this.a = p0;
       this.b = p1;
       this.c = p3;
       this.d = p2;
    }
    public void doInBackgroundGuarded(Object[] p0){
       int i;
       FileChannel uFileChannel;
       File externalStor;
       FileChannel channel;
       CameraRollModule$d uod = this;
       String str = "album";
       String str1 = "";
       File uFile = new File(uod.b.getPath());
       try{
          i = 0;
          int i1 = 1;
          int i2 = str1.equals(uod.d.getString(str)) ^ i1;
          if (i2) {
             externalStor = (("video").equals(uod.d.getString("type")))? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES): Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
          }else {
             externalStor = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
          }
          String str2 = "E_UNABLE_TO_LOAD";
          if (i2) {
             File uFile1 = new File(externalStor, uod.d.getString(str));
             if (!uFile1.exists() && !uFile1.mkdirs()) {
                uod.c.reject(str2, "Album Directory not created. Did you request WRITE_EXTERNAL_STORAGE?");
             }else {
                externalStor = uFile1;
             label_0073 :
                if (!externalStor.isDirectory()) {
                   uod.c.reject(str2, "External media storage directory not available");
                }else {
                   File uFile2 = new File(externalStor, uFile.getName());
                   String name = uFile.getName();
                   int i3 = 46;
                   if (name.indexOf(i3) >= 0) {
                      i3 = 0;
                      name = name.substring(0, name.lastIndexOf(i3));
                      str1 = name.substring(name.lastIndexOf(i3));
                   }else {
                      i3 = 0;
                   }
                   while (!uFile2.createNewFile()) {
                      int i4 = i3 + 1;
                      uFile2 = new File(externalStor, name+"_"+i3+str1);
                      i3 = i4;
                   }
                   uFileChannel = new FileInputStream(uFile).getChannel();
                   try{
                      channel = new FileOutputStream(uFile2).getChannel();
                      try{
                         int i5 = 0;
                         channel.transferFrom(uFileChannel, i5, uFileChannel.size());
                         uFileChannel.close();
                         channel.close();
                         String[] stringArray = new String[i1];
                         stringArray[0] = uFile2.getAbsolutePath();
                         MediaScannerConnection.scanFile(uod.a, stringArray, i, new a(uod));
                         if (uFileChannel.isOpen()) {
                            try{
                               uFileChannel.close();
                            }catch(java.io.IOException e0){
                               a.h("ReactNative", "Could not close input channel", e0);
                            }
                         }
                      }catch(java.io.IOException e0){
                         i = channel;
                      }
                      FileChannel uFileChannel1 = uFileChannel;
                      uFileChannel = i;
                   }catch(java.io.IOException e0){
                      goto label_0132 ;
                   }
                }
             }
          }else {
             goto label_0073 ;
          }
       }catch(java.io.IOException e0){
          uFileChannel = i;
       }
       uod.c.reject(e0);
       if (i && i.isOpen()) {
          try{
             i.close();
          }catch(java.io.IOException e0){
             a.h("ReactNative", "Could not close input channel", e0);
          }
       }
    }
}
