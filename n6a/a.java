package n6a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.GrootMerchantRecommendUserFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta$DynamicContainer;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LaunchModel$b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import android.app.Activity;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import com.kuaishou.android.model.feed.MerchantRecommendUserFeed;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta;
import com.kuaishou.android.model.mix.MerchantRecommendUserMeta$ViewObj;
import android.view.View;
import ekd.m1;

public final class a extends PresenterV2	// class@0030f0
{
    public KwaiRnContainerView p;
    public MerchantRecommendUserMeta$DynamicContainer q;
    public GrootMerchantRecommendUserFragment r;

    public void a(GrootMerchantRecommendUserFragment p0){
       a.p(p0, "mFragment");
       super();
       this.r = p0;
    }
    public void E8(){
       boolean b;
       boolean b1;
       boolean b2;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, a.class, "2")) {
          return;
       }
       MerchantRecommendUserMeta$DynamicContainer obj = PatchProxy.applyWithListener(objArray, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.R8();
          if (obj != null) {
             MerchantRecommendUserMeta$DynamicContainer mBundleId = obj.mBundleId;
             if (mBundleId != null) {
                a tq = this.q;
                MerchantRecommendUserMeta$DynamicContainer mBundleId1 = (tq != null)? tq.mBundleId: objArray;
                b1 = mBundleId.equals(mBundleId1);
             label_0036 :
                if (obj != null) {
                   mBundleId1 = obj.mComponentName;
                   if (mBundleId1 != null) {
                      a tq1 = this.q;
                      MerchantRecommendUserMeta$DynamicContainer mComponentNa = (tq1 != null)? tq1.mComponentName: objArray;
                      b2 = mBundleId1.equals(mComponentNa);
                   label_004a :
                      obj = (obj != null)? obj.mExtraMap: objArray;
                      tq1 = this.q;
                      if (tq1 != null) {
                         objArray = tq1.mExtraMap;
                      }
                      b = (obj == objArray)? 1: 0;
                      b = (b1 && (!b2 || !b))? true: false;
                      PatchProxy.onMethodExit(a.class, "7");
                   }
                }
                b2 = false;
                goto label_004a ;
             }
          }
          b1 = false;
          goto label_0036 ;
       }
       if (b) {
          this.P8();
       }
       PatchProxy.onMethodExit(a.class, "2");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, a.class, "3")) {
          return;
       }
       PatchProxy.onMethodExit(a.class, "3");
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, a.class, "4")) {
          return;
       }
       MerchantRecommendUserMeta$DynamicContainer uDynamicCont = this.R8();
       String str = "8";
       LaunchModel launchModel = PatchProxy.applyOneRefsWithListener(uDynamicCont, this, a.class, str);
       if (launchModel != PatchProxyResult.class) {
       }else {
          LaunchModel$b uob = new LaunchModel$b();
          MerchantRecommendUserMeta$DynamicContainer mBundleId = (uDynamicCont != null)? uDynamicCont.mBundleId: objArray;
          uob.i(mBundleId);
          if (uDynamicCont != null) {
             objArray = uDynamicCont.mComponentName;
          }
          uob.j(objArray);
          uob.g(false);
          LaunchModel$b uob1 = uob.f("enableBackBtnHandler", false).f("enableRootViewCache", true);
          if (uDynamicCont != null) {
             MerchantRecommendUserMeta$DynamicContainer mExtraMap = uDynamicCont.mExtraMap;
             if (mExtraMap != null) {
                Iterator iterator = mExtraMap.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   uob1.e(key, uEntry.getValue());
                }
             }
          }
          launchModel = uob1.h();
          a.o(launchModel, "builder.build\(\)");
          PatchProxy.onMethodExit(a.class, str);
       }
       a tp = this.p;
       if (tp != null) {
          tp.c(this.getActivity(), launchModel);
       }
       this.q = uDynamicCont;
       PatchProxy.onMethodExit(a.class, "4");
       return;
    }
    public final MerchantRecommendUserMeta$DynamicContainer R8(){
       Object[] objArray = null;
       MerchantRecommendUserFeed obj = PatchProxy.applyWithListener(objArray, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r.yh();
       if (obj != null) {
          obj = obj.mRecommendUserMeta;
          if (obj != null) {
             MerchantRecommendUserMeta mView = obj.mView;
             if (mView != null) {
                objArray = mView.mDynamicContainer;
             }
          }
       }
       PatchProxy.onMethodExit(a.class, "6");
       return objArray;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a16a4);
       this.P8();
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
