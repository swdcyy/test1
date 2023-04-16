package com.yxcorp.login.userlogin.fragment.PhoneOneKeyBindDialog;
import im8.g;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.BottomSheetBaseDialogFragmentAdapter;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y1d.a3;
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
import mrd.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.content.Intent;
import n3d.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.bind.presenter.c0;
import o2d.r;
import e1d.o0;
import com.yxcorp.login.bind.presenter.s;
import com.yxcorp.login.bind.presenter.a0;
import com.yxcorp.login.bind.presenter.e0;
import im8.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;

public class PhoneOneKeyBindDialog extends BottomSheetBaseDialogFragmentAdapter implements g	// class@001b39
{
    public BindPhoneParams s;
    public c t;
    public PresenterV2 u;
    public a v;
    public static final int w;

    public void PhoneOneKeyBindDialog(){
       super();
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhoneOneKeyBindDialog.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a3();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PhoneOneKeyBindDialog.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PhoneOneKeyBindDialog.class, new a3());
       }else {
          obj.put(PhoneOneKeyBindDialog.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       StyleSpan a;
       PhoneOneKeyBindDialog obj = PatchProxy.apply(null, this, PhoneOneKeyBindDialog.class, "8");
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
       return "ONE_CLICK_BIND_POP";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneOneKeyBindDialog.class, "5")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneOneKeyBindDialog.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.t = a.g();
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhoneOneKeyBindDialog.class, "4");
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
       if (PatchProxy.applyVoid(null, this, PhoneOneKeyBindDialog.class, "7")) {
          return;
       }
       super.onDestroy();
       PhoneOneKeyBindDialog tv = this.v;
       if (tv != null) {
          tv.onActivityCallback(0, -1, null);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhoneOneKeyBindDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.u = presenterV2;
       presenterV2.U7(new c0());
       this.u.U7(new r());
       this.u.U7(new o0());
       this.u.U7(new s());
       this.u.U7(new a0());
       this.u.U7(new e0());
       this.u.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.u.i(objArray);
       return;
    }
    public View th(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhoneOneKeyBindDialog.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d1112, p1, false);
    }
}
