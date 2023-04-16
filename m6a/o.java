package m6a.o;
import java.lang.Runnable;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;

public final class o implements Runnable	// class@002f57
{
    public final User b;

    public void o(User p0){
       this.b = p0;
    }
    public final void run(){
       RxBus.f.b(n.a(this.b));
    }
}
