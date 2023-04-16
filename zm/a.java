package zm.a;
import brd.t;
import java.lang.Object;
import brd.y;

public abstract class a extends t	// class@0034c0
{

    public void a(){
       super();
    }
    public abstract Object b();
    public abstract void c(y p0);
    public final void subscribeActual(y p0){
       this.c(p0);
       p0.onNext(this.b());
    }
}
