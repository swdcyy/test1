package p1.l;
import java.io.Closeable;
import android.content.Context;
import android.content.res.Resources;
import java.nio.ByteBuffer;
import java.io.File;
import java.io.InputStream;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import java.io.FileOutputStream;
import java.lang.String;
import java.io.IOException;
import java.lang.StringBuilder;
import android.os.Process;
import android.os.CancellationSignal;
import android.net.Uri;
import android.content.ContentResolver;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileDescriptor;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.nio.MappedByteBuffer;
import java.lang.Throwable;
import x1.f$b;
import java.util.Map;
import java.util.HashMap;
import java.lang.Object;
import java.util.Collections;

public class l	// class@0028a6
{

    public static void a(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static ByteBuffer b(Context p0,Resources p1,int p2){
       File uFile = l.e(p0);
       if (uFile == null) {
          return null;
       }
       if (!l.c(uFile, p1, p2)) {
          uFile.delete();
          return null;
       }else {
          uFile.delete();
          return l.g(uFile);
       }
    }
    public static boolean c(File p0,Resources p1,int p2){
       InputStream inputStream = p1.openRawResource(p2);
       l.a(inputStream);
       return l.d(p0, inputStream);
    }
    public static boolean d(File p0,InputStream p1){
       StrictMode$ThreadPolicy threadPolicy = StrictMode.allowThreadDiskWrites();
       try{
          int i = 0;
          FileOutputStream uFileOutputS = new FileOutputStream(p0, false);
          try{
             int i1 = 1024;
             byte[] uobyteArray = new byte[i1];
             i = p1.read(uobyteArray);
             while (i != -1) {
                uFileOutputS.write(uobyteArray, false, i);
             }
             l.a(uFileOutputS);
             StrictMode.setThreadPolicy(threadPolicy);
             return true;
          }catch(java.io.IOException e5){
             Closeable uCloseable = uFileOutputS;
          }
          e5.getMessage();
          l.a(i);
          StrictMode.setThreadPolicy(threadPolicy);
          return false;
       }catch(java.io.IOException e5){
          goto label_002b ;
       }
    }
    public static File e(Context p0){
       File uFile;
       File cacheDir = p0.getCacheDir();
       if (cacheDir == null) {
          return null;
       }
       String str = ".font"+Process.myPid()+"-"+Process.myTid()+"-";
       int i = 0;
       while (true) {
          if (i >= 100) {
             return null;
          }
          String str1 = str+i;
          try{
             uFile = new File(cacheDir, str1);
             if (uFile.createNewFile()) {
                break ;
             }else {
                i = i + 1;
             }
          }catch(java.io.IOException e0){
          }
       }
       return uFile;
    }
    public static ByteBuffer f(Context p0,CancellationSignal p1,Uri p2){
       ContentResolver contentResol = p0.getContentResolver();
       try{
          int i = 0;
          ParcelFileDescriptor parcelFileDe = contentResol.openFileDescriptor(p2, "r", p1);
          if (parcelFileDe == null) {
             if (parcelFileDe != null) {
                parcelFileDe.close();
             }
             return i;
          }else {
             FileInputStream uFileInputSt = new FileInputStream(parcelFileDe.getFileDescriptor());
             FileChannel channel = uFileInputSt.getChannel();
             uFileInputSt.close();
             parcelFileDe.close();
             return channel.map(FileChannel$MapMode.READ_ONLY, 0, channel.size());
          }
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public static ByteBuffer g(File p0){
       try{
          FileInputStream uFileInputSt = new FileInputStream(p0);
          FileChannel channel = uFileInputSt.getChannel();
          uFileInputSt.close();
          return channel.map(FileChannel$MapMode.READ_ONLY, 0, channel.size());
       }catch(java.io.IOException e0){
          return null;
       }
    }
    public static Map h(Context p0,f$b[] p1,CancellationSignal p2){
       HashMap hashMap = new HashMap();
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          if (!oobject.b()) {
             Uri uri = oobject.d();
             if (!hashMap.containsKey(uri)) {
                hashMap.put(uri, l.f(p0, p2, uri));
             }
          }
          i = i + 1;
       }
       return Collections.unmodifiableMap(hashMap);
    }
}
