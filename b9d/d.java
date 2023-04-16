package b9d.d;
import erd.g;
import b9d.i;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xf6.d;
import xf6.l;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.SharedPreferences;
import uy5.b;

public final class d implements g	// class@0003be
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "4")) {
       }else {
          boolean b = false;
          if (!l.c("KEY_SEARCH_HOME_NEW_USER_GUIDE_DISABLE_LIMITDIS", b) && tb.u.getBoolean(tb.P8(p0)+QCurrentUser.me().getId(), b)) {
             b = true;
          }
          tb.v = b;
          if (!tb.R8()) {
             tb.s = p0;
             tb.t = 2;
             b.c("SearchHomeNewUserGuidePresenter", "dispatchShowGuide, mPendingHomeGuideConfigList = "+tb.s);
          }else {
             tb.V8(p0);
          }
       }
       return;
    }
}
