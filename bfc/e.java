package bfc.e;
import erd.g;
import bfc.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;
import dub.z;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.t;
import bfc.g;
import erd.r;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import bfc.f;
import brd.w;
import bfc.c;
import bfc.d;
import crd.b;

public final class e implements g	// class@00046f
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       int i = -8;
       z.d("NewsSlidePlay", i, 1, Boolean.TRUE);
       if (PatchProxy.applyVoid(null, tb, i.class, "3")) {
       }else {
          tb.b = t.merge(z.l("newsSlideNotify", Integer.valueOf(i)).filter(g.b), RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).doOnNext(f.b)).subscribe(new c(tb), new d(tb));
       }
       return;
    }
}
