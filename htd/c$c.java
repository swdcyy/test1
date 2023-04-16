package htd.c$c;
import ftd.c1;
import htd.b0;
import java.lang.Object;
import htd.c;
import otd.f;
import msd.p;
import asd.c;
import asd.e;
import htd.p;
import java.lang.Throwable;
import ltd.o;
import ltd.o$d;
import ltd.e0;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.o0;

public final class c$c extends b0 implements c1	// class@000fba
{
    public final Object e;
    public final c f;
    public final f g;
    public final p h;

    public void c$c(Object p0,c p1,f p2,p p3){
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
    }
    public void b0(){
       e.i(this.h, this.f, this.g.r());
    }
    public Object c0(){
       return this.e;
    }
    public void d0(p p0){
       if (this.g.j()) {
          this.g.k(p0.i0());
       }
       return;
    }
    public void dispose(){
       this.U();
    }
    public e0 e0(o$d p0){
       return this.g.q(p0);
    }
    public String toString(){
       return "SendSelect@"+o0.b(this)+'('+this.c0()+"\)["+this.f+", "+this.g+']';
    }
}
