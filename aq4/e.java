package aq4.e;
import com.yxcorp.gifshow.bubble.b$b;
import aq4.j;
import java.lang.Object;
import com.yxcorp.gifshow.widget.popup.a;
import java.util.Objects;
import com.kwai.library.widget.popup.bubble.a$c;
import android.view.View;
import com.kwai.library.widget.popup.common.c$b;
import aq4.d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import aq4.k;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class e implements b$b	// class@0002c3
{
    public final j a;

    public void e(j p0){
       this.a = p0;
    }
    public final void a(a p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       p0.q0(true);
       p0.o0(ta.q);
       p0.P(true);
       p0.T(5000);
       p0.L(d.b);
       p0.Y(new k(ta));
    }
}
