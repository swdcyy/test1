package k6a.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import java.util.List;
import qvb.a;
import k6a.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rq4.r;
import rq4.n;
import com.kwai.framework.model.user.User;
import e17.i;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class e implements View$OnClickListener	// class@002bec
{
    public final e b;

    public void e(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       String str = tb.d.V1();
       List items = tb.d.getItems();
       if (PatchProxy.applyVoidTwoRefsWithListener(str, items, null, u.class, "16")) {
       }else {
          r or = u.a(str);
          or.d = 8;
          if (items.size() > 0) {
             n on = new n();
             or.g = on;
             on.a = items.get(0).getId();
             or.g.d = items.get(0).mPosition + 1;
          }
          u.l(or);
          PatchProxy.onMethodExit(u.class, "16");
       }
       tb.c();
       i.a(R.style.arg_RES_7f11066a, 0x7f104c5a);
       tb.c.E1(tb.f, "FeedbackBinder");
       return;
    }
}
