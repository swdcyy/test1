package nfd.o0;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;

public final class o0 implements g	// class@001de8
{
    public final Runnable b;

    public void o0(Runnable p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.run();
    }
}
