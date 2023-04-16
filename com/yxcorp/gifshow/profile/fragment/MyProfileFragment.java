package com.yxcorp.gifshow.profile.fragment.MyProfileFragment;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import k3c.p0;
import k3c.o0;
import xl8.b;
import java.util.HashMap;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.ProfileStyle;
import z5c.k0;
import o4c.l;
import s4c.t;
import z4c.f;
import r4c.f;
import d5c.a;
import tkd.b;
import tkd.d;
import xx5.e;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.a;
import o4c.i;
import q4c.e;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.hover.e;
import a5c.a;
import com.yxcorp.gifshow.profile.presenter.profile.page.MyProfilePhotoGuestDialogPresenter;
import k4c.j;
import k4c.a;
import k4c.j0;
import l4c.a;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.page.b;
import qw5.a;
import gx5.b;
import androidx.fragment.app.Fragment;
import r4c.u;
import z5c.o2;
import com.yxcorp.gifshow.profile.presenter.profile.MyProfileKMoviePosterStatusTipPresenter;
import android.view.View;
import android.view.ViewStub;
import android.os.Bundle;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import lnc.o5;
import com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import com.kwai.framework.model.user.QCurrentUser;
import qa6.b;
import java.lang.Number;
import k2b.e0;
import k2b.d0;
import java.lang.Boolean;
import ekd.k1;
import java.lang.Math;
import k3c.s0;
import java.util.Map;
import z5c.e3;
import java.lang.StringBuilder;
import wkd.b;
import lnc.u5;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import z5c.k1;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.s;
import brd.t;
import t45.d;
import brd.z;
import k3c.n0;
import erd.g;
import crd.b;
import android.content.Context;
import o56.f;
import i3c.b;
import java.util.Objects;
import i3c.b$a;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import lnc.b9;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.MemoryStorageUtil$Key;
import java.lang.Integer;
import com.yxcorp.gifshow.util.MemoryStorageUtil;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;
import hn5.n;
import hn5.m;
import s1c.v;
import b3c.g;
import com.kwai.page.component.a;
import b3c.h;
import androidx.lifecycle.LifecycleOwner;

public class MyProfileFragment extends BaseProfileFragment	// class@001308
{
    public final Runnable U0;
    public boolean V;
    public b V0;
    public b W;
    public String X;
    public long Y;
    public final Runnable Z;
    public static final int W0;

    public void MyProfileFragment(){
       super();
       this.Z = new p0(this);
       this.U0 = new o0(this);
       this.V0 = new b(new HashMap());
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MyProfileFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       BaseProfileFragment tG = this.G;
       if (tG == ProfileStyle.TEENAGE) {
          tG.addMyPresenterV2(obj);
          PatchProxy.onMethodExit(MyProfileFragment.class, "11");
          return obj;
       }else if(k0.h()){
          obj.U7(new l());
       }
       this.G.addMyPresenterV2(obj);
       obj.U7(new t());
       obj.U7(new f());
       obj.U7(new f());
       obj.U7(new a());
       PresenterV2 presenterV2 = d.a(0x66992f74).Mx(true);
       if (presenterV2 != null) {
          obj.U7(presenterV2);
       }
       obj.U7(new a());
       obj.U7(new a());
       obj.U7(new i());
       obj.U7(new e());
       obj.U7(new MyProfileBackgroundEditPresenter());
       obj.U7(new e());
       obj.U7(new a());
       obj.U7(new MyProfilePhotoGuestDialogPresenter());
       if (!k0.e()) {
          obj.U7(new j());
       }
       obj.U7(new a());
       obj.U7(new j0(true));
       obj.U7(new a());
       obj.U7(new ProfileDialogBubbleDispatchPresenter());
       obj.U7(new b());
       obj.U7(d.a(0x27ae02e4).cC());
       obj.U7(d.a(0x3673894c).W20(this, true));
       obj.U7(new u());
       if (o2.c(this)) {
          obj.U7(new MyProfileKMoviePosterStatusTipPresenter());
       }
       PatchProxy.onMethodExit(MyProfileFragment.class, "11");
       return obj;
    }
    public void Bh(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileFragment.class, "12")) {
          return;
       }
       ViewStub viewStub = p0.findViewById(R.id.header_operation_viewstub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1234);
       viewStub.inflate();
       return;
    }
    public void Ch(){
       if (PatchProxy.applyVoid(null, this, MyProfileFragment.class, "6")) {
          return;
       }
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          this.X = arguments.getString(ProfileExtraKey.ARG_PROFILE_ORIGIN_INTENT_DATA.getValue());
       }
       super.Ch();
       if (arguments != null) {
          BaseProfileFragment tE = this.E;
          tE.mFragmentArgs = arguments;
          tE.setPartOfDetailActivity(arguments.getBoolean("MyProfileFragment.arg_isPartOfDetail", false));
          this.E.mScene = arguments.getInt("MyProfileFragment.arg_scene");
       }
       return;
    }
    public void Dh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MyProfileFragment.class, "7")) {
          return;
       }
       Bundle arguments = this.getArguments();
       if (arguments != null && (arguments.containsKey(ProfileExtraKey.LOCATE_MOMENT.getValue()) && !this.B.isBanned())) {
          BaseProfileFragment tE = this.E;
          tE.mPhotoTabId = 5;
          tE.mMomentParam = MomentLocateParam.fromBundle(arguments, objArray);
       }else {
          super.Dh();
          if (this.E.mPhotoTabId == null && !TextUtils.x(this.X)) {
             Uri uri = x0.f(this.X);
             if (uri == null) {
                return;
             }else {
                String str = x0.a(uri, "tabId");
                if (TextUtils.x(str)) {
                   return;
                }else {
                   this.E.mPhotoTabId = o5.b(str, 0);
                   if (this.E.mPhotoTabId == 6) {
                      String str1 = x0.a(uri, "subTabId");
                      if (TextUtils.x(str1)) {
                         return;
                      }else {
                         this.E.mCollectSubTabName = ProfileStartParam$CollectionSub.withId(o5.b(str1, 0)).name;
                      }
                   }
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, MyProfileFragment.class, "8") && d.a(0x3673894c).E20()) {
             BaseProfileFragment tE1 = this.E;
             if (tE1.mPhotoTabId == null) {
                tE1.mPhotoTabId = 6;
                tE1.mCollectSubTabName = ProfileStartParam$CollectionSub.TAB_COLLECTION_POST.name;
             }
          }
       }
    label_00ad :
       return;
    }
    public void Fh(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileFragment.class, "5")) {
          return;
       }
       this.B = b.a(QCurrentUser.ME);
       return;
    }
    public int Lb(){
       int i;
       ProfileParam obj = PatchProxy.apply(null, this, MyProfileFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       BaseProfileFragment tE = this.E;
       if (tE != null) {
          obj = tE.mPhotoTabId;
          if (obj != 1) {
             if (obj != 2) {
                if (obj != 3) {
                   i = (obj != 5)? d0.j(this): 3;
                }else {
                   i = 4;
                }
             }else {
                i = 2;
             }
          }else {
             i = 1;
          }
       }
       return i;
    }
    public boolean Xg(){
       Object obj = PatchProxy.apply(null, this, MyProfileFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!o2.c(this))? true: false;
       return b;
    }
    public void e3(boolean p0){
       if (PatchProxy.isSupport(MyProfileFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MyProfileFragment.class, "18")) {
          return;
       }
       this.V = p0;
       this.Y = Math.max(k1.i(), this.Y);
       return;
    }
    public int f(){
       BaseProfileFragment tE = this.E;
       int i = 0;
       if (tE == null) {
          return i;
       }
       ProfileParam mPhotoTabId = tE.mPhotoTabId;
       if (mPhotoTabId == 3) {
          i = 42;
       }else if(mPhotoTabId == 5){
          i = 57;
       }else if(mPhotoTabId == 19){
          i = 283;
       }
       return i;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MyProfileFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MyProfileFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MyProfileFragment.class, new s0());
       }else {
          obj.put(MyProfileFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0x7602;
    }
    public String getPageParams(){
       boolean b;
       String obj = PatchProxy.apply(null, this, MyProfileFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       if (this.B == null) {
          this.B = b.a(QCurrentUser.ME);
       }
       b = e3.a(this.B);
       String str = "type=";
       String str1 = (b)? "business": "normal";
       str = str+str1+"&visited_user_id="+this.B.getId();
       if (b) {
          str = str+"&business_line=商家平台";
       }
       String str2 = b.a(-1071465158).e();
       if (!TextUtils.x(str2) && o2.c(this)) {
          str = str+"&redpoint_id="+str2;
       }
       if (TextUtils.x(obj)) {
          return str;
       }else {
          return str+"&"+obj;
       }
    }
    public String getUrl(){
       return "ks://self";
    }
    public void onCreate(Bundle p0){
       b$a obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (this.getActivity() != null) {
          k1.f(this.getActivity(), 0, 0);
       }
       RxBus f = RxBus.f;
       this.W = f.f(s.class).observeOn(d.a).subscribe(new n0(this));
       boolean b = f.b(this.getActivity());
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(b), null, uob, "1");
          if (obj != patchProxyRe) {
          }else {
          label_0059 :
             obj = b.b;
             Objects.requireNonNull(obj);
             if (PatchProxy.isSupport(b$a.class)) {
                obj = PatchProxy.applyOneRefs(Boolean.valueOf(b), obj, b$a.class, "1");
                if (obj != patchProxyRe) {
                }
             }
             obj = new b(b);
          }
       }else {
          goto label_0059 ;
       }
       f.b(obj);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MyProfileFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       b9.a(this.W);
       k1.m(this.Z);
       k1.m(this.U0);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MyProfileFragment.class, "16")) {
          return;
       }
       super.onResume();
       MemoryStorageUtil$Key eUserInfoCha = MemoryStorageUtil$Key.EUserInfoChanged;
       if (MemoryStorageUtil.a(eUserInfoCha, Integer.valueOf(0)).intValue() > 0 || this.V != null) {
          long l = k1.i();
          if (this.V != null) {
             MyProfileFragment tY = this.Y;
             if (l - tY < 0) {
                k1.r(this.U0, (tY - l));
             label_005c :
                MemoryStorageUtil.b(eUserInfoCha);
             }
          }
          this.w5(ProfileRefreshStatus.PROFILE);
          goto label_005c ;
       }else {
          eUserInfoCha = MemoryStorageUtil$Key.EUserFollowChanged;
          if (MemoryStorageUtil.a(eUserInfoCha, Integer.valueOf(0)).intValue() > 0) {
             this.w5(ProfileRefreshStatus.USER_FOLLOW);
             MemoryStorageUtil.b(eUserInfoCha);
          }
       }
       this.V = false;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MyProfileFragment.class, "13")) {
          return;
       }
       super.onViewCreated(p0, p1);
       m.a().sT(this.getUrl());
       return;
    }
    public void wh(ProfileParam p0,v p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MyProfileFragment.class, "10")) {
          return;
       }
       BaseProfileFragment tR = this.R;
       if (tR != null) {
          tR.o(p1, p0);
          this.R.f();
       }
       return;
    }
    public void yh(){
       if (PatchProxy.applyVoid(null, this, MyProfileFragment.class, "9")) {
          return;
       }
       if (this.R == null) {
          g og = new g(this, this.getView(), new h(), this.G);
          this.R = og;
          og.h();
       }
       return;
    }
}
