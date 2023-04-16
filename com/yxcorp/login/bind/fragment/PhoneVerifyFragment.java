package com.yxcorp.login.bind.fragment.PhoneVerifyFragment;
import com.yxcorp.login.bind.fragment.VerifyFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import e1d.u0;
import com.yxcorp.login.bind.presenter.f0;
import e1d.m1;
import com.yxcorp.login.bind.presenter.p0;
import com.yxcorp.login.bind.presenter.i0;
import com.yxcorp.login.bind.presenter.l0;
import com.yxcorp.login.bind.presenter.h0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import x1d.b;
import java.util.Objects;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oe6.a;
import java.util.Map;
import java.lang.Integer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;

public class PhoneVerifyFragment extends VerifyFragment	// class@001a54
{

    public void PhoneVerifyFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PhoneVerifyFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new u0());
       obj.U7(new f0());
       obj.U7(new m1());
       obj.U7(new p0());
       obj.U7(new i0());
       obj.U7(new l0());
       obj.U7(new h0());
       PatchProxy.onMethodExit(PhoneVerifyFragment.class, "3");
       return obj;
    }
    public void ch(){
       PhoneVerifyParams mMobileCount;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, PhoneVerifyFragment.class, str)) {
          return;
       }
       if (this.getActivity() != null && this.getActivity().getIntent() != null) {
          b uob = new b(this.getActivity().getIntent());
          this.C = uob;
          Objects.requireNonNull(uob);
          Serializable serializable = PatchProxy.apply(objArray, uob, b.class, str);
          if (serializable != PatchProxyResult.class) {
          }else {
             serializable = SerializableHook.getSerializableExtra(uob.a, "phone_verify_params");
          }
          this.B = serializable;
          if (serializable != null) {
             this.s = serializable.mTitle;
             this.q = serializable.mShowResetMobile;
             this.m = serializable.mPrompt;
             String str1 = (TextUtils.x(serializable.mPhoneNumber))? a.f(): this.B.mPhoneNumber;
             this.l = str1;
             str1 = (TextUtils.x(this.B.mMobileCountryCode))? a.e(): this.B.mMobileCountryCode;
             this.k = str1;
             VerifyFragment tB = this.B;
             this.n = tB.mAccountSecurityVerify;
             this.o = tB.mNeedMobile;
             this.r = tB.mType;
             this.p = tB.mNeedVerify;
             this.u = tB.mVerifyTrustDeviceToken;
             this.v = tB.mVerifyUserId;
          }
       }
    label_0098 :
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhoneVerifyFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PhoneVerifyFragment.class, null);
       return objectsByTag;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PhoneVerifyFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PhoneVerifyFragment.class, "4")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 2 && this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhoneVerifyFragment.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.i(p1, 0x7f0d1657);
    }
}
