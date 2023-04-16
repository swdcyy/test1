package a1d.n1;
import erd.g;
import a1d.p1;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1d.p1$a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup;
import g9c.a;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import im8.f;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;

public final class n1 implements g	// class@000041
{
    public final p1 b;

    public void n1(p1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n1 tb = this.b;
       Objects.requireNonNull(tb);
       p1 op1 = p1.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, op1, "4")) {
       }else {
          tb.v = new p1$a(tb);
          p0 = null;
          if (!PatchProxy.applyVoid(p0, tb, op1, "6")) {
             tb.u.setNestedScrollingEnabled(true);
             tb.u.setLayoutManager(new LinearLayoutManager(tb.getActivity()));
             tb.u.setAdapter(tb.v);
          }
          if (!PatchProxy.applyVoid(p0, tb, op1, "5")) {
             tb.u.setVisibility(0);
             if (!tb.getActivity().isFinishing()) {
                tb.v.M0();
                AuthInfoResponse obj = PatchProxy.apply(p0, tb, op1, "7");
                if (obj != PatchProxyResult.class) {
                   p0 = obj;
                }else {
                   obj = tb.q.get();
                   if (obj != null) {
                      obj = obj.mScopeList;
                      if (obj != null) {
                         Iterator iterator = obj.iterator();
                         while (iterator.hasNext()) {
                            AuthInfoResponse$Scope scope = iterator.next();
                            if (!TextUtils.x(tb.r.get()) && (tb.r.get()).equals(scope.mScope)) {
                               AuthInfoResponse$Scope mAgreement = scope.mAgreement;
                               if (mAgreement != null && mAgreement.size() > 0) {
                                  p0 = scope.mAgreement;
                                  break ;
                               }
                            }
                         }
                      }
                   }
                }
                if (p0 != null) {
                   tb.v.L0(p0);
                }
                tb.v.k0();
             }
          }
       }
       return;
    }
}
