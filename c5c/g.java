package c5c.g;
import u07.u;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.String;
import lnc.a1;
import k2b.e0;
import z5c.y1;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.kwai.library.widget.popup.common.c;

public final class g implements u	// class@000526
{
    public final e b;

    public void g(e p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       g tb = this.b;
       y1.x(tb.p, a1.p(R.string.arg_RES_7f101286));
       tb.r.b("PROFILE_TAB_CHANGE", "MAIN_KEY", Integer.valueOf(19));
       p0.o();
    }
}
