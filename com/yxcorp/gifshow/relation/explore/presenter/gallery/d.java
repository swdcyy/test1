package com.yxcorp.gifshow.relation.explore.presenter.gallery.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.c;
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
import iac.f;
import erd.g;
import crd.b;
import brd.t;
import lnc.b9;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import iac.h;
import eda.q;
import iac.g;
import tkd.b;
import tkd.d;
import gx5.c;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.d$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.d$b;
import y8c.d;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;

public class d extends PresenterV2	// class@001839
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
    public PublishSubject t;
    public PymkGuideCard u;
    public b v;
    public b w;
    public LottieAnimationView x;
    public KwaiImageView y;
    public TextView z;

    public void d(){
       super();
       this.E = c.b;
    }
    public void E8(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "2")) {
          return;
       }
       RecoUser mPymkGuideCa = this.p.mPymkGuideCard;
       this.u = mPymkGuideCa;
       if (mPymkGuideCa != null) {
          b.i(this.D);
          PymkGuideCard mUser = this.u.mUser;
          if (mUser != null) {
             g.b(this.y, mUser, HeadImageSize.ADJUST_BIG);
          }
          this.z.setText(QCurrentUser.ME.getName());
          this.A.setText(this.u.mTitle);
          this.B.setText(this.u.mSubTitle);
          mUser = this.u.mBgLottieUrl;
          if (!PatchProxy.applyVoidOneRefs(mUser, this, uod, "5")) {
             uod = this.x;
             if (uod != null && !uod.p()) {
                this.x.setVisibility(0);
                this.x.setAnimationFromUrl(mUser);
                this.x.s();
             }
          }
       }
    label_006a :
       this.X7(this.s.subscribe(new f(this)));
       return;
    }
    public void J8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
          uod = this.x;
          if (uod != null && uod.p()) {
             this.x.f();
          }
       }
       b[] uobArray = new b[]{this.v,this.w};
       b9.b(uobArray);
       a.b().c("KRNSocialProfileRefreshEvent", this.E);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       d tu = this.u;
       if (tu == null) {
          return;
       }
       if (tu.mIsNameEmpty == null && tu.mIsHeadEmpty == null) {
          return;
       }
       b[] uobArray = new b[]{this.v,this.w};
       b9.b(uobArray);
       if (this.u.mIsHeadEmpty != null) {
          this.v = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new h(this));
       }
       if (this.u.mIsNameEmpty != null) {
          a.b().a("KRNSocialProfileRefreshEvent", this.E);
          this.w = RxBus.f.g(q.class, RxBus$ThreadMode.MAIN).subscribe(new g(this));
       }
       d.a(0x763547f8).Sf(this.getActivity(), this.u, this.D);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.y = p0.findViewById(0x7f0a0333);
       this.x = p0.findViewById(0x7f0a0b5c);
       this.z = p0.findViewById(0x7f0a4381);
       this.A = p0.findViewById(0x7f0a3f2c);
       this.B = p0.findViewById(0x7f0a3bd1);
       p0.setOnClickListener(new d$a(this));
       p0 = p0.findViewById(R.id.close_btn);
       this.C = p0;
       p0.setOnClickListener(new d$b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("PYMK_ACCESS_IDSitem_data");
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("PYMK_ACCESS_IDSclose_user");
       this.D = this.r8("PYMK_ACCESS_IDSportal").intValue();
       this.s = this.r8("relation_btn_click");
       this.t = this.r8("PYMK_ACCESS_IDSbigcard_btn");
       return;
    }
}
