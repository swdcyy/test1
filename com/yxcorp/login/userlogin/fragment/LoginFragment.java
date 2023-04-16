package com.yxcorp.login.userlogin.fragment.LoginFragment;
import android.view.View$OnClickListener;
import elb.l;
import im8.g;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import b3d.f0;
import b3d.z;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import w1d.j;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LoginSourcePackage;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import y1d.u0;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.StringBuilder;
import android.view.View;
import android.os.Bundle;
import mrd.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.login.util.LoginPageLauncher$FromPage;
import h3b.b;
import java.lang.Throwable;
import java.lang.ClassCastException;
import q87.c;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import java.lang.Boolean;
import brd.y;

public abstract class LoginFragment extends LoginPresenterFragment implements View$OnClickListener, l, g	// class@001b30
{
    public LoginPageLauncher$FromPage k;
    public LoginParams l;
    public c m;
    public c n;
    public c o;
    public boolean p;
    public boolean q;

    public void LoginFragment(){
       super();
       this.p = f0.a.a();
       this.q = z.a.a();
    }
    public void LoginFragment(LoginParams p0){
       super();
       this.p = f0.a.a();
       this.q = z.a.a();
       this.l = p0;
    }
    public int M(){
       return 1;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, LoginFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       LoginParams mSourcePhoto = this.l.mSourcePhoto;
       if (mSourcePhoto != null) {
          obj.photoPackage = j.a(mSourcePhoto);
       }
       mSourcePhoto = this.l.mSourcePhoto;
       String str = (mSourcePhoto == null)? "": mSourcePhoto.getId();
       LoginParams mSourcePrePh = this.l.mSourcePrePhoto;
       if (mSourcePrePh != null && !(TextUtils.I(mSourcePrePh.mPrePhotoId)).equals(str)) {
          obj.referPhotoPackage = j.b(this.l.mSourcePrePhoto);
       }
       ClientContent$LoginSourcePackage loginSourceP = new ClientContent$LoginSourcePackage();
       LoginFragment tl = this.l;
       loginSourceP.source = tl.mLoginSource;
       loginSourceP.sourceExtInfo = TextUtils.I(tl.mExtraInfoParams);
       obj.loginSourcePackage = loginSourceP;
       return obj;
    }
    public ClientContent$ContentPackage ch(LoginUserResponse p0,LoginUserResponse p1){
       ClientContent$UserPackage[] userPackageA;
       ClientContent$ContentPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, LoginFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       if (p0 != null) {
          LoginUserResponse mUserInfo = p0.mUserInfo;
          if (mUserInfo != null && !TextUtils.x(mUserInfo.mId)) {
             userPackage.identity = TextUtils.I(p0.mUserInfo.mId);
             userPackageA = new ClientContent$UserPackage[]{userPackage};
             uBatchUserPa.userPackage = userPackageA;
             obj.batchUserPackage = uBatchUserPa;
          }
       }
       if (p1 != null) {
          userPackageA = p1.mUserInfo;
          if (userPackageA != null && !TextUtils.x(userPackageA.mId)) {
             userPackage.identity = TextUtils.I(p1.mUserInfo.mId);
             userPackageA = new ClientContent$UserPackage[]{userPackage};
             uBatchUserPa.userPackage = userPackageA;
             obj.batchUserPackage = uBatchUserPa;
          }
       }
       LoginParams mSourcePhoto = this.l.mSourcePhoto;
       if (mSourcePhoto != null) {
          obj.photoPackage = j.a(mSourcePhoto);
       }
       mSourcePhoto = this.l.mSourcePhoto;
       String str = (mSourcePhoto == null)? "": TextUtils.I(mSourcePhoto.getId());
       LoginParams mSourcePrePh = this.l.mSourcePrePhoto;
       if (mSourcePrePh != null && !str.equals(mSourcePrePh.mPrePhotoId)) {
          obj.referPhotoPackage = j.b(this.l.mSourcePrePhoto);
       }
       ClientContent$LoginSourcePackage loginSourceP = new ClientContent$LoginSourcePackage();
       LoginFragment tl = this.l;
       loginSourceP.source = tl.mLoginSource;
       loginSourceP.sourceExtInfo = TextUtils.I(tl.mExtraInfoParams);
       obj.loginSourcePackage = loginSourceP;
       return obj;
    }
    public void dh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginFragment.class, "5")) {
          return;
       }
       this.eh(p0, 0);
       return;
    }
    public void eh(String p0,int p1){
       if (PatchProxy.isSupport(LoginFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LoginFragment.class, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p0;
       uElementPack.type = 1;
       uElementPack.action = p1;
       u1.u(1, uElementPack, this.Q3());
       return;
    }
    public void fh(String p0,int p1,int p2){
       if (PatchProxy.isSupport(LoginFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LoginFragment.class, "8")) {
          return;
       }
       int i = -1;
       if (!PatchProxy.isSupport(LoginFragment.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(i), this, LoginFragment.class, "9")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = p0;
          uElementPack.type = 1;
          uElementPack.action = p2;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.params = this.getPageParams();
          urlPackage.subPages = "";
          urlPackage.category = this.M();
          urlPackage.page = p1;
          u1.A(urlPackage, "", 1, uElementPack, this.Q3());
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LoginFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LoginFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LoginFragment.class, new u0());
       }else {
          obj.put(LoginFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, LoginFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       if (!TextUtils.x(obj)) {
          obj = obj+"&";
       }
       return obj+"start_page="+this.l.mSourcePage+"&start_login_session_id="+this.l.mSourcePageSessionId;
    }
    public void gh(String p0,int p1,ClientContent$ContentPackage p2){
       if (PatchProxy.isSupport(LoginFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LoginFragment.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p0;
       uElementPack.type = 1;
       uElementPack.action = p1;
       u1.u(1, uElementPack, p2);
       return;
    }
    public void hh(LoginUserResponse p0,boolean p1){
    }
    public void ih(LoginUserResponse p0,boolean p1,boolean p2){
    }
    public void onClick(View p0){
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, LoginFragment.class, "2")) {
          this.m = a.g();
          this.n = a.g();
          this.o = a.g();
       }
       try{
          this.l = j0.e(this.getActivity().getIntent(), "KEY_LOGIN_PARAM");
          this.k = j0.e(this.getActivity().getIntent(), "key_login_from_page");
       }catch(java.lang.ClassCastException e4){
          Object[] objArray = new Object[0];
          b.C().u("LOGIN_TAG", e4.getCause(), objArray);
       }
       if (this.l == null) {
          this.l = new LoginParams$a().a();
       }
       if (this.k == null) {
          this.k = LoginPageLauncher$FromPage.UNIDENTIFIED;
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(LoginFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LoginFragment.class, "4")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (!p0) {
          this.o.onNext(Boolean.TRUE);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LoginFragment.class, "3")) {
          return;
       }
       super.onResume();
       this.o.onNext(Boolean.TRUE);
       return;
    }
}
