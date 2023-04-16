package ftd.t2;
import ftd.f2;
import ftd.z1;
import asd.c;
import java.lang.Throwable;
import qrd.l1;
import kotlin.Result;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class t2 extends f2	// class@000ecc
{
    public final c f;

    public void t2(z1 p0,c p1){
       super(p0);
       this.f = p1;
    }
    public void b0(Throwable p0){
       this.f.resumeWith(Result.constructor-impl(l1.a));
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
    public String toString(){
       return "ResumeOnCompletion["+this.f+']';
    }
}
