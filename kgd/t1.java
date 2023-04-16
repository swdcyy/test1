package kgd.t1;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.o0$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.plugin.setting.entries.holder.o0;
import android.widget.TextView;
import java.lang.String;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import k2b.e0;
import sgd.b;

public final class t1 implements u	// class@0017b9
{
    public final o0$a b;

    public void t1(o0$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       t1 tb = this.b;
       tb.r.e.o(tb.p, "privacy_user", true, null, true);
       b.k(tb.r.a, "PRIVATE_USER", 0);
    }
}
