package a85.a;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import java.lang.StringBuilder;
import java.net.Socket;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.log.a;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.lang.System;
import java.lang.Throwable;

public abstract class a extends Thread	// class@000038
{
    public final String b;
    public final String c;
    public final int d;
    public int e;
    public Socket f;
    public OutputStream g;
    public InputStream h;
    public boolean i;
    public static final AtomicInteger j;
    public static int k;
    public static int l;

    static {
       a.j = new AtomicInteger(1);
       a.k = -1;
       a.l = -2;
    }
    public void a(String p0,int p1){
       super();
       this.b = "TCPClient-"+a.j.getAndIncrement();
       this.f = new Socket();
       this.i = false;
       this.c = p0;
       this.d = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       a.e(this.b, "close");
       boolean b = true;
       try{
          this.i = b;
          a tg = this.g;
          if (tg != null) {
             tg.flush();
             this.g.close();
          }
          try{
             tg = this.h;
             if (tg != null) {
                tg.close();
             }
             try{
                this.f.close();
                this.f = null;
                return;
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
       }
    }
    public abstract void b(int p0,String p1,boolean p2);
    public abstract void c();
    public abstract void d();
    public abstract void e();
    public abstract void f(byte[] p0);
    public abstract void g(int p0,String p1);
    public void run(){
       int i;
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       if (this.i == null) {
          try{
             this.f.connect(new InetSocketAddress(this.c, this.d), this.e);
             this.g = this.f.getOutputStream();
             this.h = this.f.getInputStream();
          }catch(java.net.SocketTimeoutException e0){
             this.e();
             return;
          }catch(java.io.IOException e0){
             this.c();
             return;
          }
       }
       if (this.i == null && (this.h != null && (!this.f.isConnected() || this.f.isInputShutdown()))) {
          this.c();
          return;
       }else {
          this.d();
          byte[] uobyteArray = new byte[8192];
          while (true) {
             if (this.i == null && !this.f.isInputShutdown()) {
                i = this.h.read(uobyteArray);
                if (i < 0) {
                   break ;
                }else if(i > 0){
                   byte[] uobyteArray1 = new byte[i];
                   System.arraycopy(uobyteArray, 0, uobyteArray1, 0, i);
                   this.f(uobyteArray1);
                }
             }else {
                a.e(this.b, "TCPClient stop2");
                return;
             }
          }
          this.b(i, "InputStream read failed", true);
          return;
       }
    }
}
