package com.facebook.react.modules.camera.CameraRollManager$c;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.net.URL;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Channels;
import android.os.Environment;
import java.lang.Throwable;
import cb.a;
import java.lang.StringBuilder;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.facebook.react.modules.camera.a;
import android.content.Context;
import android.media.MediaScannerConnection$OnScanCompletedListener;
import android.media.MediaScannerConnection;

public class CameraRollManager$c extends GuardedAsyncTask	// class@00127e
{
    public final Context a;
    public final Uri b;
    public final Promise c;

    public void CameraRollManager$c(ReactContext p0,Uri p1,Promise p2){
       super(p0);
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void doInBackgroundGuarded(Object[] p0){
       int i;
       FileChannel uFileChannel;
       String str;
       FileChannel channel;
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraRollManager$c.class, "1")) {
       }else {
          File uFile = new File(this.b.getPath());
          try{
             i = 0;
             String scheme = this.b.getScheme();
             ReadableByteChannel readableByte = (scheme.equals("http") || scheme.equals("https"))? Channels.newChannel(new URL(this.b.toString()).openStream()): new FileInputStream(uFile).getChannel();
             try{
                File externalStor = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                externalStor.mkdirs();
                if (!externalStor.isDirectory()) {
                   this.c.reject("E_UNABLE_TO_LOAD", "External media storage directory not available");
                   if (readableByte != null && readableByte.isOpen()) {
                      try{
                         readableByte.close();
                      }catch(java.io.IOException e14){
                         a.h("ReactNative", "Could not close input channel", e14);
                      }
                   }
                }else {
                   File uFile1 = new File(externalStor, uFile.getName());
                   String name = uFile.getName();
                   int i1 = 46;
                   if (name.indexOf(i1) >= 0) {
                      str = name.substring(0, name.lastIndexOf(i1));
                      name = name.substring(name.lastIndexOf(i1));
                   }else {
                      str = name;
                      name = "";
                   }
                   i1 = 0;
                   while (!uFile1.createNewFile()) {
                      int i2 = i1 + 1;
                      uFile1 = new File(externalStor, str+"_"+i1+name);
                      i1 = i2;
                   }
                   channel = new FileOutputStream(uFile1).getChannel();
                   try{
                      externalStor = 0x100000;
                      ByteBuffer uByteBuffer = ByteBuffer.allocate(externalStor);
                      while (readableByte.read(uByteBuffer) > 0) {
                         uByteBuffer.flip();
                         channel.write(uByteBuffer);
                         uByteBuffer.compact();
                      }
                      uByteBuffer.flip();
                      while (uByteBuffer.hasRemaining()) {
                         channel.write(uByteBuffer);
                      }
                      readableByte.close();
                      channel.close();
                      String[] stringArray = new String[]{uFile1.getAbsolutePath()};
                      MediaScannerConnection.scanFile(this.a, stringArray, i, new a(this));
                      if (readableByte.isOpen()) {
                         try{
                            readableByte.close();
                         }catch(java.io.IOException e3){
                            a.h("ReactNative", "Could not close input channel", e3);
                         }
                      }
                   }catch(java.io.IOException e3){
                      i = channel;
                      Throwable throwable = e3;
                   }
                   uFileChannel = i;
                   ReadableByteChannel readableByte1 = readableByte;
                }
             }catch(java.io.IOException e14){
                goto label_013e ;
             }
          }catch(java.io.IOException e14){
             uFileChannel = i;
          }
          this.c.reject(e14);
          if (i && i.isOpen()) {
             try{
                i.close();
             }catch(java.io.IOException e14){
                a.h("ReactNative", "Could not close input channel", e14);
             }
          }
       }
    }
}
