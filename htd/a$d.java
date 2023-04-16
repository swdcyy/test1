package htd.a$d;
import ftd.c1;
import htd.x;
import htd.a;
import otd.f;
import msd.p;
import htd.p;
import htd.f0;
import htd.f0$a;
import java.lang.Throwable;
import java.lang.Object;
import asd.c;
import asd.e;
import ltd.o$d;
import ltd.e0;
import ltd.o;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.o0;

public final class a$d extends x implements c1	// class@000fad
{
    public final a e;
    public final f f;
    public final p g;
    public final int h;

    public void a$d(a p0,f p1,p p2,int p3){
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
    }
    public void b0(p p0){
       if (!this.f.j()) {
          return;
       }
       a$d th = this.h;
       if (th != null) {
          if (th != 1) {
             if (th == 2) {
                e.i(this.g, f0.a(f0.c(new f0$a(p0.e))), this.f.r());
             }
          }else if(p0.e == null){
             e.i(this.g, null, this.f.r());
          }else {
             this.f.k(p0.h0());
          }
       }else {
          this.f.k(p0.h0());
       }
       return;
    }
    public e0 d(Object p0,o$d p1){
       return this.f.q(p1);
    }
    public void dispose(){
       if (this.U()) {
          this.e.Z();
       }
       return;
    }
    public void m(Object p0){
       a$d tg = this.g;
       if (this.h == 2) {
          p0 = f0.a(f0.c(p0));
       }
       e.i(tg, p0, this.f.r());
       return;
    }
    public String toString(){
       return "ReceiveSelect@"+o0.b(this)+'['+this.f+",receiveMode="+this.h+']';
    }
}
