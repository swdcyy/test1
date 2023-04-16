package com.yxcorp.login.userlogin.fragment.AccountRiskCheckFragment;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.login.userlogin.fragment.AccountRiskCheckFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y1d.c;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.login.model.AccountRiskParams;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e2d.u1;
import com.yxcorp.login.bind.presenter.f0;
import s2d.e;
import im8.c;
import lnc.e;

public final class AccountRiskCheckFragment extends BaseFragment implements g	// class@001b29
{
    public AccountRiskParams j;
    public PresenterV2 k;
    public static final AccountRiskCheckFragment$a l;

    static {
       AccountRiskCheckFragment.l = new AccountRiskCheckFragment$a(null);
    }
    public void AccountRiskCheckFragment(){
       super(null, null, null, null, 15, null);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AccountRiskCheckFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, AccountRiskCheckFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(AccountRiskCheckFragment.class, new c());
       }else {
          obj.put(AccountRiskCheckFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountRiskCheckFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          Intent intent = activity.getIntent();
          if (intent != null) {
             this.j = j0.e(intent, "KEY_ACCOUNT_RISK_CHECKING");
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AccountRiskCheckFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d001f, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AccountRiskCheckFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       AccountRiskCheckFragment tk = this.k;
       if (tk != null) {
          tk.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AccountRiskCheckFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       String str = "4";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, AccountRiskCheckFragment.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new u1());
          presenterV2.U7(new f0());
          presenterV2.U7(new e());
          PatchProxy.onMethodExit(AccountRiskCheckFragment.class, str);
       }
       this.k = presenterV2;
       if (presenterV2 != null) {
          presenterV2.f(p0);
       }
       AccountRiskCheckFragment tk = this.k;
       if (tk != null) {
          Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
          tk.i(objArray);
       }
       e.b(p0, R.drawable.arg_RES_7f081ba0, -1, R.string.arg_RES_7f1040f3);
       return;
    }
}
