package j01.v;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import lj1.f;

public final class v implements g	// class@002a0c
{
    public static final v b;

    static {
       v.b = new v();
    }
    public void v(){
       super();
    }
    public final void accept(Object p0){
       RxBus.f.b(new f(p0));
    }
}
