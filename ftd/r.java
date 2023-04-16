package ftd.r;
import ftd.q;
import ftd.a2;
import kotlinx.coroutines.JobSupport;
import ftd.s;
import ftd.z1;
import java.lang.Throwable;
import ftd.f2;
import ftd.p2;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class r extends a2 implements q	// class@001672
{
    public final s f;

    public void r(JobSupport p0,s p1){
       super(p0);
       this.f = p1;
    }
    public void b0(Throwable p0){
       this.f.K(this.e);
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public boolean l(Throwable p0){
       return this.e.h0(p0);
    }
    public String toString(){
       return "ChildHandle["+this.f+']';
    }
}
