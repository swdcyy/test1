package c.t.m.g.dn;
import c.t.m.g.dm;
import android.content.Context;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import android.os.HandlerThread;
import c.t.m.g.dn$a;
import android.os.Looper;
import c.t.m.g.dn$1;
import java.lang.StringBuilder;
import android.os.Handler;
import java.lang.System;
import java.lang.CharSequence;
import android.text.format.DateFormat;
import android.os.Message;

public final class dn implements dm	// class@000c4d
{
    public boolean b;
    public final File c;
    public final Runnable d;
    public Handler e;
    public HandlerThread f;
    public static boolean a;

    public void dn(Context p0,File p1){
       super();
       if (p1 != null) {
          p1.getAbsolutePath();
       }
       this.c = p1;
       boolean b = (p1 != null && (p1.exists() || p1.mkdirs()))? true: false;
       this.b = b;
       if (b) {
          HandlerThread handlerThrea = new HandlerThread("log_worker", 10);
          this.f = handlerThrea;
          handlerThrea.start();
          this.e = new dn$a(this, this.f.getLooper(), null);
       }
       this.d = new dn$1(this);
       if (dn.a) {
          "log dir="+p1;
       }
       return;
    }
    public static boolean a(){
       return dn.a;
    }
    public static boolean a(dn p0){
       return p0.b();
    }
    public static boolean a(dn p0,boolean p1){
       p0.b = p1;
       return p1;
    }
    public static Handler b(dn p0){
       return p0.e;
    }
    public static HandlerThread c(dn p0){
       return p0.f;
    }
    public static File d(dn p0){
       return p0.c;
    }
    public void a(String p0,int p1,String p2){
       if (this.b()) {
          this.e.obtainMessage(1, DateFormat.format("yyyy-MM-dd kk:mm:ss", System.currentTimeMillis())+":"+p0+":"+p2+"\n").sendToTarget();
       }
       return;
    }
    public final boolean b(){
       boolean b = (this.b != null && this.e != null)? true: false;
       return b;
    }
}
