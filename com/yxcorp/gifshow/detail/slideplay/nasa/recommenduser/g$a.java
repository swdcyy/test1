package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.f;
import erd.o;
import t45.d;
import brd.z;
import k6a.h;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import yl8.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a$c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import lu7.f;
import rnc.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a$d;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a$e;
import android.view.View;
import k6a.g;
import y8c.d;
import k6a.u;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.framework.model.user.QCurrentUser;
import brd.y;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class g$a extends PresenterV2	// class@00176c
{
    public ViewTreeObserver$OnGlobalLayoutListener A;
    public SlidePlayViewModel B;
    public a C;
    public User p;
    public d q;
    public y r;
    public e s;
    public BaseFragment t;
    public KwaiImageView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public View y;
    public TextView z;

    public void g$a(){
       super();
       this.A = new g$a$a(this);
       this.C = new g$a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, g$a.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.t.getParentFragment());
       this.B = slidePlayVie;
       slidePlayVie.P(this.t, this.C);
       boolean b = false;
       this.P8(b);
       String str = RichTextMetaExt.g(this.p.mSecondaryRecoReason);
       if (!TextUtils.x(str)) {
          this.x.setVisibility(b);
          this.x.setText(str);
       }else {
          this.x.setVisibility(8);
       }
       g.l(this.u, this.p, HeadImageSize.MIDDLE, a1.f(R.drawable.arg_RES_7f0819bd));
       this.S8(this.p);
       this.X7(this.p.observable().distinctUntilChanged(f.b).observeOn(d.a).subscribe(new h(this), Functions.d()));
       this.p.b();
       this.u.setOnClickListener(new g$a$c(this));
       this.v.setText(i.j(f.a(this.p)));
       this.v.setOnClickListener(new g$a$d(this));
       this.y.setOnClickListener(new g$a$e(this));
       g$a tt = this.t;
       if (tt instanceof g && tt.V()) {
          u.d(this.p, this.q.get());
       }
       this.s.a(this.u);
       this.s.a(this.v);
       this.s.a(this.m8());
       PatchProxy.onMethodExit(g$a.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, g$a.class, "5")) {
          return;
       }
       this.w.getViewTreeObserver().removeOnGlobalLayoutListener(this.A);
       this.B.D(this.t, this.C);
       PatchProxy.onMethodExit(g$a.class, "5");
       return;
    }
    public void P8(boolean p0){
       if (PatchProxy.isSupport2(g$a.class, "4") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, g$a.class, "4")) {
          return;
       }
       g$a tp = this.p;
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
             this.w.getViewTreeObserver().addOnGlobalLayoutListener(this.A);
          }
       }else {
          this.w.setVisibility(8);
       }
       PatchProxy.onMethodExit(g$a.class, "4");
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoidWithListener(null, this, g$a.class, "7")) {
          return;
       }
       this.u.setTag(R.id.tag_view_refere, Integer.valueOf(187));
       this.u.setTag(R.id.tag_pymk_portal_refer, Integer.valueOf(74));
       this.u.setTag(R.id.tag_pymk_follow_text_refer, this.p.mFollowActionReasonTextId);
       ProfileStartParam profileStart = ProfileStartParam.l(this.p);
       profileStart.r(this.u);
       d.a(-1718536792).Y7(this.getActivity(), profileStart);
       u.b(this.p, this.q.get(), "to_profile");
       PatchProxy.onMethodExit(g$a.class, "7");
       return;
    }
    public final void S8(User p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$a.class, "6")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined() || !p0.isFollowingOrFollowRequesting()) {
          g$a tz = this.z;
          int i = (p0.mVisitorBeFollowed != null)? 0x7f10408e: 0x7f100f8f;
          tz.setText(i);
          b = true;
          this.z.setEnabled(b);
          this.y.setEnabled(b);
       }else {
          this.z.setText(R.string.arg_RES_7f101034);
          b = false;
          this.z.setEnabled(b);
          this.y.setEnabled(b);
       }
       this.r.onNext(Boolean.TRUE);
       PatchProxy.onMethodExit(g$a.class, "6");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$a.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a4353);
       TextView textView = m1.f(p0, R.id.user_name);
       this.v = textView;
       textView.getPaint().setFakeBoldText(true);
       this.w = m1.f(p0, 0x7f0a4398);
       this.x = m1.f(p0, 0x7f0a4399);
       this.y = m1.f(p0, 0x7f0a0f4c);
       TextView textView1 = m1.f(p0, R.id.follow_text);
       this.z = textView1;
       textView1.getPaint().setFakeBoldText(true);
       PatchProxy.onMethodExit(g$a.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, g$a.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("FOLLOW_STATUS_CHANGE");
       this.s = this.q8(e.class);
       this.t = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(g$a.class, "1");
       return;
    }
}
