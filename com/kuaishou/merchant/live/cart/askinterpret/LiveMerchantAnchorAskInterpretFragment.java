package com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y24.h;
import android.view.View;
import ekd.m1;
import java.util.List;
import im8.c;
import qvb.i;
import java.util.Map;
import g9c.d;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.basic.util.h;
import android.content.res.Configuration;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import y8c.g;
import com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment$b;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment$c;

public class LiveMerchantAnchorAskInterpretFragment extends RecyclerDialogFragment implements d	// class@0018f9
{
    public View A;
    public View B;
    public LiveMerchantBaseContext z;
    public static final int C;

    public void LiveMerchantAnchorAskInterpretFragment(){
       super();
    }
    public t Ah(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantAnchorAskInterpretFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMerchantAnchorAskInterpretFragment$a(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveMerchantAnchorAskInterpretFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new h());
       PatchProxy.onMethodExit(LiveMerchantAnchorAskInterpretFragment.class, "9");
       return obj;
    }
    public boolean S1(){
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretFragment.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a374d);
       this.B = m1.f(p0, 0x7f0a3f16);
       return;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveMerchantAnchorAskInterpretFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(new c("ASK_INTERPRET_LIVE_BASE_CONTEXT", this.z));
       obj.add(new c("ASK_INTERPRET_PAGE_LIST", this.q()));
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d04dd;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantAnchorAskInterpretFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveMerchantAnchorAskInterpretFragment.class, null);
       return objectsByTag;
    }
    public d ia(){
       return null;
    }
    public String o(){
       return "LIVE_PUSH";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       h.b(this, this.getDialog().getWindow());
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretFragment.class, "7")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.dismissAllowingStateLoss();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.z = b.a(this.getArguments().getParcelable("INTERPRET_LIVE_BASE_CONTEXT"));
       }
       if (p0 != null) {
          this.z = b.a(p0.getParcelable("INTERPRET_LIVE_BASE_CONTEXT"));
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAnchorAskInterpretFragment.class, "6")) {
          return;
       }
       super.onResume();
       this.q().a();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretFragment.class, "8")) {
          return;
       }
       super.onSaveInstanceState(p0);
       p0.putParcelable("INTERPRET_LIVE_BASE_CONTEXT", b.c(this.z));
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantAnchorAskInterpretFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       return;
    }
    public boolean th(){
       return true;
    }
    public int uh(){
       return 0x7f0a34dc;
    }
    public g xh(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantAnchorAskInterpretFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMerchantAnchorAskInterpretFragment$b(this, this.getActivity());
    }
    public RecyclerView$LayoutManager yh(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantAnchorAskInterpretFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayoutManager(this.getActivity());
    }
    public i zh(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantAnchorAskInterpretFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMerchantAnchorAskInterpretFragment$c(this);
    }
}
