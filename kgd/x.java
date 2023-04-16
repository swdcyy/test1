package kgd.x;
import u07.u;
import com.yxcorp.plugin.setting.entries.holder.k$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.yxcorp.plugin.setting.entries.holder.k;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.String;
import com.yxcorp.plugin.setting.helper.j;
import k2b.e0;
import sgd.b;

public final class x implements u	// class@0017c7
{
    public final k$a b;

    public void x(k$a p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       x tb = this.b;
       tb.s.e.m(tb.p, null, "personalise_reco", false);
       b.k(tb.s.a, "PERSONAL_RECOM_PRIVACY", false);
    }
}
