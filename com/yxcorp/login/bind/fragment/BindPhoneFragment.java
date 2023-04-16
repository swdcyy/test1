package com.yxcorp.login.bind.fragment.BindPhoneFragment;
import im8.g;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d1d.i;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import com.google.common.base.a;
import com.google.common.base.a$c;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import c1d.j;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import mrd.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import k2b.u1;

public abstract class BindPhoneFragment extends LoginPresenterFragment implements g	// class@001a48
{
    public String k;
    public j l;
    public boolean m;
    public boolean n;
    public BindPhoneParams o;
    public c p;

    public void BindPhoneFragment(){
       super();
    }
    public abstract int ch();
    public abstract int getLayoutResId();
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BindPhoneFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BindPhoneFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BindPhoneFragment.class, new i());
       }else {
          obj.put(BindPhoneFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       BindPhoneFragment obj = PatchProxy.apply(null, this, BindPhoneFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj != null && obj.mCommonPageParams != null) {
          return TextUtils.I(a.g("&").k("=").b(this.o.mCommonPageParams));
       }
       return super.getPageParams();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BindPhoneFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       j oj = new j(this.getActivity().getIntent());
       this.l = oj;
       BindPhoneParams uBindPhonePa = oj.a();
       this.o = uBindPhonePa;
       if (uBindPhonePa != null) {
          this.m = uBindPhonePa.mShowReturnBtn;
          this.n = uBindPhonePa.mShowSkipGuideBtn;
       }else {
          this.o = new BindPhoneParams$b().a();
          this.m = true;
       }
       this.p = a.g();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BindPhoneFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.k = u1.f();
       return a.g(p0, this.getLayoutResId(), p1, false);
    }
}
