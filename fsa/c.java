package fsa.c;
import zq6.u;
import com.yxcorp.gifshow.homebottom.presenter.b;
import java.lang.Object;
import co5.r;
import java.util.Objects;
import java.util.BitSet;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;

public final class c implements u	// class@0029e2
{
    public final b a;

    public void c(b p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (p0.a == null) {
          ta.v.set(p0.b);
       }else {
          ta.v.clear(p0.b);
       }
       Log.g("NasaBottomPresenter", "flags:"+ta.v);
       p0 = ta.u.c();
       boolean b = (ta.v.cardinality())? true: false;
       p0.E0(b);
       return;
    }
}
