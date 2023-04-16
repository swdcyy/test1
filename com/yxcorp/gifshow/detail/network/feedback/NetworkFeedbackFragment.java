package com.yxcorp.gifshow.detail.network.feedback.NetworkFeedbackFragment;
import ml8.d;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h2a.m;
import h2a.g;
import h2a.l;
import com.yxcorp.gifshow.detail.network.feedback.NetworkFeedbackFragment$a;

public class NetworkFeedbackFragment extends BottomSheetFragment implements d	// class@0015ba
{
    public QPhoto A;
    public RecyclerView B;
    public PresenterV2 z;

    public void NetworkFeedbackFragment(){
       super();
    }
    public static void Ih(GifshowActivity p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, NetworkFeedbackFragment.class, "1")) {
          return;
       }
       NetworkFeedbackFragment networkFeedb = new NetworkFeedbackFragment();
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, "photo", p1);
       networkFeedb.setArguments(uBundle);
       networkFeedb.show(p0.getSupportFragmentManager(), null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkFeedbackFragment.class, "3")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a34da);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkFeedbackFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.A = SerializableHook.getSerializable(this.getArguments(), "photo");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NetworkFeedbackFragment.class, "4");
       if (p2 != patchProxyRe) {
          return p2;
       }
       boolean b = false;
       View view = a.g(p0, R.layout.arg_RES_7f0d1099, p1, b);
       this.doBindView(view);
       String str = "5";
       Object[] objArray = null;
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, NetworkFeedbackFragment.class, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new m());
          presenterV2.U7(new g());
          presenterV2.U7(new l());
          PatchProxy.onMethodExit(NetworkFeedbackFragment.class, str);
       }
       this.z = presenterV2;
       presenterV2.f(view);
       NetworkFeedbackFragment tz = this.z;
       Object[] objArray1 = new Object[2];
       objArray1[0] = this;
       NetworkFeedbackFragment$a uoa = PatchProxy.apply(objArray, this, NetworkFeedbackFragment.class, "6");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new NetworkFeedbackFragment$a(this);
          uoa.e = this.A;
          uoa.b = this.getChildFragmentManager();
          uoa.f = this;
       }
       objArray1[1] = uoa;
       tz.i(objArray1);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, NetworkFeedbackFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       this.z.destroy();
       return;
    }
}
