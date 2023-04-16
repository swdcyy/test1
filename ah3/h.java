package ah3.h;
import erd.g;
import ah3.v;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import ah3.m;
import z1.a;
import oh3.a;
import java.lang.Throwable;
import jh3.a;

public final class h implements g	// class@0000cd
{
    public final v b;
    public final String c;
    public final boolean d;

    public void h(v p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       h tb = this.b;
       tb.T(false);
       tb.Q(new m(tb));
       tb.g.c(tb.h, this.c, true, null);
       if (this.d == null) {
          tb.S();
       }
       return;
    }
}
