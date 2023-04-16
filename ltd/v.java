package ltd.v;
import ftd.s0;
import ftd.j2;
import java.lang.Throwable;
import java.lang.String;
import nsd.u;
import kotlin.coroutines.CoroutineContext;
import java.lang.Runnable;
import java.lang.Void;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.IllegalStateException;
import ltd.u;
import ftd.k;
import asd.c;
import ftd.c1;

public final class v extends j2 implements s0	// class@001ce4
{
    public final Throwable c;
    public final String d;

    public void v(Throwable p0,String p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public void v(Throwable p0,String p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public j2 A(){
       return this;
    }
    public Void T(CoroutineContext p0,Runnable p1){
       this.Y();
       throw null;
    }
    public final Void Y(){
       String str1;
       if (this.c != null) {
          StringBuilder str = "Module with the Main dispatcher had failed to initialize";
          v td = this.d;
          if (td != null) {
             str1 = ". "+td;
             if (str1 != null) {
             label_0028 :
                throw new IllegalStateException(str+str1, this.c);
             }
          }
          str1 = "";
          goto label_0028 ;
       }else {
          u.e();
          throw null;
       }
    }
    public Void b0(long p0,k p1){
       this.Y();
       throw null;
    }
    public void g(long p0,k p1){
       this.b0(p0, p1);
    }
    public Object h(long p0,c p1){
       this.Y();
       throw null;
    }
    public c1 k(long p0,Runnable p1){
       this.Y();
       throw null;
    }
    public String toString(){
       StringBuilder str = "Main[missing";
       String str1 = (this.c != null)? ", cause="+this.c: "";
       return str+str1+']';
    }
    public void u(CoroutineContext p0,Runnable p1){
       this.T(p0, p1);
    }
    public boolean x(CoroutineContext p0){
       this.Y();
       throw false;
    }
}
