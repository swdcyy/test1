package nm9.e;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.util.HashMap;
import f55.g;
import java.lang.Object;
import u36.b;
import android.content.Context;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import nm9.a;
import nm9.b;
import crd.b;

public final class e implements g	// class@0031de
{
    public final GifshowActivity b;
    public final String c;
    public final HashMap d;
    public final g e;

    public void e(GifshowActivity p0,String p1,HashMap p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e te = this.e;
       p0 = p0.ys(tb, this.c, this.d);
       p0.compose(c.c(tb.m(), ActivityEvent.DESTROY)).subscribe(new a(te), new b(te));
    }
}
