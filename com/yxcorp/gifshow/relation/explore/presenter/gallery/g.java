package com.yxcorp.gifshow.relation.explore.presenter.gallery.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.RecoUser;
import gbc.b;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import crd.b;
import lnc.b9;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import iac.w;
import erd.g;
import eda.q;
import iac.v;
import tkd.b;
import tkd.d;
import gx5.c;
import android.app.Activity;
import android.content.Context;
import lnc.a1;
import android.text.TextPaint;
import android.view.View;
import zf6.j;
import y8c.d;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.g$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.g$b;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.g$c;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.g$d;

public class g extends PresenterV2	// class@001843
{
    public TextView A;
    public TextView B;
    public View C;
    public int D;
    public final a E;
    public RecoUser p;
    public d q;
    public PublishSubject r;
    public PublishSubject s;
    public PymkGuideCard t;
    public b u;
    public b v;
    public LottieAnimationView w;
    public KwaiImageView x;
    public TextView y;
    public TextView z;

    public void g(){
       super();
       this.E = f.b;
    }
    public void E8(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "2")) {
          return;
       }
       RecoUser mPymkGuideCa = this.p.mPymkGuideCard;
       this.t = mPymkGuideCa;
       if (mPymkGuideCa != null) {
          b.i(this.D);
          PymkGuideCard mUser = this.t.mUser;
          if (mUser != null) {
             g.b(this.x, mUser, HeadImageSize.ADJUST_BIG);
          }
          this.y.setText(QCurrentUser.ME.getName());
          this.z.setText(this.t.mTitle);
          this.A.setText(this.t.mSubTitle);
          this.R8();
          mUser = this.t.mBgLottieUrl;
          if (!PatchProxy.applyVoidOneRefs(mUser, this, og, "5")) {
             og = this.w;
             if (og != null && !og.p()) {
                this.w.setVisibility(0);
                this.w.setAnimationFromUrl(mUser);
                this.w.s();
             }
          }
       }
    label_006d :
       return;
    }
    public void J8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "6")) {
          og = this.w;
          if (og != null && og.p()) {
             this.w.f();
          }
       }
       b[] uobArray = new b[]{this.u,this.v};
       b9.b(uobArray);
       a.b().c("KRNSocialProfileRefreshEvent", this.E);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       g tt = this.t;
       if (tt == null) {
          return;
       }
       if (tt.mIsNameEmpty == null && tt.mIsHeadEmpty == null) {
          return;
       }
       b[] uobArray = new b[]{this.u,this.v};
       b9.b(uobArray);
       if (this.t.mIsHeadEmpty != null) {
          this.u = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new w(this));
       }
       if (this.t.mIsNameEmpty != null) {
          a.b().a("KRNSocialProfileRefreshEvent", this.E);
          this.v = RxBus.f.g(q.class, RxBus$ThreadMode.MAIN).subscribe(new v(this));
       }
       d.a(0x763547f8).Sf(this.getActivity(), this.t, this.D);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "10")) {
          return;
       }
       g tt = this.t;
       if (tt == null) {
          return;
       }
       if (tt.mIsNameEmpty == null && tt.mIsHeadEmpty == null) {
          this.B.setText(a1.p(R.string.arg_RES_7f103c4e));
          this.B.setBackgroundResource(R.drawable.arg_RES_7f0801b2);
          this.B.getPaint().setFakeBoldText(true);
          tt = this.B;
          tt.setTextColor(j.d(tt, R.color.arg_RES_7f061fbb));
          this.s.onNext(Integer.valueOf(this.q.get()));
       }else {
          this.B.setText(a1.p(R.string.arg_RES_7f100912));
          this.B.getPaint().setFakeBoldText(true);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       this.x = p0.findViewById(0x7f0a0333);
       this.w = p0.findViewById(0x7f0a0b5c);
       this.y = p0.findViewById(0x7f0a4381);
       this.z = p0.findViewById(0x7f0a3f2c);
       this.A = p0.findViewById(0x7f0a3bd1);
       TextView textView = p0.findViewById(R.id.follow_btn);
       this.B = textView;
       textView.setOnClickListener(new g$a(this));
       p0.setOnClickListener(new g$b(this));
       p0.setOnClickListener(new g$c(this));
       p0 = p0.findViewById(R.id.close_btn);
       this.C = p0;
       p0.setOnClickListener(new g$d(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("PYMK_ACCESS_IDSitem_data");
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("PYMK_ACCESS_IDSclose_user");
       this.s = this.r8("PYMK_ACCESS_IDSfollowUser_position");
       this.D = this.r8("PYMK_ACCESS_IDSportal").intValue();
       return;
    }
}
