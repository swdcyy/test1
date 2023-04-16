package a1d.y;
import erd.g;
import a1d.a0;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.yxcorp.login.http.response.AuthInfoResponse;
import com.yxcorp.login.http.response.AuthInfoResponse$Follow;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w0d.f;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.Boolean;
import android.widget.CheckBox;
import android.view.View;
import ekd.p1;

public final class y implements g	// class@000060
{
    public final a0 b;

    public void y(a0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a0.class, "4")) {
       }else {
          p0 = tb.p.get();
          AuthInfoResponse mFollow = p0.mFollow;
          if (mFollow != null && (!TextUtils.x(mFollow.mText) && f.b(tb.s.get()))) {
             tb.t.setVisibility(0);
             tb.u.setText(p0.mFollow.mText);
             tb.v.setChecked(tb.r.get().booleanValue());
             p1.c(tb.v, 25, 25, 25, 25);
          }else {
             tb.t.setVisibility(8);
          }
       }
       return;
    }
}
