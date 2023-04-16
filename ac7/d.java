package ac7.d;
import u07.u;
import brd.v;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Integer;
import brd.g;

public final class d implements u	// class@0000a3
{
    public final v b;

    public void d(v p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       tb.onNext(Integer.valueOf(0));
       tb.onComplete();
    }
}
