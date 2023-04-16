package hb2.f;
import java.lang.Runnable;
import hb2.g;
import java.lang.Object;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;

public final class f implements Runnable	// class@002d45
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       tb.W8((float)n.k(tb.getActivity()));
    }
}
