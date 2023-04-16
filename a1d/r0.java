package a1d.r0;
import erd.g;
import a1d.t0;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.authorization.AuthActivity;
import com.kwai.feature.api.social.login.model.AuthSource;
import im8.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w0d.f;
import java.util.ArrayList;
import k2b.e0;
import w0d.e;
import io.reactivex.subjects.PublishSubject;

public final class r0 implements g	// class@00004f
{
    public final t0 b;

    public void r0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       r0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = t0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "3")) {
       }else {
          Activity uActivity = tb.getActivity();
          int value = tb.r.getValue();
          t0 q = tb.q;
          Object obj = tb.s.get();
          t0 p = tb.p;
          p0 = PatchProxy.apply(objArray, tb, p0, "4");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else {
             p0 = tb.t.get();
             objArray = 0;
             if (p0 != null) {
                p0 = p0.mScopeList;
                if (p0 != null) {
                   p0 = p0.iterator();
                   while (p0.hasNext()) {
                      AuthInfoResponse$Scope scope = p0.next();
                      if (!TextUtils.x(tb.s.get()) && (tb.s.get()).equals(scope.mScope)) {
                         if (f.a(scope.mScope)) {
                            p0 = scope.mPhoneNumList;
                            if (p0 == null || p0.size() <= 0) {
                               break ;
                            }
                         }else {
                            p0 = scope.mUserInfoList;
                            if (p0 == null || p0.size() <= 0) {
                               break ;
                            }
                         }
                         objArray = 1;
                         break ;
                      }
                   }
                }
             }else {
             }
          }
          e.a(uActivity, value, q, obj, p, b);
       }
       tb.u.onNext(AuthEvent.DATA_LOAD_SUCCESS);
       return;
    }
}
