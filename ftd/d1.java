package ftd.d1;
import ftd.i;
import ftd.c1;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public final class d1 extends i	// class@001638
{
    public final c1 b;

    public void d1(c1 p0){
       super();
       this.b = p0;
    }
    public void a(Throwable p0){
       this.b.dispose();
    }
    public Object invoke(Object p0){
       this.a(p0);
       return l1.a;
    }
    public String toString(){
       return "DisposeOnCancel["+this.b+']';
    }
}
