package com.yxcorp.gifshow.relation.pymk.kem.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.PymkDialogItemViewResponse;
import com.kwai.framework.model.user.User;
import yl8.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import lbc.e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.q;
import lbc.f;
import lnc.b9;
import e17.i;
import zic.f;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Application;
import o56.a;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import lbc.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import java.lang.Integer;
import java.util.Map;
import com.yxcorp.gifshow.model.response.dialog.KemPymkDialogResponse;
import kbc.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import k2b.e0;
import rra.a;
import x6c.p;
import jga.f$a;
import fka.e;
import jga.c;
import wca.b;
import com.yxcorp.gifshow.pymk.b;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import ytb.k;
import io.reactivex.internal.functions.Functions;
import lbc.d;
import android.view.View;
import android.widget.TextView;
import lnc.a1;
import android.content.res.ColorStateList;
import java.util.List;
import com.kwai.framework.model.user.User$FollowStatus;
import wkd.b;
import qra.d;
import sra.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import lbc.g;
import com.kwai.social.startup.follow.model.SayHiConfigParam;
import x6c.j;
import android.view.ViewStub;
import ekd.m1;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.a$a;
import android.view.View$OnClickListener;

public class a extends PresenterV2	// class@00194b
{
    public View p;
    public TextView q;
    public ViewStub r;
    public PymkDialogItemViewResponse s;
    public List t;
    public int u;
    public g v;
    public Map w;
    public int x;
    public b y;
    public p z;

    public void a(){
       super();
       this.x = 1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       PymkDialogItemViewResponse mUser = this.s.mUser;
       mUser.mPage = "reco";
       this.R8(mUser);
       mUser.b();
       this.X7(mUser.observable().subscribe(new e(this)));
       this.X7(RxBus.f.f(q.class).subscribe(new f(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       b9.a(this.y);
       return;
    }
    public void P8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          return;
       }
       PymkDialogItemViewResponse mUser = this.s.mUser;
       if (mUser.mIsHiddenUser != null) {
          i.a(R.style.arg_RES_7f110668, 0x7f104fe7);
          f.b();
          return;
       }else {
          GifshowActivity activity = this.getActivity();
          if (!QCurrentUser.ME.isLogined()) {
             d.a(-1712118428).ne(this.getContext(), "follow", "follows_add", 0, a.b().getString(R.string.arg_RES_7f103077), null, null, null, new c(this)).h();
             return;
          }else {
             a tx = this.x;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tx), this, uoa, "9")) {
                Object obj = this.w.get("key_pymk_response");
                if (obj instanceof KemPymkDialogResponse) {
                   PymkDialogItemViewResponse mUser1 = this.s.mUser;
                   a tu = this.u;
                   if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(obj, mUser1, Integer.valueOf(tu), Integer.valueOf(tx), null, b.class, "3")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "CLICK_FOLLOW_BUTTON";
                      i3 oi3 = b.c(obj, mUser1, tu);
                      oi3.c("follow_type", Integer.valueOf(tx));
                      uElementPack.params = oi3.e();
                      u1.u(true, uElementPack, b.a(obj));
                   }
                }
             }
             if (this.x == 3) {
                a.a(activity, activity.getSupportFragmentManager(), mUser, 2);
                return;
             }else {
                uoa = this.z;
                if (uoa != null && uoa.c(objArray)) {
                   this.z.a(objArray, this.u);
                   return;
                }else {
                   f$a uoa1 = new f$a(mUser, String.valueOf(126));
                   uoa1.l(e.a().c(126));
                   uoa1.c("");
                   uoa1.o(activity.getUrl());
                   f$a uoa2 = uoa1.h(mUser.mFollowActionReasonTextId);
                   uoa2.i(b.h(mUser.getId(), 44));
                   uoa2.q(true);
                   b.m(uoa2, mUser);
                   if (this.x == 2) {
                      FollowHelper.k(uoa2.b()).subscribe(k.b, Functions.d());
                   }else {
                      FollowHelper.d(uoa2.b(), new d(activity), Functions.d());
                   }
                   return;
                }
             }
          }
       }
    }
    public final void R8(User p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       if (p0.isFollowingOrFollowRequesting()) {
          this.S8(p0);
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uoa, "7")){
          this.x = 1;
          this.p.setSelected(false);
          this.q.setSelected(false);
          uoa = this.q;
          int i = (p0.mVisitorBeFollowed != null)? 0x7f10408e: 0x7f100f8f;
          uoa.setText(i);
          this.q.setTextColor(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f061fbc)));
          this.t.remove(this.s.mUser.mId);
       }
       return;
    }
    public final void S8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       int i = 2;
       this.x = i;
       this.p.setSelected(true);
       this.q.setSelected(true);
       b9.a(this.y);
       if (p0.getFollowStatus() == User$FollowStatus.FOLLOW_REQUESTING) {
          this.q.setText(R.string.arg_RES_7f100216);
       }else {
          int i1 = 0x36dab11a;
          e0 uoe0 = null;
          if (b.a(i1).d(p0)) {
             this.y = RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new g(this, p0));
             this.q.setText(R.string.arg_RES_7f10423b);
             Context context = this.q.getContext();
             if (context instanceof e0) {
                uoe0 = context;
             }
             b.a(i1).f(uoe0, p0.getId(), i);
             this.x = 3;
          }else if(p0.mVisitorBeFollowed != null){
             if (j.a().btnType != null) {
                if (this.z == null) {
                   p op = new p(this.s.mUser, j.a(), this.p, this.q, this.r);
                   this.z = this.z;
                   this.z.b(uoe0, this.u);
                }
                this.z.e();
             }else {
                this.q.setText(R.string.arg_RES_7f100faa);
             }
          }else {
             this.q.setText(R.string.arg_RES_7f101021);
          }
       }
       this.q.setTextColor(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f060a3d)));
       if (!this.t.contains(this.s.mUser.mId)) {
          this.t.add(this.s.mUser.mId);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f4e);
       this.q = m1.f(p0, 0x7f0a0fa1);
       this.p.setOnClickListener(new a$a(this));
       this.r = m1.f(p0, 0x7f0a370b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.s = this.q8(PymkDialogItemViewResponse.class);
       this.t = this.r8("key_pymk_user_ids");
       this.u = this.r8("ADAPTER_POSITION").intValue();
       this.w = this.r8("EXTRAS");
       return;
    }
}
