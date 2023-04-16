package com.loc.ab;
import java.lang.String;
import com.loc.x;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import java.lang.Object;
import android.os.storage.StorageManager;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Array;
import java.lang.Boolean;
import java.io.File;
import android.os.Environment;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.ByteBuffer;
import java.io.Closeable;

public final class ab	// class@001360
{
    public static final String a;
    public static final String b;
    public static final String c;

    static {
       ab.a = x.c("SYmFja3Vwcw");
       ab.b = x.c("SLmFkaXU");
       ab.c = x.c("JIw");
    }
    public static String a(Context p0){
       String str1;
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT < 31) {
          String str = 30;
          if (p0.getApplicationInfo().targetSdkVersion < str || sDK_INT < str) {
             StorageManager systemServic = p0.getSystemService("storage");
             Class uClass = Class.forName(x.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
             Class[] uClassArray = new Class[0];
             uClassArray = new Class[0];
             Method method = uClass.getMethod(x.c("ZZ2V0UGF0aA"), uClassArray);
             Class[] uClassArray1 = new Class[0];
             Method method1 = uClass.getMethod(x.c("AaXNSZW1vdmFibGUK"), uClassArray1);
             Object[] objArray = new Object[0];
             systemServic = systemServic.getClass().getMethod(x.c("FZ2V0Vm9sdW1lTGlzdA"), uClassArray).invoke(systemServic, objArray);
             int length = Array.getLength(systemServic);
             int i = 0;
             while (true) {
                if (i >= length) {
                   return null;
                }
                Object obj = Array.get(systemServic, i);
                Object[] objArray1 = new Object[0];
                str1 = method.invoke(obj, objArray1);
                Object[] objArray2 = new Object[0];
                if (!method1.invoke(obj, objArray2).booleanValue()) {
                   break ;
                }else {
                   i = i + 1;
                }
             }
             return str1;
          }
       }
       File externalFile = p0.getApplicationContext().getExternalFilesDir("");
       return externalFile.getAbsolutePath();
    }
    public static synchronized void a(Context p0,String p1,String p2){
       _monitor_enter(ab.class);
       if (p0 != null && (p0.checkCallingOrSelfPermission(x.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX0VYVEVSTkFMX1NUT1JBR0U=")) || p0.checkCallingOrSelfPermission(x.c("EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ==")))) {
          _monitor_exit(ab.class);
          return;
       }else {
          String str = ab.a(p0);
          if (TextUtils.isEmpty(str)) {
             _monitor_exit(ab.class);
             return;
          }else {
             p1 = p1+ab.c+p2;
             File uFile = new File(str+File.separator+ab.a);
             File uFile1 = new File(uFile, ab.b);
             if (!uFile.exists() || uFile.isDirectory()) {
                uFile.mkdirs();
             }
             uFile1.createNewFile();
             RandomAccessFile randomAccess = new RandomAccessFile(uFile1, "rws");
             FileChannel channel = randomAccess.getChannel();
             FileLock uFileLock = channel.tryLock();
             if (uFileLock != null) {
                channel.write(ByteBuffer.wrap(p1.getBytes("UTF-8")));
             }
             if (uFileLock != null) {
                try{
                   uFileLock.release();
                }catch(java.io.IOException e0){
                }
             }
             try{
                channel.close();
                randomAccess.close();
                _monitor_exit(e0);
                return;
             }catch(java.io.IOException e0){
             }
          }
       }
    }
}
