package com.kuaishou.live.core.show.contributorlist.g;
import k51.c;
import lnc.a1;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.contributorlist.LiveContributor;
import java.lang.CharSequence;
import android.widget.TextView;
import im8.f;
import java.lang.Integer;
import android.text.TextUtils;
import java.lang.Boolean;
import java.lang.Number;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.f0;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import p62.j;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.content.res.Resources;
import b61.b;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class g extends c	// class@000ade
{
    public LiveContributor p;
    public LiveContributorListDialogFragment$d q;
    public f r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public View y;
    public static final int A = 0;
    public static final int B = 0;
    public static String sLivePresenterClassName = "LiveContributorListItemPresenter";
    public static final int z;

    static {
       g.z = a1.e(8.00f);
       g.A = a1.e(8.00f);
       g.B = a1.e(7.00f);
    }
    public void g(LiveContributorListDialogFragment$d p0){
       super();
       this.q = p0;
    }
    public void E8(){
       GradientDrawable gradientDraw;
       int b;
       Drawable uDrawable;
       int i1;
       int i2;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "3")) {
          return;
       }
       g tp = this.p;
       if (tp != null && tp.mUserInfo != null) {
          if (!PatchProxy.applyVoid(null, this, og, "4")) {
             this.u.setText(this.p.mDisplayContributionValue);
          }
          int i = 0;
          if (!PatchProxy.applyVoid(null, this, og, "5")) {
             int i3 = 1;
             b = this.r.get().intValue() + i3;
             i1 = TextUtils.isEmpty(this.p.mDisplayContributionValue) ^ i3;
             i2 = this.r.get().intValue();
             if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i1), Integer.valueOf(i2), this, og, "12")) {
                if (!i1 || i2 >= 3) {
                   this.t.setTextSize(i3, 17.00f);
                }else {
                   this.t.setTextSize(i3, 20.00f);
                }
                g tt = this.t;
                if (PatchProxy.isSupport(og)) {
                   str = PatchProxy.applyTwoRefs(Boolean.valueOf(i1), Integer.valueOf(i2), this, og, "13");
                   if (str != patchProxyRe) {
                   }else if(!i1){
                      str = "-";
                   }else {
                      str = String.valueOf((i2 + 1));
                   }
                }else {
                   goto label_00a1 ;
                }
                tt.setText(str);
                tt = this.t;
                if (PatchProxy.isSupport(og)) {
                   Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(i1), Integer.valueOf(i2), this, og, "14");
                   if (obj != patchProxyRe) {
                      i1 = obj.intValue();
                   }else if(!i1){
                      i1 = a1.a(R.color.arg_RES_7f061f9f);
                   }else if(!i2){
                      i1 = a1.a(R.color.arg_RES_7f0615b2);
                   }else if(i2 == i3){
                      i1 = a1.a(R.color.arg_RES_7f0615b3);
                   }else if(i2 == 2){
                      i1 = a1.a(R.color.arg_RES_7f0615b4);
                   }else {
                      i1 = a1.a(R.color.arg_RES_7f061f9f);
                   }
                }else {
                   goto label_00ce ;
                }
                tt.setTextColor(i1);
                if (i2 > 2) {
                   f0.i(this.t, this.getContext());
                }else {
                   f0.e(this.t);
                }
             }
             g.d(this.s, this.p.mUserInfo, HeadImageSize.MIDDLE);
             this.s.setOnClickListener(new j(this, b));
             i1 = this.r.get().intValue();
             if (!(TextUtils.isEmpty(this.p.mDisplayContributionValue) ^ i3)) {
             label_014d :
                b = 0;
             }else if(!i1){
                b = 0x7f081533;
             }else if(i1 == i3){
                b = 0x7f081534;
             }else if(i1 == 2){
                b = 0x7f081532;
             }else {
                goto label_014d ;
             }
             if (b > 0) {
                this.s.setPadding(n.c(a.a().a(), 0x3fc00000), n.c(a.a().a(), 0x3fc00000), n.c(a.a().a(), 0x3fc00000), n.c(a.a().a(), 0x3fc00000));
                this.s.getHierarchy().n().l(0);
                this.s.setBackgroundResource(b);
             }else {
                this.s.setPadding(i, i, i, i);
                this.s.getHierarchy().n().k(this.getContext().getResources().getColor(R.color.arg_RES_7f062038));
             }
          }
          if (!PatchProxy.applyVoid(null, this, og, "6")) {
             this.v.setText(b.c(this.p.mUserInfo));
             b = this.p.mUserInfo.isMale();
             g tw = this.w;
             if (PatchProxy.isSupport(og)) {
                gradientDraw = PatchProxy.applyOneRefs(Boolean.valueOf(b), this, og, "9");
                if (gradientDraw != patchProxyRe) {
                label_01f1 :
                   tw.setBackground(gradientDraw);
                   tw = this.w;
                   if (PatchProxy.isSupport(og)) {
                      uDrawable = PatchProxy.applyOneRefs(Boolean.valueOf(b), this, og, "8");
                      if (uDrawable != patchProxyRe) {
                      label_021d :
                         tw.setCompoundDrawables(uDrawable, null, null, null);
                         this.w.setPadding(a1.e(5.00f), i, a1.e(5.00f), i);
                         tw = this.w;
                         b = (b)? 0x7f103196: 0x7f100f40;
                         tw.setText(a1.p(b));
                      }
                   }
                   i1 = (b)? 0x7f0814d0: 0x7f0814c0;
                   uDrawable = a1.f(i1);
                   uDrawable.setBounds(i, i, g.z, g.z);
                   goto label_021d ;
                }
             }
             gradientDraw = new GradientDrawable();
             i2 = (b)? a1.a(R.color.arg_RES_7f060232): a1.a(R.color.arg_RES_7f0604fe);
             gradientDraw.setColor(i2);
             gradientDraw.setCornerRadius((float)g.B);
             goto label_01f1 ;
          }
          if (!PatchProxy.applyVoid(null, this, og, "7")) {
             if (TextUtils.isEmpty(this.p.mCity)) {
                this.x.setVisibility(8);
             }else {
                this.x.setVisibility(i);
                this.x.setText(this.p.mCity);
                tp = this.x;
                gradientDraw = PatchProxy.apply(null, this, og, "10");
                if (gradientDraw != patchProxyRe) {
                }else {
                   gradientDraw = new GradientDrawable();
                   gradientDraw.setColor(a1.a(R.color.arg_RES_7f0615c7));
                   gradientDraw.setCornerRadius((float)g.A);
                }
                tp.setBackground(gradientDraw);
             }
          }
          if (!PatchProxy.applyVoid(null, this, og, "11")) {
             g ty = this.y;
             if (this.r.get().intValue() <= 0) {
                i = 8;
             }
             ty.setVisibility(i);
          }
       }
    label_02ae :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a1bbe);
       this.x = m1.f(p0, 0x7f0a1bac);
       this.v = m1.f(p0, 0x7f0a1bb7);
       this.y = m1.f(p0, 0x7f0a1bad);
       this.s = m1.f(p0, 0x7f0a1bab);
       this.u = m1.f(p0, 0x7f0a1baa);
       this.t = m1.f(p0, 0x7f0a1bb8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.q8(LiveContributor.class);
       this.r = this.x8("ADAPTER_POSITION");
       return;
    }
}
