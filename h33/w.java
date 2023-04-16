package h33.w;
import erd.g;
import h33.x;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import h33.y;

public final class w implements g	// class@002c32
{
    public final x b;
    public final SlipSwitchButton c;
    public final boolean d;
    public final g e;

    public void w(x p0,SlipSwitchButton p1,boolean p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       w te = this.e;
       this.b.g.a(this.c, this.d);
       if (te != null) {
          te.accept(p0);
       }
       return;
    }
}
