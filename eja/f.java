package eja.f;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class f implements g	// class@0026c4
{
    public final a b;

    public void f(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       tb.r = (p0.booleanValue())? tb.r + 1: tb.r - 1;
       return;
    }
}
