package com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import f2d.m;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import v0d.j;
import android.app.Activity;
import java.lang.CharSequence;
import e17.i;
import android.content.Context;
import ekd.p0;
import vgc.b;
import r4d.a;
import h4d.a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.f;
import n3d.a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter$PlatformName;
import u07.t$a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.l;
import u07.u;
import com.yxcorp.login.userlogin.presenter.accountsecurity.i;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import oe6.a;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.login.userlogin.presenter.accountsecurity.j;
import com.yxcorp.login.http.response.BindedPlatformInfoResponse$PlatformInfo;
import ekd.m1;
import android.widget.TextView;
import f2d.k;
import android.view.View$OnClickListener;
import f2d.q;
import f2d.r;
import f2d.s;

public class BindThirdPlatformPresenter extends PresenterV2	// class@001b9f
{
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public BindedPlatformInfoResponse$PlatformInfo t;
    public BindedPlatformInfoResponse$PlatformInfo u;

    public void BindThirdPlatformPresenter(){
       super();
    }
    public void E8(){
       BindThirdPlatformPresenter uBindThirdPl = BindThirdPlatformPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBindThirdPl, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uBindThirdPl, "3")) {
          b.a(0x5cfaafff).h().map(new e()).subscribe(new m(this), Functions.d());
       }
       return;
    }
    public void P8(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, BindThirdPlatformPresenter.class, "5")) {
          return;
       }
       if (j.f()) {
          i.d(R.style.arg_RES_7f110669, this.getActivity().getString(R.string.arg_RES_7f104a7b));
          return;
       }else if(!p0.C(this.getContext())){
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
          return;
       }else {
          String str = 6;
          i = 0x7f0a4573;
          int i1 = (i == p0.getId())? 6: 8;
          String str1 = "QQ";
          str = (i1 == str)? "wechat": str1;
          b.b(str, 826);
          a uoa = a.a(this.getActivity(), i1);
          if (uoa != null && uoa.isAvailable()) {
             uoa.login(this.getActivity(), new f(this, uoa));
          }else if(i == p0.getId()){
             str1 = this.n8(R.string.arg_RES_7f105185);
          }
          Object[] objArray = new Object[]{str1};
          i.d(R.style.arg_RES_7f110668, this.getActivity().getString(R.string.arg_RES_7f104cb5, objArray));
          return;
       }
    }
    public void R8(BindThirdPlatformPresenter$PlatformName p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BindThirdPlatformPresenter.class, "11")) {
          return;
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.W0(R.string.arg_RES_7f104f6f);
       uoa.y0(R.string.arg_RES_7f104f6e);
       uoa.S0(R.string.arg_RES_7f1003a7);
       uoa.Q0(R.string.cancel);
       uoa.t0(l.b);
       uoa.u0(new i(this, p0));
       uoa.z(false);
       j.d(uoa);
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page = 157;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 981;
       double d = (p0 == BindThirdPlatformPresenter$PlatformName.QQ)? 2.00f: 0x3ff0000000000000;
       uElementPack.value = d;
       u1.y0(urlPackage, 4, uElementPack, null);
       return;
    }
    public void S8(View p0){
       int i;
       Activity activity;
       Object[] objArray;
       BindThirdPlatformPresenter tu;
       BindThirdPlatformPresenter uBindThirdPl = BindThirdPlatformPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uBindThirdPl, "4")) {
          return;
       }
       if (j.f()) {
          i.d(R.style.arg_RES_7f110669, this.getActivity().getString(R.string.arg_RES_7f104a7b));
          return;
       }else if(!p0.C(this.getContext())){
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
          return;
       }else {
          String str = 0x7f0a4574;
          String str1 = (str == p0.getId())? "wechat": "QQ";
          b.b(str1, 1120);
          BindThirdPlatformPresenter$PlatformName wECHAT = (str == p0.getId())? BindThirdPlatformPresenter$PlatformName.WECHAT: BindThirdPlatformPresenter$PlatformName.QQ;
          if (TextUtils.x(a.f())) {
             this.R8(wECHAT);
          }else {
             j oj = new j(this, wECHAT, p0);
             if (!PatchProxy.applyVoidTwoRefs(wECHAT, oj, this, uBindThirdPl, "10")) {
                BindThirdPlatformPresenter$PlatformName wECHAT1 = BindThirdPlatformPresenter$PlatformName.WECHAT;
                String str2 = "";
                i = 1;
                if (wECHAT1 == wECHAT) {
                   activity = this.getActivity();
                   objArray = new Object[i];
                   tu = this.u;
                   if (tu != null) {
                      str2 = tu.mName;
                   }
                   objArray[0] = str2;
                   str2 = activity.getString(R.string.arg_RES_7f104f71, objArray);
                }else {
                   activity = this.getActivity();
                   objArray = new Object[i];
                   tu = this.t;
                   if (tu != null) {
                      str2 = tu.mName;
                   }
                   objArray[0] = str2;
                   str2 = activity.getString(R.string.arg_RES_7f104f6c, objArray);
                }
                t$a uoa = new t$a(this.getActivity());
                int i1 = (wECHAT1 == wECHAT)? 0x7f104f72: 0x7f104f6d;
                uoa.W0(i1);
                uoa.z0(str2);
                uoa.S0(R.string.arg_RES_7f104f6a);
                uoa.Q0(R.string.cancel);
                uoa.u0(oj);
                uoa.z(0);
                j.d(uoa);
             }
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BindThirdPlatformPresenter.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a4574);
       this.q = m1.f(p0, 0x7f0a4573);
       this.r = m1.f(p0, 0x7f0a3386);
       this.s = m1.f(p0, 0x7f0a3385);
       m1.a(p0, new k(this), R.id.qq_nick_name);
       m1.a(p0, new q(this), R.id.wechat_nick_name);
       m1.a(p0, new r(this), R.id.qq_login_view);
       m1.a(p0, new s(this), R.id.wechat_login_view);
       return;
    }
}
