package com.yxcorp.gifshow.detail.common.information.cocreate.panel.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import android.view.View;
import cy9.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import lu7.f;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import yl8.b;
import cy9.a;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import cy9.d;
import erd.g;
import crd.b;
import android.app.Activity;
import android.content.Context;
import ekd.p0;
import e17.i;
import cy9.e;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import cy9.c;
import java.lang.Runnable;
import n3d.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Enum;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.a$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiImageView;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@00140d
{
    public CoCreateInfo$CoCreateMember p;
    public User q;
    public KwaiImageView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public View v;
    public PublishSubject w;
    public QPhoto x;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (!this.p.mUserId - null) {
          return;
       }
       this.m8().setOnClickListener(new b(this));
       this.r.U(this.p.mHeadIconUrls);
       this.t.setText(this.p.mRole);
       this.s.setText(f.b(String.valueOf(this.p.mUserId), this.p.mUserName));
       User user = new User();
       this.q = user;
       user.mId = String.valueOf(this.p.mUserId);
       this.q.mFollowStatus = (this.p.mIsFollowing != null)? User$FollowStatus.FOLLOWING: User$FollowStatus.UNFOLLOW;
       this.q.b();
       this.S8();
       this.v.setOnClickListener(new a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.q = null;
       return;
    }
    public void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0fa1);
       return;
    }
    public final int R8(){
       View obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.m8();
       ViewGroup parent = obj.getParent();
       if (parent == null) {
          return -1;
       }
       return parent.indexOfChild(obj);
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       if ((QCurrentUser.me().getId()).equals(String.valueOf(this.p.mUserId))) {
          this.W8(true);
          this.u.setText(a1.p(R.string.arg_RES_7f10463c));
          this.u.setTextColor(a1.a(R.color.arg_RES_7f061673));
          return;
       }else {
          this.W8(this.p.mIsFollowing);
          this.X7(this.q.observable().subscribe(new d(this)));
          return;
       }
    }
    public void V8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "8")) {
          return;
       }
       if (!p0.C(this.getActivity())) {
          i.a(R.style.arg_RES_7f110669, 0x7f1038e7);
          return;
       }else if(!QCurrentUser.ME.isLogined()){
          e uoe = new e(this);
          if (!PatchProxy.applyVoidOneRefs(uoe, this, uoa, "11") && !QCurrentUser.ME.isLogined()) {
             LoginParams$a uoa1 = new LoginParams$a();
             uoa1.d(a1.p(R.string.arg_RES_7f103077));
             d.a(-1712118428).x00(this.getContext(), 0, uoa1.a(), new c(uoe));
          }
       }
       a tq = this.q;
       if (tq.mFollowStatus == User$FollowStatus.UNFOLLOW) {
          if (!PatchProxy.applyVoidOneRefs(tq, this, uoa, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "USER_FOLLOW";
             i3 oi3 = i3.f();
             oi3.d("author_id", tq.mId);
             oi3.d("follow_state", tq.mFollowStatus.toString());
             oi3.d("head_position", "AUTHORS_CREATE_POPUP");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             uContentPack.userPackage = userPackage;
             userPackage.identity = tq.mId;
             tq = this.x;
             if (tq != null) {
                QPhoto mEntity = tq.mEntity;
                if (mEntity != null) {
                   uContentPack.photoPackage = w1.f(mEntity);
                }
             }
             u1.u(1, uElementPack, uContentPack);
          }
          FollowHelper.c(new f$a(this.q, "286").b(), new a$a(this));
       }
       return;
    }
    public final void W8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       this.v.setEnabled((p0 ^ 0x01));
       this.v.setSelected((p0 ^ 0x01));
       this.u.setSelected((p0 ^ 0x01));
       uoa = this.u;
       int i = (p0)? 0x7f101034: 0x7f100f8f;
       uoa.setText(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a07b2);
       this.s = m1.f(p0, 0x7f0a07b3);
       this.t = m1.f(p0, 0x7f0a07b4);
       this.v = m1.f(p0, 0x7f0a3643);
       this.P8(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p = this.q8(CoCreateInfo$CoCreateMember.class);
       this.w = this.t8("CO_CREATE_AUTHOR_CLICK_PANEL_EVENT");
       this.x = this.s8(QPhoto.class);
       return;
    }
}
