package com.yxcorp.login.bind.fragment.ChangePhoneVerifyMethodFragment;
import hka.a;
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
import com.yxcorp.login.bind.presenter.o0;
import com.yxcorp.login.bind.presenter.a;
import d1d.s;
import java.util.Map;
import java.util.HashMap;
import android.content.Intent;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import c1d.g;
import java.util.Objects;
import com.yxcorp.login.http.response.ChangePhoneRiskResponse;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import lnc.e;

public class ChangePhoneVerifyMethodFragment extends LoginPresenterFragment implements a, g	// class@001a51
{
    public ChangePhoneRiskResponse k;
    public g l;
    public static final int m;

    public void ChangePhoneVerifyMethodFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ChangePhoneVerifyMethodFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new f0());
       obj.U7(new o0());
       obj.U7(new a());
       PatchProxy.onMethodExit(ChangePhoneVerifyMethodFragment.class, "5");
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChangePhoneVerifyMethodFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ChangePhoneVerifyMethodFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ChangePhoneVerifyMethodFragment.class, new s());
       }else {
          obj.put(ChangePhoneVerifyMethodFragment.class, null);
       }
       return obj;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(ChangePhoneVerifyMethodFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ChangePhoneVerifyMethodFragment.class, "6")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 2 && this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public boolean onBackPressed(){
       return false;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneVerifyMethodFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       g og = new g(this.getActivity().getIntent());
       this.l = og;
       Objects.requireNonNull(og);
       Serializable serializable = PatchProxy.apply(null, og, g.class, "1");
       if (serializable != PatchProxyResult.class) {
       }else {
          serializable = SerializableHook.getSerializableExtra(og.a, "check_methods_list");
       }
       this.k = serializable;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChangePhoneVerifyMethodFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d01a4, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChangePhoneVerifyMethodFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       e.b(p0, R.drawable.arg_RES_7f0819d9, -1, R.string.arg_RES_7f1040e9);
       return;
    }
}
