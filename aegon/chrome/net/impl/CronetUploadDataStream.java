package aegon.chrome.net.impl.CronetUploadDataStream;
import i0.k;
import aegon.chrome.net.o;
import java.util.concurrent.Executor;
import aegon.chrome.net.impl.CronetUrlRequest;
import aegon.chrome.net.impl.CronetUploadDataStream$a;
import java.lang.Object;
import aegon.chrome.net.impl.l;
import java.lang.Exception;
import java.lang.Throwable;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Long;
import java.nio.Buffer;
import aegon.chrome.net.impl.CronetUploadDataStream$d;
import aegon.chrome.net.impl.f;
import K.S;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUploadDataStream$c;
import a0.n;
import aegon.chrome.net.impl.CronetUploadDataStream$b;

public final class CronetUploadDataStream extends k	// class@0000a8
{
    public final Executor a;
    public final l b;
    public final CronetUrlRequest c;
    public long d;
    public long e;
    public long f;
    public final Runnable g;
    public ByteBuffer h;
    public final Object i;
    public long j;
    public int k;
    public boolean l;
    public Runnable m;
    public static final String n = "CronetUploadDataStream";

    public void CronetUploadDataStream(o p0,Executor p1,CronetUrlRequest p2){
       super();
       this.g = new CronetUploadDataStream$a(this);
       this.i = new Object();
       this.k = 3;
       this.a = p1;
       this.b = new l(p0);
       this.c = p2;
    }
    public void a(Exception p0){
       CronetUploadDataStream ti = this.i;
       _monitor_enter(ti);
       this.f(0);
       this.i(p0);
       _monitor_exit(ti);
    }
    public void b(boolean p0){
       CronetUploadDataStream ti = this.i;
       _monitor_enter(ti);
       int i = 0;
       this.f(i);
       if (this.f - (long)this.h.limit()) {
          throw new IllegalStateException("ByteBuffer limit changed");
       }
       String str = null;
       if (p0 && this.d - str >= 0) {
          throw new IllegalArgumentException("Non-chunked upload can\'t have last chunk");
       }
       int i1 = this.h.position();
       long l = this.e - (long)i1;
       this.e = l;
       if (l - str >= 0 || this.d - str < 0) {
          this.h.position(i);
          this.h = null;
          this.k = 3;
          this.h();
          if (!this.j - str) {
             _monitor_exit(ti);
             return;
          }else {
             f.g();
             S.MpWH3VIr(this.j, this, i1, p0);
             _monitor_exit(ti);
             return;
          }
       }else {
          Object[] objArray = new Object[]{Long.valueOf((this.d - this.e)),Long.valueOf(this.d)};
          throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", objArray));
       }
    }
    public void c(Exception p0){
       CronetUploadDataStream ti = this.i;
       _monitor_enter(ti);
       this.f(1);
       this.i(p0);
       _monitor_exit(ti);
    }
    public void d(){
       CronetUploadDataStream ti = this.i;
       _monitor_enter(ti);
       this.f(1);
       this.k = 3;
       this.e = this.d;
       if (!this.j) {
          _monitor_exit(ti);
          return;
       }else {
          f.g();
          S.MFpRjSMv(this.j, this);
          _monitor_exit(ti);
          return;
       }
    }
    public void e(){
       this.c.j();
    }
    public void f(int p0){
       if (this.k == p0) {
          return;
       }
       throw new IllegalStateException("Expected "+p0+", but was "+this.k);
    }
    public final void g(){
       CronetUploadDataStream ti = this.i;
       _monitor_enter(ti);
       if (this.k == null) {
          this.l = true;
          _monitor_exit(ti);
          return;
       }else if(!this.j){
          _monitor_exit(ti);
          return;
       }else {
          f.g();
          S.MMW1G0N1(this.j);
          this.j = 0;
          CronetUploadDataStream tm = this.m;
          if (tm != null) {
             tm.run();
          }
          _monitor_exit(ti);
          this.j(new CronetUploadDataStream$c(this));
          return;
       }
    }
    public final void h(){
       CronetUploadDataStream ti = this.i;
       _monitor_enter(ti);
       if (this.k == null) {
          throw new IllegalStateException("Method should not be called when read has not completed.");
       }
       if (this.l != null) {
          this.g();
       }
       _monitor_exit(ti);
       return;
    }
    public void i(Throwable p0){
       CronetUploadDataStream ti = this.i;
       _monitor_enter(ti);
       CronetUploadDataStream tk = this.k;
       int i = 3;
       if (tk == i) {
          throw new IllegalStateException("There is no read or rewind or length check in progress.");
       }
       tk = (tk == 2)? 1: 0;
       this.k = i;
       this.h = null;
       this.h();
       _monitor_exit(ti);
       if (tk) {
          try{
             this.b.close();
          }catch(java.lang.Exception e0){
             Object[] objArray = new Object[]{e0};
             n.a(CronetUploadDataStream.n, "Failure closing data provider", objArray);
          }
       }
    }
    public void j(Runnable p0){
       this.a.execute(p0);
       return;
    }
    public void onUploadDataStreamDestroyed(){
       this.g();
    }
    public void readData(ByteBuffer p0){
       this.h = p0;
       this.f = (long)p0.limit();
       this.j(this.g);
    }
    public void rewind(){
       this.j(new CronetUploadDataStream$b(this));
    }
}
