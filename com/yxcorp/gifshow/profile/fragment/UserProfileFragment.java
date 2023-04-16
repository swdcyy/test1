package com.yxcorp.gifshow.profile.fragment.UserProfileFragment;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.profile.fragment.m;
import ok.x;
import com.google.common.base.Suppliers;
import z5c.g2;
import k3c.j2;
import k3c.i2;
import android.os.Bundle;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.Fragment;
import s1c.j1;
import java.util.Objects;
import java.util.Set;
import s1c.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.ProfileStyle;
import z5c.k0;
import o4c.h0;
import d5c.v0;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePymkPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n;
import z4c.h;
import v4c.n;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import d5c.w0;
import com.kwai.framework.model.user.User;
import z5c.e3;
import tkd.b;
import tkd.d;
import xx5.e;
import y4c.e;
import k4c.p3;
import k4c.v2;
import k4c.r2;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.d;
import q4c.i;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.p;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.page.e;
import o4c.f0;
import l4c.b;
import b5c.r;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import l3c.b0;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.j;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.o;
import com.kwai.framework.model.user.User$FollowStatus;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.h;
import q4c.k;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.page.b;
import com.yxcorp.gifshow.profile.presenter.profile.page.d;
import qw5.a;
import r4c.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.profile.util.o;
import nl9.u;
import ml8.c;
import android.view.View;
import android.view.ViewStub;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import java.io.Serializable;
import z5c.b;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import com.kuaishou.weapon.i.WeaponHI;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import z5c.y1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import lnc.u1;
import crd.b;
import lnc.b9;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import k3c.g2;
import com.yxcorp.gifshow.profile.fragment.n;
import erd.g;
import java.lang.Number;
import k2b.d0;
import java.util.Map;
import kp.r1;
import com.yxcorp.gifshow.profile.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.s;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import k3c.h2;
import wca.n;
import k3c.f2;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import java.lang.Runnable;
import ekd.k1;
import m56.f;
import m56.g;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;
import joc.b;
import k3c.e2;
import lkd.b;
import s1c.v;
import d3c.a;
import b3c.g;
import com.kwai.page.component.a;
import d3c.b;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;

public class UserProfileFragment extends BaseProfileFragment	// class@00131c
{
    public b U0;
    public boolean V;
    public boolean V0;
    public int W;
    public long W0;
    public j1 X;
    public b X0;
    public RecyclerView Y;
    public y1 Y0;
    public b Z;
    public g2 Z0;
    public final Runnable a1;
    public final Runnable b1;
    public static final String c1;
    public static final String d1;
    public static final String e1;
    public static final x f1;

    static {
       UserProfileFragment.c1 = "UserProfileFragment.TAG";
       UserProfileFragment.d1 = "UserProfileFragment.TAG"+".arg_user_profile_response";
       UserProfileFragment.e1 = "UserProfileFragment.TAG"+".arg_isPartOfDetail";
       UserProfileFragment.f1 = Suppliers.a(m.b);
    }
    public void UserProfileFragment(){
       super();
       this.Z0 = new g2();
       this.a1 = new j2(this);
       this.b1 = new i2(this);
    }
    public static UserProfileFragment Hh(Bundle p0,UserProfileResponse p1,boolean p2,int p3,int p4,int p5,String p6,String p7){
       UserProfileFragment obj;
       if (PatchProxy.isSupport(UserProfileFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6,p7};
          obj = PatchProxy.apply(objArray, null, UserProfileFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new UserProfileFragment();
       if (p1 != null) {
          p0.putParcelable(UserProfileFragment.d1, b.c(p1));
       }
       p0.putBoolean(UserProfileFragment.e1, p2);
       p0.putInt("arg_show_follow_flag", p3);
       p0.putInt("arg_follow_refer", p4);
       p0.putInt("arg_scene", p5);
       p0.putString("arg_ad_extra", p6);
       p0.putString("arg_server_exp_tag", p7);
       obj.setArguments(p0);
       return obj;
    }
    public void Ah(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileFragment.class, "18")) {
          return;
       }
       super.Ah();
       UserProfileFragment tX = this.X;
       if (tX == null) {
          this.X = new j1();
       }else {
          Objects.requireNonNull(tX);
          if (!PatchProxy.applyVoid(objArray, tX, j1.class, "1")) {
             tX.b.clear();
             tX.c.clear();
             tX.e.clear();
          }
       }
       this.F.m = this.Z0;
       return;
    }
    public PresenterV2 B2(){
       Object[] objArray = null;
       PresenterV2 obj = PatchProxy.applyWithListener(objArray, this, UserProfileFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       BaseProfileFragment tG = this.G;
       if (tG == ProfileStyle.TEENAGE) {
          tG.addUserPresenterV2(obj);
          PatchProxy.onMethodExit(UserProfileFragment.class, "23");
          return obj;
       }else if(k0.h()){
          obj.U7(new h0());
       }
       this.G.addUserPresenterV2(obj);
       obj.U7(new v0());
       obj.U7(new UserProfilePymkPresenter());
       obj.U7(new n());
       obj.U7(new h());
       obj.U7(new n());
       obj.U7(new UserProfileFollowGuidePresenter());
       obj.U7(new w0());
       if (e3.a(this.B)) {
          PresenterV2 presenterV2 = d.a(0x66992f74).Mx(false);
          if (presenterV2 != null) {
             obj.U7(presenterV2);
          }
       }
       obj.U7(new e());
       if (!k0.e()) {
          obj.U7(new p3());
       }
       obj.U7(new v2());
       if (!k0.e()) {
          obj.U7(new r2());
       }
       obj.U7(new d());
       obj.U7(new i());
       obj.U7(new p());
       obj.U7(new UserProfileFavoriteAndMakerPresenter());
       obj.U7(new e());
       obj.U7(new f0());
       obj.U7(new b());
       obj.U7(new r());
       UserProfileFragment tW = this.W;
       BaseProfileFragment tB = this.B;
       tG = this.E;
       String str = (tG == null)? "": tG.mAdExtra;
       String str1 = str;
       if (!PatchProxy.isSupport2(b0.class, "1") || !PatchProxy.applyVoidFourRefsWithListener(obj, Integer.valueOf(tW), tB, str1, null, b0.class, "1")) {
          if (tW != 1) {
             if (tW == 2) {
                obj.U7(new j());
                obj.U7(new o(str1));
             }
          }else if(tB.mFollowStatus == User$FollowStatus.FOLLOWING){
             Log.g("AdFollow", "union style is FOLLOWING");
          }else {
             obj.U7(new h());
             obj.U7(new o(str1));
          }
          PatchProxy.onMethodExit(b0.class, "1");
       }
       obj.U7(new k());
       obj.U7(new ProfileDialogBubbleDispatchPresenter());
       obj.U7(new b());
       obj.U7(new d());
       obj.U7(d.a(0x27ae02e4).cC());
       obj.U7(new u());
       tG = this.E;
       if (tG != null) {
          objArray = tG.mReferPhoto;
       }
       if (o.u(objArray)) {
          d.a(-1694791652).js(obj);
       }
       PatchProxy.onMethodExit(UserProfileFragment.class, "23");
       return obj;
    }
    public void Bh(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFragment.class, "20")) {
          return;
       }
       ViewStub viewStub = p0.findViewById(R.id.header_operation_viewstub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d1235);
       viewStub.inflate();
       return;
    }
    public void Ch(){
       ProfileParam mReferPhoto;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileFragment.class, "14")) {
          return;
       }
       super.Ch();
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          BaseProfileFragment tE = this.E;
          tE.mFragmentArgs = arguments;
          if (tE.mBaseFeed == null) {
             tE.mBaseFeed = b.a(arguments, ProfileExtraKey.REFER_PHOTO.getValue());
          }
          tE = this.E;
          if (tE.mReferPhoto == null && tE.mBaseFeed != null) {
             tE.mReferPhoto = new QPhoto(this.E.mBaseFeed);
          }
          if (TextUtils.x(this.E.mPhotoID)) {
             this.E.mPhotoID = arguments.getString(ProfileExtraKey.PHOTO_ID.getValue());
          }
          tE = this.E;
          if (tE.mPhotoExpTag == null) {
             tE.mPhotoExpTag = arguments.getString(ProfileExtraKey.PHOTO_EXP_TAG.getValue());
          }
          this.E.setPartOfDetailActivity(arguments.getBoolean(UserProfileFragment.e1, false));
          this.E.mFollowRefer = arguments.getInt("arg_follow_refer", false);
          this.W = arguments.getInt("arg_show_follow_flag", false);
          this.E.mScene = arguments.getInt("arg_scene");
          this.E.mAdExtra = arguments.getString("arg_ad_extra");
          this.E.mServerExpTag = arguments.getString("arg_server_exp_tag");
          this.E.mPhotoSceneType = arguments.getString(ProfileExtraKey.PHOTO_SCENE_TYPE.getValue());
          if (TextUtils.x(this.E.mPhotoID)) {
             tE = this.E;
             mReferPhoto = tE.mReferPhoto;
             if (mReferPhoto != null) {
                tE.mPhotoID = mReferPhoto.getPhotoId();
             }
          }
          if (TextUtils.x(this.E.mPhotoID)) {
             tE = this.E;
             mReferPhoto = tE.mBaseFeed;
             if (mReferPhoto != null) {
                tE.mPhotoID = TextUtils.k(mReferPhoto.getId());
             }
          }
          this.E.setBusinessSceneType(arguments.getString(ProfileExtraKey.BUSINESS_SCENE_TYPE.getValue()));
          g.e(KsLogProfileTag.PHOTO_LAST_SEEN.appendTag(UserProfileFragment.c1), "enter profile photoId: "+this.E.mPhotoID);
          WeaponHI.b("28", objArray, this.B.getId(), objArray, objArray);
       }
       if (this.getActivity() == null) {
          return;
       }else {
          this.V = j0.a(this.getActivity().getIntent(), ProfileExtraKey.DISALLOW_MOMENT_FOLLOW.getValue(), false);
          return;
       }
    }
    public void Dh(){
       if (PatchProxy.applyVoid(null, this, UserProfileFragment.class, "15")) {
          return;
       }
       Bundle arguments = this.getArguments();
       if (arguments != null && arguments.containsKey("jump_to_moment_tab_and_locate")) {
          BaseProfileFragment tE = this.E;
          tE.mPhotoTabId = 5;
          tE.mMomentParam = MomentLocateParam.fromBundle(arguments, null);
       }else {
          super.Dh();
       }
       return;
    }
    public void Eh(int p0){
       BaseProfileFragment tB;
       if (PatchProxy.isSupport(UserProfileFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, UserProfileFragment.class, "16")) {
          return;
       }
       if (this.Y0 == null) {
          this.Y0 = new y1(u1.p(), u1.o());
       }
       if (!p0) {
          this.Y0.q0(1);
          tB = this.B;
          if (tB != null) {
             UserProfileFragment tY0 = this.Y0;
             UserProfileFragment tZ0 = this.Z0;
             Objects.requireNonNull(tY0);
             if (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidFourRefs(tZ0, tB, Boolean.TRUE, this, tY0, y1.class, "4")) {
                tY0.k0(tZ0, tY0.e, tB, 1, this);
             }
          }
          u1.b(this);
          b9.a(this.X0);
       }else if(p0 == 2){
          tB = this.B;
          if (tB != null) {
             this.Y0.o0(tB);
          }
          u1.a(this);
          this.Ih();
       }
       return;
    }
    public void Fh(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFragment.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.B == null) {
          this.B = b.a(p0, ProfileExtraKey.USER.getValue());
       }
       if (this.C == null) {
          String d1 = UserProfileFragment.d1;
          if (p0.containsKey(d1)) {
             this.C = b.a(p0.getParcelable(d1));
          }
       }
       return;
    }
    public g2 Gh(){
       return this.Z0;
    }
    public final void Ih(){
       if (PatchProxy.applyVoid(null, this, UserProfileFragment.class, "4")) {
          return;
       }
       b9.a(this.X0);
       this.X0 = t.timer(UserProfileFragment.f1.get().longValue(), TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new g2(this), n.b);
       return;
    }
    public int Lb(){
       int i;
       ProfileParam obj = PatchProxy.apply(null, this, UserProfileFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       BaseProfileFragment tE = this.E;
       if (tE != null) {
          obj = tE.mPhotoTabId;
          if (obj != 1) {
             i = (obj != 5)? d0.j(this): 3;
          }else {
             i = 1;
          }
       }
       return i;
    }
    public int f(){
       if (this.V == null) {
          BaseProfileFragment tE = this.E;
          if (tE != null && (tE.mPhotoTabId == 18 && tE.mAutoSelectedMomentBtn == null)) {
             return 5;
          }
       }
       return 0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserProfileFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(UserProfileFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, UserProfileFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       boolean b = e3.a(this.B);
       String str = "type=";
       String str1 = (b)? "business": "normal";
       str = str+str1+"&visited_user_id="+this.B.getId();
       if (b) {
          str = str+"&business_line=商家平台";
       }
       BaseProfileFragment tE = this.E;
       if (tE != null) {
          ProfileParam mBaseFeed = tE.mBaseFeed;
          if (mBaseFeed != null) {
             objArray = r1.I1(mBaseFeed);
          }
       }
       if (!TextUtils.x(objArray)) {
          str = str+"&server_exp_tag="+objArray;
       }
       if (TextUtils.x(obj)) {
          return str;
       }else {
          return str+"&"+obj;
       }
    }
    public String getUrl(){
       ProfileParam mPhotoID;
       ProfileParam mPhotoExpTag;
       Bundle obj = PatchProxy.apply(null, this, UserProfileFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       BaseProfileFragment tE = this.E;
       if (tE != null) {
          mPhotoID = tE.mPhotoID;
          if (mPhotoID == null) {
          label_001d :
             mPhotoID = (obj != null)? obj.getString(ProfileExtraKey.PHOTO_ID.getValue()): null;
          }
       }else {
          goto label_001d ;
       }
       BaseProfileFragment tE1 = this.E;
       if (tE1 != null) {
          mPhotoExpTag = tE1.mPhotoExpTag;
          if (mPhotoExpTag == null) {
          label_0034 :
             mPhotoExpTag = (obj != null)? obj.getString(ProfileExtraKey.PHOTO_EXP_TAG.getValue()): null;
          }
       }else {
          goto label_0034 ;
       }
       BaseProfileFragment tB = this.B;
       String str = (tB == null)? "-1": tB.getId();
       return h.S(str, mPhotoID, mPhotoExpTag, null);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.Z = f.g(s.class, mAIN).subscribe(new h2(this));
       this.U0 = f.g(n.class, mAIN).subscribe(new f2(this));
       if (this.E.mIsPartOfDetailActivity == null) {
          this.Ih();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, UserProfileFragment.class, "9")) {
          return;
       }
       super.onDestroy();
       b9.a(this.Z);
       b9.a(this.U0);
       b9.a(this.X0);
       k1.m(this.a1);
       k1.m(this.b1);
       u1.b(this);
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFragment.class, "8")) {
          return;
       }
       UserProfileFragment tY0 = this.Y0;
       if (tY0 != null) {
          BaseProfileFragment tB = this.B;
          if (tB != null) {
             UserProfileFragment tZ0 = this.Z0;
             Objects.requireNonNull(tY0);
             if (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidFourRefs(tZ0, tB, Boolean.TRUE, this, tY0, y1.class, "2")) {
                tY0.k0(tZ0, 6, tB, 1, this);
             }
          }
       }
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFragment.class, "7")) {
          return;
       }
       UserProfileFragment tY0 = this.Y0;
       if (tY0 != null) {
          BaseProfileFragment tB = this.B;
          if (tB != null) {
             tY0.o0(tB);
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, UserProfileFragment.class, "10")) {
          return;
       }
       super.onResume();
       if (this.V0 != null) {
          long l = k1.i();
          UserProfileFragment tW0 = this.W0;
          if (l - tW0 >= 0) {
             this.w5(ProfileRefreshStatus.PROFILE);
          }else {
             k1.r(this.b1, (tW0 - l));
          }
       }
       this.V0 = false;
       return;
    }
    public Set t7(){
       Set obj = PatchProxy.apply(null, this, UserProfileFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.t7();
       obj.add(new b(new e2(this)));
       return obj;
    }
    public void wh(ProfileParam p0,v p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserProfileFragment.class, "22")) {
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
       if (PatchProxy.applyVoid(null, this, UserProfileFragment.class, "21")) {
          return;
       }
       if (this.R == null) {
          a uoa = new a(this, this.getView(), new b(), this.G);
          this.R = uoa;
          uoa.h();
       }
       return;
    }
    public ArrayList zh(){
       ArrayList obj = PatchProxy.apply(null, this, UserProfileFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.zh();
       obj.add(this.X);
       return obj;
    }
}
