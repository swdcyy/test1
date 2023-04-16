package com.kuaishou.merchant.interpretation.MerchantInterpretationPlayerFragment;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import android.os.Bundle;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawConstraintLayout;
import brd.t;
import java.lang.StringBuffer;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import com.kuaishou.merchant.interpretation.presenter.b;
import im8.c;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import org.parceler.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;

public class MerchantInterpretationPlayerFragment extends MerchantBaseFragment	// class@001842
{
    public PresenterV2 m;
    public MerchantInterpretationInfo n;
    public View o;
    public WatchDispatchDrawConstraintLayout p;
    public static final int q;

    public void MerchantInterpretationPlayerFragment(){
       super();
    }
    public String C1(){
       return "EXPLANATION_PLAYBACK";
    }
    public String D1(){
       return "Ω≤Ω‚ªÿ∑≈“≥";
    }
    public ClientEvent$ExpTagTrans I1(){
       Object[] objArray = null;
       ClientEvent$ExpTagTrans obj = PatchProxy.apply(objArray, this, MerchantInterpretationPlayerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.n.serverExpTag)) {
          return objArray;
       }
       obj = new ClientEvent$ExpTagTrans();
       obj.clientExpTag = String.valueOf(1);
       obj.serverExpTag = this.n.serverExpTag;
       return obj;
    }
    public int M(){
       return 1;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantInterpretationPlayerFragment.class, "4")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a0594);
       return;
    }
    public t getDispatchDrawObservable(){
       MerchantInterpretationPlayerFragment obj = PatchProxy.apply(null, this, MerchantInterpretationPlayerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          return null;
       }
       return obj.getDispatchDrawObservable();
    }
    public String getPageParams(){
       StringBuffer obj = PatchProxy.apply(null, this, MerchantInterpretationPlayerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "itemId="+this.n.commodity.mId+"&source="+this.n.entranceType;
       if (!TextUtils.isEmpty(this.n.searchSessionId)) {
          obj = obj+"&sessionId="+this.n.searchSessionId;
       }
       return obj;
    }
    public String o(){
       return "EXPLANATION_PLAYBACK";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInterpretationPlayerFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       PresenterV2 presenterV2 = new PresenterV2();
       this.m = presenterV2;
       presenterV2.U7(new MerchantInterpretationPlayerPresenter());
       this.m.U7(new b());
       this.m.f(this.o);
       Object[] objArray = new Object[]{this.n,new c("MERCHANT_FRAGMENT", this),this};
       this.m.i(objArray);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInterpretationPlayerFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.n = b.a(this.getArguments().getParcelable("INTERPRETATION_DATA"));
       }
       if (p0 != null && p0.containsKey("INTERPRETATION_DATA")) {
          this.n = b.a(p0.getParcelable("INTERPRETATION_DATA"));
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantInterpretationPlayerFragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.e(p1, R.layout.arg_RES_7f0d0f16);
       this.o = view;
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerFragment.class, "8")) {
          return;
       }
       super.onDestroy();
       MerchantInterpretationPlayerFragment tm = this.m;
       if (tm != null) {
          tm.destroy();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       MerchantInterpretationPlayerFragment tm = this.m;
       if (tm != null) {
          tm.unbind();
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInterpretationPlayerFragment.class, "6")) {
          return;
       }
       p0.putParcelable("INTERPRETATION_DATA", b.c(this.n));
       super.onSaveInstanceState(p0);
       return;
    }
}
