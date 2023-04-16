package kgd.t0;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.y$a;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;

public final class t0 implements g	// class@0017b8
{
    public final y$a b;

    public void t0(y$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.R8(p0.intValue());
    }
}
