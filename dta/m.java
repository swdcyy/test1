package dta.m;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import jsa.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lr6.a;

public final class m implements g	// class@00253f
{
    public final a b;

    public void m(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "11")) {
       }else {
          tb.C.E();
          tb.C.s();
       }
       return;
    }
}
