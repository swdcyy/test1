package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.LiveMerchantContainerServiceDialog;
import com.kuaishou.merchant.basic.fragment.MerchantBaseControllerDialogFragment;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.LiveMerchantContainerServiceDialog$a;
import nsd.u;
import com.kuaishou.merchant.popupController.api.models.DialogConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.view.Window;
import d84.a;
import java.lang.Integer;
import java.lang.Boolean;
import ekd.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import xm4.a$a;
import xm4.a$a$a;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ca4.a;
import androidx.lifecycle.ViewModel;
import rk0.b;
import ba4.g;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import im8.c;

public final class LiveMerchantContainerServiceDialog extends MerchantBaseControllerDialogFragment	// class@001c13
{
    public boolean A;
    public int B;
    public HashMap C;
    public b t;
    public View u;
    public LiveMerchantContainerDataList v;
    public a w;
    public a x;
    public b y;
    public int z;
    public static final LiveMerchantContainerServiceDialog$a D;

    static {
       LiveMerchantContainerServiceDialog.D = new LiveMerchantContainerServiceDialog$a(null);
    }
    public void LiveMerchantContainerServiceDialog(){
       super();
       this.z = 2;
    }
    public DialogConfig getConfig(){
       DialogConfig obj = PatchProxy.apply(null, this, LiveMerchantContainerServiceDialog.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DialogConfig();
       obj.mDialogName = "LiveMerchantTimeDiscountDialog";
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerServiceDialog.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(0, R.style.arg_RES_7f11036b);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantContainerServiceDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       obj = (uDialog != null)? uDialog.getWindow(): null;
       if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(obj, Integer.valueOf(0), Boolean.FALSE, null, a.class, "1") && (obj != null && i.c()))) {
          a.a(obj, 0, 0);
       }
    label_0044 :
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       a$a a;
       View view1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMerchantContainerServiceDialog.class, "3");
       if (p2 != patchProxyRe) {
          return p2;
       }
       if (PatchProxy.isSupport(a.class)) {
          view = PatchProxy.applyThreeRefs(p0, Integer.valueOf(R.layout.arg_RES_7f0d0c91), p1, null, a.class, "8");
          if (view != patchProxyRe) {
          }else {
          label_0032 :
             a.p(p0, "inflater");
             a = a.a;
             if (a != null) {
                Context context = p0.getContext();
                boolean b = (p1 != null)? true: false;
                view1 = a$a$a.a(a, context, p1, R.layout.arg_RES_7f0d0c91, b, 0, 16, null);
             }else {
                view1 = null;
             }
             if (view1 != null) {
                view = view1;
             }else {
                View view2 = a.f(p0, R.layout.arg_RES_7f0d0c91, p1);
                a.o(view2, "KwaiLayoutInflater.infla¡­inflater, resource, root\)");
                view = view2;
             }
          }
       }else {
          goto label_0032 ;
       }
       this.u = view;
       if (view == null) {
          a.S("mRootView");
       }
       view.setAlpha(0);
       LiveMerchantContainerServiceDialog tu = this.u;
       if (tu == null) {
          a.S("mRootView");
       }
       return tu;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantContainerServiceDialog.class, "7")) {
          return;
       }
       super.onDestroy();
       LiveMerchantContainerServiceDialog tt = this.t;
       if (tt != null) {
          tt.destroy();
       }
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LiveMerchantContainerServiceDialog.class, "10")) {
       }else {
          LiveMerchantContainerServiceDialog tC = this.C;
          if (tC != null) {
             tC.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       LiveMerchantContainerServiceDialog tt;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantContainerServiceDialog.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveMerchantContainerServiceDialog.class, "5")) {
          a uoa = ViewModelProviders.of(this).get(a.class);
          this.w = uoa;
          String str = "mViewModel";
          if (uoa == null) {
             a.S(str);
          }
          LiveMerchantContainerServiceDialog tv = this.v;
          if (tv == null) {
             a.S("mDataList");
          }
          uoa.b = tv;
          tt = this.w;
          if (tt == null) {
             a.S(str);
          }
          tt.c = this.A;
          tt = this.w;
          if (tt == null) {
             a.S(str);
          }
          LiveMerchantContainerServiceDialog ty = this.y;
          if (ty == null) {
             a.S("mILiveMerchantTimeDiscountService");
          }
          tt.f = ty;
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveMerchantContainerServiceDialog.class, "6")) {
          b uob = new b(this);
          this.t = uob;
          uob.U7(new g(this));
          tt = this.t;
          if (tt != null) {
             tt.U7(new LiveMerchantContainerAnimViewBinder(this, this.z, this.A, this.B));
          }
          tt = this.t;
          if (tt != null) {
             LiveMerchantContainerServiceDialog tu = this.u;
             if (tu == null) {
                a.S("mRootView");
             }
             tt.f(tu);
          }
          tt = this.t;
          if (tt != null) {
             objArray = new Object[]{new c("LIVE_MERCHANT_TIME_COUPON_CENTER_ANIM_SERVICE", this.x)};
             tt.i(objArray);
          }
       }
       return;
    }
}
