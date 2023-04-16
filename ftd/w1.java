package ftd.w1;
import ftd.i;
import msd.l;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;
import ftd.o0;

public final class w1 extends i	// class@000ed6
{
    public final l b;

    public void w1(l p0){
       super();
       this.b = p0;
    }
    public void a(Throwable p0){
       this.b.invoke(p0);
    }
    public Object invoke(Object p0){
       this.a(p0);
       return l1.a;
    }
    public String toString(){
       return "InvokeOnCancel["+o0.a(this.b)+'@'+o0.b(this)+']';
    }
}
