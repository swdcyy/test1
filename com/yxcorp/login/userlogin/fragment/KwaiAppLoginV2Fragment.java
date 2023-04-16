package com.yxcorp.login.userlogin.fragment.KwaiAppLoginV2Fragment;
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
import e2d.h1;
import j2d.d;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.e;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.g;
import v2d.y;
import k2d.s;
import com.kwai.sdk.switchconfig.a;
import e2d.f1;
import g2d.c;
import com.kwai.feature.api.social.login.model.LoginParams;
import g2d.b;
import java.util.Map;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.activity.LoginActivity;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import android.content.res.Resources;
import zf6.l;
import ekd.i;

public class KwaiAppLoginV2Fragment extends LoginFragment implements a	// class@001b2e
{

    public void KwaiAppLoginV2Fragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, KwaiAppLoginV2Fragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new x());
       obj.U7(new f());
       boolean b = false;
       obj.U7(new e(b));
       obj.U7(new h1());
       obj.U7(new d());
       obj.U7(new e());
       obj.U7(new g());
       obj.U7(new y(2));
       obj.U7(new s());
       if (a.t().d("enableGravityEffectButton", b)) {
          obj.U7(new f1());
       }
       if (this.p != null) {
          obj.U7(new c(this.l, true));
       }
       if (this.q != null) {
          obj.U7(new b());
       }
       PatchProxy.onMethodExit(KwaiAppLoginV2Fragment.class, "2");
       return obj;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiAppLoginV2Fragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KwaiAppLoginV2Fragment.class, null);
       return objectsByTag;
    }
    public void hh(LoginUserResponse p0,boolean p1){
       if (PatchProxy.isSupport(KwaiAppLoginV2Fragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KwaiAppLoginV2Fragment.class, "4")) {
          return;
       }
       if (this.getActivity() instanceof LoginActivity) {
          this.getActivity().A3(p0, p1);
       }
       return;
    }
    public String o(){
       return "KWAI_ACCOUNT_LOGIN";
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, KwaiAppLoginV2Fragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KwaiAppLoginV2Fragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       int i = (this.p != null)? 0x7f0d10e6: 0x7f0d10e5;
       return a.g(p0, i, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiAppLoginV2Fragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       i.h(this.getActivity(), this.getResources().getColor(R.color.arg_RES_7f060a47), l.r());
       return;
    }
}
