package kgd.c0;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.m$a$a;
import java.lang.Object;
import com.yxcorp.plugin.setting.entries.holder.m$a;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.e;

public final class c0 implements g	// class@00177c
{
    public final m$a$a b;

    public void c0(m$a$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j.d(this.b.b.p, false);
       RxBus.f.b(new e(false));
    }
}
