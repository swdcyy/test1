package bbc.h;
import erd.g;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.b;
import eda.s;
import java.lang.Boolean;

public final class h implements g	// class@00042e
{
    public final String b;
    public final int c;
    public final g d;

    public void h(String p0,int p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h td = this.d;
       p0 = RxBus.f;
       p0.b(new b(tb, this.c));
       p0.b(s.e(tb, "INTIMATE_RELATION", 1000));
       if (td != null) {
          td.accept(Boolean.TRUE);
       }
       return;
    }
}
