package com.yxcorp.gifshow.relation.explore.presenter.b;
import erd.g;
import android.view.View;
import com.kwai.framework.model.user.User;
import fac.d;
import android.view.ViewStub;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.util.List;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.relation.explore.presenter.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.n;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.RichTextMeta;
import java.util.Collection;
import ekd.q;
import android.view.ViewParent;
import ekd.m1;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.yxcorp.gifshow.relation.widget.HollowOutAvatarView;
import lnc.a1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import android.widget.ImageView;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import lnc.b3;
import android.text.SpannableString;
import com.yxcorp.gifshow.relation.explore.presenter.e;
import java.lang.Runnable;

public final class b implements g	// class@001820
{
    public final View b;
    public final User c;
    public final d d;
    public final ViewStub e;
    public final ViewGroup f;
    public final KwaiImageView[] g;
    public final TextView h;
    public final List i;

    public void b(View p0,User p1,d p2,ViewStub p3,ViewGroup p4,KwaiImageView[] p5,TextView p6,List p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void accept(Object p0){
       View view1;
       RichTextMeta richTextMeta;
       int i6;
       object oobject2;
       View view2;
       b uob = this;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       b e = uob.e;
       b f = uob.f;
       b g = uob.g;
       b h = uob.h;
       b i = uob.i;
       CharSequence uCharSequenc = p0;
       f uof = f.class;
       int i1 = 8;
       int i2 = 1;
       int i3 = 0;
       if (TextUtils.x(uCharSequenc)) {
          View[] viewArray = new View[i2];
          viewArray[i3] = b;
          n.Z(i1, viewArray);
       }else {
          RichTextMeta mShowUsers = c.mExtraInfo.mRecoTextInfo.mShowUsers;
          int i4 = (d.e == null)? 3: 2;
          i1 = 0x7f0a0357;
          ViewParent viewParent = null;
          if (!q.f(mShowUsers)) {
             View view = (e != null && e.getParent() != null)? e.inflate().findViewById(i1): f.findViewById(i1);
             g[i3] = m1.f(view, 0x7f0a14e0);
             i1 = 1;
             g[i1] = m1.f(view, 0x7f0a14df);
             int i5 = 2;
             if (i4 > i5) {
                g[i5] = m1.f(view, 0x7f0a14de);
             }
             View[] viewArray1 = new View[i1];
             viewArray1[i3] = view;
             n.Z(i3, viewArray1);
             viewArray1 = new View[]{g[i3],g[i1],g[i5]};
             n.Z(8, viewArray1);
             i5 = 0;
             object oobject = null;
             while (i5 < mShowUsers.size() && i5 < i4) {
                if (mShowUsers.get(i5) == null) {
                   view1 = view;
                   richTextMeta = mShowUsers;
                }else {
                   g.b(g[i5], mShowUsers.get(i5), HeadImageSize.SMALL);
                   i2 = 0x7f0702b8;
                   if (g[i5] instanceof HollowOutAvatarView) {
                      oobject = g[i5];
                      float f1 = (float)a1.d(i2) * d.g;
                      i2 = (int)f1;
                      Objects.requireNonNull(oobject);
                      if (PatchProxy.isSupport(HollowOutAvatarView.class)) {
                         view1 = view;
                         richTextMeta = mShowUsers;
                         if (!PatchProxy.applyVoidTwoRefs(Boolean.TRUE, Integer.valueOf(i2), oobject, HollowOutAvatarView.class, "1")) {
                         }
                      }else {
                         view1 = view;
                         richTextMeta = mShowUsers;
                      }
                   }else {
                      view1 = view;
                      richTextMeta = mShowUsers;
                   }
                   object oobject1 = g[i5];
                   i6 = a1.d(R.dimen.arg_RES_7f0702ef);
                   d g1 = d.g;
                   if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidThreeRefs(oobject1, Integer.valueOf(i6), Float.valueOf(g1), null, f.class, "10")) {
                      ConstraintLayout$LayoutParams layoutParams = oobject1.getLayoutParams();
                      if (layoutParams.getMarginEnd()) {
                         float f2 = (float)a1.d(0x7f0702b8) * g1;
                         layoutParams.setMarginEnd((int)f2);
                      }
                      if (layoutParams.width != i6) {
                         float f3 = (float)i6 * g1;
                         layoutParams.width = (int)f3;
                      }
                      oobject1.setLayoutParams(layoutParams);
                      RoundingParams roundingPara = oobject1.getHierarchy().n();
                      if (roundingPara != null) {
                         float f4 = (float)a1.d(0x7f0702e3) * g1;
                         roundingPara.l(f4);
                         roundingPara.p(f4);
                         oobject1.getHierarchy().L(roundingPara);
                      }
                      oobject1.setVisibility(0);
                   }
                   oobject = i5 + 1;
                }
                i5 = i5 + 1;
                view = view1;
                mShowUsers = richTextMeta;
                HeadImageSize headImageSiz = null;
             }
             oobject2 = oobject;
             view2 = view;
          }else {
             b3 uob3 = new b3(f.getContext(), j.n(f.getContext(), 0x7f0822ce, d.d));
             uob3.b(true);
             uCharSequenc.insert(0, uob3.a());
             uCharSequenc.insert(true, "  ");
             int i7 = (int)((float)a1.d(0x7f07034b) * d.g);
             if (PatchProxy.isSupport(uof) && (!PatchProxy.applyVoidTwoRefs(b, Integer.valueOf(i7), viewParent, uof, "7") && b.getPaddingLeft() != i7)) {
                b.setPadding(i7, b.getPaddingTop(), b.getPaddingRight(), b.getPaddingBottom());
             }
             if (d.e == null) {
                f.e(b, (int)((float)a1.d(R.dimen.arg_RES_7f07030d) * d.g));
             }
             View[] viewArray2 = new View[]{f.findViewById(i1)};
             n.Z(8, viewArray2);
             view2 = viewParent;
             oobject2 = 0;
          }
          h.setTextColor(a1.a(d.d));
          if (d.e == null || d.j != null) {
             i6 = 0;
             h.setTextSize(i6, (d.i * (float)a1.d(R.dimen.arg_RES_7f0700d9)));
          }else {
             i6 = 0;
             h.setTextSize(i6, (d.i * (float)a1.d(R.dimen.arg_RES_7f0700c2)));
          }
          h.setVisibility(i6);
          h.setText(uCharSequenc);
          if (view2 != null && !view2.getVisibility()) {
             e uoe = new e(h, d, b, view2, g, oobject2, uCharSequenc, c, i);
             h.post(uob);
          }
       }
       return;
    }
}
