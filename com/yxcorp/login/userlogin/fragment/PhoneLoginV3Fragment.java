package com.yxcorp.login.userlogin.fragment.PhoneLoginV3Fragment;
import com.yxcorp.login.userlogin.fragment.PhoneLoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.t0;
import n2d.e0;
import e2d.u1;
import n2d.f;
import e2d.e1;
import n2d.z;
import e2d.l1;
import n2d.c0;
import v2d.c1;
import k2d.s;
import o2d.x;
import tkd.b;
import tkd.d;
import ayb.g;
import q2d.d;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import g2d.c;
import com.kwai.feature.api.social.login.model.LoginParams;
import y1d.w2;
import java.util.Map;
import android.os.Bundle;
import mrd.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import i2b.a;

public class PhoneLoginV3Fragment extends PhoneLoginFragment	// class@001b38
{
    public c D;

    public void PhoneLoginV3Fragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, PhoneLoginV3Fragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new f());
       obj.U7(new e1());
       obj.U7(new t0());
       obj.U7(new e0());
       obj.U7(new z());
       obj.U7(new l1());
       int i = 2;
       obj.U7(new c0(i));
       obj.U7(new c1(i));
       obj.U7(new s());
       obj.U7(new x());
       if (d.a(-908290672).t50()) {
          obj.U7(new d());
       }
       if (this.p != null) {
          obj.U7(new c(this.l, true, true));
       }
       PatchProxy.onMethodExit(PhoneLoginV3Fragment.class, "3");
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhoneLoginV3Fragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PhoneLoginV3Fragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PhoneLoginV3Fragment.class, new w2());
       }else {
          obj.put(PhoneLoginV3Fragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneLoginV3Fragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.D = a.g();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhoneLoginV3Fragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d110f, p1, false);
    }
}
