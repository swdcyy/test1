package com.yxcorp.gifshow.relation.explore.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import hac.h0;
import erd.g;
import crd.b;
import hcc.j0;
import e17.i;
import zic.f;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.relation.user.activity.UserListActivity;
import hn5.n;
import hn5.m;
import android.content.Context;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import ou5.b;
import hac.f0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.relation.util.f;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.pymk.f;
import wca.b;
import jga.c;
import jga.f$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import hac.i0;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.relation.explore.presenter.g;
import com.gifshow.tuna.player.poi.e;
import zbc.c;
import oe6.e;
import java.lang.Integer;
import com.yxcorp.gifshow.relation.explore.presenter.i;
import com.yxcorp.gifshow.relation.explore.presenter.h;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import android.widget.TextView;
import wca.a;
import com.kwai.framework.model.user.User$FollowStatus;
import android.text.TextPaint;
import lnc.a1;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import ekd.m1;
import hac.c0;
import hac.d0;
import com.kwai.framework.model.user.RecoUser;
import zbc.d;
import nu7.a;

public class j extends PresenterV2	// class@001852
{
    public String A;
    public boolean B;
    public View p;
    public TextView q;
    public View r;
    public View s;
    public View t;
    public User u;
    public RecoUser v;
    public RecyclerFragment w;
    public d x;
    public c y;
    public a z;

    public void j(){
       super(false);
    }
    public void j(boolean p0){
       super();
       this.B = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       if (this.B != null) {
          this.W8(this.u);
       }else {
          this.V8(this.u);
       }
       this.X7(b9.d(this.u, this.w).subscribe(new h0(this)));
       return;
    }
    public final void P8(){
       j0.x(this.u, -1);
    }
    public void R8(){
       int i;
       c uoc;
       Object obj = this;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, oj, "8")) {
          return;
       }
       if (obj.u.mIsHiddenUser != null) {
          this.P8();
          i.a(R.style.arg_RES_7f110668, 0x7f104fe7);
          f.b();
          return;
       }else {
          GifshowActivity activity = this.getActivity();
          boolean b = false;
          if (!QCurrentUser.ME.isLogined()) {
             String str = a.B.getString(R.string.arg_RES_7f103077);
             if (activity instanceof UserListActivity) {
                i = 20;
             }else if(m.a().U3(activity)){
                i = 6;
             }else {
                i = 0;
             }
             if (m.a().U3(activity) && !PatchProxy.applyVoid(objArray, obj, oj, "14")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = 0x782e;
                uElementPack.type = 1;
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                userPackage.identity = obj.u.getId();
                userPackage.index = obj.u.mPosition + 1;
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.userPackage = userPackage;
                u1.u(1, uElementPack, uContentPack);
             }
             d.a(-1712118428).ne(this.getContext(), "follow", "follows_add", i, str, null, null, null, new f0(obj)).h();
             return;
          }else {
             String url = activity.getUrl();
             String str1 = f.e(obj.w.g0(), obj.u);
             if (obj.x == null) {
                this.P8();
             }
             i oi = obj.w.q();
             if (oi instanceof f) {
                int i1 = (obj.u.mIsNewFriend != null)? 76: oi.l2();
                uoc = b.i(obj.u.getId(), obj.u.getId(), 1, b.a(i1));
             }else {
                uoc = b.h(obj.u.getId(), 85);
             }
             j u = obj.u;
             j oj1 = PatchProxy.apply(objArray, obj, oj, "10");
             if (oj1 != PatchProxyResult.class) {
             }else if(!TextUtils.x(obj.A)){
                oj1 = obj.A;
             }else {
                oj1 = this.getActivity().Q2();
             }
             f$a uoa = new f$a(u, oj1);
             uoa.c(str1);
             uoa.o(url);
             uoa.i(uoc);
             f$a uoa1 = uoa.h(obj.u.mFollowActionReasonTextId);
             if (obj.B != null && obj.u.isFollowingOrFollowRequesting()) {
                if (!PatchProxy.applyVoidOneRefs(uoa1, obj, oj, "9")) {
                   uoa1.q(1);
                   FollowHelper.k(uoa1.b()).subscribe(new i0(obj), Functions.d());
                }
             }else {
                FollowHelper.d(uoa1.b(), new g(obj, activity), e.b);
             }
             oj = obj.y;
             if (oj != null) {
                oj.c(obj.u);
             }
             e.f0(b);
             return;
          }
       }
    }
    public final void S8(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "6")) {
          return;
       }
       oj = this.s;
       if (oj == null) {
          return;
       }
       if (!p0) {
          i oi = (this.u.mIsHiddenUser != null)? new i(this): new h(this);
          oj.setOnClickListener(oi);
       }else {
          oj.setOnClickListener(null);
       }
       this.s.setVisibility(p0);
       return;
    }
    public final void V8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       int i = 0;
       int i1 = (this.v == null)? 8: 0;
       int i2 = 1;
       View[] viewArray = new View[i2];
       viewArray[i] = this.t;
       n.Z(i1, viewArray);
       if (p0.isFollowingOrFollowRequesting()) {
          j tr = this.r;
          i1 = (this.u.mIsHiddenUser != null)? 8: 0;
          tr.setVisibility(i1);
          View[] viewArray1 = new View[i2];
          viewArray1[i] = this.p;
          n.Z(8, viewArray1);
          viewArray1 = new View[i2];
          viewArray1[i] = this.t;
          n.Z(8, viewArray1);
          if (this.u.mIsHiddenUser == null) {
             i = 8;
          }
          this.S8(i);
       }else {
          this.r.setVisibility(8);
          a.b(this.u, this.p, null, this.q);
          this.S8(8);
       }
       return;
    }
    public final void W8(User p0){
       int i3;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "5")) {
          return;
       }
       int i = 1;
       View[] viewArray = new View[i];
       viewArray[0] = this.r;
       int i1 = 8;
       n.Z(i1, viewArray);
       viewArray = new View[i];
       viewArray[0] = this.t;
       n.Z(i1, viewArray);
       int i2 = (this.v == null)? 8: 0;
       View[] viewArray1 = new View[i];
       viewArray1[0] = this.t;
       n.Z(i2, viewArray1);
       if (p0.mVisitorBeFollowed != null && (p0.isPrivate() || (p0.isFollowingOrFollowRequesting() || (p0.isPrivate() && p0.mFollowStatus == User$FollowStatus.FOLLOWING)))) {
          a.c(this.u, this.p, null, this.q, R.string.arg_RES_7f100fa6);
       }else if(p0.isFollowingOrFollowRequesting()){
          j tu = this.u;
          j tp = this.p;
          j tq = this.q;
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[]{tu,tp,null,tq,Integer.valueOf(0x7f0801b6)};
             if (!PatchProxy.applyVoid(objArray, null, uoa, "6")) {
             }
          }else if(tu != null && (tu.isPrivate() && tu.mFollowStatus != User$FollowStatus.FOLLOWING)){
             i3 = 0x7f100216;
          }else {
             i3 = 0x7f101034;
          }
          tq.getPaint().setFakeBoldText(i);
          View[] viewArray2 = new View[]{tp,tq};
          n.Z(0, viewArray2);
          View[] viewArray3 = new View[i];
          viewArray3[0] = null;
          n.Z(i1, viewArray3);
          tq.setText(i3);
          tp.setBackgroundResource(R.drawable.arg_RES_7f0801b6);
          tq.setTextColor(ContextCompat.getColorStateList(a1.c(), R.color.arg_RES_7f061fbb));
       }else {
          a.b(this.u, this.p, null, this.q);
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, j.class, "13")) {
          return;
       }
       this.u.setFollowStatus(User$FollowStatus.UNFOLLOW);
       RxBus.f.b(n.a(this.u));
       if (this.w.h0() != null && this.w.h0().getAdapter() != null) {
          this.w.h0().getAdapter().k0();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3635);
       this.t = m1.f(p0, 0x7f0a0785);
       this.p = m1.f(p0, 0x7f0a0f4e);
       this.q = m1.f(p0, 0x7f0a0fa1);
       this.s = m1.f(p0, 0x7f0a17af);
       m1.a(p0, new c0(this), R.id.follow_button);
       m1.a(p0, new d0(this), R.id.close_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.u = this.q8(User.class);
       this.v = this.s8(RecoUser.class);
       this.w = this.r8("FRAGMENT");
       this.x = this.t8("USER_FOLLOW_LOGGER");
       this.y = this.t8("USER_CLICK_LOGGER");
       this.z = this.t8("AUTO_ALIAS_CALLER_CONTEXT");
       this.A = this.t8("PYMK_PAGE_REFERER");
       return;
    }
}
