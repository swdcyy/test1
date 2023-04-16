package a1d.j0;
import erd.g;
import a1d.m0;
import java.lang.Object;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.util.Objects;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import java.util.ArrayList;
import java.lang.String;
import w0d.f;
import im8.f;
import w0d.g;
import com.yxcorp.login.authorization.mode.AuthEvent;
import io.reactivex.subjects.PublishSubject;

public final class j0 implements g	// class@00002f
{
    public final m0 b;

    public void j0(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m0 f;
       AuthInfoResponse$Scope scope;
       j0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          AuthInfoResponse mScopeList = p0.mScopeList;
          if (mScopeList == null || !mScopeList.size()) {
          label_0066 :
             f = tb.F;
             if (f != null) {
                f.C2(0x2711, "scope list is empty");
             }
          }else {
             mScopeList = 0;
             Iterator iterator = p0.mScopeList.iterator();
             while (iterator.hasNext()) {
                scope = iterator.next();
                if (scope.isGranted == null) {
                   AuthInfoResponse$Scope mUserInfoLis = scope.mUserInfoList;
                   if (mUserInfoLis == null || (mUserInfoLis.size() > 0 || (f.a(scope.mScope) && scope.mPhoneNumList != null))) {
                      mScopeList = 1;
                      break ;
                   }
                }
             }
             tb.z.set(p0);
             p0 = tb.F;
             if (p0 != null) {
                p0.K0();
             }
             if (mScopeList) {
                tb.R8();
                tb.P8();
                tb.A.onNext(AuthEvent.DATA_LOAD_SUCCESS);
             }else {
                p0 = tb.F;
                if (p0 != null) {
                   p0.P1();
                }
             }
          }
       }else {
          goto label_0066 ;
       }
       return;
    }
}
