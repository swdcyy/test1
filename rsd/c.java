package rsd.c;
import rsd.f;
import java.lang.Object;
import vsd.n;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class c implements f	// class@0024de
{
    public Object a;

    public void c(Object p0){
       super();
       this.a = p0;
    }
    public Object a(Object p0,n p1){
       a.p(p1, "property");
       return this.a;
    }
    public void b(Object p0,n p1,Object p2){
       a.p(p1, "property");
       p0 = this.a;
       if (!this.d(p1, p0, p2)) {
          return;
       }
       this.a = p2;
       this.c(p1, p0, p2);
       return;
    }
    public void c(n p0,Object p1,Object p2){
       a.p(p0, "property");
    }
    public boolean d(n p0,Object p1,Object p2){
       a.p(p0, "property");
       return true;
    }
}
