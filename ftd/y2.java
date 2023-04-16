package ftd.y2;
import ftd.f2;
import kotlinx.coroutines.JobSupport;
import otd.f;
import msd.l;
import ftd.z1;
import java.lang.Throwable;
import asd.c;
import mtd.a;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class y2 extends f2	// class@000ede
{
    public final f f;
    public final l g;

    public void y2(JobSupport p0,f p1,l p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public void b0(Throwable p0){
       if (this.f.j()) {
          a.c(this.g, this.f.r());
       }
       return;
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "SelectJoinOnCompletion["+this.f+']';
    }
}
