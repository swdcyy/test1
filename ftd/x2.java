package ftd.x2;
import ftd.f2;
import kotlinx.coroutines.JobSupport;
import otd.f;
import msd.p;
import ftd.z1;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class x2 extends f2	// class@000eda
{
    public final f f;
    public final p g;

    public void x2(JobSupport p0,f p1,p p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public void b0(Throwable p0){
       if (this.f.j()) {
          this.e.Y0(this.f, this.g);
       }
       return;
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "SelectAwaitOnCompletion["+this.f+']';
    }
}
