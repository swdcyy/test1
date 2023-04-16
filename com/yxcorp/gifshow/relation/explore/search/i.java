package com.yxcorp.gifshow.relation.explore.search.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import zf6.k;
import android.widget.ImageView;
import lu7.i;
import ki5.b;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import nu7.a;
import lu7.f;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import jac.j;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import jac.i;
import android.app.Application;
import o56.a;
import java.lang.StringBuilder;
import lnc.a1;
import com.yxcorp.gifshow.relation.explore.search.h;
import erd.o;
import t45.d;
import brd.z;
import jac.h;
import e17.i;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import jac.g;
import n3d.a;
import jga.f$a;
import jga.c;
import wca.b;
import jga.f;
import jac.k;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import oe6.e;
import android.view.View;
import wca.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.relation.explore.search.i$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.search.i$b;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;

public class i extends PresenterV2	// class@001880
{
    public TextView p;
    public TextView q;
    public TextView r;
    public KwaiImageView s;
    public ImageView t;
    public ImageView u;
    public View v;
    public TextView w;
    public User x;
    public ExploreSearchResponse$a y;
    public a z;

    public void i(){
       super();
    }
    public void E8(){
       int i;
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i tx = this.x;
       g.h(this.s, tx.mSex, tx.getAvatar(), this.x.getAvatars(), HeadImageSize.MIDDLE);
       i.d(this.u, this.x, k.d());
       i tx1 = this.x;
       if (tx1.mIsHiddenUser != null) {
          this.p.setText(TextUtils.i(tx1.mHiddenUserName, b.b().c(R.string.arg_RES_7f103fcb)));
       }else {
          tx = this.z;
          if (tx != null && tx.a != null) {
             this.p.setText(f.e(tx1));
             this.X7(this.x.observable().subscribe(new j(this), Functions.d()));
          }else {
             this.p.setText(f.c(tx1));
             this.X7(this.x.observable().subscribe(new i(this), Functions.d()));
          }
       }
       i = 0;
       int i1 = 1;
       if (TextUtils.x(this.x.mKwaiId)) {
          Object[] objArray = new Object[i1];
          objArray[i] = this.x.mId;
          this.q.setText(a.b().getString(R.string.arg_RES_7f1045d3, objArray));
       }else {
          this.q.setText(a1.p(R.string.arg_RES_7f103fa8)+this.x.mKwaiId);
       }
       Object[] objArray1 = new Object[i1];
       objArray1[i] = TextUtils.N((long)this.x.mFansCount);
       this.r.setText(a.b().getString(R.string.arg_RES_7f10456c, objArray1));
       this.X7(this.x.observable().distinctUntilChanged(h.b).observeOn(d.a).subscribe(new h(this), Functions.d()));
       this.R8(this.x);
       return;
    }
    public void P8(){
       boolean b;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "5")) {
          return;
       }
       if (this.x.isFollowingOrFollowRequesting()) {
          this.R8(this.x);
          return;
       }else if(this.x.mIsHiddenUser != null){
          i.a(R.style.arg_RES_7f110668, 0x7f104fe7);
          return;
       }else if(this.getActivity() instanceof GifshowActivity){
          GifshowActivity activity = this.getActivity();
          f$a obj = PatchProxy.apply(objArray, this, oi, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!QCurrentUser.me().isLogined()){
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(a1.p(R.string.arg_RES_7f103077));
             LoginParams loginParams = uoa.a();
             d.a(-1712118428).x00(this.getContext(), 23, loginParams, new g(this));
             b = false;
          }else {
             b = true;
          }
          if (!b) {
             return;
          }else {
             obj = new f$a(this.x, activity.Q2()).h(this.x.mFollowActionReasonTextId);
             obj.i(b.i(this.x.getId(), this.x.getId(), 1, objArray));
             i tz = this.z;
             String str = (tz == null || tz.a == null)? "": this.x.getThirdPartyName();
             obj.d(str);
             FollowHelper.d(obj.b(), new k(this), Functions.e);
          }
       }
       e.f0(false);
       return;
    }
    public final void R8(User p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
          return;
       }
       i = 8;
       if (!p0.isFollowingOrFollowRequesting()) {
          this.t.setVisibility(i);
          a.b(this.x, this.v, null, this.w);
       }else {
          this.v.setVisibility(i);
          this.t.setVisibility(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0333);
       this.p = m1.f(p0, 0x7f0a2d10);
       this.q = m1.f(p0, 0x7f0a40d5);
       this.r = m1.f(p0, 0x7f0a40d3);
       this.t = m1.f(p0, 0x7f0a3635);
       this.u = m1.f(p0, 0x7f0a4479);
       this.v = m1.f(p0, 0x7f0a0f4e);
       this.w = m1.f(p0, 0x7f0a0fa1);
       m1.a(p0, new i$a(this), R.id.user_layout);
       m1.a(p0, new i$b(this), R.id.follow_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.x = this.q8(User.class);
       this.y = this.q8(ExploreSearchResponse$a.class);
       this.z = this.t8("AUTO_ALIAS_CALLER_CONTEXT");
       return;
    }
}
