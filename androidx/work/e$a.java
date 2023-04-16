package androidx.work.e$a;
import java.lang.Class;
import java.lang.Object;
import java.util.HashSet;
import java.util.UUID;
import u3.r;
import java.lang.String;
import java.util.Set;
import androidx.work.e;
import k3.b;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import java.lang.IllegalArgumentException;
import androidx.work.a;

public abstract class e$a	// class@000a60
{
    public boolean a;
    public UUID b;
    public r c;
    public Set d;
    public Class e;

    public void e$a(Class p0){
       super();
       this.a = false;
       this.d = new HashSet();
       this.b = UUID.randomUUID();
       this.e = p0;
       this.c = new r(this.b.toString(), p0.getName());
       this.a(p0.getName());
    }
    public final e$a a(String p0){
       this.d.add(p0);
       return this.d();
    }
    public final e b(){
       this.b = UUID.randomUUID();
       r or = new r(this.c);
       this.c = or;
       or.a = this.b.toString();
       return this.c();
    }
    public abstract e c();
    public abstract e$a d();
    public final e$a e(b p0){
       this.c.j = p0;
       return this;
    }
    public e$a f(long p0,TimeUnit p1){
       this.c.g = p1.toMillis(p0);
       if ((Long.MAX_VALUE - System.currentTimeMillis()) - this.c.g > 0) {
          return this.d();
       }
       throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
    public final e$a g(a p0){
       this.c.e = p0;
       return this.d();
    }
}
