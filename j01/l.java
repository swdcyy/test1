package j01.l;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import lj1.f;

public final class l implements g	// class@002a00
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final void accept(Object p0){
       RxBus.f.b(new f(p0));
    }
}
