package com.yxcorp.login.userlogin.fragment.ResetAccountLoadingFragment;
import im8.g;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import com.yxcorp.login.bind.presenter.f0;
import com.yxcorp.login.userlogin.presenter.resetpassword.f;
import y1d.y4;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.login.http.response.ResetSelectResponse;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import lnc.e;

public class ResetAccountLoadingFragment extends LoginPresenterFragment implements g	// class@001b42
{
    public ResetSelectResponse k;
    public static final int l;

    public void ResetAccountLoadingFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ResetAccountLoadingFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new f0());
       obj.U7(new f());
       PatchProxy.onMethodExit(ResetAccountLoadingFragment.class, "5");
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ResetAccountLoadingFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y4();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ResetAccountLoadingFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ResetAccountLoadingFragment.class, new y4());
       }else {
          obj.put(ResetAccountLoadingFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResetAccountLoadingFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getActivity() != null) {
          this.k = j0.e(this.getActivity().getIntent(), "KEY_RESET_ACCOUNT_CHECKING");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ResetAccountLoadingFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d1318, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ResetAccountLoadingFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       e.b(p0, R.drawable.arg_RES_7f081ba0, -1, R.string.arg_RES_7f1040f3);
       return;
    }
}
