package kgd.u;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.k$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.plugin.setting.entries.holder.k;
import k2b.e0;
import java.lang.String;
import sgd.b;

public final class u implements u	// class@0017be
{
    public final k$a b;

    public void u(k$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       u tb = this.b;
       Objects.requireNonNull(tb);
       p0.o();
       b.k(tb.s.a, "PERSONAL_RECOM_PRIVACY", 1);
    }
}
