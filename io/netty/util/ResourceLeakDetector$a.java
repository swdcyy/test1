package io.netty.util.ResourceLeakDetector$a;
import wqd.o;
import java.lang.ref.PhantomReference;
import io.netty.util.ResourceLeakDetector;
import java.lang.Object;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import io.netty.util.ResourceLeakDetector$Level;
import java.lang.Enum;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Deque;
import java.lang.StringBuilder;
import zqd.w;

public final class ResourceLeakDetector$a extends PhantomReference implements o	// class@0010ea
{
    public final String b;
    public final Deque c;
    public final AtomicBoolean d;
    public ResourceLeakDetector$a e;
    public ResourceLeakDetector$a f;
    public final ResourceLeakDetector g;

    public void ResourceLeakDetector$a(ResourceLeakDetector p0,Object p1){
       this.g = p0;
       ResourceLeakDetector obj = null;
       ResourceLeakDetector c = (p1 != null)? p0.c: obj;
       super(p1, c);
       this.c = new ArrayDeque();
       if (p1 != null) {
          this.b = (ResourceLeakDetector.a().ordinal() >= ResourceLeakDetector$Level.ADVANCED.ordinal())? ResourceLeakDetector.b(obj, 3): obj;
          p1 = p0.a;
          _monitor_enter(p1);
          obj = p0.a;
          this.e = obj;
          this.f = obj.f;
          obj.f.e = this;
          obj.f = this;
          p0.i = p0.i + 1;
          _monitor_exit(p1);
          this.d = new AtomicBoolean();
       }else {
          this.b = obj;
          this.d = new AtomicBoolean(true);
       }
       return;
    }
    public void a(Object p0){
       this.c(p0, 3);
    }
    public void b(){
       this.c(null, 3);
    }
    public final void c(Object p0,int p1){
       if (this.b != null) {
          p0 = ResourceLeakDetector.b(p0, p1);
          ResourceLeakDetector$a tc = this.c;
          _monitor_enter(tc);
          int i = this.c.size();
          if (!i || !(this.c.getLast()).equals(p0)) {
             this.c.add(p0);
          }
          if (i > ResourceLeakDetector.m) {
             this.c.removeFirst();
          }
          _monitor_exit(tc);
       }
       return;
    }
    public boolean close(){
       boolean b = false;
       if (!this.d.compareAndSet(b, true)) {
          return b;
       }
       ResourceLeakDetector a = this.g.a;
       _monitor_enter(a);
       ResourceLeakDetector$a tg = this.g;
       tg.i = tg.i - 1;
       tg = this.e;
       tg.f = this.f;
       this.f.e = tg;
       this.e = null;
       this.f = null;
       _monitor_exit(a);
       return true;
    }
    public String toString(){
       if (this.b == null) {
          return "";
       }
       ResourceLeakDetector$a tc = this.c;
       _monitor_enter(tc);
       Object[] objArray = this.c.toArray();
       _monitor_exit(tc);
       String a = w.a;
       StringBuilder str = new StringBuilder(0x4000)+a+"Recent access records: "+objArray.length+a;
       if (objArray.length > 0) {
          for (int i = objArray.length - 1; i >= 0; i = i - 1) {
             int i1 = i + 1;
             str = str+'#'+i1;
             str = str+':'+w.a+objArray[i];
          }
       }
       String a1 = w.a;
       str = str+"Created at:"+a1+this.b;
       str.setLength((str.length() - a1.length()));
       return str;
    }
}
