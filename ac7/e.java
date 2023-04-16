package ac7.e;
import u07.u;
import brd.v;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Integer;
import brd.g;

public final class e implements u	// class@0000a4
{
    public final v b;

    public void e(v p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       e tb = this.b;
       tb.onNext(Integer.valueOf(0));
       tb.onComplete();
    }
}
