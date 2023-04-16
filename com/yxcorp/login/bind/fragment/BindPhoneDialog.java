package com.yxcorp.login.bind.fragment.BindPhoneDialog;
import im8.g;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.BottomSheetBaseDialogFragmentAdapter;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d1d.c;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import com.google.common.base.a;
import com.google.common.base.a$c;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import androidx.fragment.app.KwaiDialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.content.Intent;
import n3d.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.bind.presenter.e;
import e1d.f;
import com.yxcorp.login.bind.presenter.g;
import im8.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;

public class BindPhoneDialog extends BottomSheetBaseDialogFragmentAdapter implements g	// class@001a47
{
    public BindPhoneParams s;
    public PresenterV2 t;
    public a u;
    public static final int v;

    public void BindPhoneDialog(){
       super();
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BindPhoneDialog.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BindPhoneDialog.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BindPhoneDialog.class, new c());
       }else {
          obj.put(BindPhoneDialog.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       StyleSpan a;
       BindPhoneDialog obj = PatchProxy.apply(null, this, BindPhoneDialog.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj != null && obj.mCommonPageParams != null) {
          a.g("&").k("=").b(this.s.mCommonPageParams);
          a = TextUtils.a;
       }
       return "";
    }
    public String o(){
       return "HAND_BIND_PHONE_POP";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BindPhoneDialog.class, "6")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.setLayout((n.k(this.getActivity()) - (a1.e(11.00f) * 2)), -1);
          window.setGravity(1);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BindPhoneDialog.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BindPhoneDialog.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f110363);
       Dialog uDialog = super.onCreateDialog(p0);
       if (uDialog.getWindow() != null) {
          uDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
       }
       this.uh(1);
       return uDialog;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, BindPhoneDialog.class, "7")) {
          return;
       }
       super.onDestroy();
       BindPhoneDialog tu = this.u;
       if (tu != null) {
          tu.onActivityCallback(0, -1, null);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BindPhoneDialog.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.t = presenterV2;
       presenterV2.U7(new e());
       this.t.U7(new f());
       this.t.U7(new g());
       this.t.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.t.i(objArray);
       return;
    }
    public View th(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BindPhoneDialog.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d0103, p1, false);
    }
}
