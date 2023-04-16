package c.t.m.g.ew;
import android.content.Context;
import java.io.File;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.String;
import c.t.m.g.ew$a;
import android.os.Looper;
import c.t.m.g.ew$1;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.System;
import android.os.Handler;
import java.io.ByteArrayOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.OutputStream;
import java.lang.CharSequence;
import android.text.format.DateFormat;
import android.os.Message;

public class ew	// class@000c80
{
    public boolean c;
    public final File d;
    public final Runnable e;
    public Handler f;
    public HandlerThread g;
    public boolean h;
    public static ew a;
    public static boolean b;

    public void ew(Context p0,File p1){
       super();
       boolean b = false;
       this.h = b;
       this.d = p1;
       if (p1 != null && (p1.exists() || p1.mkdirs())) {
          b = true;
       }
       this.c = b;
       if (b) {
          HandlerThread handlerThrea = new HandlerThread("log_worker", 10);
          this.g = handlerThrea;
          handlerThrea.start();
          this.f = new ew$a(this, this.g.getLooper(), null);
       }
       this.e = new ew$1(this);
       if (ew.b) {
          "log dir="+p1;
       }
       return;
    }
    public static ew a(){
       return ew.a;
    }
    public static ew a(Context p0,File p1){
       if (ew.a == null) {
          _monitor_enter(ew.class);
          if (ew.a == null) {
             ew.a = new ew(p0, p1);
          }
          _monitor_exit(ew.class);
       }
       return ew.a;
    }
    public static boolean a(ew p0){
       return p0.b();
    }
    public static boolean a(ew p0,boolean p1){
       p0.c = p1;
       return p1;
    }
    public static byte[] a(byte[] p0){
       p0 = ew.c(ew.b(p0));
       byte[] uobyteArray = new byte[(p0.length + 4)];
       int len = p0.length;
       uobyteArray[0] = Integer.valueOf((len >> 8)).byteValue();
       uobyteArray[1] = Integer.valueOf((len >> 24)).byteValue();
       uobyteArray[2] = Integer.valueOf((len >> 16)).byteValue();
       uobyteArray[3] = Integer.valueOf(len).byteValue();
       System.arraycopy(p0, 0, uobyteArray, 4, len);
       return uobyteArray;
    }
    public static Handler b(ew p0){
       return p0.f;
    }
    public static byte[] b(byte[] p0){
       if (p0 == null) {
          return null;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       DeflaterOutputStream uDeflaterOut = new DeflaterOutputStream(uByteArrayOu);
       try{
          int i = 0;
          uDeflaterOut.write(p0, i, p0.length);
          uDeflaterOut.finish();
          uDeflaterOut.flush();
          uDeflaterOut.close();
          return uByteArrayOu.toByteArray();
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static HandlerThread c(ew p0){
       return p0.g;
    }
    public static byte[] c(byte[] p0){
       int len = p0.length;
       byte[] uobyteArray = new byte[len];
       System.arraycopy(p0, 0, uobyteArray, 0, len);
       int i = (len % 5) + 7;
       int i1 = 0;
       int i2 = i << 1;
       i2 = i2 + i1;
       while (i2 < len) {
          byte b = Integer.valueOf(i1).byteValue();
          for (int i3 = 0; i3 < i; i3 = i3 + 1) {
             int i4 = i1 + i3;
             byte b1 = uobyteArray[i4];
             int i5 = i1 + i;
             i5 = i5 + i3;
             int i6 = uobyteArray[i5] ^ b;
             uobyteArray[i4] = (byte)i6;
             i4 = b1 ^ b;
             uobyteArray[i5] = (byte)i4;
          }
          i1 = i2;
       }
       return uobyteArray;
    }
    public static boolean d(ew p0){
       return p0.h;
    }
    public static File e(ew p0){
       return p0.d;
    }
    public void a(String p0,int p1,String p2){
       if (this.b()) {
          this.f.obtainMessage(1, DateFormat.format("yyyy-MM-dd kk:mm:ss", System.currentTimeMillis())+":"+p0+":"+p2+"\n").sendToTarget();
       }
       return;
    }
    public final boolean b(){
       boolean b = (this.c != null && this.f != null)? true: false;
       return b;
    }
}
