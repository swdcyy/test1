package m6a.v;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserListPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.framework.model.user.User;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class v implements g	// class@002f63
{
    public final MerchantRecommendUserListPresenter b;

    public void v(MerchantRecommendUserListPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefsWithListener(p0, tb, MerchantRecommendUserListPresenter.class, "4")) {
       }else {
          ArrayList uArrayList = tb.s.b();
          List list = tb.p.Q0();
          if (uArrayList == null || uArrayList.isEmpty()) {
             PatchProxy.onMethodExit(MerchantRecommendUserListPresenter.class, "4");
          }else if(p0.intValue() == -1){
             int i = 0;
             int i1 = (list != null)? list.size(): 0;
             i1 = i1 - uArrayList.size();
             tb.p.W0(uArrayList);
             tb.p.p0(i, uArrayList.size());
             if (i1 > 0) {
                tb.p.s0(uArrayList.size(), i1);
             }
          }else if(list != null && (p0.intValue() < uArrayList.size() && p0.intValue() < list.size())){
             tb.p.V0(p0.intValue(), uArrayList.get(p0.intValue()));
             tb.p.l0(p0.intValue());
          }
          tb.u.onNext(Boolean.TRUE);
          PatchProxy.onMethodExit(MerchantRecommendUserListPresenter.class, "4");
       }
       return;
    }
}
