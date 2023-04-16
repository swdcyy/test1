package kgd.x0;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.d0$a;
import java.lang.Object;
import wl9.p;

public final class x0 implements g	// class@0017c5
{
    public final d0$a b;

    public void x0(d0$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onEventMainThread(p0);
    }
}
