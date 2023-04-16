package ao2.j;
import java.lang.Runnable;
import com.kuaishou.live.core.show.yoda.model.SubscribeLiveParams;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import xk2.a;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.t;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import ao2.i;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class j implements Runnable	// class@0002a1
{
    public final SubscribeLiveParams b;
    public final Activity c;
    public final g d;

    public void j(SubscribeLiveParams p0,Activity p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       j tb = this.b;
       a uoa = new a();
       uoa.mSource = tb.mSource;
       uoa.mSubscribeId = tb.mSubscribeId;
       i oi = new i(this.d, tb);
       j.p(uoa, this.c).subscribe(oi, Functions.d());
    }
}
