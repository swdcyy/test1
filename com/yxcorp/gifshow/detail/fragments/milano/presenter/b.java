package com.yxcorp.gifshow.detail.fragments.milano.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.b$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import df5.b;
import hf5.b;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import v0a.c;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import v0a.a;
import android.content.Context;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jga.f$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import v0a.e;
import io.reactivex.internal.functions.Functions;
import v0a.d;
import com.kwai.framework.model.user.User$FollowStatus;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import java.lang.CharSequence;
import android.widget.Button;
import android.view.View;
import android.view.ViewStub;
import brd.y;

public class b extends PresenterV2	// class@00151a
{
    public KwaiImageView A;
    public TextView B;
    public TextView C;
    public boolean D;
    public b E;
    public String p;
    public String q;
    public b r;
    public MilanoContainerEventBus s;
    public y t;
    public e0 u;
    public String v;
    public ViewStub w;
    public View x;
    public User y;
    public Button z;

    public void b(String p0,String p1){
       super();
       this.E = new b$a(this);
       this.p = p0;
       this.q = p1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.r.De(this.E);
       this.X7(this.s.r.subscribe(new c(this)));
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BOTTOM_BAR";
       i3 oi3 = i3.f();
       oi3.d("click_area", p0);
       oi3.d("popup_type", "OUTSIDE_SHARE");
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(this.u).setType(1).setElementPackage(uElementPack));
       return;
    }
    public void R8(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
          return;
       }
       GifshowActivity obj = PatchProxy.apply(objArray, this, uob, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!QCurrentUser.me().isLogined()){
          LoginParams$a uoa1 = new LoginParams$a();
          uoa1.d(a1.p(R.string.arg_RES_7f103077));
          LoginParams loginParams = uoa1.a();
          d.a(-1712118428).x00(this.getActivity(), 23, loginParams, new a(this));
          b = false;
       }else {
          b = true;
       }
       if (!b) {
          return;
       }else {
          obj = this.getActivity();
          f$a uoa = new f$a(this.y, obj.Q2());
          uoa.o(obj.getUrl());
          uoa.q(true);
          uoa.m(this.r.getCurrentPhoto());
          if (this.y.isFollowingOrFollowRequesting()) {
             if (!PatchProxy.applyVoidOneRefs(uoa, this, uob, "9")) {
                uoa.q(true);
                this.X7(FollowHelper.k(uoa.b()).subscribe(new e(this), Functions.d()));
             }
             this.P8("CANCEL_FOLLOW");
          }else {
             FollowHelper.d(uoa.b(), new d(this), Functions.e);
             this.P8("FOLLOW");
          }
          return;
       }
    }
    public final void S8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       int i = 0x7f08094e;
       if (p0.isPrivate() && p0.mFollowStatus == User$FollowStatus.FOLLOW_REQUESTING) {
          this.z.setText(a.B.getResources().getString(R.string.arg_RES_7f100216));
          this.z.setBackgroundResource(i);
       }else if(p0.mFollowStatus == User$FollowStatus.FOLLOWING){
          if (p0.mVisitorBeFollowed != null) {
             this.z.setText(a.B.getResources().getString(R.string.arg_RES_7f100faa));
          }else {
             this.z.setText(a.B.getResources().getString(R.string.arg_RES_7f101034));
          }
          this.z.setBackgroundResource(i);
       }else if(p0.mVisitorBeFollowed != null){
          this.z.setText(a.B.getResources().getString(R.string.arg_RES_7f10408e));
       }else {
          this.z.setText(a.B.getResources().getString(R.string.arg_RES_7f100f8f));
       }
       this.z.setBackgroundResource(R.drawable.arg_RES_7f08094d);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.w = p0.findViewById(0x7f0a04a3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.r = this.q8(b.class);
       this.u = this.q8(e0.class);
       this.s = this.q8(MilanoContainerEventBus.class);
       this.t = this.t8("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVER");
       return;
    }
}
