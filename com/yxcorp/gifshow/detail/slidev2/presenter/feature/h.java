package com.yxcorp.gifshow.detail.slidev2.presenter.feature.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import e8a.i0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import e8a.l0;
import e17.i;
import zic.f;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import e8a.h0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import e8a.j0;
import com.gifshow.tuna.player.poi.e;
import e8a.k0;
import android.view.View;
import android.widget.TextView;
import lnc.a1;
import android.content.res.ColorStateList;
import ekd.m1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.h$a;
import android.view.View$OnClickListener;

public class h extends PresenterV2	// class@0019a4
{
    public View p;
    public TextView q;
    public View r;
    public User s;
    public String t;
    public int u;

    public void h(){
       super();
       this.u = 1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.R8(this.s);
       this.X7(this.s.observable().subscribe(new i0(this), Functions.e));
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new l0(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, h.class, "4");
    }
    public void P8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "8")) {
          return;
       }
       if (this.s.mIsHiddenUser != null) {
          i.a(R.style.arg_RES_7f110668, 0x7f104fe7);
          f.b();
          return;
       }else {
          GifshowActivity activity = this.getActivity();
          if (!QCurrentUser.ME.isLogined()) {
             d.a(-1712118428).ne(this.getContext(), "follow", "follows_add", 0, a.B.getString(R.string.arg_RES_7f103077), null, null, null, new h0(this)).h();
             return;
          }else if(PatchProxy.applyVoid(objArray, this, oh, "10")){
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FOLLOW_USER_RECOMMENDED";
             uElementPack.params = this.t;
             u1.u(true, uElementPack, objArray);
          }
          f$a uoa = new f$a(this.s, activity.Q2());
          uoa.o(activity.getUrl());
          uoa.q(true);
          f uof = uoa.b();
          if (this.u == 2) {
             FollowHelper.k(uof).subscribe(new j0(this), e.b);
          }else {
             FollowHelper.d(uof, new k0(this), Functions.d());
          }
          return;
       }
    }
    public final void R8(User p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "5")) {
          return;
       }
       if (p0.isFollowingOrFollowRequesting()) {
          if (!PatchProxy.applyVoid(null, this, oh, "6")) {
             this.u = 2;
             this.r.setVisibility(8);
             this.p.setSelected(true);
             this.q.setSelected(true);
             this.q.setText(R.string.arg_RES_7f101021);
             this.q.setTextColor(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f061fbc)));
          }
       }else {
          this.S8();
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       this.u = 1;
       this.r.setVisibility(0);
       this.p.setSelected(0);
       this.q.setSelected(0);
       this.q.setText(R.string.arg_RES_7f100f8f);
       this.q.setTextColor(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f061fbc)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f4e);
       this.q = m1.f(p0, 0x7f0a0fa1);
       this.r = m1.f(p0, 0x7f0a0f6e);
       this.p.setOnClickListener(new h$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.s = this.q8(User.class);
       this.t = this.r8("NEBULA_PYMK_LOG_PARAMS");
       return;
    }
}
