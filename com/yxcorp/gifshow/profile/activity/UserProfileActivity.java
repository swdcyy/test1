package com.yxcorp.gifshow.profile.activity.UserProfileActivity;
import com.yxcorp.gifshow.profile.fragment.ProfilePreLoadFragment$b;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import crd.a;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import z5c.y1;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.kwai.framework.model.user.UserProfile;
import qa6.b;
import com.kwai.framework.model.user.ProfilePageInfo;
import java.lang.Number;
import android.content.Intent;
import android.app.Activity;
import wca.j;
import com.yxcorp.gifshow.entity.helper.H5OpenFrom;
import androidx.fragment.app.Fragment;
import lnc.s5;
import com.yxcorp.gifshow.profile.fragment.UserProfileFragment;
import z5c.g2;
import k2b.e0;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import com.yxcorp.gifshow.profile.h;
import android.content.res.Configuration;
import rkd.b;
import lnc.d2;
import lnc.b5;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.os.Bundle;
import android.net.Uri;
import z5c.k1;
import ekd.j0;
import u1c.f;
import com.yxcorp.gifshow.widget.SwipeLayout$b;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import u1c.g;
import joc.o;
import joc.n;
import joc.w;
import ekd.x0;
import lnc.o5;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import l3c.b0;
import ekd.w0;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import u1c.e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController;
import lnc.b9;
import m56.f;
import m56.g;
import java.io.Serializable;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.QCurrentUser;
import fka.e;
import jga.c;
import qa6.a;
import android.view.Window;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import tkd.b;
import tkd.d;
import vu5.b;
import nf6.h;
import com.yxcorp.gifshow.profile.fragment.ProfilePreLoadFragment;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.framework.model.feed.BaseFeed;
import cx5.a;
import com.yxcorp.gifshow.action.c;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;

public class UserProfileActivity extends SingleFragmentActivity implements ProfilePreLoadFragment$b	// class@0011f6
{
    public User A;
    public String B;
    public String C;
    public String D;
    public int E;
    public View F;
    public y1 G;
    public n H;
    public int I;
    public String J;
    public int K;
    public final a L;
    public boolean y;
    public UserProfileResponse z;

    public void UserProfileActivity(){
       super();
       this.y = true;
       this.E = 0;
       this.I = 0;
       this.L = new a();
    }
    public static boolean A3(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserProfileActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !TextUtils.isEmpty(p0.getId()))? true: false;
       return b;
    }
    public void b2(int p0){
       UserProfileActivity userProfileA = UserProfileActivity.class;
       if (PatchProxy.isSupport(userProfileA) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, userProfileA, "5")) {
          return;
       }
       super.b2(p0);
       this.G.f = u1.k();
       return;
    }
    public void d0(UserProfileResponse p0){
       UserProfileActivity userProfileA = UserProfileActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, userProfileA, "23")) {
          return;
       }
       User user = b.c(p0.mUserProfile);
       this.A = user;
       if (!PatchProxy.applyVoidOneRefs(user, this, userProfileA, "22") && !user.getUserType()) {
          user.mProfilePageInfo.mUserType = 1;
       }
       this.z = p0;
       this.z3();
       return;
    }
    public int f(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       UserProfileActivity obj = PatchProxy.apply(objArray, this, UserProfileActivity.class, "7");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.E;
       if (obj != null) {
          return obj;
       }
       Intent intent = this.getIntent();
       int i = 0;
       if (intent != null) {
          Object obj1 = PatchProxy.applyOneRefs(intent, objArray, j.class, "2");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else {
             H5OpenFrom h5OpenFrom = H5OpenFrom.fromIntent(intent);
             i1 = (h5OpenFrom == null)? 0: h5OpenFrom.getFromPage();
          }
          if (i1) {
             return i1;
          }
       }
       if (this.w3() instanceof s5) {
          i = this.w3().f();
       }
       return i;
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, UserProfileActivity.class, "25")) {
          return;
       }
       if (this.y != null) {
          super.f3();
       }
       return;
    }
    public void finish(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileActivity.class, "20")) {
          return;
       }
       Fragment uFragment = this.w3();
       g2 og2 = (uFragment instanceof UserProfileFragment)? uFragment.Gh(): objArray;
       super.finish();
       UserProfileActivity tG = this.G;
       if (tG != null) {
          if (uFragment instanceof e0) {
             tG.l0(og2, this.A, uFragment);
          }else {
             tG.l0(objArray, this.A, objArray);
          }
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, UserProfileActivity.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       UserProfileActivity obj = PatchProxy.apply(null, this, UserProfileActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       String str = "-1";
       String str1 = (obj == null)? str: obj.getId();
       UserProfileActivity tB = this.B;
       if (tB == null) {
          tB = str;
       }
       UserProfileActivity tC = this.C;
       if (tC != null) {
          str = tC;
       }
       return h.S(str1, tB, str, this.Q2());
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, UserProfileActivity.class, "19")) {
          return;
       }
       this.G.q0(4);
       super.onBackPressed();
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileActivity.class, "24")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (!b.g() && p0.orientation == 2) {
          return;
       }
       if (this.F == null) {
          return;
       }
       d2.n();
       if (d2.i(p0) || b5.a(this)) {
          FrameLayout$LayoutParams layoutParams = this.F.getLayoutParams();
          layoutParams.width = n.x(this);
          this.F.setLayoutParams(layoutParams);
       }else if(this.F.getWidth() != n.x(this)){
          p0.width = n.x(this);
          UserProfileActivity tF = this.F;
          tF.setLayoutParams(tF.getLayoutParams());
       }
       return;
    }
    public void onCreate(Bundle p0){
       UserProfileActivity userProfileA = UserProfileActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, userProfileA, "3")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       Object obj = null;
       Uri uri = (intent == null)? obj: intent.getData();
       if (uri == null || !uri.isHierarchical()) {
          super.finish();
          return;
       }else {
          int i = 0;
          k1.f(this, i, i);
          boolean b = j0.a(intent, "arg_enable_smooth_swipe", i);
          if (!PatchProxy.isSupport(userProfileA) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, userProfileA, "21")) {
             SwipeLayout swipeLayout = w9.b(this, new f(this));
             swipeLayout.e(true);
             if (b) {
                this.H = w.b(this, swipeLayout, new g(this, u1.p()));
             }
          }
          String str = x0.a(uri, "followRefer");
          this.E = (!TextUtils.isEmpty(str))? o5.b(str, i): j0.b(intent, ProfileExtraKey.FOLLOW_REFER.getValue(), i);
          intent = PatchProxy.applyOneRefs(uri, obj, b0.class, "2");
          if (intent != PatchProxyResult.class) {
             i = intent.intValue();
          }else {
             try{
                String str1 = w0.a(uri, "followDirectly");
                if (!TextUtils.isEmpty(str1) && Boolean.parseBoolean(str1)) {
                   if (a.t().d("enableFollowDirectlyOnLaunchProfile", i)) {
                      i = 2;
                   }
                }
                i = 1;
             }catch(java.lang.Exception e0){
             }catch(java.lang.Exception e0){
             }
          }
          this.I = i;
          this.F = this.findViewById(0x7f0a0fe6);
          y1 oy1 = new y1(u1.p(), u1.o());
          this.G = oy1;
          oy1.o0(this.A);
          u1.a(this);
          this.L.c(RxBus.f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new e(this)));
          ResourceDownloadController.e().b(this);
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, UserProfileActivity.class, "16")) {
          return;
       }
       b9.a(this.L);
       super.onDestroy();
       u1.b(this);
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileActivity.class, "18")) {
          return;
       }
       Fragment uFragment = this.w3();
       UserProfileActivity userProfileA = null;
       g2 og2 = (uFragment instanceof UserProfileFragment)? uFragment.Gh(): userProfileA;
       if (uFragment instanceof e0) {
          this.G.h0(og2, this.A, uFragment);
       }else {
          this.G.h0(userProfileA, this.A, userProfileA);
       }
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileActivity.class, "17")) {
          return;
       }
       this.G.o0(this.A);
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileActivity.class, "4")) {
          return;
       }
       super.onNewIntent(p0);
       this.z3();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
    }
    public void startActivity(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileActivity.class, "1")) {
          return;
       }
       super.startActivity(p0);
       this.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
       return;
    }
    public void startActivityForResult(Intent p0,int p1){
       UserProfileActivity userProfileA = UserProfileActivity.class;
       if (PatchProxy.isSupport(userProfileA) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, userProfileA, "2")) {
          return;
       }
       super.startActivityForResult(p0, p1);
       p0.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100e5);
       return;
    }
    public Fragment u3(){
       String dataString;
       String str5;
       String id;
       UserProfileActivity d;
       User user = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UserProfileActivity userProfileA = UserProfileActivity.class;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, user, userProfileA, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getIntent();
       Object[] objArray1 = (obj == null)? objArray: obj.getData();
       if (objArray1 != null && objArray1.isHierarchical()) {
          ProfileStartParam obj1 = PatchProxy.apply(objArray, user, userProfileA, "9");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             obj = this.getIntent();
             Uri data = obj.getData();
             String str = "10";
             String str1 = null;
             if (!PatchProxy.applyVoidTwoRefs(obj, data, user, userProfileA, str)) {
                if (!UserProfileActivity.A3(user.A)) {
                   ProfileExtraKey uSER = ProfileExtraKey.USER;
                   if (j0.g(obj, uSER.getValue())) {
                      user.A = j0.e(obj, uSER.getValue());
                   }
                }
                if (!UserProfileActivity.A3(user.A)) {
                   if (data == null || TextUtils.isEmpty(data.getLastPathSegment())) {
                      user.setResult(-10);
                      this.finish();
                   }else {
                      str5 = data.getLastPathSegment();
                      String str6 = x0.a(data, "hrefMomentId");
                      if (TextUtils.equals(str5, "moment")) {
                         List pathSegments = data.getPathSegments();
                         if (!q.f(pathSegments)) {
                            str5 = pathSegments.get(str1);
                            MomentLocateParam momentLocate = MomentLocateParam.fromUri(data).setNotifyIfInvalid(true);
                            momentLocate.mMomentId = str6;
                            MomentLocateParam.addToIntent(obj, momentLocate);
                         }else {
                         label_00ba :
                            str5 = "";
                         }
                      }else if(!str5.equals("-1")){
                      }
                      if (!TextUtils.isEmpty(str5)) {
                         User user1 = v15;
                         User user2 = v15;
                         user1 = new User(str5, null, null, null, 0);
                         user.A = user2;
                      }
                      if (!TextUtils.isEmpty(str5) && !TextUtils.equals(QCurrentUser.ME.getId(), str5)) {
                         c uoc = new c();
                         uoc.b(str6);
                         uoc.c(5);
                         e.a().j(uoc);
                      }
                   }
                }
             }
          label_0101 :
             if (!UserProfileActivity.A3(user.A)) {
                super.finish();
             }else {
                String str2 = x0.a(data, "extraInfo");
                String str3 = x0.a(data, "serverExpTag");
                if (QCurrentUser.ME.isLogined() && a.b(user.A)) {
                   if (!PatchProxy.applyVoid(objArray, user, userProfileA, "13")) {
                      View decorView = this.getWindow().getDecorView();
                      decorView.setTag(R.id.tag_view_refere, Integer.valueOf(43));
                      obj1 = ProfileStartParam.m(QCurrentUser.ME.getId());
                      obj1.r(decorView);
                      if (this.getIntent() != null) {
                         dataString = this.getIntent().getDataString();
                         if (PatchProxy.applyOneRefs(dataString, obj1, ProfileStartParam.class, str) != patchProxyRe) {
                         }else {
                            obj1.n(ProfileExtraKey.ARG_PROFILE_ORIGIN_INTENT_DATA, dataString);
                         }
                         obj1.w(j0.b(this.getIntent(), ProfileExtraKey.PROFILE_TAB.getValue(), 0));
                      }else {
                         int i = 0;
                      }
                      d.a(-1718536792).Kp(user, obj1);
                      user.i = 0;
                      user.y = false;
                      this.finish();
                   }
                }else {
                   dataString = "scene";
                   String str4 = "businessServiceProfileParams";
                   if (data != null) {
                      if ((data.toString()).contains(str4)) {
                         str = x0.a(data, str4);
                         user.J = str;
                         obj.putExtra(str4, str);
                      }
                      str = x0.a(data, dataString);
                      if (!TextUtils.isEmpty(str)) {
                         user.K = o5.b(str, 0);
                      }
                      str = x0.a(data, "source");
                      str5 = "WEB_STAR_RECO";
                      user.D = ((str5.toLowerCase()).equals(str))? str5: str;
                      h.a(data);
                   }
                   if (!user.A.getUserType()) {
                      id = user.A.getId();
                      UserProfileActivity j = user.J;
                      UserProfileActivity k = user.K;
                      d = user.D;
                      if (PatchProxy.isSupport(ProfilePreLoadFragment.class)) {
                         Object obj2 = PatchProxy.applyFourRefs(id, j, Integer.valueOf(k), d, null, ProfilePreLoadFragment.class, "10");
                         if (obj2 != patchProxyRe) {
                            objArray = obj2;
                         }
                      }
                      Bundle uBundle = new Bundle();
                      uBundle.putString("user_id", id);
                      SerializableHook.putSerializable(uBundle, str4, j);
                      uBundle.putInt(dataString, k);
                      uBundle.putString("arg_business_scene_type", d);
                      ProfilePreLoadFragment profilePreLo = new ProfilePreLoadFragment();
                      profilePreLo.setArguments(uBundle);
                      objArray = profilePreLo;
                   }else {
                      ProfileExtraKey pHOTO_ID = ProfileExtraKey.PHOTO_ID;
                      dataString = j0.f(obj, pHOTO_ID.getValue());
                      user.B = dataString;
                      if (data != null && TextUtils.isEmpty(dataString)) {
                         user.B = x0.a(data, "photoId");
                      }
                      user.C = j0.f(obj, ProfileExtraKey.PHOTO_EXP_TAG.getValue());
                      BaseFeed uBaseFeed = j0.e(obj, ProfileExtraKey.REFER_PHOTO.getValue());
                      if (uBaseFeed != null) {
                         RxBus.f.b(new a(uBaseFeed));
                         c.f(c.i(2), 8, uBaseFeed, c.i(3), RealAction$ExtParams.newInstance());
                      }
                      if (TextUtils.isEmpty(user.D)) {
                         user.D = j0.f(obj, ProfileExtraKey.BUSINESS_SCENE_TYPE.getValue());
                      }
                      Bundle extras = obj.getExtras();
                      if (extras == null) {
                         extras = new Bundle();
                      }
                      Bundle uBundle1 = extras;
                      SerializableHook.putSerializable(uBundle1, ProfileExtraKey.USER.getValue(), user.A);
                      uBundle1.putString(pHOTO_ID.getValue(), user.B);
                      uBundle1.putString(ProfileExtraKey.BUSINESS_SCENE_TYPE.getValue(), user.D);
                      pHOTO_ID = ProfileExtraKey.PHOTO_SCENE_TYPE;
                      dataString = pHOTO_ID.getValue();
                      uBundle1.putString(dataString, j0.f(obj, pHOTO_ID.getValue()));
                      objArray = UserProfileFragment.Hh(uBundle1, user.z, false, user.I, user.E, user.K, str2, str3);
                   }
                }
             }
          }
       }
       return objArray;
    }
}
