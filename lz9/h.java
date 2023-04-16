package lz9.h;
import erd.g;
import lz9.b0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import lz9.s;
import android.content.Context;
import n3d.a;
import java.util.List;
import m9a.t$c;

public final class h implements g	// class@002ede
{
    public final b0 b;

    public void h(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       int i = p0.intValue();
       b0 uob0 = b0.class;
       if (!PatchProxy.isSupport(uob0) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, uob0, "10") && !VisitorModeManager.g(6))) {
          if (!QCurrentUser.ME.isLogined()) {
             d.a(-1712118428).x00(tb.A.getActivity(), 8, new LoginParams$a().a(), new s(tb, i));
          }else {
             tb.q0(tb.X.get(i));
          }
       }
       return;
    }
}
