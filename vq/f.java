package vq.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;

public class f	// class@0026d9
{
    public final long a;
    public final long b;
    public long c;

    public void f(long p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p0;
    }
    public long a(){
       return this.c;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       long l = this.c * 2;
       this.c = l;
       this.c = Math.min(l, this.b);
       return;
    }
    public void c(){
       this.c = this.a;
    }
}
