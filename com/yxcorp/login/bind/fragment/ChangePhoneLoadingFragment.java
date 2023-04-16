package com.yxcorp.login.bind.fragment.ChangePhoneLoadingFragment;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import com.yxcorp.login.bind.presenter.f0;
import com.yxcorp.login.bind.presenter.k;
import android.content.Intent;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import lnc.e;

public class ChangePhoneLoadingFragment extends LoginPresenterFragment	// class@001a50
{
    public static final int k;

    public void ChangePhoneLoadingFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ChangePhoneLoadingFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new f0());
       obj.U7(new k());
       PatchProxy.onMethodExit(ChangePhoneLoadingFragment.class, "5");
       return obj;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(ChangePhoneLoadingFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ChangePhoneLoadingFragment.class, "6")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 2 && this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneLoadingFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChangePhoneLoadingFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d01a3, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChangePhoneLoadingFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       e.b(p0, R.drawable.arg_RES_7f0819d9, -1, R.string.arg_RES_7f1040f3);
       return;
    }
}
