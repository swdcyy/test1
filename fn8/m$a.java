package fn8.m$a;
import fn8.l$a;
import fn8.m;
import java.lang.Object;
import fn8.l;
import fn8.b;
import java.lang.Math;

public class m$a implements l$a	// class@00232f
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void a(l p0){
       this.a.e();
    }
    public boolean b(l p0){
       m$a ta = this.a;
       m c = ta.C;
       double d = p0.d + c;
       ta.C = d;
       long l = p0.a - p0.b;
       if (l > 0) {
          ta.D = (d - c) / (double)l;
       }
       if (Math.abs(d) - 0x3fb657184ae74487 >= 0 && this.a.k() == 2) {
          this.a.a();
       }
       return true;
    }
    public boolean c(l p0){
       return true;
    }
}
