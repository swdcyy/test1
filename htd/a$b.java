package htd.a$b;
import htd.x;
import ftd.k;
import htd.p;
import kotlin.Result;
import java.lang.Object;
import asd.c;
import htd.f0;
import htd.f0$a;
import java.lang.Throwable;
import qrd.j0;
import ltd.o$d;
import ltd.e0;
import ftd.m;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.o0;

public final class a$b extends x	// class@000fab
{
    public final k e;
    public final int f;

    public void a$b(k p0,int p1){
       super();
       this.e = p0;
       this.f = p1;
    }
    public void b0(p p0){
       a$b tf = this.f;
       if (tf == 1 && p0.e == null) {
          this.e.resumeWith(Result.constructor-impl(null));
       }else if(tf == 2){
          this.e.resumeWith(Result.constructor-impl(f0.a(f0.c(new f0$a(p0.e)))));
       }else {
          this.e.resumeWith(Result.constructor-impl(j0.a(p0.h0())));
       }
       return;
    }
    public final Object c0(Object p0){
       if (this.f != 2) {
       }else {
          p0 = f0.a(f0.c(p0));
       }
       return p0;
    }
    public e0 d(Object p0,o$d p1){
       a$b te = this.e;
       p0 = this.c0(p0);
       o$d c = (p1 != null)? p1.c: null;
       if (te.G(p0, c) != null) {
          if (p1 != null) {
             p1.d();
          }
          return m.a;
       }else {
          return null;
       }
    }
    public void m(Object p0){
       this.e.F(m.a);
    }
    public String toString(){
       return "ReceiveElement@"+o0.b(this)+"[receiveMode="+this.f+']';
    }
}
