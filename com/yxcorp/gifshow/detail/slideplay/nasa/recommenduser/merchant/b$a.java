package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.b$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.b$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.util.List;
import android.view.View;
import android.widget.ImageView;
import yl8.b;
import y8c.d;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.a;
import erd.o;
import t45.d;
import brd.z;
import m6a.m;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import m6a.n;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.d;
import lu7.f;
import java.lang.CharSequence;
import rnc.i;
import android.widget.TextView;
import android.text.Spanned;
import android.text.Html;
import k6a.g;
import k2b.e0;
import m6a.w;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import brd.y;
import ekd.m1;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;

public class b$a extends PresenterV2	// class@00178e
{
    public View A;
    public SlidePlayViewModel B;
    public a C;
    public User p;
    public d q;
    public y r;
    public BaseFragment s;
    public MerchantRecommendUserManager t;
    public AvatarWithLiving u;
    public TextView v;
    public TextView w;
    public TextView x;
    public View y;
    public KwaiImageView[] z;

    public void b$a(){
       super();
       this.C = new b$a$a(this);
    }
    public void E8(){
       b$a tw;
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, b$a.class, "3")) {
          return;
       }
       String str = "7";
       if (!PatchProxy.applyVoidWithListener(objArray, this, b$a.class, str)) {
          if (this.p.mIsLiving != null) {
             this.u.b();
          }else {
             this.u.c();
          }
          g.l(this.u.getMAvatarView(), this.p, HeadImageSize.MIDDLE, a1.f(R.drawable.arg_RES_7f0819bd));
          PatchProxy.onMethodExit(b$a.class, str);
       }
       str = "5";
       if (!PatchProxy.applyVoidWithListener(objArray, this, b$a.class, str)) {
          User mFansImages = this.p.mFansImages;
          i = 8;
          if (mFansImages != null && !mFansImages.isEmpty()) {
             b$a tz = this.z;
             if (tz != null && tz.length > 0) {
                int i1 = 0;
                this.A.setVisibility(i1);
                int i2 = 0;
                b$a tz1 = this.z;
                while (i2 < tz1.length) {
                   object oobject = tz1[i2];
                   if (i2 >= mFansImages.size()) {
                      oobject.setVisibility(i);
                   }else {
                      String str1 = mFansImages.get(i2);
                      if (str1 == null || str1.isEmpty()) {
                         oobject.L(objArray);
                      }else {
                         oobject.setVisibility(i1);
                         oobject.L(str1);
                      }
                   }
                   i2 = i2 + 1;
                }
                PatchProxy.onMethodExit(b$a.class, str);
             }
          }
          this.A.setVisibility(i);
          PatchProxy.onMethodExit(b$a.class, str);
       }
       this.P8(this.p);
       this.p.b();
       this.p.mPosition = this.q.get();
       str = "6";
       if (!PatchProxy.applyVoidWithListener(objArray, this, b$a.class, str)) {
          Fragment parentFragme = this.s.getParentFragment();
          if (parentFragme != null) {
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(parentFragme);
             this.B = slidePlayVie;
             slidePlayVie.P(this.s, this.C);
          }
          z a = d.a;
          this.X7(this.p.observable().distinctUntilChanged(a.b).observeOn(a).subscribe(new m(this), Functions.d()));
          t ot = RxBus.f.f(n.class).observeOn(a);
          this.X7(ot.subscribe(new n(this)));
          View view = this.m8();
          if (view != null) {
             view.setOnClickListener(new c(this));
          }
          b$a ty = this.y;
          if (ty != null) {
             ty.setOnClickListener(new d(this));
          }
          PatchProxy.onMethodExit(b$a.class, str);
       }
       str = "4";
       if (!PatchProxy.applyVoidWithListener(objArray, this, b$a.class, str)) {
          tw = this.v;
          if (tw != null) {
             tw.setText(i.j(f.a(this.p)));
          }
          PatchProxy.onMethodExit(b$a.class, str);
       }
       tw = this.w;
       if (tw != null) {
          User mIntroductio = this.p.mIntroduction;
          if (mIntroductio == null) {
             mIntroductio = "";
          }
          tw.setText(Html.fromHtml(mIntroductio));
       }
       tw = this.s;
       if (tw instanceof g && tw.V()) {
          w.a(this.p, this.s);
       }
       PatchProxy.onMethodExit(b$a.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, b$a.class, "9")) {
          return;
       }
       b$a tu = this.u;
       if (tu != null) {
          tu.c();
       }
       PatchProxy.onMethodExit(b$a.class, "9");
       return;
    }
    public final void P8(User p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a.class, "10")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined() || !p0.isFollowingOrFollowRequesting()) {
          this.x.setText(R.string.arg_RES_7f100f8f);
          this.x.setEnabled(true);
       }else {
          this.x.setText(R.string.arg_RES_7f101034);
          this.x.setEnabled(false);
       }
       this.r.onNext(Boolean.TRUE);
       PatchProxy.onMethodExit(b$a.class, "10");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a037c);
       TextView textView = m1.f(p0, R.id.user_name);
       this.v = textView;
       textView.getPaint().setFakeBoldText(true);
       this.w = m1.f(p0, 0x7f0a41ad);
       textView = m1.f(p0, R.id.follow_text);
       this.x = textView;
       textView.getPaint().setFakeBoldText(true);
       this.y = m1.f(p0, 0x7f0a0f4c);
       KwaiImageView[] kwaiImageVie = new KwaiImageView[]{m1.f(p0, 0x7f0a0dd7),m1.f(p0, 0x7f0a0dd8),m1.f(p0, 0x7f0a0dd9)};
       this.z = kwaiImageVie;
       this.A = m1.f(p0, 0x7f0a0dda);
       PatchProxy.onMethodExit(b$a.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, b$a.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("FOLLOW_STATUS_CHANGE");
       this.s = this.q8(BaseFragment.class);
       this.t = this.q8(MerchantRecommendUserManager.class);
       PatchProxy.onMethodExit(b$a.class, "1");
       return;
    }
}
