package c5c.h;
import u07.u;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import nf6.i;
import java.lang.String;
import android.net.Uri;
import android.content.Context;
import android.content.Intent;
import lnc.a1;
import k2b.e0;
import z5c.y1;
import com.kwai.library.widget.popup.common.c;

public final class h implements u	// class@000527
{
    public final e b;
    public final Activity c;

    public void h(e p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       h tb = this.b;
       tb.getActivity().startActivity(b.a(0x66dce92a).a(this.c, Uri.parse("kwai://setting/atTabSetting")));
       y1.x(tb.p, a1.p(R.string.arg_RES_7f103e49));
       p0.o();
    }
}
