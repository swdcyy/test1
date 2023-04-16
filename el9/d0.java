package el9.d0;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.presenter.global.g$b;
import java.lang.Object;
import com.yxcorp.gifshow.comment.presenter.global.g;
import com.yxcorp.gifshow.comment.log.a;

public final class d0 implements Runnable	// class@0021df
{
    public final g$b b;

    public void d0(g$b p0){
       this.b = p0;
    }
    public final void run(){
       d0 tb = this.b;
       if (tb.b.P8()) {
          tb.b.t.f();
       }
       return;
    }
}
