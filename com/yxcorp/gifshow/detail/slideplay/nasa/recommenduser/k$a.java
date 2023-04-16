package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kwai.framework.model.user.User;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.Exception;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.j;
import erd.o;
import t45.d;
import brd.z;
import k6a.l;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import yl8.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a$b;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import lu7.f;
import rnc.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a$d;
import android.view.View;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import y8c.d;
import k6a.u;
import com.kwai.framework.model.user.QCurrentUser;
import brd.y;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class k$a extends PresenterV2	// class@001777
{
    public View A;
    public ImageView B;
    public TextView C;
    public ViewTreeObserver$OnGlobalLayoutListener D;
    public User p;
    public d q;
    public y r;
    public e s;
    public BaseFragment t;
    public KwaiImageView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    public void k$a(){
       super();
       this.D = new k$a$a(this);
    }
    public void E8(){
       k$a tu;
       String str1;
       int i;
       Drawable drawable;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, k$a.class, "3")) {
          return;
       }
       boolean b = false;
       this.P8(b);
       String str = "5";
       if (!PatchProxy.applyVoidWithListener(objArray, this, k$a.class, str)) {
          if (this.getContext() == null || this.y == null) {
             PatchProxy.onMethodExit(k$a.class, str);
          }else if(this.p.isMale()){
             str1 = a1.p(R.string.arg_RES_7f103196);
             i = 0x7f0822e4;
          }else if(this.p.isFemale()){
             str1 = a1.p(R.string.arg_RES_7f100f40);
             i = 0x7f081d85;
          }else {
             i = -1;
             str1 = "";
          }
          if (TextUtils.x(str1)) {
             this.y.setVisibility(8);
             PatchProxy.onMethodExit(k$a.class, str);
          }else {
             this.y.setVisibility(b);
             k$a ty = this.y;
             try{
                ty.setText(str1);
                drawable = this.getContext().getResources().getDrawable(i);
                if (drawable != null) {
                   drawable.setBounds(b, b, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                   this.y.setCompoundDrawables(drawable, objArray, objArray, objArray);
                }
             }catch(java.lang.Exception e5){
                this.y.setVisibility(8);
                e5.printStackTrace();
             }
             PatchProxy.onMethodExit(k$a.class, str);
          }
       }
       str = "4";
       if (!PatchProxy.applyVoidWithListener(objArray, this, k$a.class, str)) {
          if (this.getContext() != null && this.z != null) {
             tu = this.p;
             if (tu != null) {
                String cityName = tu.getCityName();
                if (TextUtils.x(cityName)) {
                   this.z.setVisibility(8);
                }else {
                   this.z.setVisibility(b);
                   this.z.setText(cityName);
                }
                PatchProxy.onMethodExit(k$a.class, str);
             }
          }
          PatchProxy.onMethodExit(k$a.class, str);
       }
       if (this.x != null) {
          if (!TextUtils.x("")) {
             this.x.setVisibility(b);
             this.x.setText("");
          }else {
             this.x.setVisibility(8);
          }
       }
       g.l(this.u, this.p, HeadImageSize.MIDDLE, a1.f(R.drawable.arg_RES_7f0819bd));
       this.S8(this.p);
       this.X7(this.p.observable().distinctUntilChanged(j.b).observeOn(d.a).subscribe(new l(this), Functions.d()));
       this.p.b();
       tu = this.u;
       if (tu != null) {
          tu.setOnClickListener(new k$a$b(this));
       }
       tu = this.v;
       if (tu != null) {
          tu.setText(i.j(f.a(this.p)));
          this.v.setOnClickListener(new k$a$c(this));
       }
       tu = this.A;
       if (tu != null) {
          tu.setOnClickListener(new k$a$d(this));
       }
       this.s.a(this.u);
       this.s.a(this.v);
       this.s.a(this.m8());
       PatchProxy.onMethodExit(k$a.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, k$a.class, "7")) {
          return;
       }
       this.w.getViewTreeObserver().removeOnGlobalLayoutListener(this.D);
       PatchProxy.onMethodExit(k$a.class, "7");
       return;
    }
    public void P8(boolean p0){
       if (PatchProxy.isSupport2(k$a.class, "6") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, k$a.class, "6")) {
          return;
       }
       k$a tp = this.p;
       User mMainRecoRea = tp.mMainRecoReason;
       if (mMainRecoRea == null) {
          User mExtraInfo = tp.mExtraInfo;
          if (mExtraInfo != null) {
             mMainRecoRea = mExtraInfo.mRecoTextInfo;
          }
       }
       String str = (p0)? RichTextMetaExt.e(mMainRecoRea): RichTextMetaExt.g(mMainRecoRea);
       if (!TextUtils.x(str)) {
          this.w.setVisibility(0);
          this.w.setText(str);
          if (!p0) {
             this.w.getViewTreeObserver().addOnGlobalLayoutListener(this.D);
          }
       }else {
          this.w.setVisibility(8);
       }
       PatchProxy.onMethodExit(k$a.class, "6");
       return;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, k$a.class, "9")) {
          return;
       }
       k$a tu = this.u;
       if (tu == null) {
          PatchProxy.onMethodExit(k$a.class, "9");
          return;
       }else {
          tu.setTag(R.id.tag_view_refere, Integer.valueOf(187));
          this.u.setTag(R.id.tag_pymk_portal_refer, Integer.valueOf(74));
          this.u.setTag(R.id.tag_pymk_follow_text_refer, this.p.mFollowActionReasonTextId);
          String str = "10";
          if (!PatchProxy.applyVoidWithListener(objArray, this, k$a.class, str)) {
             if (this.u == null || this.p == null) {
                PatchProxy.onMethodExit(k$a.class, str);
             }else {
                ProfileStartParam profileStart = ProfileStartParam.l(this.p);
                profileStart.r(this.u);
                d.a(-1718536792).Y7(this.getActivity(), profileStart);
                PatchProxy.onMethodExit(k$a.class, str);
             }
          }
          u.c(this.p, this.q.get(), "to_profile", false);
          PatchProxy.onMethodExit(k$a.class, "9");
          return;
       }
    }
    public final void S8(User p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, k$a.class, "8")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined() || !p0.isFollowingOrFollowRequesting()) {
          this.B.setSelected(p0.mVisitorBeFollowed);
          this.B.setVisibility(0);
          k$a tC = this.C;
          int i = (p0.mVisitorBeFollowed != null)? 0x7f10408e: 0x7f100f8f;
          tC.setText(i);
          boolean b = true;
          this.C.setEnabled(b);
          this.A.setEnabled(b);
       }else {
          this.B.setVisibility(8);
          this.C.setText(R.string.arg_RES_7f101034);
          this.C.setEnabled(0);
          this.A.setEnabled(0);
       }
       this.r.onNext(Boolean.TRUE);
       PatchProxy.onMethodExit(k$a.class, "8");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, k$a.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a4353);
       TextView textView = m1.f(p0, R.id.user_name);
       this.v = textView;
       textView.getPaint().setFakeBoldText(true);
       this.w = m1.f(p0, 0x7f0a4398);
       this.x = m1.f(p0, 0x7f0a4399);
       this.y = m1.f(p0, 0x7f0a439b);
       this.z = m1.f(p0, 0x7f0a439a);
       this.A = m1.f(p0, 0x7f0a0f4c);
       this.B = m1.f(p0, 0x7f0a0f6e);
       TextView textView1 = m1.f(p0, R.id.follow_text);
       this.C = textView1;
       textView1.getPaint().setFakeBoldText(true);
       PatchProxy.onMethodExit(k$a.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, k$a.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("FOLLOW_STATUS_CHANGE");
       this.s = this.q8(e.class);
       this.t = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(k$a.class, "1");
       return;
    }
}
