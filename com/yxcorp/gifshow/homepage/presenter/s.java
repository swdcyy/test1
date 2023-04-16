package com.yxcorp.gifshow.homepage.presenter.s;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.t;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import android.view.ViewGroup;
import ekd.m1;
import lnc.s6;
import dsa.e;
import q87.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kwai.component.feedstaggercard.model.CardStyle;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMetaExt;
import android.widget.TextView;
import com.kwai.framework.model.feed.BaseFeed;
import zp.d;
import android.view.ViewGroup$MarginLayoutParams;
import msa.d;
import yta.w1;
import android.view.View$OnClickListener;

public final class s implements g	// class@0017d8
{
    public final t b;

    public void s(t p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Drawable uDrawable;
       Object[] objArray;
       int i1;
       Drawable uDrawable1;
       s tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       t ot = t.class;
       if (!PatchProxy.isSupport(ot) || (PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, ot, "5") || (tb.getContext() != null && tb.p.getParent() == null))) {
          ViewGroup viewGroup = tb.r.findViewById(R.id.photo_share_container);
          tb.y = viewGroup;
          if (viewGroup != null) {
             if (b) {
                b = null;
                if (!PatchProxy.applyVoid(b, tb, ot, "7")) {
                   if (tb.z == null) {
                      ViewStub viewStub = m1.f(tb.m8(), R.id.fans_top_promote_container);
                      tb.q = viewStub;
                      tb.z = viewStub.inflate();
                   }
                   if (!PatchProxy.applyVoid(b, tb, ot, "8")) {
                      String str = "PhotoFansPromotePresenter";
                      if (!s6.F()) {
                         objArray = new Object[0];
                         e.C().w(str, "handleBackgroundMaskAndLayoutIfNeed, normal style, not need this", objArray);
                      }else {
                         t z = tb.z;
                         if (z == null || !z.getLayoutParams() instanceof RelativeLayout$LayoutParams) {
                            objArray = new Object[0];
                            e.C().t(str, "handleBackgroundMaskAndLayoutIfNeed container error status", objArray);
                         }else {
                            objArray = new Object[0];
                            e.C().w(str, "handleBackgroundMaskAndLayoutIfNeed", objArray);
                            RelativeLayout$LayoutParams layoutParams1 = tb.z.getLayoutParams();
                            uDrawable = a1.f(R.color.arg_RES_7f0619a9);
                            int i = a1.d(R.dimen.arg_RES_7f070315);
                            t a = tb.A;
                            if (a != CardStyle.NORMAL_CARD_NORMAL_BOTTOM && a != CardStyle.FOLLOW_CARD_V1) {
                               a = tb.v;
                               if (a != null) {
                                  if (CoverMetaExt.getCoverAspectRatio(a) - 0x3f800000 >= 0) {
                                     i1 = a1.d(R.dimen.arg_RES_7f070340);
                                     layoutParams1.removeRule(12);
                                     layoutParams1.addRule(8, R.id.photo_cover_container);
                                     uDrawable1 = a1.f(R.drawable.arg_RES_7f080da1);
                                  }else if(tb.A == CardStyle.FOLLOW_CARD_V5){
                                     i = a1.d(R.dimen.arg_RES_7f0702fe);
                                     ViewGroup$LayoutParams layoutParams2 = tb.z.findViewById(R.id.fans_promote_real_layout).getLayoutParams();
                                     layoutParams2.height = a1.d(0x7f0702fe);
                                     tb.z.findViewById(R.id.fans_promote_real_layout).setLayoutParams(layoutParams2);
                                     uDrawable = a1.f(0x7f061c17);
                                  }
                                  layoutParams1.removeRule(8);
                                  layoutParams1.addRule(12);
                                  uDrawable1 = uDrawable;
                                  i1 = i;
                               }else {
                               label_0126 :
                                  i1 = a1.d(R.dimen.arg_RES_7f070340);
                                  uDrawable1 = a1.f(R.drawable.arg_RES_7f080da2);
                               }
                            }else {
                               goto label_0126 ;
                            }
                            layoutParams1.height = i1;
                            tb.z.setClickable(0);
                            tb.z.setLayoutParams(layoutParams1);
                            tb.z.setBackground(uDrawable1);
                         }
                      }
                   }
                   tb.z.setVisibility(0);
                   uDrawable = a1.f(R.drawable.arg_RES_7f0821e3);
                   uDrawable.setBounds(0, 0, a1.e(5.00f), a1.e(9.00f));
                   tb.z.findViewById(R.id.ad_fans_promote_title).setCompoundDrawables(b, b, uDrawable, b);
                   if (!PatchProxy.applyVoid(b, tb, ot, "10") && tb.z != null) {
                      float f = d.a(tb.w);
                      if (f < 0) {
                         f = CoverMetaExt.getCoverAspectRatio(tb.v);
                      }
                      ViewGroup$MarginLayoutParams layoutParams = tb.z.getLayoutParams();
                      if (f - 0x3f200000 <= 0) {
                         layoutParams.topMargin = 0;
                      }else {
                         layoutParams.topMargin = a1.d(0x7f0702ab);
                      }
                   }
                   d.c();
                   tb.z.findViewById(R.id.fans_promote_real_layout).setOnClickListener(new w1(tb));
                }
             }else {
                tb.P8();
             }
          }
       }
       return;
    }
}
