package com.alipay.apmobilesecuritysdk.f.b;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Thread;
import java.lang.Runnable;
import com.alipay.apmobilesecuritysdk.f.c;

public final class b	// class@000e76
{
    public Thread b;
    public LinkedList c;
    public static b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
       this.b = null;
       this.c = new LinkedList();
    }
    public static b a(){
       return b.a;
    }
    public static LinkedList a(b p0){
       return p0.c;
    }
    public static Thread b(b p0){
       p0.b = null;
       return null;
    }
    public synchronized final void a(Runnable p0){
       this.c.add(p0);
       if (this.b == null) {
          Thread thread = new Thread(new c(this));
          this.b = thread;
          thread.start();
       }
       return;
    }
}
