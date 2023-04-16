package bbc.l;
import erd.g;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.f;

public final class l implements g	// class@000432
{
    public final boolean b;
    public final String c;
    public final g d;

    public void l(boolean p0,String p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       l tb = this.b;
       l tc = this.c;
       l td = this.d;
       int i = (tb != null)? 0x7f101784: 0x7f101771;
       i.a(R.style.arg_RES_7f11066a, i);
       RxBus.f.b(new f(tc, tb));
       if (td != null) {
          td.accept(p0);
       }
       return;
    }
}
