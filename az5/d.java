package az5.d;
import erd.g;
import java.util.concurrent.RunnableFuture;
import java.lang.Object;
import crd.b;

public final class d implements g	// class@0003d1
{
    public final RunnableFuture b;

    public void d(RunnableFuture p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.run();
    }
}
