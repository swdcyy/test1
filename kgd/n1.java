package kgd.n1;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.m0$a;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import lgd.c;

public final class n1 implements g	// class@0017a7
{
    public final m0$a b;

    public void n1(m0$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n1 tb = this.b;
       Objects.requireNonNull(tb);
       tb.R8(p0.intValue());
       RxBus.f.b(new c(p0.intValue()));
    }
}
