package com.yxcorp.login.bind.fragment.OriginBindPhoneFragment;
import com.yxcorp.login.bind.fragment.BindPhoneFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import com.yxcorp.login.bind.presenter.l;
import e2d.j;
import com.yxcorp.login.bind.presenter.b0;
import com.yxcorp.login.bind.presenter.i;
import com.yxcorp.login.bind.presenter.p;
import com.yxcorp.login.bind.presenter.m;
import d1d.b0;
import java.util.Map;
import android.os.Bundle;
import c1d.j;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;

public class OriginBindPhoneFragment extends BindPhoneFragment	// class@001a52
{
    public c q;
    public c r;
    public c s;
    public c t;
    public PublishSubject u;
    public String v;
    public boolean w;

    public void OriginBindPhoneFragment(){
       super();
       this.v = "+86";
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, OriginBindPhoneFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new l());
       obj.U7(new j());
       obj.U7(new b0());
       obj.U7(new i());
       obj.U7(new p());
       obj.U7(new m());
       PatchProxy.onMethodExit(OriginBindPhoneFragment.class, "2");
       return obj;
    }
    public int M(){
       return 1;
    }
    public int ch(){
       return 0;
    }
    public int getLayoutResId(){
       return 0x7f0d10f5;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OriginBindPhoneFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, OriginBindPhoneFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(OriginBindPhoneFragment.class, new b0());
       }else {
          obj.put(OriginBindPhoneFragment.class, null);
       }
       return obj;
    }
    public String o(){
       return "HAND_BIND_PHONE_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OriginBindPhoneFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       j oj = new j(this.getActivity().getIntent());
       Object obj = PatchProxy.apply(null, oj, j.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): oj.a.getBooleanExtra("close_bind_btn", false);
       this.w = b;
       this.u = PublishSubject.g();
       this.q = a.g();
       this.r = a.g();
       this.s = a.g();
       this.t = a.g();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, OriginBindPhoneFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d10f5, p1, false);
    }
}
