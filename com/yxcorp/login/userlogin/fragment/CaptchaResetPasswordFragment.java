package com.yxcorp.login.userlogin.fragment.CaptchaResetPasswordFragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import com.yxcorp.login.userlogin.presenter.resetpassword.a;
import com.yxcorp.login.userlogin.presenter.resetpassword.o;
import e2d.g;
import y1d.g;
import java.util.Map;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import mrd.a;
import android.content.Intent;
import ekd.j0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import android.content.res.Resources;
import zf6.l;
import ekd.i;

public class CaptchaResetPasswordFragment extends LoginFragment implements a	// class@001b2b
{
    public String r;
    public c s;

    public void CaptchaResetPasswordFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CaptchaResetPasswordFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new a());
       obj.U7(new o());
       obj.U7(new g());
       PatchProxy.onMethodExit(CaptchaResetPasswordFragment.class, "4");
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CaptchaResetPasswordFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CaptchaResetPasswordFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CaptchaResetPasswordFragment.class, new g());
       }else {
          obj.put(CaptchaResetPasswordFragment.class, null);
       }
       return obj;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, CaptchaResetPasswordFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getActivity() != null) {
          this.getActivity().setResult(0);
          this.getActivity().finish();
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CaptchaResetPasswordFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.s = a.g();
       if (this.getActivity() != null && this.getActivity().getIntent() != null) {
          this.r = j0.f(this.getActivity().getIntent(), "CAPTCHA_CODE");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CaptchaResetPasswordFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d019f, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CaptchaResetPasswordFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       i.h(this.getActivity(), this.getResources().getColor(R.color.arg_RES_7f060a47), l.r());
       return;
    }
}
