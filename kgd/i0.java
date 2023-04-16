package kgd.i0;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.p$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.plugin.setting.entries.holder.p;
import android.widget.TextView;
import java.lang.String;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import k2b.e0;
import sgd.b;

public final class i0 implements u	// class@001795
{
    public final p$a b;

    public void i0(p$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       i0 tb = this.b;
       tb.s.e.o(tb.p, "privacy_location", true, null, true);
       b.k(tb.s.a, "LOCAL_INFORMATION", 0);
    }
}
