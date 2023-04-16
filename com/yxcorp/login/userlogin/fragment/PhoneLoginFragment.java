package com.yxcorp.login.userlogin.fragment.PhoneLoginFragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import n2d.x;
import e2d.e1;
import e2d.a0;
import n2d.o;
import e2d.l1;
import v2d.o0;
import k2d.s;
import y1d.t2;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.activity.LoginActivity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import o1d.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;
import android.app.Activity;
import android.os.Bundle;
import mrd.a;
import com.kwai.feature.api.social.login.model.LoginParams;
import android.content.Intent;
import ekd.j0;
import y1d.l2;
import erd.g;
import crd.b;
import brd.t;
import y1d.h2;
import y1d.i2;
import y1d.j2;
import y1d.k2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import android.content.res.Resources;
import zf6.l;
import ekd.i;

public class PhoneLoginFragment extends LoginFragment implements a	// class@001b37
{
    public boolean A;
    public boolean B;
    public c r;
    public c s;
    public c t;
    public c u;
    public c v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final int C;

    public void PhoneLoginFragment(){
       super();
       this.y = true;
       this.z = true;
       this.A = true;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PhoneLoginFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new x());
       obj.U7(new e1());
       obj.U7(new a0());
       obj.U7(new o());
       obj.U7(new l1());
       obj.U7(new o0(2));
       obj.U7(new s());
       PatchProxy.onMethodExit(PhoneLoginFragment.class, "5");
       return obj;
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhoneLoginFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PhoneLoginFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PhoneLoginFragment.class, new t2());
       }else {
          obj.put(PhoneLoginFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0x7d45;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, PhoneLoginFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       if (!TextUtils.x(obj)) {
          obj = obj+"&";
       }
       StringBuilder str = obj;
       obj = (this.x != null)? "login_mode=PASSWORD": "login_mode=AUTHENTICATION_CODE";
       return str+obj;
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, PhoneLoginFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPageParams();
    }
    public void ih(LoginUserResponse p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(PhoneLoginFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, PhoneLoginFragment.class, "7")) {
          return;
       }
       if (this.getActivity() instanceof LoginActivity) {
          this.getActivity().A3(p0, p2);
       }
       return;
    }
    public String o(){
       return "PHONE_NUMBER_LOGIN_PAGE";
    }
    public boolean onBackPressed(){
       Object[] objArray = null;
       String str = "6";
       ClientContent$ContentPackage obj = PatchProxy.apply(objArray, this, PhoneLoginFragment.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q3();
       PhoneLoginFragment ty = this.y;
       PhoneLoginFragment tz = this.z;
       PhoneLoginFragment tA = this.A;
       PhoneLoginFragment tB = this.B;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray1 = new Object[]{obj,Boolean.valueOf(ty),Boolean.valueOf(tz),Boolean.valueOf(tA),Boolean.valueOf(tB)};
          if (PatchProxy.applyVoid(objArray1, objArray, om, str)) {
          label_0090 :
             this.getActivity().setResult(0);
             this.getActivity().finish();
             return 0;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.a("is_fill_phone", Boolean.valueOf((ty ^ 1)));
       oi3.a("is_fill_authentiction", Boolean.valueOf((tz ^ 0x01)));
       oi3.a("is_fill_password", Boolean.valueOf((tA ^ 0x01)));
       oi3.a("is_login_fail", Boolean.valueOf(tB));
       uElementPack.params = oi3.e();
       uElementPack.action = 824;
       u1.u(1, uElementPack, obj);
       goto label_0090 ;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneLoginFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.r = a.g();
       this.s = a.g();
       this.t = a.g();
       this.u = a.g();
       this.v = a.g();
       this.x = this.l.mIsPasswordLogin;
       this.w = j0.a(this.getActivity().getIntent(), "from_one_key_login", false);
       if (!PatchProxy.applyVoid(null, this, PhoneLoginFragment.class, "2")) {
          this.n.subscribe(new l2(this));
          this.u.subscribe(new h2(this));
          this.t.subscribe(new i2(this));
          this.s.subscribe(new j2(this));
          this.v.subscribe(new k2(this));
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhoneLoginFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d110e, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhoneLoginFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       i.h(this.getActivity(), this.getResources().getColor(R.color.arg_RES_7f060a47), l.r());
       return;
    }
}
