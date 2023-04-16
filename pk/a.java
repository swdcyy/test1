package pk.a;
import pk.b;
import java.lang.Object;
import pk.d;
import com.google.common.cache.LongAddables;
import pk.c;

public final class a implements b	// class@00292c
{
    public final d a;
    public final d b;
    public final d c;
    public final d d;
    public final d e;
    public final d f;

    public void a(){
       super();
       this.a = LongAddables.a();
       this.b = LongAddables.a();
       this.c = LongAddables.a();
       this.d = LongAddables.a();
       this.e = LongAddables.a();
       this.f = LongAddables.a();
    }
    public void a(int p0){
       this.a.add((long)p0);
    }
    public void b(){
       this.f.increment();
    }
    public void c(long p0){
       this.c.increment();
       this.e.add(p0);
    }
    public void d(int p0){
       this.b.add((long)p0);
    }
    public void e(long p0){
       this.d.increment();
       this.e.add(p0);
    }
    public void f(b p0){
       c uoc = p0.l();
       this.a.add(uoc.a);
       this.b.add(uoc.b);
       this.c.add(uoc.c);
       this.d.add(uoc.d);
       this.e.add(uoc.e);
       this.f.add(uoc.f);
    }
    public c l(){
       c uoc = new c(this.a.sum(), this.b.sum(), this.c.sum(), this.d.sum(), this.e.sum(), this.f.sum());
       return v13;
    }
}
