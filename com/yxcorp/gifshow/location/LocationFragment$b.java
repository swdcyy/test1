package com.yxcorp.gifshow.location.LocationFragment$b;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.location.LocationFragment;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9c.d;
import qvb.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import j2b.s;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import i2b.a;
import j2b.n;
import android.view.View$OnClickListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class LocationFragment$b extends f	// class@001ad9
{
    public final LocationFragment l;

    public void LocationFragment$b(LocationFragment p0,RefreshLayout p1,d p2,i p3,boolean p4){
       this.l = p0;
       super(p1, p2, p3, p4);
    }
    public View J0(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, LocationFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.J0();
       if (obj instanceof KwaiEmptyStateView) {
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          if (s.b()) {
             uoa.h(R.string.arg_RES_7f1039b5);
          }else {
             obj = a.i(this.l.Ac(), R.layout.arg_RES_7f0d128a);
             obj.setRetryBtnVisibility(0);
             uoa.h(R.string.publish_poi_request_permission_hint);
             uoa.e(R.string.arg_RES_7f103d11);
             uoa.k(R.drawable.common_emptystate_noposition);
             uoa.p(new n(this));
             if (this.l.getActivity() != null && this.l.getActivity() instanceof GifshowActivity) {
                FragmentActivity uFragmentAct = this.l.getActivity();
                if (!PatchProxy.applyVoidOneRefs(uFragmentAct, objArray, a.class, "101")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "AUTHORIZE_LOCATION_TIPS";
                   u1.D0("", uFragmentAct, 6, uElementPack, null, null);
                }
             }
          }
          uoa.a(obj);
       }
       return obj;
    }
}
