package ftd.y1;
import ftd.f2;
import ftd.z1;
import msd.l;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.o0;

public final class y1 extends f2	// class@000edd
{
    public final l f;

    public void y1(z1 p0,l p1){
       super(p0);
       this.f = p1;
    }
    public void b0(Throwable p0){
       this.f.invoke(p0);
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "InvokeOnCompletion["+o0.a(this)+'@'+o0.b(this)+']';
    }
}
