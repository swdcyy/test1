package htd.a$c;
import htd.x;
import htd.a$a;
import ftd.k;
import htd.p;
import java.lang.Boolean;
import java.lang.Object;
import ftd.k$a;
import java.lang.Throwable;
import ltd.o$d;
import ltd.e0;
import ftd.m;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.o0;

public final class a$c extends x	// class@000fac
{
    public final a$a e;
    public final k f;

    public void a$c(a$a p0,k p1){
       super();
       this.e = p0;
       this.f = p1;
    }
    public void b0(p p0){
       Object obj = (p0.e == null)? k$a.b(this.f, Boolean.FALSE, null, 2, null): this.f.J(p0.h0());
       if (obj != null) {
          this.e.g(p0);
          this.f.F(obj);
       }
       return;
    }
    public e0 d(Object p0,o$d p1){
       p0 = this.f;
       Boolean tRUE = Boolean.TRUE;
       o$d c = (p1 != null)? p1.c: null;
       if (p0.G(tRUE, c) != null) {
          if (p1 != null) {
             p1.d();
          }
          return m.a;
       }else {
          return null;
       }
    }
    public void m(Object p0){
       this.e.g(p0);
       this.f.F(m.a);
    }
    public String toString(){
       return "ReceiveHasNext@"+o0.b(this);
    }
}
