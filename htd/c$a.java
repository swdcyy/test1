package htd.c$a;
import htd.b0;
import java.lang.Object;
import htd.p;
import ltd.o$d;
import ltd.e0;
import ftd.m;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.o0;

public final class c$a extends b0	// class@000fb8
{
    public final Object e;

    public void c$a(Object p0){
       super();
       this.e = p0;
    }
    public void b0(){
    }
    public Object c0(){
       return this.e;
    }
    public void d0(p p0){
    }
    public e0 e0(o$d p0){
       e0 a = m.a;
       if (p0 != null) {
          p0.d();
       }
       return a;
    }
    public String toString(){
       return "SendBuffered@"+o0.b(this)+'('+this.e+')';
    }
}
