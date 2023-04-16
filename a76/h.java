package a76.h;
import erd.g;
import java.util.concurrent.RunnableFuture;
import java.lang.Object;
import crd.b;

public final class h implements g	// class@000027
{
    public final RunnableFuture b;

    public void h(RunnableFuture p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.run();
    }
}
