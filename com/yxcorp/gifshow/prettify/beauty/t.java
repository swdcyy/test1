package com.yxcorp.gifshow.prettify.beauty.t;
import com.yxcorp.gifshow.prettify.beauty.r;
import lnc.a1;
import p0c.a;
import com.yxcorp.gifshow.prettify.beauty.r$b;
import n1c.l;
import com.yxcorp.gifshow.prettify.beauty.r$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import g9c.a;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import xyb.a;
import w46.b;
import java.util.List;
import java.util.Collection;
import ekd.q;
import android.content.Context;
import android.content.res.Resources;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import q0c.k1;
import java.lang.Runnable;
import ekd.k1;
import q0c.m1;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import s0c.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import bld.b;
import bld.c;
import n1c.i;
import com.yxcorp.widget.KwaiRadiusStyles;
import android.graphics.drawable.Drawable;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import q0c.j1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.prettify.beauty.r$d;
import com.kwai.feature.post.api.componet.prettify.beauty.RecoBeautifyConfig;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import com.yxcorp.gifshow.prettify.beauty.t$a;
import com.kwai.feature.post.api.widget.PrettifyLoadingView$a;
import xb.t$b;
import android.widget.FrameLayout;
import q0c.l1;
import com.yxcorp.gifshow.prettify.beauty.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import n1c.e;
import n1c.n;
import jd.c;
import ub.b;

public class t extends r	// class@00111f
{
    public static final int q;
    public static final int r;

    static {
       t.q = a1.d(0x7f07030d);
       t.r = a1.d(0x7f07025d);
    }
    public void t(a p0,r$b p1,l p2){
       super(p0, p1, p2);
    }
    public void Y0(r$c p0,int p1){
       int i = this;
       Object obj = p0;
       int i1 = p1;
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(p1), i, ot, "1")) {
          return;
       }
       r$c a = obj.a;
       r$c b = obj.b;
       r$c c = obj.c;
       r$c d = obj.d;
       r$c e = obj.e;
       r$c f = obj.f;
       int i2 = 8;
       if (c != null) {
          c.setVisibility(i2);
       }
       i.l.d(obj.itemView);
       if (d != null) {
          d.setVisibility(i2);
       }
       BeautifyConfig uBeautifyCon = i.N0(i1);
       int i3 = 0;
       if (uBeautifyCon == null) {
          Object[] objArray = new Object[i3];
          a.D().t("BeautyCategoryAdapter", "onBindViewHolderError", objArray);
          return;
       }else {
          r h = i.h;
          boolean b1 = true;
          int b2 = (h != null && uBeautifyCon.mId == h.mId)? true: false;
          if (b2) {
             i.i = i1;
          }
          if (uBeautifyCon.mId == -1) {
             b.setSelected(b2);
          }else if(b2){
             b.setSelected(b1);
             List list = this.i1();
             if (c != null && !q.f(list)) {
                c.setProgressArcColor(c.getContext().getResources().getColor(R.color.arg_RES_7f061fda));
                c.setProgressArcBackgroundColor(c.getContext().getResources().getColor(R.color.arg_RES_7f06009a));
                i.b1(obj, list);
             }
             if (i.j != null && this.d1().isEmpty()) {
                i.j = i3;
                k1.r(new k1(i), 0);
             }
          }else {
             b.setSelected(i3);
          }
          c = obj.g;
          if (c != null) {
             c.setSelected(b.isSelected());
          }
          if (f != null && !m1.b.c(f, uBeautifyCon)) {
             if (i.k.q() != null && !TextUtils.x(i.k.q().a(Integer.valueOf(uBeautifyCon.mId)))) {
                f.setTagText(i.k.q().a(Integer.valueOf(uBeautifyCon.mId)));
                f.q();
             }else {
                f.p();
             }
          }
          i.X0(a, uBeautifyCon);
          if (!PatchProxy.applyVoidTwoRefs(e, uBeautifyCon, i, ot, "3")) {
             String str = i.h1(uBeautifyCon);
             if (e != null) {
                if (!TextUtils.x(str) && i.k.z()) {
                   if (i.m == null) {
                      BeautifyConfig mId = uBeautifyCon.mId;
                      if (mId == 999 || mId == 1000) {
                      }
                   }else {
                   }
                }
             label_0146 :
                e.setText("");
             }
          }
          BeautifyConfig mItemNameSty = uBeautifyCon.mItemNameStyle;
          b1 = (uBeautifyCon.mId != -1)? true: false;
          i.q1(mItemNameSty, obj, b1);
          if (!PatchProxy.applyVoidOneRefs(obj, i, ot, "4")) {
             ViewGroup$MarginLayoutParams layoutParams2 = obj.b.getLayoutParams();
             if (this.p1()) {
                layoutParams2.width = a1.d(0x7f070cd1);
                layoutParams2.height = a1.d(0x7f070cd0);
             }else {
                layoutParams2.width = a1.d(0x7f070cc8);
                layoutParams2.height = a1.d(0x7f070cc6);
             }
             obj.b.setLayoutParams(layoutParams2);
          }
          if (!PatchProxy.applyVoidTwoRefs(a, e, i, ot, "6")) {
             ViewGroup$LayoutParams layoutParams = a.getLayoutParams();
             RoundingParams roundingPara = new RoundingParams();
             int i4 = a1.d(R.dimen.arg_RES_7f070cce);
             b uob = new b();
             uob.v(a1.a(R.color.arg_RES_7f061c37));
             b2 = 0x7f070ccc;
             if (e == null || TextUtils.x(e.getText())) {
                layoutParams.height = (this.p1())? a1.d(b2): a1.d(0x7f070cc9);
                if (e != null) {
                   e.setVisibility(i2);
                }
                roundingPara.m((float)i4, (float)i4, (float)i4, (float)i4);
                uob.g(KwaiRadiusStyles.R6);
             }else {
                ViewGroup$LayoutParams layoutParams1 = e.getLayoutParams();
                if (this.p1()) {
                   layoutParams.height = a1.d(0x7f070cd2);
                   e.setGravity(49);
                   layoutParams1.height = a1.d(0x7f070cd8);
                }else {
                   layoutParams.height = a1.d(b2);
                   layoutParams1.height = a1.d(0x7f070cd3);
                   e.setGravity(17);
                }
                e.setLayoutParams(layoutParams1);
                e.setVisibility(i3);
                roundingPara.m((float)i4, (float)i4, 0, 0);
                uob.g(i.e());
             }
             a.setBackground(uob.a());
             a.getHierarchy().L(roundingPara);
             a.setLayoutParams(layoutParams);
          }
          obj.itemView.setOnClickListener(new j1(i, obj, i1, uBeautifyCon));
          return;
       }
    }
    public void Z0(r$d p0,int p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ot, "2")) {
          return;
       }
       this.l.d(p0.itemView);
       BeautifyConfig uBeautifyCon = this.N0(p1);
       if (!uBeautifyCon instanceof RecoBeautifyConfig) {
          return;
       }
       r th = this.h;
       boolean b = (th != null && uBeautifyCon.mId == th.mId)? true: false;
       p0.b.setSelected(b);
       BeautifyConfig uBeautifyCon1 = uBeautifyCon;
       p0.a.setVisibility(0);
       r$c c = p0.c;
       int i = 8;
       if (c != null) {
          c.setVisibility(i);
       }
       c = p0.d;
       if (c != null) {
          c.setVisibility(i);
       }
       Drawable uDrawable = null;
       p0.a.setPlaceHolderImage(uDrawable);
       c = p0.e;
       if (c != null) {
          c.setVisibility(0);
          p0.e.setPadding(0, 0, 0, 0);
       }
       p0.h.setLoadingResId(R.drawable.arg_RES_7f081c69);
       if (this.l1() || this.k1()) {
          p0.h.c();
       }else {
          p0.h.e(true);
       }
       p0.h.setCallback(new t$a(this, p0));
       BeautifyConfig currentConfi = uBeautifyCon1.getCurrentConfig();
       p0.a.setBackground(uDrawable);
       p0.a.getHierarchy().u(t$b.e);
       p0.a.setPadding(t.r, t.r, t.r, t.r);
       p0.a.y(R.drawable.arg_RES_7f081b83, t.q, t.q);
       p0.h.setBackground(uDrawable);
       uDrawable = a1.f(R.drawable.arg_RES_7f080321);
       if (currentConfi != null) {
          this.q1(RecoBeautifyConfig.getRecoItemNameStyle(), p0, 0);
          uDrawable.setAlpha(76);
       }else {
          this.q1(uBeautifyCon.mItemNameStyle, p0, 0);
          uDrawable.setAlpha(255);
       }
       if (p0.e != null) {
          if (currentConfi != null && !uBeautifyCon1.isLastConfig()) {
             p0.e.setText(a1.p(R.string.arg_RES_7f103e11));
          }else {
             p0.e.setText(a1.p(R.string.arg_RES_7f104128));
          }
       }
       r$c g = p0.g;
       if (g != null) {
          g.setSelected(p0.b.isSelected());
       }
       p0.b.setBackground(uDrawable);
       if (p0.c != null) {
          if (currentConfi != null && b) {
             List list = this.i1();
             if (!q.f(list)) {
                r$c c1 = p0.c;
                c1.setProgressArcColor(c1.getContext().getResources().getColor(R.color.arg_RES_7f061fda));
                c1 = p0.c;
                c1.setProgressArcBackgroundColor(c1.getContext().getResources().getColor(R.color.arg_RES_7f06009a));
                this.b1(p0, list);
                p0.c.setVisibility(0);
                p0.a.setVisibility(4);
                this.j = true;
             }else if(this.j != null){
                this.j = false;
                k1.r(new l1(this), 0);
             }
          }else {
             this.j = false;
          }
       }
       p0.itemView.setOnClickListener(new s(this, p0, uBeautifyCon1));
       return;
    }
    public final boolean p1(){
       Object obj = PatchProxy.apply(null, this, t.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.k.g() && this.m == null)? true: false;
       return b;
    }
    public final void q1(ItemNameStyle p0,r$c p1,boolean p2){
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, t.class, "7")) {
          return;
       }
       int i = i.d(p0);
       int i1 = 0x7f061c37;
       int i2 = a1.a(i1);
       r$c e = p1.e;
       if (e != null) {
          e.setTextColor(i);
          if (!TextUtils.x(p1.e.getText())) {
             int i3 = (this.p1())? a1.a(i1): i.c(p0);
             i2 = i3;
          }
          b uob = new b();
          uob.v(i2);
          uob.g(i.a());
          p1.e.setBackground(uob.a());
       }
       ImageView imageView = p1.itemView.findViewById(R.id.select_img);
       i2 = 8;
       Drawable uDrawable = null;
       if (this.m != null) {
          if (imageView != null) {
             if (imageView.isSelected() && (p1.c.getVisibility() && p1.d.getVisibility())) {
                imageView.setVisibility(0);
                if (p2) {
                   imageView.setImageResource(R.drawable.arg_RES_7f081b07);
                }else {
                   imageView.setImageDrawable(uDrawable);
                }
             }else {
                imageView.setVisibility(i2);
                if (p2) {
                   imageView.setImageDrawable(uDrawable);
                }
             }
          }
          if (p1.a.isSelected() && p2) {
             p1.a.setColorFilter(a1.a(R.color.arg_RES_7f0600a7));
          }else {
             p1.a.clearColorFilter();
          }
          p1.a.setPlaceHolderImage(R.drawable.arg_RES_7f081b0a);
       }else {
          p1.a.clearColorFilter();
          if (imageView != null) {
             imageView.setVisibility(i2);
          }
          if (p1.a.isSelected() && p2) {
             if (p1.c.getVisibility()) {
                r$c d = p1.d;
                if (d == null || d.getVisibility()) {
                   p1.a.setPlaceHolderImage(R.drawable.arg_RES_7f081b0a);
                   p1.a.z(R.drawable.arg_RES_7f081b07, -1, -1, n.d(), null);
                }
             }
             p1.a.i0();
             p1.a.setPlaceHolderImage(uDrawable);
          }
       }
       return;
    }
}
