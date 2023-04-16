package kgd.b0;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.m$a$a;
import java.lang.Object;
import com.yxcorp.plugin.setting.entries.holder.m$a;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.e;

public final class b0 implements g	// class@001778
{
    public final m$a$a b;

    public void b0(m$a$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j.d(this.b.b.p, true);
       RxBus.f.b(new e(true));
    }
}
