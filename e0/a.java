package e0.a;
import e0.f;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.lang.String;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import java.util.List;
import e0.a$b;
import java.util.Map;
import e0.a$a;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;

public final class a implements f	// class@001e73
{
    public final ReentrantReadWriteLock a;
    public Map b;
    public AtomicInteger c;
    public List d;
    public int e;
    public f f;
    public static final boolean g;

    public void a(){
       super();
       this.a = new ReentrantReadWriteLock(false);
       this.b = new HashMap();
       this.c = new AtomicInteger();
       this.d = new ArrayList();
    }
    public void a(String p0,long p1){
       this.a.readLock().lock();
       a tf = this.f;
       if (tf != null) {
          tf.a(p0, p1);
          this.a.readLock().unlock();
          return;
       }else {
          this.a.readLock().unlock();
          this.a.writeLock().lock();
          if (this.f == null) {
             if (this.d.size() < 256) {
                this.d.add(new a$b(p0, p1));
             }else {
                this.e = this.e + 1;
             }
             this.a.writeLock().unlock();
             return;
          }else {
             this.a.readLock().lock();
             this.a.writeLock().unlock();
             this.f.a(p0, p1);
             this.a.readLock().unlock();
             return;
          }
       }
    }
    public void b(String p0,int p1,int p2,int p3,int p4){
       this.f(3, p0, p1, p2, p3, p4);
    }
    public void c(String p0,int p1){
       this.f(4, p0, p1, 0, 0, 0);
    }
    public void d(String p0,boolean p1){
       this.f(1, p0, p1, 0, 0, 0);
    }
    public void e(String p0,int p1,int p2,int p3,int p4){
       this.f(2, p0, p1, p2, p3, p4);
    }
    public final void f(int p0,String p1,int p2,int p3,int p4,int p5){
       this.a.readLock().lock();
       int i = 1;
       if (this.f != null) {
          this.g(p0, p1, p2, p3, p4, p5);
       }else {
          Object obj = this.b.get(p1);
          if (obj == null) {
             i = 0;
          }else if(!obj.a(p0, p1, p2, p3, p4, p5)){
             this.c.incrementAndGet();
          }
       }
       this.a.readLock().unlock();
       if (i) {
          return;
       }else {
          this.a.writeLock().lock();
          if (this.f == null) {
             a$a uoa = this.b.get(p1);
             if (uoa == null) {
                if (this.b.size() >= 256) {
                   this.c.incrementAndGet();
                }else {
                   uoa = new a$a(p0, p1, p3, p4, p5);
                   this.b.put(p1, v6);
                   uoa = v6;
                label_0074 :
                   if (!uoa.a(p0, p1, p2, p3, p4, p5)) {
                      this.c.incrementAndGet();
                   }
                }
             }else {
                goto label_0074 ;
             }
             this.a.writeLock().unlock();
             return;
          }else {
             this.a.readLock().lock();
             this.a.writeLock().unlock();
             this.g(p0, p1, p2, p3, p4, p5);
             this.a.readLock().unlock();
             return;
          }
       }
    }
    public final void g(int p0,String p1,int p2,int p3,int p4,int p5){
       int i = 1;
       if (p0 != i) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 == 4) {
                   this.f.c(p1, p2);
                }else {
                   throw new UnsupportedOperationException("Unknown histogram type "+p0);
                }
             }else {
                this.f.b(p1, p2, p3, p4, p5);
             }
          }else {
             this.f.e(p1, p2, p3, p4, p5);
          }
       }else {
          a tf = this.f;
          if (!p2) {
             i = false;
          }
          tf.d(p1, i);
       }
       return;
    }
}
