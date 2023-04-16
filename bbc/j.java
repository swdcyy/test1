package bbc.j;
import erd.g;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.a;
import eda.s;
import java.lang.Boolean;

public final class j implements g	// class@000430
{
    public final String b;
    public final g c;

    public void j(String p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       j tb = this.b;
       j tc = this.c;
       p0 = RxBus.f;
       p0.b(new a(tb));
       p0.b(s.e(tb, "INTIMATE_RELATION", 1000));
       if (tc != null) {
          tc.accept(Boolean.TRUE);
       }
       return;
    }
}
