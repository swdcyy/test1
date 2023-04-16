package com.yxcorp.gifshow.profile.presenter.profile.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Integer;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import zf6.k;
import java.util.Collection;
import ekd.q;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import j4c.h0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import ql5.b;
import z5c.k0;
import android.widget.ImageView;
import com.yxcorp.utility.n;
import android.view.View$MeasureSpec;
import java.lang.Math;
import com.yxcorp.gifshow.profile.presenter.profile.b0$a;
import java.lang.reflect.Type;
import el.a;
import android.content.SharedPreferences;
import km8.b;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z5c.b3;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import j4c.g0;
import android.view.View$OnClickListener;
import t99.w;
import t99.w$a;
import z5c.m2;
import android.graphics.drawable.Drawable;
import zf6.j;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import z5c.g3;
import com.kwai.feature.api.social.profile.model.ProfileParam;

public class b0 extends PresenterV2	// class@001487
{
    public List A;
    public View p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public ImageView t;
    public ProfileParam u;
    public ProfileTemplateCard v;
    public int w;
    public String x;
    public f y;
    public boolean z;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;

    static {
       b0.B = a1.e(20.00f);
       b0.C = a1.e(202.00f);
       b0.D = a1.e(92.00f);
       b0.E = a1.e(8.00f);
    }
    public void b0(){
       super();
    }
    public void E8(){
       a$a uoa;
       int i2;
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob0, "3")) {
          return;
       }
       int i = 1;
       this.v.mIndex = this.y.get().intValue() + i;
       String str = ":ks-features:ft-social:profile";
       if (k.d()) {
          if (!q.f(this.v.mDarkIconUrls)) {
             uoa = a.d();
             uoa.b(str);
             this.q.S(this.v.mDarkIconUrls, uoa.a());
          }else {
             uoa = a.d();
             uoa.b(str);
             this.q.M(this.v.mDarkIconUrl, uoa.a());
          }
       }else if(!q.f(this.v.mIconUrls)){
          uoa = a.d();
          uoa.b(str);
          this.q.S(this.v.mIconUrls, uoa.a());
       }else {
          uoa = a.d();
          uoa.b(str);
          this.q.M(this.v.mIconUrl, uoa.a());
       }
       b0 tr = this.r;
       CharSequence text = (TextUtils.x(this.v.mMainTitle))? this.getContext().getText(R.string.arg_RES_7f10089f): this.v.mMainTitle;
       tr.setText(text);
       ViewGroup$MarginLayoutParams layoutParams = this.r.getLayoutParams();
       int i1 = 0;
       if (this.P8()) {
          this.s.setVisibility(i1);
          layoutParams.rightMargin = a1.d(0x7f070253);
          if (this.v.mIsTopSerial != null) {
             b0 tp = this.p;
             if (!PatchProxy.applyVoidOneRefs(tp, this, uob0, "12")) {
                a uoa1 = new a(this.getActivity());
                uoa1.o0(tp);
                uoa1.F0(a1.p(R.string.arg_RES_7f10365c));
                uoa1.T(3000);
                uoa1.A(i);
                uoa1.z(i);
                uoa1.P(i);
                uoa1.M(new h0(this));
                p.d(uoa1);
             }
             b.c(i);
          }
       }else {
          this.s.setVisibility(8);
          i2 = (k0.u())? 0x7f0702ac: 0x7f070329;
          layoutParams.rightMargin = a1.d(i2);
       }
       this.r.setLayoutParams(layoutParams);
       this.t.setVisibility(i1);
       String str1 = this.r.getText().toString();
       if (!PatchProxy.applyVoidOneRefs(str1, this, uob0, "4")) {
          i2 = n.z(this.getContext());
          this.p.measure(View$MeasureSpec.makeMeasureSpec(i1, i1), View$MeasureSpec.makeMeasureSpec(i1, i1));
          this.t.setVisibility(i1);
          if (!PatchProxy.isSupport(uob0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), str1, this, uob0, "5")) {
             uob0 = this.w;
             if (uob0 <= 4 && this.z != null) {
                this.R8((((i2 - (b0.B * 2)) - (b0.E * (uob0 - 1))) / uob0));
             }else {
                float f = 13.00f;
                float f1 = (float)(n.c0(this.getContext(), n.O(a1.p(0x7f10365f), 9.00f)) + a1.e(f));
                Context context = this.getContext();
                if (!k0.u()) {
                   f = 12.00f;
                }
                float f2 = (float)n.c0(context, n.O(str1, f)) + (float)a1.e(61.00f);
                f1 = (this.P8())? f1 - (float)a1.e(4.00f): 0;
                this.R8(Math.max(b0.D, Math.min((int)(f2 + f1), b0.C)));
             }
          }
       }
       Type type = new b0$a(this).getType();
       str1 = b.a.getString("mmuPopUserIDs", "");
       if (str1 != null && str1 != "") {
          objArray = b.a(str1, type);
       }
       this.A = objArray;
       if (objArray == null) {
          this.A = new ArrayList();
       }
       return;
    }
    public final boolean P8(){
       b0 obj = PatchProxy.apply(null, this, b0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b3.b(this.x)) {
          obj = this.v;
          if (obj.mExtra != null) {
             return b3.a(obj);
          }
       }
       return false;
    }
    public final void R8(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "6")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
       if (layoutParams.width == p0) {
          return;
       }
       layoutParams.width = p0;
       this.p.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a40a8);
       this.q = m1.f(p0, 0x7f0a130c);
       this.r = m1.f(p0, 0x7f0a2a59);
       this.s = m1.f(p0, 0x7f0a3bd1);
       this.t = m1.f(p0, 0x7f0a0239);
       m1.a(p0, new g0(this), R.id.tube_card_id);
       int i = 0x7f0822f2;
       if (k0.u()) {
          b0 tq = this.q;
          int i1 = a1.d(R.dimen.arg_RES_7f070283);
          int i2 = a1.d(R.dimen.arg_RES_7f070283);
          if (!PatchProxy.isSupport(w.class) || !PatchProxy.applyVoidThreeRefs(tq, Integer.valueOf(i1), Integer.valueOf(i2), null, w.class, "7")) {
             w.a.g(tq, i1, i2);
          }
          this.r.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f07027a));
          m2.c(this.r, 4);
          tq = this.t;
          tq.setImageDrawable(j.n(tq.getContext(), i, R.color.arg_RES_7f061641));
          b uob = new b();
          uob.v(j.d(p0, R.color.arg_RES_7f061730));
          uob.s(DrawableCreator$Shape.Rectangle);
          uob.g(KwaiRadiusStyles.R6);
          p0.setBackground(uob.a());
          if (k0.t()) {
             g3.d(this.p, a1.d(R.dimen.arg_RES_7f0702fe));
             g3.c(this.q, a1.d(R.dimen.arg_RES_7f070283), a1.d(R.dimen.arg_RES_7f070283));
             g3.c(this.t, a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.arg_RES_7f070271));
             g3.e(this.r, 13);
          }
       }else {
          b0 tt = this.t;
          tt.setImageDrawable(j.n(tt.getContext(), i, R.color.arg_RES_7f0616a7));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.v = this.q8(ProfileTemplateCard.class);
       this.w = this.r8("PROFILE_TUBE_CARD_COUNT").intValue();
       this.x = this.r8("PROFILE_TEMPLATE_CARD_USER_ID");
       this.y = this.x8("ADAPTER_POSITION");
       this.z = this.r8("PROFILE_TUBE_CARD_WIDTH_SPLIT").booleanValue();
       this.u = this.q8(ProfileParam.class);
       return;
    }
}
