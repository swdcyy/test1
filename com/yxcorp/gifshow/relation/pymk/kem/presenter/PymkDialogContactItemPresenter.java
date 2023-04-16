package com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$mPermissionHolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7c.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.dialog.PymkDialogItemViewResponse;
import kbc.b;
import java.lang.Integer;
import k2b.f3;
import lnc.i3;
import java.lang.Number;
import android.text.TextPaint;
import android.widget.TextView;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import java.lang.CharSequence;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import zf6.k;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ub.b;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import android.view.View;
import n7c.e;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import k2b.h;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$a;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import android.content.res.ColorStateList;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogContactItemPresenter$c;
import java.util.Map;

public final class PymkDialogContactItemPresenter extends PresenterV2	// class@001943
{
    public boolean A;
    public final p B;
    public int p;
    public int q;
    public KwaiImageView r;
    public EmojiTextView s;
    public TextView t;
    public View u;
    public TextView v;
    public PymkDialogItemViewResponse w;
    public Map x;
    public PymkGuideCard y;
    public int z;

    public void PymkDialogContactItemPresenter(){
       super();
       this.p = -1;
       this.q = 44;
       this.B = s.c(PymkDialogContactItemPresenter$mPermissionHolder$2.INSTANCE);
    }
    public void E8(){
       boolean b;
       PymkDialogContactItemPresenter pymkDialogCo = PymkDialogContactItemPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pymkDialogCo, "4")) {
          return;
       }
       this.A = c.f();
       PymkDialogContactItemPresenter tw = this.w;
       if (tw == null) {
          a.S("mItemResponse");
       }
       this.y = tw.mPymkGuideCard;
       if (!PatchProxy.applyVoid(objArray, this, pymkDialogCo, "5")) {
          tw = this.y;
          if (tw != null) {
             PymkDialogContactItemPresenter tq = this.q;
             b uob = b.class;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tq), objArray, uob, "15")) {
                f3 uof3 = f3.j("OPEN_CONTACTS_CARD");
                i3 oi3 = i3.f();
                oi3.c("portal", Integer.valueOf(tq));
                uof3.m(oi3.e());
                uof3.g();
             }
             tq = this.s;
             if (tq == null) {
                a.S("mNameTV");
             }
             TextPaint paint = tq.getPaint();
             a.o(paint, "mNameTV.paint");
             paint.setFakeBoldText(true);
             tq = this.s;
             if (tq == null) {
                a.S("mNameTV");
             }
             tq.setText(tw.mTitle);
             tq = this.t;
             if (tq == null) {
                a.S("mDescTV");
             }
             tq.setText(tw.mSubTitle);
             tq = this.r;
             if (tq == null) {
                a.S("mAvatar");
             }
             a hierarchy = tq.getHierarchy();
             a.o(hierarchy, "mAvatar.hierarchy");
             hierarchy.L(objArray);
             if (k.d() && !TextUtils.x(tw.mDarkHeadUrl)) {
                tq = this.r;
                if (tq == null) {
                   a.S("mAvatar");
                }
                g.g(tq, tw.mDarkHeadUrl, HeadImageSize.MIDDLE, objArray, objArray);
             }else if(!TextUtils.x(tw.mHeadUrl)){
                tq = this.r;
                if (tq == null) {
                   a.S("mAvatar");
                }
                g.g(tq, tw.mHeadUrl, HeadImageSize.MIDDLE, objArray, objArray);
             }
             if (this.A != null) {
                b = this.R8().d();
                tq = this.v;
                if (tq == null) {
                   a.S("mBtn");
                }
                PymkDialogContactItemPresenter tu = this.u;
                if (tu == null) {
                   a.S("mBtnContainer");
                }
                e.c(b, tq, tu);
             }else {
                this.S8();
             }
             if (!PatchProxy.applyVoid(objArray, this, pymkDialogCo, "7")) {
                pymkDialogCo = this.r;
                if (pymkDialogCo == null) {
                   a.S("mAvatar");
                }
                ViewGroup$LayoutParams layoutParams = pymkDialogCo.getLayoutParams();
                String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                Objects.requireNonNull(layoutParams, str);
                tw = this.s;
                if (tw == null) {
                   a.S("mNameTV");
                }
                ViewGroup$LayoutParams layoutParams1 = tw.getLayoutParams();
                Objects.requireNonNull(layoutParams1, str);
                if (this.A != null) {
                   layoutParams.height = a1.d(0x7f070539);
                   layoutParams.width = a1.d(0x7f070539);
                   layoutParams.leftMargin = a1.d(0x7f070271);
                   layoutParams1.leftMargin = a1.d(0x7f07034b);
                }else {
                   layoutParams.height = a1.d(0x7f070537);
                   layoutParams.width = a1.d(0x7f070537);
                   layoutParams.leftMargin = a1.d(0x7f070295);
                   layoutParams1.leftMargin = a1.d(0x7f070271);
                }
                PymkDialogContactItemPresenter tr = this.r;
                if (tr == null) {
                   a.S("mAvatar");
                }
                tr.setLayoutParams(layoutParams);
                pymkDialogCo = this.s;
                if (pymkDialogCo == null) {
                   a.S("mNameTV");
                }
                pymkDialogCo.setLayoutParams(layoutParams1);
             }
          }
       }
       return;
    }
    public final void P8(){
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PymkDialogContactItemPresenter.class, "8")) {
          return;
       }
       if (this.A != null && this.R8().d()) {
          str = "second_view";
       }else if(this.A != null){
          str = "view";
       }else {
          str = "open";
       }
       PymkDialogContactItemPresenter tq = this.q;
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(str, Integer.valueOf(tq), objArray, uob, "14")) {
          h oh = h.k("OPEN_CONTACTS_CARD");
          i3 oi3 = i3.f();
          oi3.c("portal", Integer.valueOf(tq));
          oi3.d("click_area", str);
          oh.n(oi3.e());
          oh.h();
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          this.R8().g(objArray, this.q, new PymkDialogContactItemPresenter$a(objArray, this));
       }
       return;
    }
    public final ContactPermissionHolder R8(){
       Object obj = PatchProxy.apply(null, this, PymkDialogContactItemPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public final void S8(){
       PymkDialogContactItemPresenter tv;
       if (PatchProxy.applyVoid(null, this, PymkDialogContactItemPresenter.class, "6")) {
          return;
       }
       String str = "mBtnContainer";
       String str1 = "mBtn";
       if (this.R8().d()) {
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          tv.setSelected(true);
          tv = this.u;
          if (tv == null) {
             a.S(str);
          }
          tv.setSelected(true);
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          tv.setText(a1.p(R.string.arg_RES_7f1046e4));
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          TextPaint paint = tv.getPaint();
          a.o(paint, "mBtn.paint");
          paint.setFakeBoldText(true);
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          tv.setTextColor(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f060a3d)));
       }else {
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          tv.setText(a1.p(R.string.arg_RES_7f103ac5));
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          tv.setSelected(false);
          tv = this.u;
          if (tv == null) {
             a.S(str);
          }
          tv.setSelected(false);
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkDialogContactItemPresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.avatar);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.avatar\)");
       this.r = view;
       view = m1.f(p0, R.id.name);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.name\)");
       this.s = view;
       view = m1.f(p0, R.id.detail);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.detail\)");
       this.t = view;
       view = m1.f(p0, R.id.follow_button);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_button\)");
       this.u = view;
       view = m1.f(p0, R.id.follow_text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_text\)");
       this.v = view;
       PymkDialogContactItemPresenter tu = this.u;
       if (tu == null) {
          a.S("mBtnContainer");
       }
       tu.setOnClickListener(new PymkDialogContactItemPresenter$b(this));
       p0.setOnClickListener(new PymkDialogContactItemPresenter$c(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PymkDialogContactItemPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(PymkDialogItemViewResponse.class);
       a.o(obj, "inject\(PymkDialogItemViewResponse::class.java\)");
       this.w = obj;
       obj = this.r8("ADAPTER_POSITION");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION\)");
       this.z = obj.intValue();
       obj = this.r8("EXTRAS");
       a.o(obj, "inject\(PageAccessIds.EXTRAS\)");
       this.x = obj;
       return;
    }
}
