package com.yxcorp.login.userlogin.fragment.MailLoginV2Fragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import n2d.e;
import l2d.r;
import e2d.l1;
import n2d.c0;
import v2d.c1;
import l2d.d;
import l2d.g;
import k2d.s;
import o2d.x;
import g2d.c;
import com.kwai.feature.api.social.login.model.LoginParams;
import y1d.j1;
import java.util.Map;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.activity.LoginActivity;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import o1d.l;
import k2b.u1;
import android.app.Activity;
import android.os.Bundle;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import android.content.Intent;
import ekd.j0;
import y1d.a1;
import erd.g;
import crd.b;
import brd.t;
import y1d.b1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.Resources;
import ekd.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;

public class MailLoginV2Fragment extends LoginFragment implements a	// class@001b34
{
    public c r;
    public c s;
    public c t;
    public c u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public static final int z;

    public void MailLoginV2Fragment(){
       super();
       this.v = false;
       this.x = true;
       this.y = true;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MailLoginV2Fragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new e());
       obj.U7(new r());
       obj.U7(new l1());
       obj.U7(new c0(1));
       obj.U7(new c1(1));
       obj.U7(new d());
       obj.U7(new g());
       obj.U7(new s());
       obj.U7(new x());
       if (this.p != null) {
          obj.U7(new c(this.l, 1, 1));
       }
       PatchProxy.onMethodExit(MailLoginV2Fragment.class, "2");
       return obj;
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MailLoginV2Fragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MailLoginV2Fragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MailLoginV2Fragment.class, new j1());
       }else {
          obj.put(MailLoginV2Fragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0x7d46;
    }
    public void ih(LoginUserResponse p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(MailLoginV2Fragment.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, MailLoginV2Fragment.class, "5")) {
          return;
       }
       if (this.getActivity() instanceof LoginActivity) {
          this.getActivity().A3(p0, p2);
       }
       return;
    }
    public String o(){
       return "EMAIL_LOGIN_PAGE";
    }
    public boolean onBackPressed(){
       Object[] objArray = null;
       i3 obj = PatchProxy.apply(objArray, this, MailLoginV2Fragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = i3.f();
       obj.a("is_fill_email", Boolean.valueOf((this.x ^ 1)));
       obj.a("is_fill_password", Boolean.valueOf((this.y ^ 1)));
       obj.a("is_login_fail", Boolean.valueOf(this.v));
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = "";
       uElementPack.type = 3;
       uElementPack.action = 824;
       uElementPack.params = obj.e();
       ClientContent$ContentPackage uContentPack = this.Q3();
       if (!PatchProxy.applyVoidTwoRefs(uContentPack, uElementPack, objArray, l.class, "8")) {
          u1.u(1, uElementPack, uContentPack);
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return 1;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MailLoginV2Fragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.r = a.g();
       this.s = a.g();
       this.t = a.g();
       this.u = PublishSubject.g();
       this.w = j0.a(this.getActivity().getIntent(), "from_one_key_login", false);
       if (!PatchProxy.applyVoid(null, this, MailLoginV2Fragment.class, "4")) {
          this.t.subscribe(new a1(this));
          this.s.subscribe(new b1(this));
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MailLoginV2Fragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       i.h(this.getActivity(), this.getResources().getColor(R.color.arg_RES_7f060a47), true);
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d0ee7, p1, false);
    }
}
