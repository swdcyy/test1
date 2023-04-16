package bbc.k;
import erd.g;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.relation.intimate.model.IntimateDeleteResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.c;
import eda.s;

public final class k implements g	// class@000431
{
    public final String b;
    public final g c;

    public void k(String p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k tb = this.b;
       k tc = this.c;
       int i = 0x7f11066a;
       if (!TextUtils.x(p0.mShowMessageToast)) {
          i.d(i, p0.mShowMessageToast);
       }else {
          i.a(i, R.string.arg_RES_7f10176e);
       }
       RxBus f = RxBus.f;
       f.b(new c(tb));
       f.b(s.e(tb, "INTIMATE_RELATION", 1000));
       if (tc != null) {
          tc.accept(p0);
       }
       return;
    }
}
