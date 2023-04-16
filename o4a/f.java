package o4a.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;

public final class f implements Runnable	// class@003286
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       if (tb.P8()) {
          tb.R8(1);
          tb.J = false;
       }else {
          tb.J = true;
       }
       return;
    }
}
