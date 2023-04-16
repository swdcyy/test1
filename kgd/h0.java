package kgd.h0;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.p$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.plugin.setting.entries.holder.p;
import k2b.e0;
import java.lang.String;
import sgd.b;

public final class h0 implements u	// class@001792
{
    public final p$a b;

    public void h0(p$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       h0 tb = this.b;
       Objects.requireNonNull(tb);
       p0.q(4);
       b.k(tb.s.a, "LOCAL_INFORMATION", 1);
    }
}
