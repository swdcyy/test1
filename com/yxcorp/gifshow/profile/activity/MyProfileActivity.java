package com.yxcorp.gifshow.profile.activity.MyProfileActivity;
import k26.d;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import crd.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import lnc.s5;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.content.res.Configuration;
import rkd.b;
import lnc.d2;
import lnc.b5;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.os.Bundle;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.d;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import u1c.b;
import erd.g;
import crd.b;
import e06.b;
import u1c.c;
import eda.n;
import com.yxcorp.gifshow.profile.activity.a;
import android.content.Intent;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import u1c.d;
import joc.o;
import joc.n;
import joc.w;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import u1c.a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController;
import lnc.b9;
import nl9.u;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import k26.b;
import l3c.a;
import java.lang.Integer;
import android.net.Uri;
import ekd.j0;
import java.lang.CharSequence;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import ekd.x0;
import lnc.o5;
import com.yxcorp.gifshow.profile.fragment.MyProfileFragment;

public class MyProfileActivity extends SingleFragmentActivity implements d	// class@0011f4
{
    public String A;
    public int B;
    public boolean C;
    public a D;
    public View y;
    public MyProfileFragment z;
    public static final int E;

    public void MyProfileActivity(){
       super();
       this.D = new a();
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, MyProfileActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
       profilePacka.visitedUid = TextUtils.k(QCurrentUser.ME.getId());
       obj.profilePackage = profilePacka;
       return obj;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, MyProfileActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.w3() instanceof s5)? this.w3().f(): 0;
       return i;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MyProfileActivity.class, "4")) {
          return;
       }
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MyProfileActivity.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       return 0;
    }
    public String getUrl(){
       return "ks://self";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileActivity.class, "17")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (!b.g() && p0.orientation == 2) {
          return;
       }
       if (this.y == null) {
          return;
       }
       d2.n();
       if (d2.i(p0) || b5.a(this)) {
          FrameLayout$LayoutParams layoutParams = this.y.getLayoutParams();
          layoutParams.width = n.x(this);
          this.y.setLayoutParams(layoutParams);
       }else if(this.y.getWidth() != n.x(this)){
          p0.width = n.x(this);
          MyProfileActivity ty = this.y;
          ty.setLayoutParams(ty.getLayoutParams());
       }
       return;
    }
    public void onCreate(Bundle p0){
       boolean b;
       MyProfileActivity myProfileAct = MyProfileActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, myProfileAct, "1")) {
          return;
       }
       super.onCreate(p0);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.D.c(f.g(d.class, mAIN).subscribe(new b(this)));
       this.D.c(f.g(b.class, mAIN).subscribe(new c(this)));
       this.D.c(f.g(n.class, mAIN).subscribe(a.b));
       Intent intent = this.getIntent();
       b = false;
       if (intent != null && intent.getBooleanExtra(ProfileExtraKey.ENABLE_SMOOTH_SWIPE.getValue(), b)) {
          b = true;
       }
       if (!PatchProxy.isSupport(myProfileAct) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, myProfileAct, "16")) {
          SwipeLayout swipeLayout = w9.a(this);
          swipeLayout.e(1);
          if (b) {
             w.b(this, swipeLayout, new d(this, u1.p()));
          }
       }
       if (!PatchProxy.applyVoid(null, this, myProfileAct, "13") && !QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).ne(this, this.getUrl(), "my_profile", 50, null, null, null, null, null).K(1).w(new a(this)).h();
       }
       this.y = this.findViewById(0x7f0a0fe6);
       ResourceDownloadController.e().b(this);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MyProfileActivity.class, "8")) {
          return;
       }
       b9.a(this.D);
       super.onDestroy();
       return;
    }
    public void onResume(){
       MyProfileActivity myProfileAct = MyProfileActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, myProfileAct, "6")) {
          return;
       }
       super.onResume();
       if (PatchProxy.applyVoid(objArray, this, myProfileAct, "7") || (this.z != null && this.C != null)) {
          this.C = false;
          u ou = d.a(-1694791652);
          boolean b = ou.v7(this.z.ab().getUserType());
          if (b != ou.v7(QCurrentUser.ME.getUserType())) {
             this.z3();
          }
       }
       return;
    }
    public b q2(){
       Object obj = PatchProxy.apply(null, this, MyProfileActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public void startActivity(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileActivity.class, "2")) {
          return;
       }
       super.startActivity(p0);
       this.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
       return;
    }
    public void startActivityForResult(Intent p0,int p1){
       MyProfileActivity myProfileAct = MyProfileActivity.class;
       if (PatchProxy.isSupport(myProfileAct) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, myProfileAct, "3")) {
          return;
       }
       super.startActivityForResult(p0, p1);
       this.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MyProfileActivity myProfileAct = MyProfileActivity.class;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, this, myProfileAct, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getIntent();
       if (obj != null) {
          Uri data = obj.getData();
          if (!PatchProxy.applyVoidOneRefs(obj, this, myProfileAct, "11")) {
             this.A = j0.f(obj, ProfileExtraKey.ARG_PROFILE_ORIGIN_INTENT_DATA.getValue());
          }
          if (data != null) {
             if ((data.toString()).contains("moment")) {
                MomentLocateParam.addToIntent(this.getIntent(), MomentLocateParam.fromUri(this.getIntent().getData()));
             }
             if ((data.toString()).equals("ks://self") && !TextUtils.x(this.A)) {
                data = Uri.parse(this.A);
             }
             String str = "businessServiceProfileParams";
             obj.putExtra(str, x0.a(data, str));
          }
          if (!PatchProxy.applyVoidOneRefs(obj, this, myProfileAct, "10")) {
             Uri data1 = obj.getData();
             if (data1 != null) {
                this.B = o5.b(x0.a(data1, "scene"), 0);
             }
          }
       }
    label_008f :
       Intent obj1 = PatchProxy.apply(objArray, this, myProfileAct, "12");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(!QCurrentUser.ME.isLogined()){
          obj1 = this.getIntent();
          Bundle extras = (obj1 != null)? obj1.getExtras(): objArray;
          if (extras == null) {
             extras = new Bundle();
          }
          MyProfileActivity tB = this.B;
          if (PatchProxy.isSupport(MyProfileFragment.class)) {
             objArray = PatchProxy.applyTwoRefs(extras, Integer.valueOf(tB), objArray, MyProfileFragment.class, "1");
             if (objArray != patchProxyRe) {
             label_00e2 :
                this.z = objArray;
             }
          }
          extras.putInt("MyProfileFragment.arg_scene", tB);
          MyProfileFragment myProfileFra = new MyProfileFragment();
          myProfileFra.setArguments(extras);
          objArray = myProfileFra;
          goto label_00e2 ;
       }
       return objArray;
    }
}
