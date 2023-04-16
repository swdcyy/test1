package dta.n;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import zca.r;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lr6.a;

public final class n implements g	// class@002543
{
    public final a b;

    public void n(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "12")) {
       }else {
          tb.C.E();
          tb.C.s();
       }
       return;
    }
}
