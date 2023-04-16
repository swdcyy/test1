package h6a.a0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h6a.d0;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import java.lang.Object;
import w85.a;

public class a0 extends Accessor	// class@002571
{
    public final NasaGrootDetailVMFragment c;
    public final d0 d;

    public void a0(d0 p0,NasaGrootDetailVMFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.U0;
    }
    public void set(Object p0){
       this.c.U0 = p0;
    }
}
