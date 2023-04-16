package ftd.p;
import ftd.a2;
import ftd.z1;
import ftd.l;
import java.lang.Throwable;
import ftd.f2;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class p extends a2	// class@00166c
{
    public final l f;

    public void p(z1 p0,l p1){
       super(p0);
       this.f = p1;
    }
    public void b0(Throwable p0){
       p tf = this.f;
       tf.B(tf.p(this.e));
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "ChildContinuation["+this.f+']';
    }
}
