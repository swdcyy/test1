package kotlinx.coroutines.JobSupport$b;
import ftd.f2;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.JobSupport$c;
import ftd.r;
import java.lang.Object;
import ftd.z1;
import java.lang.Throwable;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class JobSupport$b extends f2	// class@001927
{
    public final JobSupport f;
    public final JobSupport$c g;
    public final r h;
    public final Object i;

    public void JobSupport$b(JobSupport p0,JobSupport$c p1,r p2,Object p3){
       super(p2.f);
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
    }
    public void b0(Throwable p0){
       this.f.j0(this.g, this.h, this.i);
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "ChildCompletion["+this.h+", "+this.i+']';
    }
}
