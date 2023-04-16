package ftd.s2;
import ftd.f2;
import kotlinx.coroutines.JobSupport;
import ftd.l;
import ftd.z1;
import java.lang.Throwable;
import java.lang.Object;
import ftd.x;
import kotlin.Result;
import qrd.j0;
import asd.c;
import ftd.g2;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class s2 extends f2	// class@000ec6
{
    public final l f;

    public void s2(JobSupport p0,l p1){
       super(p0);
       this.f = p1;
    }
    public void b0(Throwable p0){
       p0 = this.e.y0();
       if (p0 instanceof x) {
          this.f.resumeWith(Result.constructor-impl(j0.a(p0.a)));
       }else {
          this.f.resumeWith(Result.constructor-impl(g2.i(p0)));
       }
       return;
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "ResumeAwaitOnCompletion["+this.f+']';
    }
}
