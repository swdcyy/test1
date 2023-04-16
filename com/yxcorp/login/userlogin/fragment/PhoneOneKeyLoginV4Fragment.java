package com.yxcorp.login.userlogin.fragment.PhoneOneKeyLoginV4Fragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import o2d.x;
import i2d.f;
import i2d.e;
import o2d.r;
import o2d.b0;
import o2d.e0;
import v2d.y;
import k2d.w;
import e2d.h1;
import com.kwai.sdk.switchconfig.a;
import e2d.f1;
import g2d.c;
import com.kwai.feature.api.social.login.model.LoginParams;
import g2d.b;
import y1d.k4;
import java.util.Map;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.activity.LoginActivity;
import com.yxcorp.login.util.LoginPageLauncher;
import java.util.Objects;
import com.yxcorp.login.util.LoginPageLauncher$a;
import kotlin.jvm.internal.a;
import com.yxcorp.login.util.LoginPageLauncher$FromPage;
import android.content.Context;
import b3d.v;
import android.app.Activity;
import android.os.Bundle;
import mrd.a;
import y1d.e4;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import o1d.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Number;
import i2b.a;
import brd.y;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import android.content.res.Resources;
import zf6.l;
import ekd.i;

public class PhoneOneKeyLoginV4Fragment extends LoginFragment implements a	// class@001b3a
{
    public c r;
    public int s;
    public boolean t;
    public i$a u;
    public static final int v;

    public void PhoneOneKeyLoginV4Fragment(){
       super();
       this.t = true;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PhoneOneKeyLoginV4Fragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new x());
       obj.U7(new f());
       obj.U7(new e(this.jh(), true, true));
       obj.U7(new r());
       obj.U7(new b0());
       obj.U7(new e0());
       if (!this.jh()) {
          obj.U7(new y(true));
       }
       obj.U7(new w());
       obj.U7(new h1());
       if (a.t().d("enableGravityEffectButton", false)) {
          obj.U7(new f1());
       }
       if (this.p != null) {
          obj.U7(new c(this.l, true));
       }
       if (this.q != null) {
          obj.U7(new b());
       }
       PatchProxy.onMethodExit(PhoneOneKeyLoginV4Fragment.class, "4");
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhoneOneKeyLoginV4Fragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k4();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PhoneOneKeyLoginV4Fragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PhoneOneKeyLoginV4Fragment.class, new k4());
       }else {
          obj.put(PhoneOneKeyLoginV4Fragment.class, null);
       }
       return obj;
    }
    public void hh(LoginUserResponse p0,boolean p1){
       if (PatchProxy.isSupport(PhoneOneKeyLoginV4Fragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PhoneOneKeyLoginV4Fragment.class, "6")) {
          return;
       }
       if (this.getActivity() instanceof LoginActivity) {
          this.getActivity().A3(p0, p1);
       }
       return;
    }
    public final boolean jh(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LoginFragment obj = PatchProxy.apply(objArray, this, PhoneOneKeyLoginV4Fragment.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.k;
       LoginPageLauncher$a obj1 = PatchProxy.applyOneRefs(obj, objArray, LoginPageLauncher.class, "13");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          obj1 = LoginPageLauncher.i;
          Objects.requireNonNull(obj1);
          Object obj2 = PatchProxy.applyOneRefs(obj, obj1, LoginPageLauncher$a.class, "5");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             a.p(obj, "fromPage");
             b1 = (obj == LoginPageLauncher$FromPage.PHONE_MAIL_LOGIN)? true: false;
          }
       }
       if (!b1 && (LoginPageLauncher.e(this.k) || !v.c(this.getActivity(), this.l))) {
          b = false;
       }
       return b;
    }
    public String o(){
       String obj = PatchProxy.apply(null, this, PhoneOneKeyLoginV4Fragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.jh())? "IPHONE_QUICK_LOGIN_OR_SIGN_UP": "PHONE_QUICK_LOGIN_PAGE";
       return obj;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, PhoneOneKeyLoginV4Fragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return true;
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneOneKeyLoginV4Fragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       this.r = a.g();
       this.u = new e4(this);
       ClientContent$ContentPackage uContentPack = this.Q3();
       if (!PatchProxy.applyVoidOneRefs(uContentPack, null, o.class, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 13;
          u1.u0(1, uElementPack, uContentPack);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhoneOneKeyLoginV4Fragment.class, "3");
       if (p2 != patchProxyRe) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       p2 = PatchProxy.apply(null, this, PhoneOneKeyLoginV4Fragment.class, "10");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(this.jh()){
          i = (this.p != null)? 0x7f0d10e4: 0x7f0d10e3;
       }else if(this.p != null){
          i = 0x7f0d10e6;
       }else {
          i = 0x7f0d10e5;
       }
       return a.g(p0, i, p1, false);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, PhoneOneKeyLoginV4Fragment.class, "2")) {
          return;
       }
       super.onResume();
       this.r.onNext(Boolean.TRUE);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhoneOneKeyLoginV4Fragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       i.h(this.getActivity(), this.getResources().getColor(R.color.arg_RES_7f061c5e), l.r());
       return;
    }
}
