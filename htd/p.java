package htd.p;
import htd.z;
import htd.b0;
import java.lang.Throwable;
import java.lang.Object;
import ltd.o$d;
import ltd.e0;
import ftd.m;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import java.lang.String;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import java.lang.StringBuilder;
import ftd.o0;

public final class p extends b0 implements z	// class@000fd7
{
    public final Throwable e;

    public void p(Throwable p0){
       super();
       this.e = p0;
    }
    public void b0(){
    }
    public Object c0(){
       return this.g0();
    }
    public e0 d(Object p0,o$d p1){
       p0 = m.a;
       if (p1 != null) {
          p1.d();
       }
       return p0;
    }
    public void d0(p p0){
    }
    public Object e(){
       return this.f0();
    }
    public e0 e0(o$d p0){
       e0 a = m.a;
       if (p0 != null) {
          p0.d();
       }
       return a;
    }
    public p f0(){
       return this;
    }
    public p g0(){
       return this;
    }
    public final Throwable h0(){
       p te = this.e;
       if (te != null) {
       }else {
          te = new ClosedReceiveChannelException("Channel was closed");
       }
       return te;
    }
    public final Throwable i0(){
       p te = this.e;
       if (te != null) {
       }else {
          te = new ClosedSendChannelException("Channel was closed");
       }
       return te;
    }
    public void m(Object p0){
    }
    public String toString(){
       return "Closed@"+o0.b(this)+'['+this.e+']';
    }
}
