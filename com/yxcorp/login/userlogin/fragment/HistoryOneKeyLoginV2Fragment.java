package com.yxcorp.login.userlogin.fragment.HistoryOneKeyLoginV2Fragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import io.reactivex.subjects.PublishSubject;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import o2d.x;
import o2d.q;
import i2d.f;
import i2d.e;
import o2d.d;
import o2d.i;
import k2d.v;
import i2d.d;
import e2d.h1;
import o2d.j;
import o2d.k;
import v2d.a;
import com.kwai.sdk.switchconfig.a;
import e2d.f1;
import g2d.c;
import com.kwai.feature.api.social.login.model.LoginParams;
import g2d.b;
import y1d.x;
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
import i2b.a;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import android.content.res.Resources;
import zf6.l;
import ekd.i;

public class HistoryOneKeyLoginV2Fragment extends LoginFragment implements a	// class@001b2d
{
    public PublishSubject r;

    public void HistoryOneKeyLoginV2Fragment(){
       super();
       this.r = PublishSubject.g();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, HistoryOneKeyLoginV2Fragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new x());
       obj.U7(new q());
       obj.U7(new f());
       boolean b = false;
       obj.U7(new e(true, b, b));
       obj.U7(new d());
       obj.U7(new i());
       obj.U7(new v());
       obj.U7(new d(b));
       obj.U7(new h1());
       obj.U7(new j());
       obj.U7(new k());
       obj.U7(new a());
       if (a.t().d("enableGravityEffectButton", b)) {
          obj.U7(new f1());
       }
       if (this.p != null) {
          obj.U7(new c(this.l, true));
       }
       if (this.q != null) {
          obj.U7(new b());
       }
       PatchProxy.onMethodExit(HistoryOneKeyLoginV2Fragment.class, "2");
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HistoryOneKeyLoginV2Fragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new x();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, HistoryOneKeyLoginV2Fragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(HistoryOneKeyLoginV2Fragment.class, new x());
       }else {
          obj.put(HistoryOneKeyLoginV2Fragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0;
    }
    public void hh(LoginUserResponse p0,boolean p1){
       if (PatchProxy.isSupport(HistoryOneKeyLoginV2Fragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, HistoryOneKeyLoginV2Fragment.class, "4")) {
          return;
       }
       if (this.getActivity() instanceof LoginActivity) {
          this.getActivity().A3(p0, p1);
       }
       return;
    }
    public String o(){
       return "LAST_INFORMATION_ONE_CLICK_LOGIN";
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, HistoryOneKeyLoginV2Fragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, HistoryOneKeyLoginV2Fragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = (this.p != null)? 0x7f0d05b9: 0x7f0d05b6;
       return a.g(p0, i, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HistoryOneKeyLoginV2Fragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       i.h(this.getActivity(), this.getResources().getColor(R.color.arg_RES_7f061c5e), l.r());
       return;
    }
}
