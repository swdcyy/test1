package lrd.c;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.StringBuilder;

public final class c	// class@001caa
{
    public final Object a;
    public final long b;
    public final TimeUnit c;

    public void c(Object p0,long p1,TimeUnit p2){
       super();
       this.a = p0;
       this.b = p1;
       a.c(p2, "unit is null");
       this.c = p2;
    }
    public long a(){
       return this.b;
    }
    public Object b(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof c && (a.a(this.a, p0.a) && (!this.b - p0.b && a.a(this.c, p0.c)))) {
          b = true;
       }
    label_0024 :
       return b;
    }
    public int hashCode(){
       c ta = this.a;
       int i = (ta != null)? ta.hashCode(): 0;
       c tb = this.b;
       return ((((i * 31) + (int)(tb ^ (tb >> 31))) * 31) + this.c.hashCode());
    }
    public String toString(){
       return "Timed[time="+this.b+", unit="+this.c+", value="+this.a+"]";
    }
}
