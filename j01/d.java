package j01.d;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import lj1.f;

public final class d implements g	// class@0029ec
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       RxBus.f.b(new f(p0));
    }
}
