package com.yxcorp.login.userlogin.fragment.PhoneVerifyV2Fragment;
import com.yxcorp.login.bind.fragment.VerifyFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import p2d.h;
import com.yxcorp.login.bind.presenter.f0;
import p2d.f;
import p2d.e;
import com.yxcorp.login.userlogin.presenter.phoneverify.c;
import p2d.g;
import com.yxcorp.login.bind.presenter.h0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import x1d.e;
import java.util.Objects;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oe6.a;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.Integer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;

public class PhoneVerifyV2Fragment extends VerifyFragment	// class@001b3b
{
    public e D;

    public void PhoneVerifyV2Fragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PhoneVerifyV2Fragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new h());
       obj.U7(new f0());
       obj.U7(new f());
       obj.U7(new e());
       obj.U7(new c());
       obj.U7(new g());
       obj.U7(new h0());
       PatchProxy.onMethodExit(PhoneVerifyV2Fragment.class, "3");
       return obj;
    }
    public int M(){
       return 1;
    }
    public void ch(){
       PhoneVerifyParams mMobileCount;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, PhoneVerifyV2Fragment.class, str)) {
          return;
       }
       if (this.getActivity() != null && this.getActivity().getIntent() != null) {
          e uoe = new e(this.getActivity().getIntent());
          this.D = uoe;
          Objects.requireNonNull(uoe);
          Serializable serializable = PatchProxy.apply(objArray, uoe, e.class, str);
          if (serializable != PatchProxyResult.class) {
          }else {
             serializable = SerializableHook.getSerializableExtra(uoe.a, "phone_verify_params");
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
             this.y = tB.mAccountVerifyFrom;
             this.z = tB.mIsLoginProcess;
             this.A = tB.mVerifyPhoneActionType;
          }
       }
    label_00a4 :
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhoneVerifyV2Fragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PhoneVerifyV2Fragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 0x7d12;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, PhoneVerifyV2Fragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "source = "+this.A;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PhoneVerifyV2Fragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PhoneVerifyV2Fragment.class, "4")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 2 && this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhoneVerifyV2Fragment.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.i(p1, 0x7f0d1658);
    }
}
