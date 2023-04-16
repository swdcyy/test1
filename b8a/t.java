package b8a.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.g$b;
import android.view.View;
import java.lang.Object;
import z1.a;

public final class t implements Runnable	// class@0003f8
{
    public final g$b b;
    public final View c;

    public void t(g$b p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b.accept(this.c);
    }
}
