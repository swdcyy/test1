package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView;
import android.widget.LinearLayout;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import android.graphics.drawable.GradientDrawable;
import va1.l0;
import android.graphics.drawable.GradientDrawable$Orientation;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import java.util.List;

public final class LiveMerchantHourlyRankPendantView extends LinearLayout	// class@000cca
{
    public long b;
    public List c;
    public View d;
    public KwaiImageView e;
    public KwaiImageView f;
    public LiveViewFlipper g;
    public LiveViewFlipper$a h;
    public HashMap i;
    public static final LiveMerchantHourlyRankPendantView$a j;

    static {
       LiveMerchantHourlyRankPendantView.j = new LiveMerchantHourlyRankPendantView$a(null);
    }
    public void LiveMerchantHourlyRankPendantView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveMerchantHourlyRankPendantView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveMerchantHourlyRankPendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = 3000;
       this.c = new ArrayList();
       this.h = new LiveMerchantHourlyRankPendantView$b(this);
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantView.class, "1")) {
       }else {
          View view = a.c(this.getContext(), R.layout.arg_RES_7f0d0c97, this);
          a.o(view, "KwaiLayoutInflater.infla¡­ourly_rank_pendant, this\)");
          this.d = view;
          view = this.findViewById(R.id.live_merchant_hourly_rank_icon);
          a.o(view, "findViewById\(R.id.live_merchant_hourly_rank_icon\)");
          this.e = view;
          view = this.findViewById(R.id.live_merchant_hourly_rank_action_view);
          a.o(view, "findViewById\(R.id.live_m¡­_hourly_rank_action_view\)");
          this.f = view;
          view = this.findViewById(R.id.merchant_hourly_rank_content_flipper_view);
          a.o(view, "findViewById\(R.id.mercha¡­ank_content_flipper_view\)");
          this.g = view;
          String str = "mViewFlipper";
          if (view == null) {
             a.S(str);
          }
          view.a(this.h);
          LiveMerchantHourlyRankPendantView tg = this.g;
          if (tg == null) {
             a.S(str);
          }
          tg.setInAnimation(AnimationUtils.loadAnimation(this.getContext(), R.anim.arg_RES_7f0100b8));
          tg = this.g;
          if (tg == null) {
             a.S(str);
          }
          tg.setOutAnimation(AnimationUtils.loadAnimation(this.getContext(), R.anim.arg_RES_7f0100b9));
       }
       return;
    }
    public static final LiveViewFlipper a(LiveMerchantHourlyRankPendantView p0){
       p0 = p0.g;
       if (p0 == null) {
          a.S("mViewFlipper");
       }
       return p0;
    }
    public final void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantHourlyRankPendantView.class, "2")) {
          return;
       }
       a.p(p0, "startColor");
       a.p(p1, "endColor");
       GradientDrawable gradientDraw = new GradientDrawable();
       int[] ointArray = new int[]{l0.j(p0, (int)0xffffa071),l0.j(p1, (int)0xffff874d)};
       gradientDraw.setColors(ointArray);
       gradientDraw.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
       gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f070421));
       LiveMerchantHourlyRankPendantView td = this.d;
       if (td == null) {
          a.S("mRootView");
       }
       td.setBackground(gradientDraw);
       return;
    }
    public final void setActionIcon(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankPendantView.class, "6")) {
          return;
       }
       if (j.h(p0)) {
          LiveMerchantHourlyRankPendantView tf = this.f;
          if (tf == null) {
             a.S("mRankActionIconIv");
          }
          tf.setVisibility(8);
       }else {
          LiveMerchantHourlyRankPendantView tf1 = this.f;
          if (tf1 == null) {
             a.S("mRankActionIconIv");
          }
          tf1.setVisibility(0);
          tf1 = this.f;
          if (tf1 == null) {
             a.S("mRankActionIconIv");
          }
          a.m(p0);
          tf1.U(p0);
       }
       return;
    }
    public final void setContent(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankPendantView.class, "5")) {
          return;
       }
       a.p(p0, "rankContent");
       int i = 0;
       LiveMerchantHourlyRankPendantView liveMerchant = (!p0.length)? 1: null;
       if (liveMerchant) {
          return;
       }else {
          liveMerchant = this.g;
          if (liveMerchant == null) {
             a.S("mViewFlipper");
          }
          if (liveMerchant.isFlipping()) {
             liveMerchant = this.g;
             if (liveMerchant == null) {
                a.S("mViewFlipper");
             }
             liveMerchant.stopFlipping();
          }
          liveMerchant = this.g;
          if (liveMerchant == null) {
             a.S("mViewFlipper");
          }
          liveMerchant.removeAllViews();
          liveMerchant = this.g;
          if (liveMerchant == null) {
             a.S("mViewFlipper");
          }
          liveMerchant.setFlipInterval((int)this.b);
          int len = p0.length;
          for (; i < len; i = i + 1) {
             TextView textView = a.a(this.getContext(), R.layout.arg_RES_7f0d0f4c);
             a.o(textView, "textView");
             textView.setText(p0[i]);
             LiveMerchantHourlyRankPendantView tg = this.g;
             if (tg == null) {
                a.S("mViewFlipper");
             }
             tg.addView(textView);
          }
          if (p0.length > 1) {
             LiveMerchantHourlyRankPendantView tg1 = this.g;
             if (tg1 == null) {
                a.S("mViewFlipper");
             }
             tg1.startFlipping();
          }
          return;
       }
    }
    public final void setIcon(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankPendantView.class, "3")) {
          return;
       }
       if (p0 != null) {
          LiveMerchantHourlyRankPendantView te = this.e;
          if (te == null) {
             a.S("mRankIconIv");
          }
          te.U(p0);
       }
       return;
    }
    public final void setInterval(long p0){
       if (p0 > 0) {
          this.b = p0;
       }
       return;
    }
    public final void setInterval(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankPendantView.class, "4")) {
          return;
       }
       a.p(p0, "intervals");
       this.c = p0;
       return;
    }
}
