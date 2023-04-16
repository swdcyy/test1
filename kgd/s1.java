package kgd.s1;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.o0$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.plugin.setting.entries.holder.o0;
import k2b.e0;
import java.lang.String;
import sgd.b;

public final class s1 implements u	// class@0017b6
{
    public final o0$a b;

    public void s1(o0$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       s1 tb = this.b;
       Objects.requireNonNull(tb);
       p0.q(4);
       b.k(tb.r.a, "PRIVATE_USER", 1);
    }
}
