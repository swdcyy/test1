package ked.h$a;
import qvb.q;
import ked.h;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import jed.h;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import com.yxcorp.plugin.search.response.BaseSearchResultResponse;
import java.util.Objects;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchSkyFallInfo;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import nfd.k1;
import android.content.Context;
import lnc.w5;
import java.lang.Integer;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchPopUpStyleInfo;
import android.content.DialogInterface$OnDismissListener;
import jz6.a;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchPopUpStyleInfo$Decoration;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import ked.i;
import w4.j;
import ked.c;
import java.util.ArrayList;
import lnc.c3$b;
import lnc.c3;
import ked.b;
import crd.b;
import ok.h;
import lnc.b9;

public class h$a implements q	// class@001770
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, h$a.class, "1")) {
          return;
       }
       if (p0) {
          h q = this.b.q;
          if (q != null) {
             q.dismiss();
          }
          h$a tb = this.b;
          tb.u = "";
          tb.v = false;
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       boolean b1;
       Object obj = this;
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, uoa, "2")) {
          return;
       }
       if (p0) {
          SearchResultResponse searchResult = obj.b.s.q().L0();
          if (searchResult != null) {
             h$a b = obj.b;
             b.r = searchResult.mExtParams;
             b.p = searchResult.mUssid;
          }
          uoa = obj.b;
          h r = uoa.r;
          Objects.requireNonNull(uoa);
          h oh = h.class;
          if (!PatchProxy.applyVoidOneRefs(r, uoa, oh, "6") && r != null) {
             SearchResultExtParams mReceiveSkyF = r.mReceiveSkyFallInfo;
             if (mReceiveSkyF != null && (mReceiveSkyF.mReceiveSkyFallModel != null && mReceiveSkyF.mPopUpStyleInfo != null)) {
                uoa.u = mReceiveSkyF.mCouponId;
                Object obj1 = PatchProxy.apply(null, uoa, oh, "7");
                if (obj1 != PatchProxyResult.class) {
                   b1 = obj1.booleanValue();
                }else if(uoa.getActivity() != null && (!uoa.getActivity().isFinishing() && (uoa.getActivity().isDestroyed() || uoa.s.R == null))){
                   b1 = false;
                }else {
                   b1 = true;
                }
                if (!b1) {
                   k1.a(r.mReceiveSkyFallInfo.mCouponId, "search_sky_fall_fail_unselect", true);
                }else if(r.mDisplayGpsToast != null && !w5.a(uoa.getContext())){
                   k1.a(r.mReceiveSkyFallInfo.mCouponId, "search_poi_location_permission_toast", true);
                }else {
                   k1.a(r.mReceiveSkyFallInfo.mCouponId, "search_sky_fall_receive_data", false);
                   SearchResultExtParams mReceiveSkyF1 = r.mReceiveSkyFallInfo;
                   SearchResultExtParams mCouponType = r.mCouponType;
                   SearchResultExtParams mCouponExtPa = r.mCouponExtParams;
                   if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidThreeRefs(mReceiveSkyF1, Integer.valueOf(mCouponType), mCouponExtPa, uoa, h.class, "8")) {
                      oh = uoa.q;
                      if (oh != null) {
                         oh.dismiss();
                      }
                      mReceiveSkyF = mReceiveSkyF1;
                      h oh1 = new h(uoa.getActivity(), uoa.s, mReceiveSkyF1.mPopUpStyleInfo, mReceiveSkyF1, uoa.p, mCouponType, mCouponExtPa);
                      uoa.q = oh;
                      oh.setOnDismissListener(uoa.w);
                      if (mReceiveSkyF.mIsActivity != null) {
                         SearchPopUpStyleInfo mDecoration = mReceiveSkyF.mPopUpStyleInfo.mDecoration;
                         if (mDecoration != null && !q.f(mDecoration.mBgLottie)) {
                            a.i(uoa.getContext(), mReceiveSkyF.mPopUpStyleInfo.mDecoration.mBgLottie.get(false).mUrl).addListener(new i(uoa));
                         }
                      }
                      uoa.v = true;
                      uoa.t = b9.c(uoa.t, new b(uoa, c3.b(mReceiveSkyF.mPopUpStyleInfo, c.a, new ArrayList()), mReceiveSkyF));
                   }
                }
             }
          }
       }
    label_0157 :
       return;
    }
}
