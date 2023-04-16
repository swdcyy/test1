package a1d.u;
import erd.g;
import a1d.w;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.yxcorp.login.http.response.AuthInfoResponse;
import com.yxcorp.login.http.response.AuthInfoResponse$AppInfo;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import com.yxcorp.utility.TextUtils;

public final class u implements g	// class@000058
{
    public final w b;

    public void u(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, w.class, "4")) {
       }else {
          p0 = tb.p.get();
          tb.s.L(p0.mAppInfo.mIcon);
          tb.t.setText(p0.mAppInfo.mName);
          p0 = p0.mScopeList.iterator();
          while (p0.hasNext()) {
             AuthInfoResponse$Scope scope = p0.next();
             if ((tb.r.get()).equals(scope.mScope)) {
                tb.u.setText(TextUtils.I(scope.mText));
             }
          }
       }
       return;
    }
}
