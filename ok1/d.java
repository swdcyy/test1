package ok1.d;
import android.view.View$OnClickListener;
import ok1.h;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.bottombar.component.widget.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.lifecycle.MutableLiveData;
import ok1.e;
import ok1.f;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import j61.c;

public final class d implements View$OnClickListener	// class@003520
{
    public final h b;

    public void d(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d i = tb.i;
       Object obj = PatchProxy.apply(null, tb, h.class, "9");
       int i1 = (obj != PatchProxyResult.class)? obj.intValue(): k0.b(tb.n(), e.a, f.a).or(Integer.valueOf(0)).intValue();
       i.a(i1);
       return;
    }
}
