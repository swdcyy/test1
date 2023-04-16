package b3d.r0;
import java.util.concurrent.Callable;
import java.lang.Object;
import yb6.d;
import java.lang.Boolean;

public final class r0 implements Callable	// class@000341
{
    public final long b;

    public void r0(long p0){
       this.b = p0;
    }
    public final Object call(){
       r0 tb = this.b;
       Boolean fALSE = (tb > 0 && (d.a() / 1000) - tb < 0)? Boolean.FALSE: Boolean.TRUE;
       return fALSE;
    }
}
