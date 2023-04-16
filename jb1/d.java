package jb1.d;
import erd.g;
import jb1.b$c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import nl8.p;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jb1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b61.b;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.d;

public final class d implements g	// class@002b0d
{
    public final b$c b;
    public final UserInfo c;

    public void d(b$c p0,UserInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       tb.p.T0(tb.t()).k0();
       int i = 1;
       if (tc.isWatching()) {
          p0 = tb.p;
          p0.y = p0.y - i;
       }
       if (!PatchProxy.applyVoid(null, tb, b$c.class, "17")) {
          int i1 = tb.p.r1();
          b$c p = tb.p;
          if (i1 != p.z) {
             p.z = i1;
             p.k0();
          }
       }
       Object[] objArray = new Object[i];
       objArray[0] = b.c(tc);
       i.d(R.style.arg_RES_7f11066a, a.a().a().getString(R.string.arg_RES_7f102bb5, objArray));
       p0 = RxBus.f;
       UserInfo mId = tc.mId;
       if (tb.p.getItemCount()) {
          i = false;
       }
       p0.b(new d(mId, i));
       return;
    }
}
